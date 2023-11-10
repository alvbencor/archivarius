<template>

  <div class="header">
    <h1>Archivarius</h1>
    <div class="barraBusqueda">
      <input type="text">
      <div class="lupa">
        <p>buscar</p>
      </div>
      <span> filtros</span>
    </div>
  <nav>
    <a>+ info</a>
    
    <router-link to="/">iniciar sesión</router-link>
    <router-link to="/about">nuevo usuario</router-link>
    <a href="">legal</a>
    <a>contacto</a>
  </nav>
  

  </div>
  <router-view/>
  
</template>

<style lang="scss">

@import "@/scss/main.scss";

</style>

