<template>
  <v-app id="home">
    <NavBar />
    <v-container fluid>
      <div class="head">
        <v-row>
          <v-col cols="5">
            <div style="position: relative" class="mt-16">
              <h1 class="text-grey">Hola!!</h1>
              <h1 class="text-white">Soy Francisco Valdez</h1>
              <span class="text-grey">Backend Developer</span><br />

              <v-btn tile dark class="text-yellow mt-8" variant="outlined">
                Contactame
              </v-btn>
            </div>
          </v-col>
          <v-col cols="2">
            <div
              style="
                position: absolute;
                z-index: 9999;
                bottom: 0;
                margin-left: auto;
                margin-right: auto;
                left: 0;
                right: 0;
                text-align: center;
              "
              class="mt-16"
            >
              <v-icon>fas fa-angle-double-down</v-icon>
            </div>
          </v-col>
          <v-col cols="5">
            <div style="position: relative; z-index: 9999" class="mt-16">
              <v-img src="asd.jpeg" contain max-height="300"></v-img>
            </div>
          </v-col>
        </v-row>
      </div>
      <v-col cols="12" class="mt-16" id="about">
        <div>
          <v-row>
            <v-col cols="12" sm="6">
              <div class="egg">
                <v-img src="aaa.jpeg" max-height="300" class=""></v-img>
              </div>
            </v-col>
            <v-col cols="12" sm="6">
              <h5 class="mt-16">Sobre mi</h5>
              <div style="width: 120px">
                <v-slider
                  v-model="slider2"
                  color="yellow"
                  label="track-color"
                ></v-slider>
              </div>
              <h4 class="mt-n4">Soy un programador Backend</h4>
              <h4 class="">y un desarrollador DevOp</h4>
              <p class="text-grey">
                Desarrollador Backend con experiencia en Java y Spring, 
                especializado en la creación de aplicaciones escalables, 
                seguras y eficientes. Enfocado en la implementación de lógica de negocio 
                con Spring Boot, manejo de datos con Spring Data JPA, y optimización de servicios RESTful. Conocimientos en Spring Security para garantizar autenticación y autorización robustas, y en 
                herramientas de pruebas como JUnit y Mockito para asegurar la calidad del código.
              </p>
              <br />
              <p class="text-grey">
                Además, poseo experiencia en Docker y Kubernetes para la contenedorización y orquestación de aplicaciones, 
                facilitando el despliegue en entornos distribuidos. Tengo conocimientos en 
                Google Cloud Platform (GCP), utilizando sus servicios para el manejo de 
                infraestructura escalable en la nube. Manejo bases de datos relacionales como MySQL y PostgreSQL, así como no relacionales como MongoDB, asegurando la correcta gestión y almacenamiento de información.
              </p>
              <v-btn tile dark color="yellow" class="mt-4">
                Descargar Cv
              </v-btn>
            </v-col>
          </v-row>
        </div>
      </v-col>      
   
      <v-col cols="12" sm="12" id="services">
        <div class="d-flex justify-center mb-6">
        
          <v-btn class="mr-2" variant="tonal"> Certificaciones</v-btn>
        
        </div>
      </v-col>
      <v-col cols="12" class="imgHover">
        <v-row class="fill-height" align="center" justify="center">
          <template v-for="(item, i) in items" :key="i">
            <v-col cols="12" md="4">
              <v-hover v-slot="{ isHovering, props }">
                <v-card
                  :elevation="isHovering ? 12 : 2"
                  :class="{ 'on-hover': isHovering }"
                  v-bind="props"
                >
                  <v-img :src="item.img" height="225px" cover> </v-img>
                </v-card>
              </v-hover>
            </v-col>
          </template>
        </v-row>
      </v-col>
      
              
            
    

      <v-col cols="12" sm="12" class="px-16" id="contact">
        <v-row>
          <v-col cols="12" sm="4">
            <div class="child">
              <h1>Informacion de Contacto</h1>
              <v-btn
                icon="fas fa-map-marker-alt"
                color=""
                class="mt-10"
                variant="outlined"
              ></v-btn
              ><br />
              <span class="text-caption">Ciudad Mendoza, Argentina </span
              ><br />
              <v-btn
                icon="fas fa-phone-alt"
                color=""
                class="mt-10"
                variant="outlined"
              ></v-btn
              ><br />
              <span class="text-caption">+54 261 - 000271 </span> <br />
              <span class="text-caption">+54 261 - 000274 </span> <br />
              <v-btn
                icon="fas fa-envelope"
                color=""
                class="mt-10"
                variant="outlined"
              ></v-btn
              ><br />
              <span class="text-caption">ruben_mza@hotmail.com </span> <br />
              <span class="text-caption">robledooogustavooo@gmail.com </span> <br />
            </div>
          </v-col>
          <v-col cols="12" sm="8">
            <h1 class="mt-8">Enviar Mensaje</h1>
            <v-divider></v-divider>
            <span class="text-caption"
              >Contáctame para llevar tus proyectos al siguiente nivel. Con experiencia en desarrollo backend, Java, Spring, y
              soluciones en la nube, te ofrezco escalabilidad, seguridad y eficiencia en cada solución.</span
            >
            <v-row class="mt-10">
              <v-col cols="12" sm="6">
                <v-text-field
                  label="Nombre"
                  persistent-hint
                  variant="outlined"
                ></v-text-field>
              </v-col>
              <v-col cols="12" sm="6">
                <v-text-field
                  label="Teléfono"
                  persistent-hint
                  variant="outlined"
                ></v-text-field>
              </v-col>
            </v-row>
            <v-textarea
              label="Mensaje"
              persistent-hint
              variant="outlined"
            ></v-textarea>
            <v-btn color="#FBDF7E" class="mt-2">Enviar</v-btn>
          </v-col>
        </v-row>
      </v-col>
    </v-container>
    <FooterView />
  </v-app>
</template>

<script>
import { defineComponent } from "vue";
import NavBar from "../components/NavBar.vue";
import FooterView from "../components/FooterView.vue";

// Components
//import HelloWorld from '../components/HelloWorld.vue';

export default defineComponent({
  name: "HomeView",
  setup() {
    return {
      slider2: 50,

      items: [
        {
          img: "todocode-certificate.png",
        },
        {
          img: "aws-certificate-ia.png",
        },
        {
          img: "googlecloid-certificate.png",
        },
        
      ],
    };
  },
  components: {
    NavBar,
    FooterView
},
});
</script>
<style scoped>
.v-container {
  padding: 16px 0 16px 0;
}

.head {
  position: relative;
  text-align: center;
  padding: 12px;
  margin-bottom: 6px;
  height: 400px;
  width: 100%;
  color: white;
}
.head:before {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 50%;
  background: black;
  transform: skew(0deg, 6deg);
}
.head:after {
  content: "";
  position: absolute;
  top: 0;
  right: 0;
  height: 100%;
  width: 50%;
  background: black;
  transform: skew(0deg, -6deg);
}
.egg {
  display: block;
  margin-left: 100px;
  margin-top: 50px;
  width: 356px;
  height: 300px;
  background-color: #fbdf7e;
  border-radius: 50% 50% 50% 50% / 60% 60% 40% 40%;
}
.first {
  width: 100%;
  height: 280px;
  text-align: center;
  padding: 2rem 2rem;
}
.child {
  display: inline-block;
  padding: 2rem 1rem;
  vertical-align: middle;
  text-align: center;
  margin-right: 8px;
}
.imgHover {
  padding: 0 200px;
}
.pre {
  width: 100%;
  height: 380px;
  text-align: center;
  padding: 0 200px;
  background-color: #f5f5f5;
}
.hire {
  width: 100%;
  height: 200px;
  padding: 0 200px;
  background-color: #e9e9e9;
  margin-top: -24px;
}
@media only screen and (max-width: 700px) {
  .head {
    height: auto;
    padding: 8px;
    margin-bottom: 16px;
  }

  .head h1 {
    font-size: 24px;
  }

  .head .text-grey, 
  .head .text-white {
    font-size: 18px;
  }

  .v-btn {
    font-size: 16px;
    padding: 10px 20px;
  }

  .egg {
    margin-left: auto;
    margin-right: auto;
    width: 250px;
    height: 250px;
  }

  .first {
    padding: 1rem;
  }

  .child {
    margin-bottom: 16px;
  }

  .imgHover, 
  .pre, 
  .hire {
    padding: 0 16px;
  }

  .v-col {
    text-align: center;
  }

  .hire h1 {
    font-size: 20px;
  }

  .hire p {
    font-size: 14px;
  }

  .text-grey {
    font-size: 14px;
  }

  .v-img {
    max-height: 200px;
  }
}
@media only screen and (max-width: 700px) {
  /* Footer adjustments */
  .footer {
    padding: 16px;
    text-align: center;
    background-color: #e9e9e9;
  }

  .footer h1 {
    font-size: 18px;
  }

  .footer p {
    font-size: 14px;
    margin-bottom: 8px;
  }

  .footer .v-btn {
    font-size: 14px;
    padding: 8px 16px;
  }

  /* Icon adjustments */
  .v-icon {
    font-size: 24px;
  }

  .v-btn.icon {
    font-size: 18px;
    padding: 10px;
  }

  .v-btn.icon > .v-icon {
    font-size: 18px;
    margin-right: 4px;
  }

  /* General adjustments for icons and buttons */
  .child .v-btn {
    padding: 10px;
    font-size: 14px;
  }

  .child h3 {
    font-size: 16px;
    margin-top: 12px;
  }

  .child p {
    font-size: 12px;
    line-height: 1.5;
    margin-top: 8px;
  }

  /* Footer icons alignment */
  .footer .v-btn.icon {
    display: inline-block;
    margin: 8px;
    text-align: center;
  }

  /* Contact section icons */
  .contact-info .v-btn.icon {
    margin-bottom: 8px;
  }

  /* Footer buttons alignment */
  .footer .v-btn {
    margin-top: 12px;
  }
}

</style>