package aula03;

public class Caneta {

        private String modelo;
        private String cor;
        private Float ponta;
        protected Integer carga;
        private Boolean tampada;

        public Caneta(String modelo, Float ponta, String cor){

            this.tampar();

            this.setModelo(modelo);
            this.setCarga(100);
            this. setPonta(ponta);
            this.setCor(cor);
        }



        public void status() {
            System.out.println("Modelo: " + this.getModelo());
            System.out.println("Uma caneta "+ this.getCor());
            System.out.println("Ponta: " + this.getPonta());
            System.out.println("Carga: " + this.carga);
            System.out.println("Está tampada? " + this.tampada);
        }

        public void rabiscar() {
            if (this.tampada == true){
                System.out.println("\nERRO! Caneta tampada!!");
            } else {
                System.out.println("\nEstou rabiscando!");
            }
        }

        public void tampar(){
            this.tampada = true;
        }

        public void destampar(){
            this.tampada = false;
        }

        public Integer getCarga (){
            return this.carga;
        }

        public void setCarga (Integer carga){
            this.carga = carga;
        }

        public String getCor (){
            return this.cor;
        }

        public void setCor (String cor){
            this.cor = cor;
        }

        public String getModelo (){
            return this.modelo;
        }

        public void setModelo (String modelo){
            this.modelo = modelo;
        }

        public Float getPonta(){
            return this.ponta;
        }

        public void setPonta (Float ponta){
            this.ponta = ponta;
        }

        public Boolean getTampada(){
            return this.tampada;
        }

        public void setTampada (Boolean tampa){
            this.tampada = tampada;
        }


}
