class MobileNavbar{
    constructor(mobileMenu, layoutList, layoutLinks){
        this.mobileMenu = document.querySelector(mobileMenu);
        this.layoutList = document.querySelector(layoutList);
        this.layoutLinks = document.querySelectorAll(layoutLinks);
        this.activeClass = "active";

        this.handleClick = this.handleClick.bind(this);
    }

    animateLinks(){
        this.layoutLinks.forEach((link, index) => {
            link.style.animation
            ? (link.style.animation = "")
            : (link.style.animation = `layoutLinkFade 0.5s ease forwards 0.3s`);
        });
    }

    handleClick(){
        this.layoutList.classList.toggle(this.activeClass);
        this.mobileMenu.classList.toggle(this.activaClass);
        this.animateLinks();
    }

    addClickEvent(){
        this.mobileMenu.addEventListener("click", this.handleClick);
    }

    init(){
        if(this.mobileMenu){
            this.addClickEvent();
        }
        return this;
    }
}

const mobileNavbar = new MobileNavbar(
    ".mobile-menu",
    ".layout-list",
    ".layout-list li",
);
mobileNavbar.init();