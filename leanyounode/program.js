var steps = 0

    for (var i = 2; i < process.argv.length; i++)
      steps += Number(process.argv[i])

    console.log(steps)
