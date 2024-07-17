const apiEndpoint = "http://localhost:8080/sample/getList";

function fetchStations() {
  return new Promise((resolve, reject) => {
    const xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
      if (this.readyState == 4 && this.status == 200) {
        // Typical action to be performed when the document is ready:
        resolve(xhttp.responseText);
      }
    };
    xhttp.open("GET", apiEndpoint, true);
    xhttp.send();
  });
}

function populateDropdown(data) {
  const dropdownMenu = document.getElementById("station-list");
  dropdownMenu.innerHTML = "";

  data.forEach((item) => {
    const listItem = document.createElement("li");
    const linkItem = document.createElement("a");
    linkItem.textContent = item;
    listItem.appendChild(linkItem);
    dropdownMenu.appendChild(listItem);
  });
}
document.addEventListener("DOMContentLoaded", async function () {
  const stations = await fetchStations();
  const stationList = JSON.parse(stations);
  populateDropdown(stationList.name);
});
