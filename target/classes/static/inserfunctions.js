let user = null;
let userData = null;
const body = document.body;

document.addEventListener("DOMContentLoaded", function (event) {
  const preview = document.querySelector('#form-image-preview')


  const fileCollection = [];



  document.querySelector('#pictures').addEventListener('change', (e) => {
    const formData = extractFormData('#statusForm');
    while (fileCollection.length) {
      fileCollection.pop();
    }
    [].slice.call(formData.pictures).map(f => fileCollection.push(f));

    renderCollection(fileCollection, preview);
  });




  const renderCollection = (collection, container) => {
    removeAllChildren(container);
    Promise
      .all(collection.map(generatePreviewData))
      .then(imgs => imgs.map((img, i) => {
        img.setAttribute('index', i);
        img.addEventListener('click', e => {
          collection.splice(i, 1);
          renderCollection(collection, container);
        })
        container.appendChild(img);
      }))
  }



}


);