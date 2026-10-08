package org.bouncycastle.math.ec;

import android.R;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class LongArray implements Cloneable {
    private static final String ZEROES = "0000000000000000000000000000000000000000000000000000000000000000";
    private long[] m_ints;
    private static final short[] INTERLEAVE2_TABLE = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    private static final int[] INTERLEAVE3_TABLE = {0, 1, 8, 9, 64, 65, 72, 73, 512, 513, 520, 521, 576, 577, 584, 585, PKIFailureInfo.certConfirmed, 4097, 4104, 4105, 4160, 4161, 4168, 4169, 4608, 4609, 4616, 4617, 4672, 4673, 4680, 4681, 32768, 32769, 32776, 32777, 32832, 32833, 32840, 32841, 33280, 33281, 33288, 33289, 33344, 33345, 33352, 33353, 36864, 36865, 36872, 36873, 36928, 36929, 36936, 36937, 37376, 37377, 37384, 37385, 37440, 37441, 37448, 37449, PKIFailureInfo.transactionIdInUse, 262145, 262152, 262153, 262208, 262209, 262216, 262217, 262656, 262657, 262664, 262665, 262720, 262721, 262728, 262729, 266240, 266241, 266248, 266249, 266304, 266305, 266312, 266313, 266752, 266753, 266760, 266761, 266816, 266817, 266824, 266825, 294912, 294913, 294920, 294921, 294976, 294977, 294984, 294985, 295424, 295425, 295432, 295433, 295488, 295489, 295496, 295497, 299008, 299009, 299016, 299017, 299072, 299073, 299080, 299081, 299520, 299521, 299528, 299529, 299584, 299585, 299592, 299593};
    private static final int[] INTERLEAVE4_TABLE = {0, 1, 16, 17, 256, 257, 272, 273, PKIFailureInfo.certConfirmed, 4097, 4112, 4113, 4352, 4353, 4368, 4369, PKIFailureInfo.notAuthorized, 65537, 65552, 65553, 65792, 65793, 65808, 65809, 69632, 69633, 69648, 69649, 69888, 69889, 69904, 69905, PKIFailureInfo.badCertTemplate, 1048577, 1048592, 1048593, 1048832, 1048833, 1048848, 1048849, 1052672, 1052673, 1052688, 1052689, 1052928, 1052929, 1052944, 1052945, 1114112, 1114113, 1114128, 1114129, 1114368, 1114369, 1114384, 1114385, 1118208, 1118209, 1118224, 1118225, 1118464, 1118465, 1118480, 1118481, 16777216, 16777217, 16777232, 16777233, 16777472, 16777473, 16777488, 16777489, 16781312, 16781313, 16781328, 16781329, 16781568, 16781569, 16781584, 16781585, R.attr.theme, R.attr.label, R.attr.exported, R.attr.process, R.attr.transcriptMode, R.attr.cacheColorHint, R.attr.childIndicatorRight, R.attr.childDivider, 16846848, 16846849, 16846864, 16846865, 16847104, 16847105, 16847120, 16847121, R.raw.loaderror, R.raw.nodomain, 17825808, 17825809, 17826048, 17826049, 17826064, 17826065, 17829888, 17829889, 17829904, 17829905, 17830144, 17830145, 17830160, 17830161, R.bool.config_sendPackageName, R.bool.config_showDefaultAssistant, R.bool.allow_test_udfps, R.bool.auto_data_switch_ping_test_before_switch, R.bool.config_cecRoutingControl_userConfigurable, R.bool.config_cecSetMenuLanguageDisabled_allowed, R.bool.config_cecSystemAudioModeMutingDisabled_allowed, R.bool.config_cecSystemAudioModeMutingDisabled_default, 17895424, 17895425, 17895440, 17895441, 17895680, 17895681, 17895696, 17895697, 268435456, 268435457, 268435472, 268435473, 268435712, 268435713, 268435728, 268435729, 268439552, 268439553, 268439568, 268439569, 268439808, 268439809, 268439824, 268439825, 268500992, 268500993, 268501008, 268501009, 268501248, 268501249, 268501264, 268501265, 268505088, 268505089, 268505104, 268505105, 268505344, 268505345, 268505360, 268505361, 269484032, 269484033, 269484048, 269484049, 269484288, 269484289, 269484304, 269484305, 269488128, 269488129, 269488144, 269488145, 269488384, 269488385, 269488400, 269488401, 269549568, 269549569, 269549584, 269549585, 269549824, 269549825, 269549840, 269549841, 269553664, 269553665, 269553680, 269553681, 269553920, 269553921, 269553936, 269553937, 285212672, 285212673, 285212688, 285212689, 285212928, 285212929, 285212944, 285212945, 285216768, 285216769, 285216784, 285216785, 285217024, 285217025, 285217040, 285217041, 285278208, 285278209, 285278224, 285278225, 285278464, 285278465, 285278480, 285278481, 285282304, 285282305, 285282320, 285282321, 285282560, 285282561, 285282576, 285282577, 286261248, 286261249, 286261264, 286261265, 286261504, 286261505, 286261520, 286261521, 286265344, 286265345, 286265360, 286265361, 286265600, 286265601, 286265616, 286265617, 286326784, 286326785, 286326800, 286326801, 286327040, 286327041, 286327056, 286327057, 286330880, 286330881, 286330896, 286330897, 286331136, 286331137, 286331152, 286331153};
    private static final int[] INTERLEAVE5_TABLE = {0, 1, 32, 33, 1024, 1025, 1056, 1057, 32768, 32769, 32800, 32801, 33792, 33793, 33824, 33825, PKIFailureInfo.badCertTemplate, 1048577, 1048608, 1048609, 1049600, 1049601, 1049632, 1049633, 1081344, 1081345, 1081376, 1081377, 1082368, 1082369, 1082400, 1082401, 33554432, 33554433, 33554464, 33554465, 33555456, 33555457, 33555488, 33555489, 33587200, 33587201, 33587232, 33587233, 33588224, 33588225, 33588256, 33588257, 34603008, 34603009, 34603040, 34603041, 34604032, 34604033, 34604064, 34604065, 34635776, 34635777, 34635808, 34635809, 34636800, 34636801, 34636832, 34636833, 1073741824, 1073741825, 1073741856, 1073741857, 1073742848, 1073742849, 1073742880, 1073742881, 1073774592, 1073774593, 1073774624, 1073774625, 1073775616, 1073775617, 1073775648, 1073775649, 1074790400, 1074790401, 1074790432, 1074790433, 1074791424, 1074791425, 1074791456, 1074791457, 1074823168, 1074823169, 1074823200, 1074823201, 1074824192, 1074824193, 1074824224, 1074824225, 1107296256, 1107296257, 1107296288, 1107296289, 1107297280, 1107297281, 1107297312, 1107297313, 1107329024, 1107329025, 1107329056, 1107329057, 1107330048, 1107330049, 1107330080, 1107330081, 1108344832, 1108344833, 1108344864, 1108344865, 1108345856, 1108345857, 1108345888, 1108345889, 1108377600, 1108377601, 1108377632, 1108377633, 1108378624, 1108378625, 1108378656, 1108378657};
    private static final long[] INTERLEAVE7_TABLE = {0, 1, 128, 129, 16384, 16385, 16512, 16513, 2097152, 2097153, 2097280, 2097281, 2113536, 2113537, 2113664, 2113665, 268435456, 268435457, 268435584, 268435585, 268451840, 268451841, 268451968, 268451969, 270532608, 270532609, 270532736, 270532737, 270548992, 270548993, 270549120, 270549121, 34359738368L, 34359738369L, 34359738496L, 34359738497L, 34359754752L, 34359754753L, 34359754880L, 34359754881L, 34361835520L, 34361835521L, 34361835648L, 34361835649L, 34361851904L, 34361851905L, 34361852032L, 34361852033L, 34628173824L, 34628173825L, 34628173952L, 34628173953L, 34628190208L, 34628190209L, 34628190336L, 34628190337L, 34630270976L, 34630270977L, 34630271104L, 34630271105L, 34630287360L, 34630287361L, 34630287488L, 34630287489L, 4398046511104L, 4398046511105L, 4398046511232L, 4398046511233L, 4398046527488L, 4398046527489L, 4398046527616L, 4398046527617L, 4398048608256L, 4398048608257L, 4398048608384L, 4398048608385L, 4398048624640L, 4398048624641L, 4398048624768L, 4398048624769L, 4398314946560L, 4398314946561L, 4398314946688L, 4398314946689L, 4398314962944L, 4398314962945L, 4398314963072L, 4398314963073L, 4398317043712L, 4398317043713L, 4398317043840L, 4398317043841L, 4398317060096L, 4398317060097L, 4398317060224L, 4398317060225L, 4432406249472L, 4432406249473L, 4432406249600L, 4432406249601L, 4432406265856L, 4432406265857L, 4432406265984L, 4432406265985L, 4432408346624L, 4432408346625L, 4432408346752L, 4432408346753L, 4432408363008L, 4432408363009L, 4432408363136L, 4432408363137L, 4432674684928L, 4432674684929L, 4432674685056L, 4432674685057L, 4432674701312L, 4432674701313L, 4432674701440L, 4432674701441L, 4432676782080L, 4432676782081L, 4432676782208L, 4432676782209L, 4432676798464L, 4432676798465L, 4432676798592L, 4432676798593L, 562949953421312L, 562949953421313L, 562949953421440L, 562949953421441L, 562949953437696L, 562949953437697L, 562949953437824L, 562949953437825L, 562949955518464L, 562949955518465L, 562949955518592L, 562949955518593L, 562949955534848L, 562949955534849L, 562949955534976L, 562949955534977L, 562950221856768L, 562950221856769L, 562950221856896L, 562950221856897L, 562950221873152L, 562950221873153L, 562950221873280L, 562950221873281L, 562950223953920L, 562950223953921L, 562950223954048L, 562950223954049L, 562950223970304L, 562950223970305L, 562950223970432L, 562950223970433L, 562984313159680L, 562984313159681L, 562984313159808L, 562984313159809L, 562984313176064L, 562984313176065L, 562984313176192L, 562984313176193L, 562984315256832L, 562984315256833L, 562984315256960L, 562984315256961L, 562984315273216L, 562984315273217L, 562984315273344L, 562984315273345L, 562984581595136L, 562984581595137L, 562984581595264L, 562984581595265L, 562984581611520L, 562984581611521L, 562984581611648L, 562984581611649L, 562984583692288L, 562984583692289L, 562984583692416L, 562984583692417L, 562984583708672L, 562984583708673L, 562984583708800L, 562984583708801L, 567347999932416L, 567347999932417L, 567347999932544L, 567347999932545L, 567347999948800L, 567347999948801L, 567347999948928L, 567347999948929L, 567348002029568L, 567348002029569L, 567348002029696L, 567348002029697L, 567348002045952L, 567348002045953L, 567348002046080L, 567348002046081L, 567348268367872L, 567348268367873L, 567348268368000L, 567348268368001L, 567348268384256L, 567348268384257L, 567348268384384L, 567348268384385L, 567348270465024L, 567348270465025L, 567348270465152L, 567348270465153L, 567348270481408L, 567348270481409L, 567348270481536L, 567348270481537L, 567382359670784L, 567382359670785L, 567382359670912L, 567382359670913L, 567382359687168L, 567382359687169L, 567382359687296L, 567382359687297L, 567382361767936L, 567382361767937L, 567382361768064L, 567382361768065L, 567382361784320L, 567382361784321L, 567382361784448L, 567382361784449L, 567382628106240L, 567382628106241L, 567382628106368L, 567382628106369L, 567382628122624L, 567382628122625L, 567382628122752L, 567382628122753L, 567382630203392L, 567382630203393L, 567382630203520L, 567382630203521L, 567382630219776L, 567382630219777L, 567382630219904L, 567382630219905L, 72057594037927936L, 72057594037927937L, 72057594037928064L, 72057594037928065L, 72057594037944320L, 72057594037944321L, 72057594037944448L, 72057594037944449L, 72057594040025088L, 72057594040025089L, 72057594040025216L, 72057594040025217L, 72057594040041472L, 72057594040041473L, 72057594040041600L, 72057594040041601L, 72057594306363392L, 72057594306363393L, 72057594306363520L, 72057594306363521L, 72057594306379776L, 72057594306379777L, 72057594306379904L, 72057594306379905L, 72057594308460544L, 72057594308460545L, 72057594308460672L, 72057594308460673L, 72057594308476928L, 72057594308476929L, 72057594308477056L, 72057594308477057L, 72057628397666304L, 72057628397666305L, 72057628397666432L, 72057628397666433L, 72057628397682688L, 72057628397682689L, 72057628397682816L, 72057628397682817L, 72057628399763456L, 72057628399763457L, 72057628399763584L, 72057628399763585L, 72057628399779840L, 72057628399779841L, 72057628399779968L, 72057628399779969L, 72057628666101760L, 72057628666101761L, 72057628666101888L, 72057628666101889L, 72057628666118144L, 72057628666118145L, 72057628666118272L, 72057628666118273L, 72057628668198912L, 72057628668198913L, 72057628668199040L, 72057628668199041L, 72057628668215296L, 72057628668215297L, 72057628668215424L, 72057628668215425L, 72061992084439040L, 72061992084439041L, 72061992084439168L, 72061992084439169L, 72061992084455424L, 72061992084455425L, 72061992084455552L, 72061992084455553L, 72061992086536192L, 72061992086536193L, 72061992086536320L, 72061992086536321L, 72061992086552576L, 72061992086552577L, 72061992086552704L, 72061992086552705L, 72061992352874496L, 72061992352874497L, 72061992352874624L, 72061992352874625L, 72061992352890880L, 72061992352890881L, 72061992352891008L, 72061992352891009L, 72061992354971648L, 72061992354971649L, 72061992354971776L, 72061992354971777L, 72061992354988032L, 72061992354988033L, 72061992354988160L, 72061992354988161L, 72062026444177408L, 72062026444177409L, 72062026444177536L, 72062026444177537L, 72062026444193792L, 72062026444193793L, 72062026444193920L, 72062026444193921L, 72062026446274560L, 72062026446274561L, 72062026446274688L, 72062026446274689L, 72062026446290944L, 72062026446290945L, 72062026446291072L, 72062026446291073L, 72062026712612864L, 72062026712612865L, 72062026712612992L, 72062026712612993L, 72062026712629248L, 72062026712629249L, 72062026712629376L, 72062026712629377L, 72062026714710016L, 72062026714710017L, 72062026714710144L, 72062026714710145L, 72062026714726400L, 72062026714726401L, 72062026714726528L, 72062026714726529L, 72620543991349248L, 72620543991349249L, 72620543991349376L, 72620543991349377L, 72620543991365632L, 72620543991365633L, 72620543991365760L, 72620543991365761L, 72620543993446400L, 72620543993446401L, 72620543993446528L, 72620543993446529L, 72620543993462784L, 72620543993462785L, 72620543993462912L, 72620543993462913L, 72620544259784704L, 72620544259784705L, 72620544259784832L, 72620544259784833L, 72620544259801088L, 72620544259801089L, 72620544259801216L, 72620544259801217L, 72620544261881856L, 72620544261881857L, 72620544261881984L, 72620544261881985L, 72620544261898240L, 72620544261898241L, 72620544261898368L, 72620544261898369L, 72620578351087616L, 72620578351087617L, 72620578351087744L, 72620578351087745L, 72620578351104000L, 72620578351104001L, 72620578351104128L, 72620578351104129L, 72620578353184768L, 72620578353184769L, 72620578353184896L, 72620578353184897L, 72620578353201152L, 72620578353201153L, 72620578353201280L, 72620578353201281L, 72620578619523072L, 72620578619523073L, 72620578619523200L, 72620578619523201L, 72620578619539456L, 72620578619539457L, 72620578619539584L, 72620578619539585L, 72620578621620224L, 72620578621620225L, 72620578621620352L, 72620578621620353L, 72620578621636608L, 72620578621636609L, 72620578621636736L, 72620578621636737L, 72624942037860352L, 72624942037860353L, 72624942037860480L, 72624942037860481L, 72624942037876736L, 72624942037876737L, 72624942037876864L, 72624942037876865L, 72624942039957504L, 72624942039957505L, 72624942039957632L, 72624942039957633L, 72624942039973888L, 72624942039973889L, 72624942039974016L, 72624942039974017L, 72624942306295808L, 72624942306295809L, 72624942306295936L, 72624942306295937L, 72624942306312192L, 72624942306312193L, 72624942306312320L, 72624942306312321L, 72624942308392960L, 72624942308392961L, 72624942308393088L, 72624942308393089L, 72624942308409344L, 72624942308409345L, 72624942308409472L, 72624942308409473L, 72624976397598720L, 72624976397598721L, 72624976397598848L, 72624976397598849L, 72624976397615104L, 72624976397615105L, 72624976397615232L, 72624976397615233L, 72624976399695872L, 72624976399695873L, 72624976399696000L, 72624976399696001L, 72624976399712256L, 72624976399712257L, 72624976399712384L, 72624976399712385L, 72624976666034176L, 72624976666034177L, 72624976666034304L, 72624976666034305L, 72624976666050560L, 72624976666050561L, 72624976666050688L, 72624976666050689L, 72624976668131328L, 72624976668131329L, 72624976668131456L, 72624976668131457L, 72624976668147712L, 72624976668147713L, 72624976668147840L, 72624976668147841L};
    static final byte[] bitLengths = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    public LongArray(int i15) {
        this.m_ints = new long[i15];
    }

    private static void add(long[] jArr, int i15, long[] jArr2, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i15 + i18;
            jArr[i19] = jArr[i19] ^ jArr2[i16 + i18];
        }
    }

    private static void addBoth(long[] jArr, int i15, long[] jArr2, int i16, long[] jArr3, int i17, int i18) {
        for (int i19 = 0; i19 < i18; i19++) {
            int i25 = i15 + i19;
            jArr[i25] = jArr[i25] ^ (jArr2[i16 + i19] ^ jArr3[i17 + i19]);
        }
    }

    private void addShiftedByBitsSafe(LongArray longArray, int i15, int i16) {
        int i17 = (i15 + 63) >>> 6;
        int i18 = i16 >>> 6;
        int i19 = i16 & 63;
        if (i19 == 0) {
            add(this.m_ints, i18, longArray.m_ints, 0, i17);
            return;
        }
        long jAddShiftedUp = addShiftedUp(this.m_ints, i18, longArray.m_ints, 0, i17, i19);
        if (jAddShiftedUp != 0) {
            long[] jArr = this.m_ints;
            int i25 = i17 + i18;
            jArr[i25] = jAddShiftedUp ^ jArr[i25];
        }
    }

    private static long addShiftedDown(long[] jArr, int i15, long[] jArr2, int i16, int i17, int i18) {
        int i19 = 64 - i18;
        long j15 = 0;
        while (true) {
            i17--;
            if (i17 < 0) {
                return j15;
            }
            long j16 = jArr2[i16 + i17];
            int i25 = i15 + i17;
            jArr[i25] = (j15 | (j16 >>> i18)) ^ jArr[i25];
            j15 = j16 << i19;
        }
    }

    private static long addShiftedUp(long[] jArr, int i15, long[] jArr2, int i16, int i17, int i18) {
        int i19 = 64 - i18;
        long j15 = 0;
        for (int i25 = 0; i25 < i17; i25++) {
            long j16 = jArr2[i16 + i25];
            int i26 = i15 + i25;
            jArr[i26] = (j15 | (j16 << i18)) ^ jArr[i26];
            j15 = j16 >>> i19;
        }
        return j15;
    }

    private static int bitLength(long j15) {
        int i15;
        int i16 = 32;
        int i17 = (int) (j15 >>> 32);
        if (i17 == 0) {
            i17 = (int) j15;
            i16 = 0;
        }
        int i18 = i17 >>> 16;
        if (i18 == 0) {
            int i19 = i17 >>> 8;
            i15 = i19 == 0 ? bitLengths[i17] : bitLengths[i19] + 8;
        } else {
            int i25 = i17 >>> 24;
            i15 = i25 == 0 ? bitLengths[i18] + 16 : bitLengths[i25] + 24;
        }
        return i16 + i15;
    }

    private int degreeFrom(int i15) {
        int i16 = (i15 + 62) >>> 6;
        while (i16 != 0) {
            i16--;
            long j15 = this.m_ints[i16];
            if (j15 != 0) {
                return (i16 << 6) + bitLength(j15);
            }
        }
        return 0;
    }

    private static void distribute(long[] jArr, int i15, int i16, int i17, int i18) {
        for (int i19 = 0; i19 < i18; i19++) {
            long j15 = jArr[i15 + i19];
            int i25 = i16 + i19;
            jArr[i25] = jArr[i25] ^ j15;
            int i26 = i17 + i19;
            jArr[i26] = j15 ^ jArr[i26];
        }
    }

    private static void flipBit(long[] jArr, int i15, int i16) {
        int i17 = i15 + (i16 >>> 6);
        jArr[i17] = jArr[i17] ^ (1 << (i16 & 63));
    }

    private static void flipVector(long[] jArr, int i15, long[] jArr2, int i16, int i17, int i18) {
        int i19 = i15 + (i18 >>> 6);
        int i25 = i18 & 63;
        if (i25 == 0) {
            add(jArr, i19, jArr2, i16, i17);
        } else {
            jArr[i19] = addShiftedDown(jArr, i19 + 1, jArr2, i16, i17, 64 - i25) ^ jArr[i19];
        }
    }

    private static void flipWord(long[] jArr, int i15, int i16, long j15) {
        int i17 = i15 + (i16 >>> 6);
        int i18 = i16 & 63;
        if (i18 == 0) {
            jArr[i17] = jArr[i17] ^ j15;
            return;
        }
        jArr[i17] = jArr[i17] ^ (j15 << i18);
        long j16 = j15 >>> (64 - i18);
        if (j16 != 0) {
            int i19 = i17 + 1;
            jArr[i19] = j16 ^ jArr[i19];
        }
    }

    private static void interleave(long[] jArr, int i15, long[] jArr2, int i16, int i17, int i18) {
        if (i18 == 3) {
            interleave3(jArr, i15, jArr2, i16, i17);
            return;
        }
        if (i18 == 5) {
            interleave5(jArr, i15, jArr2, i16, i17);
        } else if (i18 != 7) {
            interleave2_n(jArr, i15, jArr2, i16, i17, bitLengths[i18] - 1);
        } else {
            interleave7(jArr, i15, jArr2, i16, i17);
        }
    }

    private static long interleave2_32to64(int i15) {
        short[] sArr = INTERLEAVE2_TABLE;
        int i16 = sArr[i15 & GF2Field.MASK] | (sArr[(i15 >>> 8) & GF2Field.MASK] << 16);
        return (((long) i16) & BodyPartID.bodyIdMax) | ((((long) ((sArr[i15 >>> 24] << 16) | sArr[(i15 >>> 16) & GF2Field.MASK])) & BodyPartID.bodyIdMax) << 32);
    }

    private static long interleave2_n(long j15, int i15) {
        while (i15 > 1) {
            i15 -= 2;
            j15 = (interleave4_16to64(((int) (j15 >>> 48)) & 65535) << 3) | (interleave4_16to64(((int) (j15 >>> 16)) & 65535) << 1) | interleave4_16to64(((int) j15) & 65535) | (interleave4_16to64(((int) (j15 >>> 32)) & 65535) << 2);
        }
        if (i15 <= 0) {
            return j15;
        }
        return (interleave2_32to64((int) (j15 >>> 32)) << 1) | interleave2_32to64((int) j15);
    }

    private static long interleave3(long j15) {
        return (interleave3_21to63(((int) (j15 >>> 42)) & 2097151) << 2) | (Long.MIN_VALUE & j15) | interleave3_21to63(((int) j15) & 2097151) | (interleave3_21to63(((int) (j15 >>> 21)) & 2097151) << 1);
    }

    private static long interleave3_13to65(int i15) {
        int[] iArr = INTERLEAVE5_TABLE;
        int i16 = iArr[i15 & CertificateBody.profileType];
        return (((long) i16) & BodyPartID.bodyIdMax) | ((((long) iArr[i15 >>> 7]) & BodyPartID.bodyIdMax) << 35);
    }

    private static long interleave3_21to63(int i15) {
        int[] iArr = INTERLEAVE3_TABLE;
        int i16 = iArr[i15 & CertificateBody.profileType];
        return (((long) i16) & BodyPartID.bodyIdMax) | ((((long) iArr[i15 >>> 14]) & BodyPartID.bodyIdMax) << 42) | ((((long) iArr[(i15 >>> 7) & CertificateBody.profileType]) & BodyPartID.bodyIdMax) << 21);
    }

    private static long interleave4_16to64(int i15) {
        int[] iArr = INTERLEAVE4_TABLE;
        int i16 = iArr[i15 & GF2Field.MASK];
        return (((long) i16) & BodyPartID.bodyIdMax) | ((((long) iArr[i15 >>> 8]) & BodyPartID.bodyIdMax) << 32);
    }

    private static long interleave5(long j15) {
        return (interleave3_13to65(((int) (j15 >>> 52)) & 8191) << 4) | interleave3_13to65(((int) j15) & 8191) | (interleave3_13to65(((int) (j15 >>> 13)) & 8191) << 1) | (interleave3_13to65(((int) (j15 >>> 26)) & 8191) << 2) | (interleave3_13to65(((int) (j15 >>> 39)) & 8191) << 3);
    }

    private static long interleave7(long j15) {
        long[] jArr = INTERLEAVE7_TABLE;
        return (jArr[((int) (j15 >>> 54)) & 511] << 6) | (Long.MIN_VALUE & j15) | jArr[((int) j15) & 511] | (jArr[((int) (j15 >>> 9)) & 511] << 1) | (jArr[((int) (j15 >>> 18)) & 511] << 2) | (jArr[((int) (j15 >>> 27)) & 511] << 3) | (jArr[((int) (j15 >>> 36)) & 511] << 4) | (jArr[((int) (j15 >>> 45)) & 511] << 5);
    }

    private static void multiplyWord(long j15, long[] jArr, int i15, long[] jArr2, int i16) {
        int i17 = i15;
        long[] jArr3 = jArr2;
        int i18 = i16;
        if ((j15 & 1) != 0) {
            add(jArr3, i18, jArr, 0, i17);
        }
        long j16 = j15;
        int i19 = 1;
        while (true) {
            j16 >>>= 1;
            if (j16 == 0) {
                return;
            }
            if ((j16 & 1) != 0) {
                long jAddShiftedUp = addShiftedUp(jArr3, i18, jArr, 0, i17, i19);
                if (jAddShiftedUp != 0) {
                    int i25 = i16 + i15;
                    jArr2[i25] = jArr2[i25] ^ jAddShiftedUp;
                }
            }
            i19++;
            i17 = i15;
            jArr3 = jArr2;
            i18 = i16;
        }
    }

    private static void reduceBit(long[] jArr, int i15, int i16, int i17, int[] iArr) {
        flipBit(jArr, i15, i16);
        int i18 = i16 - i17;
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                flipBit(jArr, i15, i18);
                return;
            }
            flipBit(jArr, i15, iArr[length] + i18);
        }
    }

    private static void reduceBitWise(long[] jArr, int i15, int i16, int i17, int[] iArr) {
        while (true) {
            i16--;
            if (i16 < i17) {
                return;
            }
            if (testBit(jArr, i15, i16)) {
                reduceBit(jArr, i15, i16, i17, iArr);
            }
        }
    }

    private static int reduceInPlace(long[] jArr, int i15, int i16, int i17, int[] iArr) {
        int i18 = (i17 + 63) >>> 6;
        if (i16 < i18) {
            return i16;
        }
        int i19 = i16 << 6;
        int iMin = Math.min(i19, (i17 << 1) - 1);
        int i25 = i19 - iMin;
        int i26 = i16;
        while (i25 >= 64) {
            i26--;
            i25 -= 64;
        }
        int length = iArr.length;
        int i27 = iArr[length - 1];
        int i28 = length > 1 ? iArr[length - 2] : 0;
        int iMax = Math.max(i17, i27 + 64);
        int iMin2 = (i25 + Math.min(iMin - iMax, i17 - i28)) >> 6;
        if (iMin2 > 1) {
            int i29 = i26 - iMin2;
            int i35 = i26;
            reduceVectorWise(jArr, i15, i35, i29, i17, iArr);
            i26 = i35;
            while (i26 > i29) {
                i26--;
                jArr[i15 + i26] = 0;
            }
            iMin = i29 << 6;
        }
        int i36 = iMin;
        int i37 = i26;
        if (i36 > iMax) {
            reduceWordWise(jArr, i15, i37, iMax, i17, iArr);
        } else {
            iMax = i36;
        }
        if (iMax > i17) {
            reduceBitWise(jArr, i15, iMax, i17, iArr);
        }
        return i18;
    }

    private static LongArray reduceResult(long[] jArr, int i15, int i16, int i17, int[] iArr) {
        return new LongArray(jArr, i15, reduceInPlace(jArr, i15, i16, i17, iArr));
    }

    private static void reduceVectorWise(long[] jArr, int i15, int i16, int i17, int i18, int[] iArr) {
        int i19 = (i17 << 6) - i18;
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                flipVector(jArr, i15, jArr, i15 + i17, i16 - i17, i19);
                return;
            }
            flipVector(jArr, i15, jArr, i15 + i17, i16 - i17, i19 + iArr[length]);
        }
    }

    private static void reduceWord(long[] jArr, int i15, int i16, long j15, int i17, int[] iArr) {
        int i18 = i16 - i17;
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                flipWord(jArr, i15, i18, j15);
                return;
            }
            flipWord(jArr, i15, iArr[length] + i18, j15);
        }
    }

    private static void reduceWordWise(long[] jArr, int i15, int i16, int i17, int i18, int[] iArr) {
        int i19 = i17 >>> 6;
        int i25 = i16;
        while (true) {
            i25--;
            if (i25 <= i19) {
                break;
            }
            int i26 = i15 + i25;
            long j15 = jArr[i26];
            if (j15 != 0) {
                jArr[i26] = 0;
                reduceWord(jArr, i15, i25 << 6, j15, i18, iArr);
            }
        }
        int i27 = i17 & 63;
        int i28 = i15 + i19;
        long j16 = jArr[i28];
        long j17 = j16 >>> i27;
        if (j17 != 0) {
            jArr[i28] = (j17 << i27) ^ j16;
            reduceWord(jArr, i15, i17, j17, i18, iArr);
        }
    }

    private long[] resizedInts(int i15) {
        long[] jArr = new long[i15];
        long[] jArr2 = this.m_ints;
        System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, i15));
        return jArr;
    }

    private static long shiftUp(long[] jArr, int i15, int i16, int i17) {
        int i18 = 64 - i17;
        long j15 = 0;
        for (int i19 = 0; i19 < i16; i19++) {
            int i25 = i15 + i19;
            long j16 = jArr[i25];
            jArr[i25] = j15 | (j16 << i17);
            j15 = j16 >>> i18;
        }
        return j15;
    }

    private static void squareInPlace(long[] jArr, int i15, int i16, int[] iArr) {
        int i17 = i15 << 1;
        while (true) {
            i15--;
            if (i15 < 0) {
                return;
            }
            long j15 = jArr[i15];
            jArr[i17 - 1] = interleave2_32to64((int) (j15 >>> 32));
            i17 -= 2;
            jArr[i17] = interleave2_32to64((int) j15);
        }
    }

    private static boolean testBit(long[] jArr, int i15, int i16) {
        return (jArr[i15 + (i16 >>> 6)] & (1 << (i16 & 63))) != 0;
    }

    public LongArray addOne() {
        if (this.m_ints.length == 0) {
            return new LongArray(new long[]{1});
        }
        long[] jArrResizedInts = resizedInts(Math.max(1, getUsedLength()));
        jArrResizedInts[0] = jArrResizedInts[0] ^ 1;
        return new LongArray(jArrResizedInts);
    }

    public void addShiftedByWords(LongArray longArray, int i15) {
        int usedLength = longArray.getUsedLength();
        if (usedLength == 0) {
            return;
        }
        int i16 = usedLength + i15;
        if (i16 > this.m_ints.length) {
            this.m_ints = resizedInts(i16);
        }
        add(this.m_ints, i15, longArray.m_ints, 0, usedLength);
    }

    public Object clone() {
        return new LongArray(Arrays.clone(this.m_ints));
    }

    void copyTo(long[] jArr, int i15) {
        long[] jArr2 = this.m_ints;
        System.arraycopy(jArr2, 0, jArr, i15, jArr2.length);
    }

    public int degree() {
        int length = this.m_ints.length;
        while (length != 0) {
            length--;
            long j15 = this.m_ints[length];
            if (j15 != 0) {
                return (length << 6) + bitLength(j15);
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LongArray)) {
            return false;
        }
        LongArray longArray = (LongArray) obj;
        int usedLength = getUsedLength();
        if (longArray.getUsedLength() != usedLength) {
            return false;
        }
        for (int i15 = 0; i15 < usedLength; i15++) {
            if (this.m_ints[i15] != longArray.m_ints[i15]) {
                return false;
            }
        }
        return true;
    }

    public int getLength() {
        return this.m_ints.length;
    }

    public int getUsedLength() {
        return getUsedLengthFrom(this.m_ints.length);
    }

    public int getUsedLengthFrom(int i15) {
        long[] jArr = this.m_ints;
        int iMin = Math.min(i15, jArr.length);
        if (iMin < 1) {
            return 0;
        }
        if (jArr[0] != 0) {
            while (true) {
                int i16 = iMin - 1;
                if (jArr[i16] != 0) {
                    return iMin;
                }
                iMin = i16;
            }
        } else {
            while (true) {
                int i17 = iMin - 1;
                if (jArr[i17] != 0) {
                    return iMin;
                }
                if (i17 <= 0) {
                    return 0;
                }
                iMin = i17;
            }
        }
    }

    public int hashCode() {
        int usedLength = getUsedLength();
        int i15 = 1;
        for (int i16 = 0; i16 < usedLength; i16++) {
            long j15 = this.m_ints[i16];
            i15 = (((i15 * 31) ^ ((int) j15)) * 31) ^ ((int) (j15 >>> 32));
        }
        return i15;
    }

    public boolean isOne() {
        long[] jArr = this.m_ints;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i15 = 1; i15 < jArr.length; i15++) {
            if (jArr[i15] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isZero() {
        for (long j15 : this.m_ints) {
            if (j15 != 0) {
                return false;
            }
        }
        return true;
    }

    public LongArray modInverse(int i15, int[] iArr) {
        int iDegree = degree();
        if (iDegree == 0) {
            throw new IllegalStateException();
        }
        int i16 = 1;
        if (iDegree == 1) {
            return this;
        }
        LongArray longArray = (LongArray) clone();
        int i17 = (i15 + 63) >>> 6;
        LongArray longArray2 = new LongArray(i17);
        int iDegreeFrom = 0;
        reduceBit(longArray2.m_ints, 0, i15, i15, iArr);
        LongArray longArray3 = new LongArray(i17);
        longArray3.m_ints[0] = 1;
        LongArray longArray4 = new LongArray(i17);
        int[] iArr2 = new int[2];
        iArr2[0] = iDegree;
        iArr2[1] = i15 + 1;
        LongArray[] longArrayArr = {longArray, longArray2};
        int[] iArr3 = new int[2];
        iArr3[0] = 1;
        iArr3[1] = 0;
        LongArray[] longArrayArr2 = {longArray3, longArray4};
        int i18 = iArr2[1];
        int i19 = i18 - iArr2[0];
        while (true) {
            if (i19 < 0) {
                i19 = -i19;
                iArr2[i16] = i18;
                iArr3[i16] = iDegreeFrom;
                i16 = 1 - i16;
                i18 = iArr2[i16];
                iDegreeFrom = iArr3[i16];
            }
            int i25 = 1 - i16;
            longArrayArr[i16].addShiftedByBitsSafe(longArrayArr[i25], iArr2[i25], i19);
            int iDegreeFrom2 = longArrayArr[i16].degreeFrom(i18);
            if (iDegreeFrom2 == 0) {
                return longArrayArr2[i25];
            }
            int i26 = iArr3[i25];
            longArrayArr2[i16].addShiftedByBitsSafe(longArrayArr2[i25], i26, i19);
            int i27 = i26 + i19;
            if (i27 > iDegreeFrom) {
                iDegreeFrom = i27;
            } else if (i27 == iDegreeFrom) {
                iDegreeFrom = longArrayArr2[i16].degreeFrom(iDegreeFrom);
            }
            i19 += iDegreeFrom2 - i18;
            i18 = iDegreeFrom2;
        }
    }

    public LongArray modMultiply(LongArray longArray, int i15, int[] iArr) {
        int i16;
        int i17;
        LongArray longArray2;
        LongArray longArray3;
        long[] jArr;
        long[] jArr2;
        int iDegree = degree();
        if (iDegree == 0) {
            return this;
        }
        int iDegree2 = longArray.degree();
        if (iDegree2 == 0) {
            return longArray;
        }
        if (iDegree > iDegree2) {
            i17 = iDegree;
            i16 = iDegree2;
            longArray3 = this;
            longArray2 = longArray;
        } else {
            i16 = iDegree;
            i17 = iDegree2;
            longArray2 = this;
            longArray3 = longArray;
        }
        int i18 = (i16 + 63) >>> 6;
        int i19 = (i17 + 63) >>> 6;
        int i25 = ((i16 + i17) + 62) >>> 6;
        if (i18 == 1) {
            long j15 = longArray2.m_ints[0];
            if (j15 == 1) {
                return longArray3;
            }
            long[] jArr3 = new long[i25];
            multiplyWord(j15, longArray3.m_ints, i19, jArr3, 0);
            return reduceResult(jArr3, 0, i25, i15, iArr);
        }
        int i26 = (i17 + 70) >>> 6;
        int[] iArr2 = new int[16];
        int i27 = i26 << 4;
        long[] jArr4 = new long[i27];
        iArr2[1] = i26;
        System.arraycopy(longArray3.m_ints, 0, jArr4, i26, i19);
        int i28 = 2;
        int i29 = i26;
        while (i28 < 16) {
            int i35 = i29 + i26;
            iArr2[i28] = i35;
            if ((i28 & 1) == 0) {
                int i36 = i26;
                shiftUp(jArr4, i35 >>> 1, jArr4, i35, i36, 1);
                i26 = i36;
            } else {
                add(jArr4, i26, jArr4, i35 - i26, jArr4, i35, i26);
                i35 = i35;
            }
            i28++;
            i29 = i35;
        }
        long[] jArr5 = new long[i27];
        long[] jArr6 = jArr4;
        shiftUp(jArr6, 0, jArr5, 0, i27, 4);
        long[] jArr7 = longArray2.m_ints;
        int i37 = i25 << 3;
        long[] jArr8 = new long[i37];
        int i38 = 0;
        while (i38 < i18) {
            long j16 = jArr7[i38];
            int i39 = i26;
            int i45 = i38;
            while (true) {
                addBoth(jArr8, i45, jArr6, iArr2[((int) j16) & 15], jArr5, iArr2[((int) (j16 >>> 4)) & 15], i39);
                jArr = jArr8;
                int i46 = i45;
                jArr2 = jArr6;
                i26 = i39;
                j16 >>>= 8;
                if (j16 == 0) {
                    break;
                }
                jArr6 = jArr2;
                i39 = i26;
                jArr8 = jArr;
                i45 = i46 + i25;
            }
            i38++;
            jArr6 = jArr2;
            jArr8 = jArr;
        }
        long[] jArr9 = jArr8;
        while (true) {
            int i47 = i37 - i25;
            if (i47 == 0) {
                return reduceResult(jArr9, 0, i25, i15, iArr);
            }
            addShiftedUp(jArr9, i47 - i25, jArr9, i47, i25, 8);
            i37 = i47;
        }
    }

    public LongArray modMultiplyAlt(LongArray longArray, int i15, int[] iArr) {
        int i16;
        int i17;
        LongArray longArray2;
        LongArray longArray3;
        int i18;
        long[] jArr;
        int i19;
        int i25;
        long[] jArr2;
        int iDegree = degree();
        if (iDegree == 0) {
            return this;
        }
        int iDegree2 = longArray.degree();
        if (iDegree2 == 0) {
            return longArray;
        }
        if (iDegree > iDegree2) {
            i17 = iDegree;
            i16 = iDegree2;
            longArray3 = this;
            longArray2 = longArray;
        } else {
            i16 = iDegree;
            i17 = iDegree2;
            longArray2 = this;
            longArray3 = longArray;
        }
        int i26 = (i16 + 63) >>> 6;
        int i27 = (i17 + 63) >>> 6;
        int i28 = ((i16 + i17) + 62) >>> 6;
        int i29 = 0;
        int i35 = 1;
        if (i26 == 1) {
            long j15 = longArray2.m_ints[0];
            if (j15 == 1) {
                return longArray3;
            }
            long[] jArr3 = new long[i28];
            multiplyWord(j15, longArray3.m_ints, i27, jArr3, 0);
            return reduceResult(jArr3, 0, i28, i15, iArr);
        }
        int i36 = (i17 + 78) >>> 6;
        int i37 = i36 * 8;
        int[] iArr2 = new int[16];
        iArr2[0] = i26;
        int i38 = i26 + i37;
        iArr2[1] = i38;
        int i39 = 2;
        while (true) {
            i38 += i28;
            if (i39 >= 16) {
                break;
            }
            iArr2[i39] = i38;
            i39++;
        }
        int i45 = i26;
        long[] jArr4 = new long[i38 + 1];
        interleave(longArray2.m_ints, 0, jArr4, 0, i45, 4);
        System.arraycopy(longArray3.m_ints, 0, jArr4, i45, i27);
        int i46 = i45;
        int i47 = 1;
        while (i47 < 8) {
            int i48 = i46 + i36;
            int i49 = i45;
            shiftUp(jArr4, i49, jArr4, i48, i36, i47);
            i45 = i49;
            i47++;
            i46 = i48;
        }
        int i55 = 15;
        int i56 = 0;
        while (true) {
            int i57 = i29;
            while (true) {
                i18 = i55;
                int i58 = i45;
                int i59 = i29;
                long j16 = jArr4[i57] >>> i56;
                while (true) {
                    int i65 = ((int) j16) & i18;
                    if (i65 != 0) {
                        add(jArr4, iArr2[i65] + i57, jArr4, i58, i36);
                    }
                    int i66 = i59 + 1;
                    if (i66 == 8) {
                        break;
                    }
                    i58 += i36;
                    j16 >>>= 4;
                    i35 = i35;
                    i28 = i28;
                    jArr4 = jArr4;
                    i59 = i66;
                }
                i57++;
                if (i57 >= i45) {
                    break;
                }
                i35 = i35;
                i28 = i28;
                jArr4 = jArr4;
                i55 = i18;
                i29 = 0;
            }
            i56 += 32;
            if (i56 < 64) {
                jArr = jArr4;
                i55 = i18;
            } else {
                if (i56 >= 64) {
                    break;
                }
                jArr = jArr4;
                i56 = 60;
                i55 = 0;
            }
            shiftUp(jArr, i45, i37, 8);
            long[] jArr5 = jArr;
            i35 = i35;
            i28 = i28;
            jArr4 = jArr5;
            i29 = 0;
        }
        int i67 = 16;
        while (true) {
            int i68 = i67 - 1;
            if (i68 <= i35) {
                return reduceResult(jArr4, iArr2[i35], i28, i15, iArr);
            }
            if ((((long) i68) & 1) == 0) {
                int i69 = i28;
                i25 = i35;
                jArr2 = jArr4;
                addShiftedUp(jArr2, iArr2[i68 >>> 1], jArr4, iArr2[i68], i69, 16);
                i19 = i69;
            } else {
                long[] jArr6 = jArr4;
                i19 = i28;
                i25 = i35;
                jArr2 = jArr6;
                distribute(jArr2, iArr2[i68], iArr2[i67 - 2], iArr2[i25], i19);
            }
            long[] jArr7 = jArr2;
            i35 = i25;
            i28 = i19;
            jArr4 = jArr7;
            i67 = i68;
        }
    }

    public LongArray modMultiplyLD(LongArray longArray, int i15, int[] iArr) {
        int i16;
        int i17;
        LongArray longArray2;
        LongArray longArray3;
        long[] jArr;
        int iDegree = degree();
        if (iDegree == 0) {
            return this;
        }
        int iDegree2 = longArray.degree();
        if (iDegree2 == 0) {
            return longArray;
        }
        if (iDegree > iDegree2) {
            i17 = iDegree;
            i16 = iDegree2;
            longArray3 = this;
            longArray2 = longArray;
        } else {
            i16 = iDegree;
            i17 = iDegree2;
            longArray2 = this;
            longArray3 = longArray;
        }
        int i18 = (i16 + 63) >>> 6;
        int i19 = (i17 + 63) >>> 6;
        int i25 = ((i16 + i17) + 62) >>> 6;
        int i26 = 1;
        if (i18 == 1) {
            long j15 = longArray2.m_ints[0];
            if (j15 == 1) {
                return longArray3;
            }
            long[] jArr2 = new long[i25];
            multiplyWord(j15, longArray3.m_ints, i19, jArr2, 0);
            return reduceResult(jArr2, 0, i25, i15, iArr);
        }
        int i27 = (i17 + 70) >>> 6;
        int[] iArr2 = new int[16];
        int i28 = i27 << 4;
        long[] jArr3 = new long[i28];
        iArr2[1] = i27;
        System.arraycopy(longArray3.m_ints, 0, jArr3, i27, i19);
        int i29 = 2;
        int i35 = i27;
        while (i29 < 16) {
            int i36 = i35 + i27;
            iArr2[i29] = i36;
            if ((i29 & 1) == 0) {
                int i37 = i27;
                jArr = jArr3;
                shiftUp(jArr, i36 >>> 1, jArr3, i36, i37, 1);
                i27 = i37;
            } else {
                int i38 = i27;
                jArr = jArr3;
                add(jArr, i27, jArr3, i36 - i38, jArr, i36, i38);
                i36 = i36;
            }
            i29++;
            jArr3 = jArr;
            i35 = i36;
        }
        long[] jArr4 = new long[i28];
        shiftUp(jArr3, 0, jArr4, 0, i28, 4);
        long[] jArr5 = longArray2.m_ints;
        long[] jArr6 = new long[i25];
        int i39 = 56;
        while (i39 >= 0) {
            int i45 = i26;
            while (i45 < i18) {
                int[] iArr3 = iArr2;
                int i46 = (int) (jArr5[i45] >>> i39);
                int i47 = i27;
                addBoth(jArr6, i45 - 1, jArr3, iArr3[i46 & 15], jArr4, iArr3[(i46 >>> 4) & 15], i47);
                i45 += 2;
                i27 = i47;
                iArr2 = iArr3;
                jArr6 = jArr6;
            }
            long[] jArr7 = jArr6;
            shiftUp(jArr7, 0, i25, 8);
            i39 -= 8;
            jArr6 = jArr7;
            i26 = 1;
        }
        int[] iArr4 = iArr2;
        long[] jArr8 = jArr6;
        int i48 = i27;
        long[] jArr9 = jArr3;
        for (int i49 = 56; i49 >= 0; i49 -= 8) {
            for (int i55 = 0; i55 < i18; i55 += 2) {
                int i56 = (int) (jArr5[i55] >>> i49);
                long[] jArr10 = jArr9;
                addBoth(jArr8, i55, jArr10, iArr4[i56 & 15], jArr4, iArr4[(i56 >>> 4) & 15], i48);
                jArr9 = jArr10;
            }
            if (i49 > 0) {
                shiftUp(jArr8, 0, i25, 8);
            }
        }
        return reduceResult(jArr8, 0, i25, i15, iArr);
    }

    public LongArray modReduce(int i15, int[] iArr) {
        long[] jArrClone = Arrays.clone(this.m_ints);
        return new LongArray(jArrClone, 0, reduceInPlace(jArrClone, 0, jArrClone.length, i15, iArr));
    }

    public LongArray modSquare(int i15, int[] iArr) {
        int usedLength = getUsedLength();
        if (usedLength == 0) {
            return this;
        }
        int i16 = usedLength << 1;
        long[] jArr = new long[i16];
        int i17 = 0;
        while (i17 < i16) {
            long j15 = this.m_ints[i17 >>> 1];
            int i18 = i17 + 1;
            jArr[i17] = interleave2_32to64((int) j15);
            i17 += 2;
            jArr[i18] = interleave2_32to64((int) (j15 >>> 32));
        }
        return new LongArray(jArr, 0, reduceInPlace(jArr, 0, i16, i15, iArr));
    }

    public LongArray modSquareN(int i15, int i16, int[] iArr) {
        int usedLength = getUsedLength();
        if (usedLength == 0) {
            return this;
        }
        int i17 = ((i16 + 63) >>> 6) << 1;
        long[] jArr = new long[i17];
        System.arraycopy(this.m_ints, 0, jArr, 0, usedLength);
        while (true) {
            i15--;
            if (i15 < 0) {
                return new LongArray(jArr, 0, usedLength);
            }
            squareInPlace(jArr, usedLength, i16, iArr);
            usedLength = reduceInPlace(jArr, 0, i17, i16, iArr);
        }
    }

    public LongArray multiply(LongArray longArray, int i15, int[] iArr) {
        int i16;
        int i17;
        LongArray longArray2;
        LongArray longArray3;
        int i18;
        int i19;
        int iDegree = degree();
        if (iDegree == 0) {
            return this;
        }
        int iDegree2 = longArray.degree();
        if (iDegree2 == 0) {
            return longArray;
        }
        if (iDegree > iDegree2) {
            i17 = iDegree;
            i16 = iDegree2;
            longArray3 = this;
            longArray2 = longArray;
        } else {
            i16 = iDegree;
            i17 = iDegree2;
            longArray2 = this;
            longArray3 = longArray;
        }
        int i25 = (i16 + 63) >>> 6;
        int i26 = (i17 + 63) >>> 6;
        int i27 = ((i16 + i17) + 62) >>> 6;
        if (i25 == 1) {
            long j15 = longArray2.m_ints[0];
            if (j15 == 1) {
                return longArray3;
            }
            long[] jArr = new long[i27];
            multiplyWord(j15, longArray3.m_ints, i26, jArr, 0);
            return new LongArray(jArr, 0, i27);
        }
        int i28 = (i17 + 70) >>> 6;
        int[] iArr2 = new int[16];
        int i29 = i28 << 4;
        long[] jArr2 = new long[i29];
        iArr2[1] = i28;
        System.arraycopy(longArray3.m_ints, 0, jArr2, i28, i26);
        int i35 = 2;
        int i36 = i28;
        while (i35 < 16) {
            int i37 = i36 + i28;
            iArr2[i35] = i37;
            if ((i35 & 1) == 0) {
                int i38 = i28;
                shiftUp(jArr2, i37 >>> 1, jArr2, i37, i38, 1);
                i19 = i38;
            } else {
                int i39 = i28;
                i19 = i39;
                add(jArr2, i39, jArr2, i37 - i39, jArr2, i37, i19);
                i37 = i37;
            }
            i35++;
            i36 = i37;
            i28 = i19;
        }
        int i45 = i28;
        long[] jArr3 = new long[i29];
        shiftUp(jArr2, 0, jArr3, 0, i29, 4);
        long[] jArr4 = longArray2.m_ints;
        int i46 = i27 << 3;
        long[] jArr5 = new long[i46];
        int i47 = 0;
        while (i47 < i25) {
            long j16 = jArr4[i47];
            int i48 = i47;
            while (true) {
                long[] jArr6 = jArr3;
                long[] jArr7 = jArr2;
                addBoth(jArr5, i48, jArr7, iArr2[((int) j16) & 15], jArr6, iArr2[((int) (j16 >>> 4)) & 15], i45);
                int i49 = i48;
                jArr2 = jArr7;
                jArr3 = jArr6;
                i18 = i45;
                j16 >>>= 8;
                if (j16 == 0) {
                    break;
                }
                i45 = i18;
                i48 = i49 + i27;
            }
            i47++;
            i45 = i18;
        }
        while (true) {
            int i55 = i46 - i27;
            if (i55 == 0) {
                return new LongArray(jArr5, 0, i27);
            }
            addShiftedUp(jArr5, i55 - i27, jArr5, i55, i27, 8);
            i46 = i55;
        }
    }

    public void reduce(int i15, int[] iArr) {
        long[] jArr = this.m_ints;
        int iReduceInPlace = reduceInPlace(jArr, 0, jArr.length, i15, iArr);
        if (iReduceInPlace < jArr.length) {
            long[] jArr2 = new long[iReduceInPlace];
            this.m_ints = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, iReduceInPlace);
        }
    }

    public LongArray square(int i15, int[] iArr) {
        int usedLength = getUsedLength();
        if (usedLength == 0) {
            return this;
        }
        int i16 = usedLength << 1;
        long[] jArr = new long[i16];
        int i17 = 0;
        while (i17 < i16) {
            long j15 = this.m_ints[i17 >>> 1];
            int i18 = i17 + 1;
            jArr[i17] = interleave2_32to64((int) j15);
            i17 += 2;
            jArr[i18] = interleave2_32to64((int) (j15 >>> 32));
        }
        return new LongArray(jArr, 0, i16);
    }

    public boolean testBitZero() {
        long[] jArr = this.m_ints;
        return jArr.length > 0 && (1 & jArr[0]) != 0;
    }

    public BigInteger toBigInteger() {
        int usedLength = getUsedLength();
        if (usedLength == 0) {
            return ECConstants.ZERO;
        }
        int i15 = usedLength - 1;
        long j15 = this.m_ints[i15];
        byte[] bArr = new byte[8];
        int i16 = 0;
        boolean z15 = false;
        for (int i17 = 7; i17 >= 0; i17--) {
            byte b15 = (byte) (j15 >>> (i17 * 8));
            if (z15 || b15 != 0) {
                bArr[i16] = b15;
                i16++;
                z15 = true;
            }
        }
        byte[] bArr2 = new byte[(i15 * 8) + i16];
        for (int i18 = 0; i18 < i16; i18++) {
            bArr2[i18] = bArr[i18];
        }
        for (int i19 = usedLength - 2; i19 >= 0; i19--) {
            long j16 = this.m_ints[i19];
            int i25 = 7;
            while (i25 >= 0) {
                bArr2[i16] = (byte) (j16 >>> (i25 * 8));
                i25--;
                i16++;
            }
        }
        return new BigInteger(1, bArr2);
    }

    public String toString() {
        int usedLength = getUsedLength();
        if (usedLength == 0) {
            return d.f37012h1;
        }
        int i15 = usedLength - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.m_ints[i15]));
        while (true) {
            i15--;
            if (i15 < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.m_ints[i15]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append(ZEROES.substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }

    public LongArray(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0) {
            throw new IllegalArgumentException("invalid F2m field value");
        }
        int i15 = 1;
        if (bigInteger.signum() == 0) {
            this.m_ints = new long[]{0};
            return;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (byteArray[0] == 0) {
            length--;
        } else {
            i15 = 0;
        }
        int i16 = (length + 7) / 8;
        this.m_ints = new long[i16];
        int i17 = i16 - 1;
        int i18 = (length % 8) + i15;
        if (i15 < i18) {
            long j15 = 0;
            while (i15 < i18) {
                j15 = (j15 << 8) | ((long) (byteArray[i15] & 255));
                i15++;
            }
            this.m_ints[i17] = j15;
            i17 = i16 - 2;
        }
        while (i17 >= 0) {
            int i19 = 0;
            long j16 = 0;
            while (i19 < 8) {
                j16 = (j16 << 8) | ((long) (byteArray[i15] & 255));
                i19++;
                i15++;
            }
            this.m_ints[i17] = j16;
            i17--;
        }
    }

    private static void add(long[] jArr, int i15, long[] jArr2, int i16, long[] jArr3, int i17, int i18) {
        for (int i19 = 0; i19 < i18; i19++) {
            jArr3[i17 + i19] = jArr[i15 + i19] ^ jArr2[i16 + i19];
        }
    }

    private static void interleave2_n(long[] jArr, int i15, long[] jArr2, int i16, int i17, int i18) {
        for (int i19 = 0; i19 < i17; i19++) {
            jArr2[i16 + i19] = interleave2_n(jArr[i15 + i19], i18);
        }
    }

    private static void interleave3(long[] jArr, int i15, long[] jArr2, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            jArr2[i16 + i18] = interleave3(jArr[i15 + i18]);
        }
    }

    private static void interleave5(long[] jArr, int i15, long[] jArr2, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            jArr2[i16 + i18] = interleave5(jArr[i15 + i18]);
        }
    }

    private static void interleave7(long[] jArr, int i15, long[] jArr2, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            jArr2[i16 + i18] = interleave7(jArr[i15 + i18]);
        }
    }

    private static long shiftUp(long[] jArr, int i15, long[] jArr2, int i16, int i17, int i18) {
        int i19 = 64 - i18;
        long j15 = 0;
        for (int i25 = 0; i25 < i17; i25++) {
            long j16 = jArr[i15 + i25];
            jArr2[i16 + i25] = j15 | (j16 << i18);
            j15 = j16 >>> i19;
        }
        return j15;
    }

    public LongArray(long[] jArr) {
        this.m_ints = jArr;
    }

    public LongArray(long[] jArr, int i15, int i16) {
        if (i15 == 0 && i16 == jArr.length) {
            this.m_ints = jArr;
            return;
        }
        long[] jArr2 = new long[i16];
        this.m_ints = jArr2;
        System.arraycopy(jArr, i15, jArr2, 0, i16);
    }
}
