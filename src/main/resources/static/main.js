$(document).ready(function () {
    $('table a').on("click", function (e) {
        event.preventDefault();
        $('#addModal').modal();
    });
});