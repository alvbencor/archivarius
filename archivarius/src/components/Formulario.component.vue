<template>
  <div class="form-login">
    <form>
      <label>Usuario
        <input type="text" id="username" placeholder="Introduzca su usuario">
      </label>
      <label>Contraseña
        <input type="password" name="password" id="password" placeholder="Introduzca su contraseña">
      </label>  

      <div class="botonesLogin">
        <a href="">Darse de alta</a>
        <button type="submit">Iniciar Sesión</button>
      </div>
    </form>
  </div>
</template>
  
  <script>
  export default {
    name: 'Formulario',
  }
  </script>
  
  