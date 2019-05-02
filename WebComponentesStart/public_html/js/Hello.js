export default class Hello extends HTMLElement{
        constructor(){
            //quando estendi una classa
            super();
            console.log('connectedCallback()1');
            // include Shadow DOM (componente)
            // serve ad isolare l'oggetto dall'influenza del CSS
            this.root=this.attachShadow({mode:'open'});
        }
        
        connectedCallback(){
            console.log('connectedCallback()');
            this.createView();
        }
        
        //Template string
        createView(){
//            modo per richiamare la regola nel css, se non viene usata la regola, prende il
//            default (dopo 
            this.root.innerHTML= `
                <style>
                    h1{
                        
                        color:var(--hello-color,red);
                    }
                </style>
                <h1>Hello from web components</h1>
                `
        }
        
}

//registrare il componente
// 'nome che voglio dare io'
// nome classe
customElements.define('my-hello', Hello);