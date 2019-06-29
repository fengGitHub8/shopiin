/*---LEFT BAR ACCORDION----*/
$(function () {
    $('#nav-accordion').dcAccordion({
        eventType: 'click',
        autoClose: true,
        saveState: true,
        disableLink: true,
        speed: 'slow',
        showCount: false,
        autoExpand: true,
//        cookie: 'dcjq-accordion-1',
        classExpand: 'dcjq-current-parent'
    });
});

var Script = function () {


//    sidebar dropdown menu auto scrolling

    jQuery('#sidebar .sub-menu > a').click(function () {
        var o = ($(this).offset());
        diff = 250 - o.top;
        if (diff > 0)
            $("#sidebar").scrollTo("-=" + Math.abs(diff), 500);
        else
            $("#sidebar").scrollTo("+=" + Math.abs(diff), 500);
    });


//    sidebar toggle

    $(function () {
        function responsiveView() {
            var wSize = $(window).width();
            if (wSize <= 768) {
                $('#container').addClass('sidebar-close');
                $('#sidebar > ul').hide();
            }
            if (wSize > 768) {
                $('#container').removeClass('sidebar-close');
                $('#sidebar > ul').show();
            }
        }

        $(window).on('load', responsiveView);
        $(window).on('resize', responsiveView);
    });

    $('.fa-bars').click(function () {
        var width1 = $(window).width();
        var width2 = $("#sidebar").width();
        var width3 = width1 - width2;
        var height1 = $(window).height();
        var height2 = $(".header").height();
        var height3 = height1 - height2;
        console.log(height1);
        console.log(height2);
        console.log(height3);
        if ($('#sidebar > ul').is(":visible") === true) {
            $('#main-content').css({
                'margin-left': '0px'
            });
            width2 = 0;
            $('#sidebar').css({
                'margin-left': '-210px'

            });
            $('#sidebar > ul').hide();
            $("#container").addClass("sidebar-closed");
        } else {
            $('#main-content').css({
                'margin-left': '210px'
            });
            width2 = 210;
            $('#sidebar > ul').show();
            $('#sidebar').css({
                'margin-left': '0'
            });
            $("#container").removeClass("sidebar-closed");
        }
        var width3 = width1 - width2;
        $("#main-content").css("width", width3);
        $("#main-content").css("height", height3);
        $("#main-content").css("margin-top", height2);
        console.log($("#main-content").height());
    });

// custom scrollbar
    $("#sidebar").niceScroll({
        styler: "fb",
        cursorcolor: "#4ECDC4",
        cursorwidth: '3',
        cursorborderradius: '10px',
        background: '#404040',
        spacebarenabled: false,
        cursorborder: ''
    });

    $("html").niceScroll({
        styler: "fb",
        cursorcolor: "#4ECDC4",
        cursorwidth: '6',
        cursorborderradius: '10px',
        background: '#404040',
        spacebarenabled: false,
        cursorborder: '',
        zindex: '1000'
    });

// widget tools

    jQuery('.panel .tools .fa-chevron-down').click(function () {
        var el = jQuery(this).parents(".panel").children(".panel-body");
        if (jQuery(this).hasClass("fa-chevron-down")) {
            jQuery(this).removeClass("fa-chevron-down").addClass("fa-chevron-up");
            el.slideUp(200);
        } else {
            jQuery(this).removeClass("fa-chevron-up").addClass("fa-chevron-down");
            el.slideDown(200);
        }
    });

    jQuery('.panel .tools .fa-times').click(function () {
        jQuery(this).parents(".panel").parent().remove();
    });


//    tool tips

    $('.tooltips').tooltip();

//    popovers

    $('.popovers').popover();


// custom bar chart

    if ($(".custom-bar-chart")) {
        $(".bar").each(function () {
            var i = $(this).find(".value").html();
            $(this).find(".value").html("");
            $(this).find(".value").animate({
                height: i
            }, 2000)
        })
    }


}();