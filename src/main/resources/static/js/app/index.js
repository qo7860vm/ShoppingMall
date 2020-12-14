var main = {
   init : function () {
       var _this = this;
       $('#btn-save').on('click', function () {
           _this.save();
       })
       $('#btn-update').on('click', function () {
           _this.update();
       })
       $('#btn-delete').on('click', function () {
           _this.delete();
       })
   },

   save : function () {
       var data = {

           name : $("#name").val(),
           price : $("#price").val(),
           desc : $("#desc").val()


       };

       $.ajax({
           type : 'PRODUCTS',
           url : '/api/v1/products',
           dataType : 'json',
           contentType : 'application/json; charset=utf-8',
           data : JSON.stringify(data)
       }).done(function () {
           alert('상품이 등록되었습니다.');
           window.location.href = '/';
       }).fail(function (error) {
           alert(JSON.stringify(error));
       })
   },

   update : function () {
         var data = {

             name : $("#name").val(),
             price : $("#price").val(),
             desc : $("#desc").val()

         };

         $.ajax({
             type : 'PUT',
             url : '/api/v1/products/',
             dataType : 'json',
             contentType : 'application/json; charset=utf-8',
             data : JSON.stringify(data)
         }).done(function () {
             alert('상품이 수정되었습니다.');
             window.location.href = '/';
         }).fail(function (error) {
             alert(JSON.stringify(error));
         });
     },

    delete : function () {
         var id = $("#id").val();

         $.ajax({
             type : 'DELETE',
             url : '/api/v1/products/'+id,
             dataType : 'json',
             contentType : 'application/json; charset=utf-8',
         }).done(function () {
             alert('글이 삭제되었습니다.');
             window.location.href = '/';
         }).fail(function (error) {
             alert(JSON.stringify(error));
         });
     }
};

main.init();
