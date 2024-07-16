document.addEventListener('DOMContentLoaded', function () {
  const apiEndpoint = '';

  function fetchStations() {
    fetch(apiEndpoint)
      .then((response) => response.json())
      .then((data) => populateDropdown(data))
      .catch((error) => console.error('Error fetching stations:', error));
  }

  function populateDropdown(data) {
    const dropdownMenu = document.getElementById(
      'station-list'
    );
    dropdownMenu.innerHTML = '';

    data.forEach((item) => {
      const listItem = document.createElement('li');
      const linkItem = document.createElement('a');
      linkItem.textContent = item.name;
      listItem.appendChild(linkItem);
      dropdownMenu.appendChild(listItem);
    });
  }

  fetchStations();
});
