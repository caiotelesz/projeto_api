const form = document.querySelector("form");
const iusername = document.querySelector(".name");
const iemail = document.querySelector(".email");
const ipasswords = document.querySelector(".password");
const itelephone = document.querySelector(".telephone");

function register() {
  fetch("http://localhost:8080/users", {
    headers: {
      Accept: "application/json",
      "Content-Type": "application/json",
    },
    method: "POST",
    body: JSON.stringify({
      username: iusername.value,
      email: iemail.value,
      passwords: ipasswords.value,
      telephone: itelephone.value,
    }),
  })
    .then(function (res) {
      console.log(res);
    })
    .catch(function (res) {
      console.log(res);
    });
}

function clearForm() {
  iusername.value = "";
  iemail.value = "";
  ipasswords.value = "";
  itelephone.value = "";
}

form.addEventListener("submit", function (event) {
  event.preventDefault();

  register();
  clearForm();
});
