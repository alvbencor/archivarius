<template>

<div class="seccionInicioSesion">
  <div class="texto">
</div>

<div class="formularioInicioSesion">
  
  <Formulario></Formulario>
</div>
</div>
</template>

<script>

import Formulario from '@/components/Formulario.component.vue';


export default {
  name: 'HomeView',
  components: {
    Formulario,
    
  }
}
</script>
<style>

.container{
  display: flex;
  justify-content: center;
  flex-direction: column;
  width: 100%;
}

</style>