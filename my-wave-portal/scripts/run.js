// const main = async () => {
//     const [owner, randomPerson] = await hre.ethers.getSigners();
//     const waveContractFactory = await hre.ethers.getContractFactory("WavePortal");
//     const waveContract = await waveContractFactory.deploy();
//     await waveContract.deployed();
  
//     console.log("Contract deployed to:", waveContract.address);
//     console.log("Contract deployed by:", owner.address);
  
//     await waveContract.getTotalWaves();
  
//     const firstWaveTxn = await waveContract.wave();
//     await firstWaveTxn.wait();
  
//     await waveContract.getTotalWaves();
  
//     const secondWaveTxn = await waveContract.connect(randomPerson).wave();
//     await secondWaveTxn.wait();
  
//     await waveContract.getTotalWaves();
//   };
  
//   const runMain = async () => {
//     try {
//       await main();
//       process.exit(0);
//     } catch (error) {
//       console.log(error);
//       process.exit(1);
//     }
//   };
  
//   runMain();

// secondWaveTxn = await waveContract.connect(randomPerson).wave();
// await secondWaveTxn.wait();

// await waveContract.getTotalWaves();


const main = async () => {
    const waveContractFactory = await hre.ethers.getContractFactory("WavePortal");
    const waveContract = await waveContractFactory.deploy();
    await waveContract.deployed();
    console.log("Contract addy:", waveContract.address);
  
    let waveCount;
    waveCount = await waveContract.getTotalWaves();
    console.log(waveCount.toNumber());
  
    /**
     * Let's send a few waves!
     */
    let waveTxn = await waveContract.wave("A message!");
    await waveTxn.wait(); // Wait for the transaction to be mined
  
    const [_, randomPerson] = await hre.ethers.getSigners();
    waveTxn = await waveContract.connect(randomPerson).wave("Another message!");
    await waveTxn.wait(); // Wait for the transaction to be mined
  
    let allWaves = await waveContract.getAllWaves();
    console.log(allWaves);
  };
  
  const runMain = async () => {
    try {
      await main();
      process.exit(0);
    } catch (error) {
      console.log(error);
      process.exit(1);
    }
  };
  
  runMain();
