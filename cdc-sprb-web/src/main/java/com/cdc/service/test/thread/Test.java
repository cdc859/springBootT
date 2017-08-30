package com.cdc.service.test.thread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Test {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//testThread9();
		
		//testThread8();
		
		//testThread7();
		
		//testThread6();
		
		//testThread5();
		
		//testThread4();
		
		//testThread3();
		
		//testThread2();
		
		//testThread();
		
		//testThread10();
		
		//testThread11();
		
		//testThread12();
		
		//testThread13();
		
		//testThread14();
		
		//testThread15();
		
		//testThread16();
		
		//testThread17();
		
		//testThread18();
		
		//testThread19();
		
		//testThread20();
		
		//testThread21();
		
		//testThread22();
		
		//testThread23();
		
		//testThread24();
		
		//testThread25();
		
		//testThread26();
		
		//testThread27();
		
		//testThread28();
		
		//testThread29();
		
		//testThread30();
		
		//testThread31();
		
		//testThread32();
		
		//testThread33();
		
		//testThread34();
		
		//testThread35();
		
		//testThread36();
		
		//testThread37();
		
		//testThread38();
		
		//testThread39();
		
		//testThread40();
		
		//testThread41();
		
		//testThread42();
		
		//testThread43();
		
		//testThread44();
		
		//testThread45();
		
		//testThread46();
		
		testThread47();

	}
	
	/**
	 * 读写锁的使用，只要有写锁的都是互坼：都写、写都、写写等都是互坼，读读不是互坼
	 * 合理使用都写锁可以提高效率 
	 */
	public static void testThread47() {
		
		ReadAndWriteService raws = new ReadAndWriteService();
		//ReadThreadA rta = new ReadThreadA(raws);
		//rta.setName("ReadT");
		//rta.start();
		
		WriteThreadB rtb = new WriteThreadB(raws);
		rtb.setName("WriteT");
		rtb.start();
		
		WriteThreadB rtb1 = new WriteThreadB(raws);
		rtb1.setName("WriteT1");
		rtb1.start();
		
		ReadThreadA rta1 = new ReadThreadA(raws);
		rta1.setName("ReadT1");
		rta1.start();
		
	}
	
	/**
	 * condition.awaitUntil(calendar.getTime())在指定的时间内自动唤醒当前线程
	 * @throws InterruptedException
	 */
	public static void testThread46() throws InterruptedException {
		
		final WaitQueneLenthService wqls = new WaitQueneLenthService();
		
		Runnable runnable = new Runnable() {

			public void run() {
				
				wqls.method5();
				
			}
			
		};
		
		Thread threadsA = new Thread(runnable);
		threadsA.setName("A");
		threadsA.start();
		System.out.println("main end");
		
	}
	
	/**
	 * condition.awaitUninterruptibly()使线程处于待定状态且不会被interrupt()打断
	 * @throws InterruptedException
	 */
	public static void testThread45() throws InterruptedException {
		
		final WaitQueneLenthService wqls = new WaitQueneLenthService();
		
		Runnable runnable = new Runnable() {

			public void run() {
				
				wqls.method4();
				
			}
			
		};
		
		Thread threadsA = new Thread(runnable);
		threadsA.setName("A");
		threadsA.start();
		
		Thread.sleep(3000);
		threadsA.interrupt();
		System.out.println("main end");
		
	}
	
	/**
	 * 在给定时间内，如果锁没有被另外一个线程锁定，且线程没有中断则获取该锁
	 * @throws InterruptedException
	 */
	public static void testThread44() throws InterruptedException {
		
		final WaitQueneLenthService wqls = new WaitQueneLenthService();
		
		Runnable runnable = new Runnable() {

			public void run() {
				
				System.out.println("threadName " + Thread.currentThread().getName() + "调用method3的时间=" + System.currentTimeMillis());
				wqls.method3();
				
			}
			
		};
		
		Thread threadsA = new Thread(runnable);
		threadsA.setName("A");
		threadsA.start();
		
		Thread threadsB = new Thread(runnable);
		threadsB.setName("B");
		threadsB.start();
		
	}
	
	/**
	 * lock.tryLock()锁定在未被其他线程保持锁的情况下才获得锁
	 * @throws InterruptedException
	 */
	public static void testThread43() throws InterruptedException {
		
		final WaitQueneLenthService wqls = new WaitQueneLenthService();
		
		Runnable runnable = new Runnable() {

			public void run() {
				
				wqls.method2();
				
			}
			
		};
		
		Thread threadsA = new Thread(runnable);
		threadsA.setName("A");
		threadsA.start();
		
		Thread threadsB = new Thread(runnable);
		threadsB.setName("B");
		threadsB.start();
		
	}
	
	/**
	 * lock.lockInterruptibly()如果当前线程未被中断则获取锁，已经被中断则抛出异常
	 * @throws InterruptedException
	 */
	public static void testThread42() throws InterruptedException {
		
		final WaitQueneLenthService wqls = new WaitQueneLenthService();
		
		Runnable runnable = new Runnable() {

			public void run() {
				
				wqls.method();
				
			}
			
		};
		
		Thread threadsA = new Thread(runnable);
		threadsA.setName("A");
		threadsA.start();
		Thread.sleep(500);
		
		Thread threadsB = new Thread(runnable);
		threadsB.setName("B");
		threadsB.start();
		threadsB.interrupt();
		
		System.out.println("main end");		
		
	}
	
	/**
	 * lock.hasQueuedThread(threads)查询此线程是否在等待此锁
	 * lock.hasQueuedThread()查询是否有线程在等待获取此锁
	 * lock.isHeldByCurrentThread()查询当前线程顺丰占有锁
	 * lock.isLocked()查询此锁是否由任意线程保持
	 * @throws InterruptedException
	 */
	public static void testThread41() throws InterruptedException {
		
		final WaitQueneLenthService wqls = new WaitQueneLenthService();
		
		Runnable runnable = new Runnable() {

			public void run() {
				
				wqls.method1();
				
			}
			
		};
		
		Thread threadsA = new Thread(runnable);
		
		threadsA.start();
		Thread.sleep(500);
		
		Thread threadsB = new Thread(runnable);
		
		threadsB.start();
		Thread.sleep(500);
		
		System.out.println(wqls.lock.hasQueuedThread(threadsA));
		System.out.println(wqls.lock.hasQueuedThread(threadsB));
		System.out.println(wqls.lock.hasQueuedThreads());
		
	}
	
	/**
	 * lock.getWaitQueueLength(condition)获取正在等待状态的线程数
	 * lock.hasWaiters(condition)是否有线程在指定的condition中等待状态
	 * @throws InterruptedException
	 */
	public static void testThread40() throws InterruptedException {
		
		final WaitQueneLenthService wqls = new WaitQueneLenthService();
		
		Runnable runnable = new Runnable() {

			public void run() {
				
				wqls.waitMethod();
				
			}
			
		};
		
		Thread[] threads = new Thread[10];
		
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(runnable);
		}
		
		for (int i = 0; i < 10; i++) {
			threads[i].start();
		}
		
		Thread.sleep(2000);
		wqls.notityMethod();
		
	}
	
	/**
	 * lock.getQueueLength()获取正在等待获取锁的线程数
	 * @throws InterruptedException
	 */
	public static void testThread39() throws InterruptedException {
		
		final WaitQueneLenthService wqls = new WaitQueneLenthService();
		
		Runnable runnable = new Runnable() {

			public void run() {
				
				System.out.println("线程" + Thread.currentThread().getName() + "运行了");
				wqls.method1();
				
			}
			
		};
		
		Thread[] threads = new Thread[10];
		
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(runnable);
		}
		
		for (int i = 0; i < 10; i++) {
			threads[i].start();
		}
		
		Thread.sleep(2000);
		System.out.println("有线程数：" + wqls.lock.getQueueLength() + "在等待获取锁");
		
	}
	
	/**
	 * lock.getHoldCount()查询当前线程保持锁的个数
	 */
	public static void testThread38() {
		
		HoldCountService hcs = new HoldCountService();
		hcs.method1();
		
	}
	
	/**
	 * true公平锁与false非公平锁的区别
	 * 公平锁：基本是谁先开始就谁优先获取锁
	 * 非公司锁：随机优先级获取锁
	 * lock.isFair()查询此lock是否是属于公平锁
	 */
	public static void testThread37() {
		
		final ConditionFairService cfs = new ConditionFairService(true);//公平锁
		//final ConditionFairService cfs = new ConditionFairService(false);//非公平锁
		
		Runnable runnable = new Runnable() {

			public void run() {
				
				System.out.println("线程" + Thread.currentThread().getName() + "运行了");
				cfs.serviceMethod();
				
			}
			
		};
		
		Thread[] threads = new Thread[10];
		
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(runnable);
		}
		
		for (int i = 0; i < 10; i++) {
			threads[i].start();
		}
		
	}
	
	/**
	 * 释放特定的Conditicon的await
	 * @throws InterruptedException
	 */
	public static void testThread36() throws InterruptedException {
		
		ConditiconService conditiconService = new ConditiconService();
		
		ConditionThreadC conditionThreadC = new ConditionThreadC(conditiconService);
		conditionThreadC.setName("C");
		conditionThreadC.start();
		
		ConditionThreadD conditionThreadD = new ConditionThreadD(conditiconService);
		conditionThreadD.setName("D");
		conditionThreadD.start();
		
		Thread.sleep(2000);
		conditiconService.signalAll_D();
		
	}
	
	/**
	 * signalAll()来释放所有的lock对象锁
	 * 在多个线程中注意使用signalAll来释放锁，防止假死情况
	 * @throws InterruptedException
	 */
	public static void testThread35() throws InterruptedException {
		
		ConditiconService conditiconService = new ConditiconService();
		
		ConditionThreadA conditionThreadA = new ConditionThreadA(conditiconService);
		conditionThreadA.setName("A");
		conditionThreadA.start();
		
		ConditionThreadB conditionThreadB = new ConditionThreadB(conditiconService);
		conditionThreadB.setName("B");
		conditionThreadB.start();
		
		Thread.sleep(2000);
		conditiconService.signalAll();
		
	}
	
	/**
	 * 在lock中使用condition来让线程等待状态，与wait相似，用这个等待方法时前提必须是lock状态，与在用wait时前提必须是synchronzied中一样
	 * lock中的线程使用signal()来释放对象锁
	 * @throws InterruptedException 
	 */
	public static void testThread34() throws InterruptedException {
		
		ConditiconService conditiconService = new ConditiconService();
		
		ConditionThread conditionThread = new ConditionThread(conditiconService);
		conditionThread.start();
		
		Thread.sleep(2000);
		conditiconService.signal();
		
	}
	
	/**
	 * lock是jdk5之后新增的特性，与synchronized同样的效果，且多了新的功能可用
	 */
	public static void testThread33() {
		
		LockService ls = new LockService();
		
		LockServiceThread lst = new LockServiceThread(ls);
		LockServiceThread lst2 = new LockServiceThread(ls);
		LockServiceThread lst3 = new LockServiceThread(ls);
		LockServiceThread lst4 = new LockServiceThread(ls);
		LockServiceThread lst5 = new LockServiceThread(ls);
		
		lst.start();
		lst2.start();
		lst3.start();
		lst4.start();
		lst5.start();
		
	}
	
	/**
	 * InheritableThreadLocal字线程会继承父线程的值
	 *  InheritableThreadLocal中子线程需要修改父线程的值可以重写childValue方法
	 * @throws InterruptedException
	 */
	public static void testThread32() throws InterruptedException {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("在线程main 取的值=" + ThreadTools.itl.get());
			Thread.sleep(100);
		}
		
		Thread.sleep(2000);
		
		InheritableThread it = new InheritableThread();
		it.start();
		
	}
	
	/**
	 * ThreadLocal存放线程的私有数据，线程间的数据互不干扰
	 */
	public static void testThread31() throws InterruptedException {
		
		ThreadLocalA tla = new ThreadLocalA();
		ThreadLocalB tlb = new ThreadLocalB();
		tla.start();
		tlb.start();
		
		for (int i = 0; i < 100; i++) {
			
			ThreadTools.tl.set("main" + (i + 1));
			System.out.println("main get value=" + ThreadTools.tl.get());
			Thread.sleep(200);
			
		}
		
	}
	
	/**
	 * ThreadLocal存放线程的私有数据，线程间的数据互不干扰
	 * 如果需要有初始化值需要自己写类ThreadLocalExt继承ThreadLocal，重写initialValue方法即可
	 * 使用ThreadLocalExt时每个线程都有自己独有值
	 */
	public static void testThread30() {
		
		//ThreadLocal<String> tl = new ThreadLocal<String>();
		
		ThreadLocalExt<String> tl = new ThreadLocalExt<String>();//具有初始化值
		
		if (tl.get() == null) {
			System.out.println("从未放过值。");
			tl.set("我的值");
		}
		
		System.out.println(tl.get());
		System.out.println(tl.get());
		
	}
	
	/**
	 * join让主线程等待子线程执行完后在执行，具体实现是使用wait方法，所以要注意遇到interrupt时候会报异常
	 * 也是由于join使用的是wait实现，所以线程是会释放锁，与sleep方法不同，sleep是不释放锁
	 * @throws InterruptedException
	 */
	public static void testThread29() throws InterruptedException {
		
		JoinThread jt = new JoinThread();
		jt.start();
		
		//Thread.sleep(???);无法确定sleep多少时间才能达到下面打印的要求
		jt.join();//用join可以解决这个问题
		
		System.out.println("我想在jt线程执行完后在执行。");
		
	}
	
	/**
	 * 线程间的通讯
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void testThread28() throws IOException, InterruptedException {
		
		WriteData wd = new WriteData();
		ReadData rd = new ReadData();
		
		PipedOutputStream out = new PipedOutputStream();
		PipedInputStream input = new PipedInputStream();
		
		out.connect(input);
		
		ReadThread rt = new ReadThread(rd, input);
		rt.start();
		
		Thread.sleep(2000);
		
		WriteThread wt = new WriteThread(wd, out);
		wt.start();
		
	}
	
	/**
	 * 一生产者多消费者-操作栈
	 * 多线程中如果用if判断，由于有可能出现在wait之后继续运行下去，这时候有可能其他线程改变了list的值，所以list。size（）为0，
	 * 在执行remove时会报异常。但是用while来判断，在唤醒线程时还会去判断list。size（），保证正常remove不会出现异常。
	 * 在不确定有多少线程wait的时候，要用notifyAll来唤醒全部wait线程，否则会出现假死情况
	 */
	public static void testThread27() {
		
		MyStack ms = new MyStack();
		
		MyStackCService mscs = new MyStackCService(ms);
		MyStackPService msps = new MyStackPService(ms);
		
		MyStackCService mscs2 = new MyStackCService(ms);
		MyStackCService mscs3 = new MyStackCService(ms);
		MyStackCService mscs4 = new MyStackCService(ms);
		MyStackCService mscs5 = new MyStackCService(ms);
		
		
		StackProductThread spt = new StackProductThread(msps);
		
		spt.start();
		
		StackConsumerThread sct = new StackConsumerThread(mscs);
		
		StackConsumerThread sct2 = new StackConsumerThread(mscs2);
		StackConsumerThread sct3 = new StackConsumerThread(mscs3);
		StackConsumerThread sct4 = new StackConsumerThread(mscs4);
		StackConsumerThread sct5 = new StackConsumerThread(mscs5);
		
		
		sct.start();
		
		sct2.start();
		sct3.start();
		sct4.start();
		sct5.start();
		
	}
	
	/**
	 * 一生产者一消费者-操作栈
	 */
	public static void testThread26() {
		
		MyStack ms = new MyStack();
		
		MyStackCService mscs = new MyStackCService(ms);
		MyStackPService msps = new MyStackPService(ms);
		
		StackProductThread spt = new StackProductThread(msps);
		StackConsumerThread sct = new StackConsumerThread(mscs);
		
		spt.start();
		sct.start();
		
		
	}
	
	/**
	 * 多个生产者与多个消费者时，nofity()可能会出现线程假死等待的情况
	 * 所以需要用nofityAll()解决这种问题
	 * @throws InterruptedException
	 */
	public static void testThread25() throws InterruptedException {
		
		String lock = new String("");
		
		Product p = new Product(lock);
		Consumer c = new Consumer(lock);
		
		ProductThread[] productThreads = new ProductThread[2];
		ConsumerThread[] consumerThreads = new ConsumerThread[2];
		
		for (int i = 0; i < 2; i++) {
			
			productThreads[i] = new ProductThread(p);
			productThreads[i].setName("生产者 " + (i + 1));
			
			consumerThreads[i] = new ConsumerThread(c);
			consumerThreads[i].setName("消费者 " + (i + 1));
			
			productThreads[i].start();
			consumerThreads[i].start();
			
		}
		
		Thread.sleep(5000);
		Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for (int i = 0; i < threadArray.length; i++) {
			System.out.println("-----------------------------------------------------------------------aaaaaa");
			System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
			
		}
		
	}
	
	/**
	 * 一个生产者与一个消费者
	 */
	public static void testThread24() {
		
		String lock = new String("");
		
		Product p = new Product(lock);
		Consumer c = new Consumer(lock);
		
		ProductThread pt = new ProductThread(p);
		pt.setName("producer");
		ConsumerThread ct = new ConsumerThread(c);
		ct.setName("consumer");
		
		pt.start();
		ct.start();
		
	}
	
	/**
	 * notify()只会随机唤醒一个wait，可以多次调用唤醒多个wait()
	 * 在不确定有几个wait()情况，notifyAll()可以唤醒所以的wait()
	 * 如果是wait(Long)，则在long时间内如果有notify()则会唤醒，如果超过long时间即使没有notify()也会自动唤醒
	 * 注意notify与wait的调用顺序，否则可能出现先notify后wait的情况导致线程一直等待
	 * @throws InterruptedException
	 */
	public static void testThread23() throws InterruptedException {
		
		Object ob = new Object();
		
		NofityServiceThread mst = new NofityServiceThread(ob);
		mst.setName("A");
		mst.start();
		
		NofityServiceThread1 mst1 = new NofityServiceThread1(ob);
		mst1.setName("B");
		mst1.start();
		
		NofityServiceThread2 mst2 = new NofityServiceThread2(ob);
		mst2.setName("C");
		mst2.start();
		
		Thread.sleep(5000);
		NofityServiceThreadN nstn = new NofityServiceThreadN(ob);
		nstn.start();
		
	}
	
	/**
	 * wait会释放锁(其他线程也可能进来，注意使用防止异常)，sleep不会释放锁
	 * modify也不会释放锁，等所在锁的同步快后才释放锁
	 * 处于wait状态的线程被interrupt后会抛出异常
	 * @throws InterruptedException 
	 */
	public static void testThread22() throws InterruptedException {
		
		Object ob = new Object();
		WaitReleaseThread wrt = new WaitReleaseThread(ob);
		wrt.setName("A");
		wrt.start();
		
		WaitReleaseThread2 wrt2 = new WaitReleaseThread2(ob);
		wrt2.setName("B");
		wrt2.start();
		
		Thread.sleep(5000);
		wrt.interrupt();//处于wait状态的线程被interrupt后会抛出异常
		
	}
	
	/**
	 * 线程在wait状态，可以使用nofity唤醒wait继续执行
	 * @throws InterruptedException
	 */
	public static void testThread21() throws InterruptedException {
		
		Object object = new Object();
		WaitListThread wtt = new WaitListThread(object);
		wtt.start();
		
		Thread.sleep(50);
		
		WaitListThread2 wtt2 = new WaitListThread2(object);
		wtt2.start();
		
	}
	
	/**
	 * 线程在wait状态，可以使用nofity唤醒wait继续执行
	 * @throws InterruptedException
	 */
	public static void testThread20() throws InterruptedException {
		
		Object object = new Object();
		
		WaitThread wt = new WaitThread(object);
		wt.start();
		
		Thread.sleep(3000);
		
		WaitThread2 wt2 = new WaitThread2(object);
		wt2.start();
		
	}
	
	/**
	 * wait只有在持有对象锁才能正常运行，否则会报 IllegalMonitorStateException异常
	 */
	public static void testThread19() {
		
		try {
			
			String s = new String("");
			
			System.out.println("syn 上面的");
			
			synchronized (s) {
				System.out.println("syn 第一行");
				s.wait();
				System.out.println("weit下面的代码");
			}
			
			System.out.println("syn 下面的");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * wait只有在持有对象锁才能正常运行，否则会报 IllegalMonitorStateException异常
	 */
	public static void testThread18() {
		
		try {
			String s = new String("");
			s.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 线程间的通讯.注意volatile的使用
	 */
	public static void testThread17() {
		
		MyList ml = new MyList();
		MyListThread mlt = new MyListThread(ml);
		mlt.setName("A");
		mlt.start();
		
		MyListThread2 mlt2 = new MyListThread2(ml);
		mlt2.setName("B");
		mlt2.start();
		
	}
	
	/**
	 * atomic在方法间调用使用时却不是原子性
	 * 原子类在方法间调用要保持同步需要加上同步关键字
	 * @throws InterruptedException
	 */
	public static void testThread16() throws InterruptedException {
		
		AtomicService as = new AtomicService();
		
		AtomicThread2 [] volatileThreadArray = new AtomicThread2[5];
		
		for (int i = 0; i < volatileThreadArray.length; i++) {
			volatileThreadArray[i] = new AtomicThread2(as);
		}
		
		for (int i = 0; i < volatileThreadArray.length; i++) {
			volatileThreadArray[i].start();
		}
		
		Thread.sleep(1000);
		
		System.out.println(as.acount.get());
		
	}
	
	/**
	 * atomic在单个方法使用时可以保证原子性
	 */
	public static void testThread15() {
		
		AtomicThread at = new AtomicThread();
		
		Thread t1 = new Thread(at);
		t1.start();
		
		Thread t2 = new Thread(at);
		t2.start();
		
		Thread t3 = new Thread(at);
		t3.start();
		
		Thread t4 = new Thread(at);
		t4.start();
		
		Thread t5 = new Thread(at);
		t5.start();
	}
	
	/**
	 * volatile虽然增加了线程间的变量可见性(保证主内容加载到线程工作内存的值最新的)，但是却不能保证同步，所以不具备原子性
	 * 要保证原子行，要使用同步关键字
	 * synchronized 同步关键字后可以保证互坼信和可见性，所以无需在加volatile保证可见性
	 */
	public static void testThread14() {
		
		VolatileThread [] volatileThreadArray = new VolatileThread[100];
		
		for (int i = 0; i < 100; i++) {
			volatileThreadArray[i] = new VolatileThread();
		}
		
		for (int i = 0; i < 100; i++) {
			volatileThreadArray[i].start();
		}
		
	}
	
	/**
	 * 当一个类继承了Thread或者实现Runnable接口该类中的属性在类的初始化时是存放在线程的公共堆栈中和线程的私有堆栈中
	 * jdk6及其之前的版本默认-client模式运行，设置run中的-server模式运行后jvm线程为了运行效率，线程一直在私人堆栈中取得running的值，
	 * 而rt.setRunning(false)虽然执行了，但更新的确 是公共堆栈的running的值，公共堆栈与私有堆栈不同步，从而导致了死循环没有停止
	 * jdk7、8-client模式被忽略了只有-server模式，所以线程一直在私人堆栈中取得running的值，所以一直公共堆栈与私有堆栈不同步，从而导致了死循环没有停止
	 * 注：jdk6及其之前的版本，存在client与server运行模式之分，client模式采用轻量级的jvm启动快、但少了一些优性能优化的机制。server模式采用重量级的jvm启动教慢，
	 * 	  但是却多了很多性能优化的机制。而在jdk7、8之后不存在client模式了，全部统一server模式
	 * @throws InterruptedException
	 */
	public static void testThread13() throws InterruptedException {
		
		RunThread rt = new RunThread();
		rt.start();
		
		Thread.sleep(1000);
		
		rt.setRunning(false);
		
		System.out.println("已经赋值为false");
		
	}
	
	/**
	 * 多线程可以设置到false的值,但是在死循环中使用System.out.println或则sleep()情况，否则还是会出现公共堆栈与私有堆栈的问题
	 * 原因可能是JVM会尽力保证内存的可见性，即便这个变量没有加同步关键字,System.out.println或则sleep()运行后cpu有足够的时间去同步公共堆栈与私有堆栈的值，保证变量的可见性，从而解决了问题
	 * @throws InterruptedException 
	 */
	public static void testThread12() throws InterruptedException {
		
		PrintStringThread pst = new PrintStringThread();
		
		Thread td = new Thread(pst);
		td.setName("td");
		td.start();
		//pst.start();
		Thread.sleep(1000);
		System.out.println("我要停止他 thread name=" + Thread.currentThread().getName());
		pst.setContinutePrint(false);
	}
	
	/**
	 * 执行不到想要的false，出现死循环
	 */
	public static void testThread11() {
		
		PrintString ps = new PrintString();
		ps.printStringMethod();
		
		System.out.println("我要停止他 thread name=" + Thread.currentThread().getName());
		ps.setContinutePrint(false);
		
	}
	
	/**
	 * 锁对象的改变，导致同步异步执行
	 * @throws InterruptedException
	 */
	public static void testThread10() throws InterruptedException {
		
		StringService ss = new StringService();
		
		StringThreadC stc = new StringThreadC(ss);
		stc.setName("C");
		
		StringThreadD std = new StringThreadD(ss);
		std.setName("D");
		
		stc.start();
		//Thread.sleep(50);//打开此，两个线程抢的同一一个123对象的锁，保持同步执行，注释掉后线程C改变了String的对象，所以D来的时候拿的是456的锁，所以锁的对象不同会异步执行
		std.start();
		
	}
	
	/**
	 * 互相等待对方释放资源就有可能出现死锁
	 * jps - jstack可以跟踪死锁发生
	 * @throws InterruptedException
	 */
	public static void testThread9() throws InterruptedException {
		
		DealThread td = new DealThread();
		td.setUserName("a");
		
		Thread td1 = new Thread(td);
		td1.start();
		Thread.sleep(100);
		td.setUserName("b");
		
		Thread td2 = new Thread(td);
		td2.start();
		
	}
	
	/**
	 * String常量池的影响，往String类型加锁时会阻塞其他线程
	 * 如不希望阻塞可以换成Object类
	 */
	public static void testThread8() {
		
		StringService ss = new StringService();
		
		StringThreadA sta = new StringThreadA(ss);
		sta.setName("A");
		sta.start();
		
		StringThreadB stb = new StringThreadB(ss);
		stb.setName("B");
		stb.start();
	}
	
	/**
	 * static 前加cynchronized是类锁，与对象锁是两个不同的锁
	 * 类锁对此类所有的new的对象都起作用
	 */
	public static void testThread7() {
		
		StaticService ss = new StaticService();
		
		StaticService ss2 = new StaticService();
		
		StaticThreadA sta = new StaticThreadA(ss);
		sta.setName("A");
		sta.start();
		
		StaticThreadB stb = new StaticThreadB(ss2);
		stb.setName("B");
		stb.start();
		
		StaticThreadC stc = new StaticThreadC(ss);
		stc.setName("C");
		stc.start();
		
	}
	
	/**
	 * 线程执行会出现脏读问题
	 * @throws InterruptedException
	 */
	public static void testThread6() throws InterruptedException {
		
		MyOneList myOneList = new MyOneList();
		
		MyServiceTreadA myServiceTreadA = new MyServiceTreadA(myOneList);
		myServiceTreadA.setName("A");
		myServiceTreadA.start();
		
		MyServiceTreadB myServiceTreadB = new MyServiceTreadB(myOneList);
		myServiceTreadB.setName("B");
		myServiceTreadB.start();
		Thread.sleep(6000);
		
		System.out.println("myOneList.size()=" + myOneList.getSize());
	}
	
	/**
	 * synchronzied 锁代码快（对象锁），其他非synchronzied代码快不受影响
	 * 但其他synchronzied修饰的代码快或则方法(对象锁)保持同步执行
	 */
	public static void testThread5() {
		
		Task task = new Task();
		TaskTread1 tt1 = new TaskTread1(task);
		tt1.start();
		
		TaskTread2 tt2 = new TaskTread2(task);
		tt2.start();
		
	}
	
	/**
	 * 终止线程用interrupt（只改变线程中断状态，需要自己处理），stop已经废弃的暴力终止，不建议使用（可能出现不可预知的问题）
	 * 调用interrupted方法，第一次会返回true。然后，当前线程的中断状态被方法内部清除了
	 * 而调用isInterrupted()只是简单的查询中断状态，不会对状态进行修改
	 */
	public static void testThread4() {
		MyThread3 myThread3 = new MyThread3();
		
		try {
			
			myThread3.start();
			Thread.sleep(1000);
			myThread3.interrupt();
			
			System.out.println("interrupted是否终止1：" + myThread3.interrupted());
			System.out.println("interrupted是否终止2：" + myThread3.interrupted());
			
			System.out.println("isInterrupted是否终止1：" + myThread3.isInterrupted());
			System.out.println("isInterrupted是否终止2：" + myThread3.isInterrupted());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end!");
	}
	
	/**
	 * 静态变量线程不安全，需加 synchronized 关键字达到线程安全
	 */
	public static void testThread3() {
		
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
		
	}
	
	/**
	 * 基础多线程-线程不安全，需加 synchronized 关键字达到线程安全
	 * 如方法内定义变量是线程安全的
	 */
	public static void testThread2() {
		
		MyThread2 myThread2 = new MyThread2();
		Thread a = new Thread(myThread2, "A");
		Thread b = new Thread(myThread2, "B");
		Thread c = new Thread(myThread2, "C");
		Thread d = new Thread(myThread2, "D");
		Thread e = new Thread(myThread2, "E");
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
	
	/**
	 * 基础多线程-线程安全
	 */
	public static void testThread() {
		
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		
		a.start();
		b.start();
		c.start();
		
	}

}
