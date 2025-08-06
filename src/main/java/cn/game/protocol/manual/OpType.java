package cn.game.protocol.manual;


/**
 * 操作类型
 * 2020年10月9日 上午10:46:02
 * @author SYQ
 */
public enum OpType{

	/** 购买商品 */
	BuyGoods(6 , "购买商品"),
	/** 抽卡 */
	Draw(11, "抽卡"),
	/** GM操作 */
	GM(12, "GM操作"),
	/** 效果产生的 */
	Effect(16, "效果产生的"),
	/** 选择事件 */
	EventOptin(17, "选择事件"),
	/** 装备强化 */
	EquipmentStrengthen(19, "装备强化"),

	/** 英雄升级 */
	HeroLevelUp(50, "英雄升级"),
	HeroConflate(51, "英雄合成"),

	HeishiFresh(53, "黑市刷新"),

	// 可以增加奖励的。
	Init(100, "初始化增加的"),
	Quest(101, "任务奖励"),
	ShopTrade(102, "商店购买"),
	Patrol(103, "巡逻，挂机"),
	BattleEnd(104, "战役结束"),
	HeroLvReset(105, "英雄等级重置"),
	HeroQualityReset(106, "英雄品质重置"),
	MonthCardBuy(107, "月卡购买"),
	MonthCardDay(108, "月卡每日奖励"),
	MonthCardDoubleBonus(109, "双月卡奖励"),

	Mail(110, "邮件"),
	Test(111, "测试添加"),

	TimerRecovery(112, "定时恢复"),
	NewHeroReward(113, "新英雄奖励"),

	PlayerLevelUp(114, "升级奖励"),

	CloudBox(115, "小云宝箱"),
	FirstCharge(116, "首冲"),
	ChapterGift(117, "章节礼包"),
	QuestActiveReward(118, "任务活跃积分奖励"),
	DayChallengeReward(119, "每日挑战活跃积分奖励"),

	FundPass(120, "通行证"),
	SevenDaysSignin(121, "七日签到活动"),

	ItemChoose(130, "自选道具"),
	ItemOpen(131, "道具开启"),
	FreeHeroDayRent(132, "免费英雄日租卡"),
	StoreStamina(133, "储存的体力"),

	BattleSweep(135, "关卡扫荡"),

	MengYanMiJingFirstFinish(138, "梦魇秘境首通奖励"),
	MengYanMiJingSweep(139, "梦魇秘境扫荡奖励"),
	DaoXinFirstFinish(140, "道心试炼首通奖励"),
	
	XinMoFirstFinish(141, "心魔试炼首通奖励"),
	
	DaoXinSweep(142, "道心试炼扫荡奖励"),

	XinMoSweep(143, "心魔试炼扫荡奖励"),

	DaoXinComplete(144, "道心试炼通关奖励"),

	XinMoComplete(145, "心魔试炼通关奖励"),

	YaoWangSweep(146, "妖王快跑扫荡奖励"),

	YaoWangComplete(147, "妖王快跑通关奖励"),

	llustrationsReward(148, "英雄图鉴奖励"),

	PotentialLvUp(150, "潜力升级"),
	PotentialBreak(151, "潜力突破"),
	RescueLvUp(152, "强援升级"),

	BattleStart(160, "战役开始"),

	BattleEndMultipleReward(161, "战役结束多倍奖励"),
	GachaConversion(162, "蓝卡转化货币"),
	Relive(163, "复活"),

	LingPoBattle(165, "灵魄之战"),
	LingPoBattlePointFull(166, "灵魄之战补积分"),
	LingPoBattleChange(167, "灵魄之战改难度"),

	QianKunMirror(169, "乾坤镜"),

	ShiLuoZhenJing(170, "失落真经"),

	WorldBoss(171, "世界boss"),

	XiangYaoChuMo(173, "降妖除魔"),

	LingShanWenChan(175, "灵山问禅"),
	LingShanBuyTimes(176, "灵山问禅购买次数"),
	LingShanWenChanFloorReward(177, "灵山问禅层奖励"),

	FairyFriend(180, "仙友"),
	SoulPet(181, "灵宠"),
	Secretscript(182, "神通"),
	BattleFirstReward(183, "关卡首通奖励"),
	BattleChapterFirstReward(184, "章节首通奖励"),

	Questionnaire(185, "调查问卷"),

	ItemSell(186, "道具出售"),

	FuncOpen(187, "功能开启"),

	HeroIllustrationsLevelReward(187, "图鉴等级奖励"),

	BoxOpen(200, "合并开宝箱"),
	MergeEquipLvUp(201, "合并装备升级"),
	HCHeroPieceAds(203, "看广告获得觉醒合成英雄碎片"),
	HCHeroStarUp(204, "合成英雄升星"),
	HCHeroLvUp(205, "合成英雄升级"),
	HCHeroComposite(206, "合成英雄"),
	vipFreeGiftReward(207, "vip 免费礼包掉落"),
	vipGiftReward(208, "vip 一次性礼包掉落"),
	Friend(210, "好友"),
	ActivityJQB(211, "金钱豹爆爆"),
	DA_DAO_WIN(212, "大道争锋赢了掉落"),
	DA_DAO_JOIN(213, "每天前5场战斗都会获得10争锋值"),
	DA_DAO_Buy(214, "大道争锋购买"),
	DA_DAO_FREE_ADD(215, "大道争锋每日免费奖励挑战券"),


	BuyXianShiLiBao(216, "限时礼包购买" ),
	ZhuanPanClearItem(217, "转盘结束销毁身上的抽奖卷" ),
	ZhuanPanDraw(218, "转盘抽奖"), 
	ZhuanPanItemBuy(219, "购买转盘抽奖道具"),
	ActivityMeiRiTeHui(220, "每日特惠礼包购买"),


	Rename(225, "改名"),

	inviteReward(218,"邀请分享任务奖励"),
	HeroSkinBreakdown(230, "英雄皮肤分解"),
	HeadPortraitRepeat(231, "头像重复获取"),

	ZongMenActive(232, "宗门活跃度奖励"),
	ZongMenShopReward(233,"宗门商店掉落"),
	zongMenChangeName(234,"宗门改名"),
	ZongMenBargain(236, "宗门购买砍价物品"),
	ZongMenQuestReward(137, "宗门任务积分奖励"),

	

	HeroFragmentCompose(250, "英雄合成"), 
	HeroDisassemble(251, "英雄分解"),
	
	GinsengTreeWarter(260, "人参果树浇水"), 
	GinsengTreeInsectic(261, "人参果树施肥"),
	GinsengTreeLevelUp(262, "人参果树升级"),
	GinsengTreeBug(263, "人参果树捉虫"),
	GinsengTreeInsecticidesBug(264, "人参果树购买杀虫剂"),
	GinsengTreeHangUp(265, "人参果树挂机"),
	GinsengTreeHarvest(266, "人参果树收获果实"),

	DrawHeroRefresh(270, "招募刷新英雄"),
	DrawHero(271, "招募英雄"),

	EquipDecompose(280, "装备分解"),
	EquipPartStrength(281, "装备部位强化"),
	DefenceLevelUp(282, "防线升级"),
	DefenceSkinStarUp(283, "防线皮肤升星"),

	GemCompose(290, "宝石合成"),
	GemTowerFirstFinish(138, "龙渊秘藏首通奖励"),
	GemTowerSweep(139, "龙渊秘藏扫荡奖励"),
	EquipTowerTicket(140, "踏破凌霄门票"),
	EquipTowerFinish(141, "踏破凌霄通关奖励"),
	EquipTowerHelp(142, "龙渊秘藏助战奖励"),
	EquipTowerStart(143, "龙渊秘藏开始战斗"),
	MountainBattleBuffShop(144, "大圣来巡山Buff商店掉落"),
	MountainBattle(145, "大圣来巡山战斗掉落"),
	MountainBattleEvent(146, "大圣来巡山事件掉落"),
	PressureTest(888, "压力测试"),
	None(999, "未定义"),;

	private int id ;
	private String name ; 
	private String desc ; 

	private OpType(int id, String name, String desc) {
		this.id = id; 
		this.name = name; 
		this.desc = desc; 
//		UniqueValueEnum.checkDuplicateValue(this.getClass(), id);
	}

	private OpType(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}
	
	public static OpType get(int id) {
		OpType[] values = OpType.values();
		for (int i = 0, len = values.length; i < len; i++) {
			if (values[i].getId() == id) {
				return values[i];
			}
		}
		return null;
	}

	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public String getDesc(){
		return this.desc;
	}
}
