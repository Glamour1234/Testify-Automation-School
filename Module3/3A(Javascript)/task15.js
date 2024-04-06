const bookArray = [
    {
      title: 'Habits of highly effective people',
      description: 'the book helps you become a more effective individual',
      numberOfPages: 600,
      author: 'Steve Covey',
      reading: true,
    },
    {
      title: 'Five Love Languages',
      description: 'teaches couples how to know each other\'s love language',
      numberOfPages: 300,
      author: 'Gary Chapman',
      reading: true,
    },
    {
      title: 'Eat that Frog',
      description: 'how to get tasks done easily',
      numberOfPages: 370,
      author: 'Brian Tracy',
      reading: false,
    },
  ];
  for (let number = 0; number < bookArray.length; number = number + 1) {
    const loopingThroughTheBooks = bookArray[number];
    if (loopingThroughTheBooks.reading) {
      console.log(loopingThroughTheBooks);
    }
  }