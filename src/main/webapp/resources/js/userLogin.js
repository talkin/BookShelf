$(document).ready(function () {
    $('#tags').tokenfield();

    $('button[type="submit"]').attr('disabled', 'disabled');
    $('#name').keyup(function () {
        if ($('#name').val() == "") {
            $('button[type="submit"]').attr('disabled', 'disabled');
        }
        else {
            $('button[type="submit"]').removeAttr('disabled');
        }
    });

    $('userForm').on('reset', function (event) {
        event.preventDefault();
        $('#userForm')[0].reset();
    });

    $('#birthday').datepicker({
        todayBtn: true,
        todayHighlight: true,
        daysOfWeekDisabled: [0, 6]
    });
});