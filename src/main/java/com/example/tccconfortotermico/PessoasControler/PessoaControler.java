package com.example.tccconfortotermico.PessoasControler;


import com.example.tccconfortotermico.models.Pessoas;
import com.example.tccconfortotermico.services.FileStorageService;
import com.example.tccconfortotermico.services.PessoasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;
import javax.servlet.http.HttpServletResponse;

@Controller
public class PessoaControler {
    PessoasService service;
    FileStorageService storageService;

    @Autowired
    public void setFileStorageService(FileStorageService fileStorageService) {
        this.storageService = fileStorageService;
    }

    @Autowired
    public void setService(PessoasService service) {
        this.service = service;
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String getHome(Model model, HttpServletResponse response) {
    return "index";
    }

    @RequestMapping("/questionario")
    public String getFormCadastro(Model model){
        Pessoas pp = new Pessoas();
        model.addAttribute("pet", pp);
        return "questionario";
    }
    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    public String doSalvar(@ModelAttribute @Valid Pessoas pessoas, Errors errors, RedirectAttributes redirectAttributes){

            service.save(pessoas);

            redirectAttributes.addAttribute("msg", "Cadastro realizado com sucesso");
            return "redirect:/";
        }
    }

