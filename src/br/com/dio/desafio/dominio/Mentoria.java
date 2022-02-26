package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {


        private LocalDate data;

        public Mentoria() {
        }


        public LocalDate getData() {
                return data;
        }

        public void setData(LocalDate data) {
                this.data = data;
        }

        @Override
        public String toString() {
                return "Mentoria{" +
                        "titulo='" + getTitulo()+ '\'' +
                        ", descricao='" + getDescricao() + '\'' +
                        ", data=" + getData() +
                        '}';
        }


        @Override
        public double calcular_Xp() {
                return XP_PADRAO + 20d;
        }
}
