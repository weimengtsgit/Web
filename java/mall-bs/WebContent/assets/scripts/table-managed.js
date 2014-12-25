var TableManaged = function () {

    return {

        //main function to initiate the module
        init: function (table_id) {
            
            if (!jQuery().dataTable) {
                return;
            }
           
            jQuery('#'+table_id+' .group-checkable').change(function () {
                var set = jQuery(this).attr("data-set");
                var checked = jQuery(this).is(":checked");
                jQuery(set).each(function () {
                    if (checked) {
                        $(this).attr("checked", true);
                    } else {
                        $(this).attr("checked", false);
                    }
                    $(this).parents('tr').toggleClass("active");
                });
                jQuery.uniform.update(set);

            });

            jQuery('#'+table_id+' tbody tr .checkboxes').change(function(){
                 $(this).parents('tr').toggleClass("active");
            });
            

        }

    };

}();