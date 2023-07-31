module.exports = {
    css: {
      loaderOptions: {
        sass: {
          additionalData: `
            @import "@/scss/variables.scss";
            @import "@/scss/general/general.scss";
            @import "@/scss/forms.scss";
            @import "@/scss/main.scss";
          `
        }
      }
    }
  };
  