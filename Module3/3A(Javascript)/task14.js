const book = {title:'Habits of highly effective people',

              description:'the book helps you become a more effective individual',
              numberOfPages:600,
              author:'Steve Covey',
              reading: true,
                toggleReadStatus: function(){
                    if (book.reading === true) {
                        book.reading = true
                     } else{
                        book.reading = false
                     }
                    }
                }       
                 console.log(book.reading)    
