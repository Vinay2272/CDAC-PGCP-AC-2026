function main() {
    var n = 5;
    var s = '';

   
    for (var i = 0; i < n; i++) {
        s = '';
       
        for (var j = 0; j < n - i; j++)
            s += "* ";
        
        console.log(s);
       
    }
}
