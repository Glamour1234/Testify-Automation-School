function getVowel (string){
    let vowel = aeiou;
    let vowelCount = 0;
    for (let i=0; i<string.length; i= i++){
        if (vowel.includes(i)){
            vowelCount ++
        }
    }
    console.log (vowelCount);
}