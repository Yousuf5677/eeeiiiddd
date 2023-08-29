
   var fs=require('fs');
var http=require('http');

 var server=http.createServer(function (req,res){

  if(req.url=="/"){
fs.writeFile('demo.txt','Hello World',function (error){
    if(error){
        res.writeHead(200,{'Content-Type':'text/html'});
        res.write("File Write Fail");
        res.end();
    }
    else{
        res.writeHead(200,{'Content-Type':'text/html'});
        res.write("File Write Success");
        res.end();
    }
});
 
let data= fs.readFileSync('home.html','utf8');
    res.end(data);
}
else if(req.url=="/Contact"){
    let data= fs.readFileSync('contact.html','utf8');
    res.end(data);
}
else if(req.url=="/About"){
    let data= fs.readFileSync('about.html','utf8');
    res.end(data);
}



});

server.listen(3030);
console.log("Lisetening on 3000 port");





