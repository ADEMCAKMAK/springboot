# springboot

----------------------------------------------------------------------------------------------------------------------------------------
branch name : feature_request_part_example

  Q : How to send http request from client side ? 

	function(listOfFiles) {

		let document = new Blob(
			[JSON.stringify({name:'document', data:'someContentOfData'})],
			{ type: 'application/json' }
			);
		let formData = new FormData();

		formData.append("file", listOfFiles[0]);
		formData.append("document", document);

		uploadFile( formData,
			function (response) {
				debug(JSON.stringify(response));
			},
			function (error) {
				debug(JSON.stringify(error));
			});
	},

	uploadFile: function (formData, fnSuccess, fnError) {
		return jQuery.ajax({
			url: 'http://localhost:8090/demo/api/request-part',
			data: formData,
			cache: false,
			processData: false,
			contentType: false,
			method: "POST",
			success: fnSuccess,
			error: fnError
	});
      
----------------------------------------------------------------------------------------------------------------------------------------
      
