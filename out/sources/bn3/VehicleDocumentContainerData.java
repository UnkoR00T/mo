package bn3;

import fr.t;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bn3.g, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b[\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010(\u001a\u0004\u0018\u00010\b\u0012\b\u0010)\u001a\u0004\u0018\u00010\b\u0012\b\u0010*\u001a\u0004\u0018\u00010\b\u0012\b\u0010+\u001a\u0004\u0018\u00010\b\u0012\b\u0010,\u001a\u0004\u0018\u00010\b\u0012\b\u0010-\u001a\u0004\u0018\u00010\b\u0012\b\u0010.\u001a\u0004\u0018\u00010\b\u0012\b\u0010/\u001a\u0004\u0018\u00010\b\u0012\b\u00100\u001a\u0004\u0018\u00010\b\u0012\b\u00101\u001a\u0004\u0018\u00010\b\u0012\b\u00102\u001a\u0004\u0018\u00010\b\u0012\b\u00103\u001a\u0004\u0018\u00010\b\u0012\b\u00104\u001a\u0004\u0018\u00010\b\u0012\b\u00105\u001a\u0004\u0018\u00010\b\u0012\b\u00106\u001a\u0004\u0018\u00010\b\u0012\b\u00107\u001a\u0004\u0018\u00010\u0002\u0012\b\u00108\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010:\u001a\u000209\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010=\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010B\u001a\u0004\u0018\u00010A\u0012\b\u0010D\u001a\u0004\u0018\u00010C\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u000209HÖ\u0001¢\u0006\u0004\bK\u0010LJ\u001a\u0010N\u001a\u00020>2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bN\u0010OR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010JR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bS\u0010Q\u001a\u0004\bT\u0010JR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bU\u0010Q\u001a\u0004\bV\u0010JR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010JR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bY\u0010Q\u001a\u0004\bZ\u0010JR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b_\u0010\\\u001a\u0004\b`\u0010^R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u0010Q\u001a\u0004\bb\u0010JR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b]\u0010d\u001a\u0004\bg\u0010fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bh\u0010d\u001a\u0004\bi\u0010fR\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\be\u0010j\u001a\u0004\bk\u0010lR\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bm\u0010j\u001a\u0004\bn\u0010lR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bk\u0010Q\u001a\u0004\bo\u0010JR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u0010Q\u001a\u0004\bq\u0010JR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010Q\u001a\u0004\br\u0010JR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bR\u0010Q\u001a\u0004\bs\u0010JR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bt\u0010Q\u001a\u0004\bu\u0010JR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bv\u0010Q\u001a\u0004\bw\u0010JR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bx\u0010Q\u001a\u0004\by\u0010JR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bz\u0010Q\u001a\u0004\b{\u0010JR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b`\u0010Q\u001a\u0004\b|\u0010JR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b}\u0010Q\u001a\u0004\b~\u0010JR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u007f\u0010Q\u001a\u0004\bm\u0010JR\u001a\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0080\u0001\u0010Q\u001a\u0004\bh\u0010JR\u001b\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010Q\u001a\u0005\b\u0082\u0001\u0010JR\u001a\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bT\u0010Q\u001a\u0005\b\u0083\u0001\u0010JR\u0019\u0010#\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b{\u0010\\\u001a\u0004\b[\u0010^R\u0019\u0010$\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bw\u0010\\\u001a\u0004\b_\u0010^R\u0019\u0010%\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bn\u0010\\\u001a\u0004\bW\u0010^R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010Q\u001a\u0004\bY\u0010JR\u0019\u0010'\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bs\u0010\\\u001a\u0004\b\u007f\u0010^R\u0019\u0010(\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bV\u0010\\\u001a\u0004\bv\u0010^R\u001a\u0010)\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0005\b\u0084\u0001\u0010\\\u001a\u0004\bz\u0010^R\u001b\u0010*\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\\\u001a\u0005\b\u0085\u0001\u0010^R\u001a\u0010+\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\bo\u0010\\\u001a\u0005\b\u0084\u0001\u0010^R\u0019\u0010,\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bg\u0010\\\u001a\u0004\bP\u0010^R\u0019\u0010-\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bi\u0010\\\u001a\u0004\bU\u0010^R\u001a\u0010.\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0005\b\u0086\u0001\u0010\\\u001a\u0004\bp\u0010^R\u0019\u0010/\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bu\u0010\\\u001a\u0004\bx\u0010^R\u001a\u00100\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\br\u0010\\\u001a\u0005\b\u0087\u0001\u0010^R\u001a\u00101\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\bq\u0010\\\u001a\u0005\b\u0080\u0001\u0010^R\u001a\u00102\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b|\u0010\\\u001a\u0005\b\u0088\u0001\u0010^R\u001b\u00103\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\\\u001a\u0005\b\u0081\u0001\u0010^R\u0019\u00104\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bX\u0010\\\u001a\u0004\b}\u0010^R\u001a\u00105\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0005\b\u0088\u0001\u0010\\\u001a\u0004\bS\u0010^R\u001a\u00106\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0005\b\u008a\u0001\u0010\\\u001a\u0004\bt\u0010^R\u001b\u00107\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010Q\u001a\u0005\b\u008a\u0001\u0010JR\u001b\u00108\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\\\u001a\u0005\b\u008c\u0001\u0010^R\u0019\u0010:\u001a\u0002098\u0006¢\u0006\u000e\n\u0005\by\u0010\u0085\u0001\u001a\u0005\b\u008d\u0001\u0010LR\u001b\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010Q\u001a\u0005\b\u008f\u0001\u0010JR\u001b\u0010<\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010Q\u001a\u0005\b\u0091\u0001\u0010JR\u001b\u0010=\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010d\u001a\u0005\b\u0093\u0001\u0010fR\u001b\u0010?\u001a\u00020>8\u0006¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0090\u0001\u001a\u0006\b\u008b\u0001\u0010\u0095\u0001R\u001a\u0010@\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0096\u0001\u0010Q\u001a\u0004\bc\u0010JR\u001c\u0010B\u001a\u0004\u0018\u00010A8\u0006¢\u0006\u000f\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0005\ba\u0010\u0099\u0001R\u001d\u0010D\u001a\u0004\u0018\u00010C8\u0006¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u0086\u0001\u0010\u009c\u0001R\u001b\u0010F\u001a\u00020E8\u0006¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u0089\u0001\u0010\u009f\u0001¨\u0006 \u0001"}, d2 = {"Lbn3/g;", "", "", "make", "model", "registrationNumber", "vin", "productionYear", "Ljava/math/BigDecimal;", "engineCapacity", "maxPower", "kind", "Ljava/util/Date;", "firstRegistrationDate", "technicalExaminationActivityDate", "technicalExaminationExpireDate", "", "Lbn3/k;", "insurances", "Lbn3/c;", "otherDocuments", "subKind", "vehicleCategory", "vehicleApprovalCategoryCertificate", "purpose", "type", "origin", "isIdNumberStamped", "nameplate", "vehicleProductionMethod", "kWperkg", "fuelType", "firstAlternativeFuelType", "secondAlternativeFuelType", "isCatalyst", "combinedFuelConsumption", "combinedFuelConsumptionWLTP", "co2Emission", "co2EmissionWLTP", "maxWeight", "maxAllowedWeight", "maxLoad", "standingPlaces", "seats", "allPlaces", "axisQuantity", "kerbWeight", "maxAllowedWeightOfCarSet", "maxWeigthOfTrailerWithBrake", "maxWeigthOfTrailerWithoutBrake", "wheelbase", "minTrackWidth", "maxTrackWidth", "avgTrackWidth", "maxAllowedAxisEmphasis", "isCarHook", "imageCode", "", "meterValue", "meterUnit", "dataImporter", "meterSavingDate", "", "isEuroNorm", "emissionLevelEuro", "Lbn3/a;", "distanceMeter", "Lbn3/f;", "timeMeter", "Lbn3/l;", "vehicleType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;ZLjava/lang/String;Lbn3/a;Lbn3/f;Lbn3/l;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "q", "b", "A", "c", "G", "d", ip.a.f96137b, "e", "E", "f", "Ljava/math/BigDecimal;", "j", "()Ljava/math/BigDecimal;", "g", "v", "h", "p", "i", "Ljava/util/Date;", "l", "()Ljava/util/Date;", "K", "k", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Ljava/util/List;", "n", "()Ljava/util/List;", "m", ip.a.f96138c, "J", "o", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "O", "F", "r", "N", "s", "C", "t", "X", "u", "B", "Q", "w", "getKWperkg", "x", "y", "z", "getSecondAlternativeFuelType", "V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "I", "M", "getMaxWeigthOfTrailerWithBrake", "T", "R", "U", "W", "getImageCode", "getMeterValue", "Y", "getMeterUnit", "Z", "getDataImporter", "a0", "getMeterSavingDate", "b0", "()Z", "c0", "d0", "Lbn3/a;", "()Lbn3/a;", "e0", "Lbn3/f;", "()Lbn3/f;", "f0", "Lbn3/l;", "()Lbn3/l;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleDocumentContainerData {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    private final String isCatalyst;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    private final BigDecimal combinedFuelConsumption;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    private final BigDecimal combinedFuelConsumptionWLTP;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
    private final BigDecimal co2Emission;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
    private final String co2EmissionWLTP;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
    private final BigDecimal maxWeight;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
    private final BigDecimal maxAllowedWeight;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
    private final BigDecimal maxLoad;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
    private final BigDecimal standingPlaces;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
    private final BigDecimal seats;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
    private final BigDecimal allPlaces;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
    private final BigDecimal axisQuantity;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata and from toString */
    private final BigDecimal kerbWeight;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
    private final BigDecimal maxAllowedWeightOfCarSet;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata and from toString */
    private final BigDecimal maxWeigthOfTrailerWithBrake;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata and from toString */
    private final BigDecimal maxWeigthOfTrailerWithoutBrake;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata and from toString */
    private final BigDecimal wheelbase;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata and from toString */
    private final BigDecimal minTrackWidth;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata and from toString */
    private final BigDecimal maxTrackWidth;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata and from toString */
    private final BigDecimal avgTrackWidth;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata and from toString */
    private final BigDecimal maxAllowedAxisEmphasis;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata and from toString */
    private final String isCarHook;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata and from toString */
    private final BigDecimal imageCode;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata and from toString */
    private final int meterValue;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata and from toString */
    private final String meterUnit;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata and from toString */
    private final String dataImporter;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String make;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date meterSavingDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String model;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEuroNorm;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String registrationNumber;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String emissionLevelEuro;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vin;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata and from toString */
    private final DistanceMeter distanceMeter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productionYear;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata and from toString */
    private final TimeMeter timeMeter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal engineCapacity;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata and from toString */
    private final l vehicleType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal maxPower;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String kind;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date firstRegistrationDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date technicalExaminationActivityDate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date technicalExaminationExpireDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<VehicleInsuranceModel> insurances;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentModel> otherDocuments;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subKind;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vehicleCategory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vehicleApprovalCategoryCertificate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String purpose;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String origin;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isIdNumberStamped;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameplate;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vehicleProductionMethod;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final String kWperkg;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fuelType;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstAlternativeFuelType;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secondAlternativeFuelType;

    public VehicleDocumentContainerData(String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str6, Date date, Date date2, Date date3, List<VehicleInsuranceModel> list, List<DocumentModel> list2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str21, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, BigDecimal bigDecimal18, BigDecimal bigDecimal19, BigDecimal bigDecimal20, BigDecimal bigDecimal21, String str22, BigDecimal bigDecimal22, int i15, String str23, String str24, Date date4, boolean z15, String str25, DistanceMeter distanceMeter, TimeMeter timeMeter, l lVar) {
        this.make = str;
        this.model = str2;
        this.registrationNumber = str3;
        this.vin = str4;
        this.productionYear = str5;
        this.engineCapacity = bigDecimal;
        this.maxPower = bigDecimal2;
        this.kind = str6;
        this.firstRegistrationDate = date;
        this.technicalExaminationActivityDate = date2;
        this.technicalExaminationExpireDate = date3;
        this.insurances = list;
        this.otherDocuments = list2;
        this.subKind = str7;
        this.vehicleCategory = str8;
        this.vehicleApprovalCategoryCertificate = str9;
        this.purpose = str10;
        this.type = str11;
        this.origin = str12;
        this.isIdNumberStamped = str13;
        this.nameplate = str14;
        this.vehicleProductionMethod = str15;
        this.kWperkg = str16;
        this.fuelType = str17;
        this.firstAlternativeFuelType = str18;
        this.secondAlternativeFuelType = str19;
        this.isCatalyst = str20;
        this.combinedFuelConsumption = bigDecimal3;
        this.combinedFuelConsumptionWLTP = bigDecimal4;
        this.co2Emission = bigDecimal5;
        this.co2EmissionWLTP = str21;
        this.maxWeight = bigDecimal6;
        this.maxAllowedWeight = bigDecimal7;
        this.maxLoad = bigDecimal8;
        this.standingPlaces = bigDecimal9;
        this.seats = bigDecimal10;
        this.allPlaces = bigDecimal11;
        this.axisQuantity = bigDecimal12;
        this.kerbWeight = bigDecimal13;
        this.maxAllowedWeightOfCarSet = bigDecimal14;
        this.maxWeigthOfTrailerWithBrake = bigDecimal15;
        this.maxWeigthOfTrailerWithoutBrake = bigDecimal16;
        this.wheelbase = bigDecimal17;
        this.minTrackWidth = bigDecimal18;
        this.maxTrackWidth = bigDecimal19;
        this.avgTrackWidth = bigDecimal20;
        this.maxAllowedAxisEmphasis = bigDecimal21;
        this.isCarHook = str22;
        this.imageCode = bigDecimal22;
        this.meterValue = i15;
        this.meterUnit = str23;
        this.dataImporter = str24;
        this.meterSavingDate = date4;
        this.isEuroNorm = z15;
        this.emissionLevelEuro = str25;
        this.distanceMeter = distanceMeter;
        this.timeMeter = timeMeter;
        this.vehicleType = lVar;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getNameplate() {
        return this.nameplate;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    public final List<DocumentModel> D() {
        return this.otherDocuments;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getProductionYear() {
        return this.productionYear;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getPurpose() {
        return this.purpose;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final BigDecimal getSeats() {
        return this.seats;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final BigDecimal getStandingPlaces() {
        return this.standingPlaces;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getSubKind() {
        return this.subKind;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final Date getTechnicalExaminationActivityDate() {
        return this.technicalExaminationActivityDate;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final Date getTechnicalExaminationExpireDate() {
        return this.technicalExaminationExpireDate;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final TimeMeter getTimeMeter() {
        return this.timeMeter;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final String getVehicleApprovalCategoryCertificate() {
        return this.vehicleApprovalCategoryCertificate;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final String getVehicleCategory() {
        return this.vehicleCategory;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final String getVehicleProductionMethod() {
        return this.vehicleProductionMethod;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final l getVehicleType() {
        return this.vehicleType;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final BigDecimal getWheelbase() {
        return this.wheelbase;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final String getIsCarHook() {
        return this.isCarHook;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final String getIsCatalyst() {
        return this.isCatalyst;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final boolean getIsEuroNorm() {
        return this.isEuroNorm;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final String getIsIdNumberStamped() {
        return this.isIdNumberStamped;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAllPlaces() {
        return this.allPlaces;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getAvgTrackWidth() {
        return this.avgTrackWidth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getAxisQuantity() {
        return this.axisQuantity;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getCo2Emission() {
        return this.co2Emission;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCo2EmissionWLTP() {
        return this.co2EmissionWLTP;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleDocumentContainerData)) {
            return false;
        }
        VehicleDocumentContainerData vehicleDocumentContainerData = (VehicleDocumentContainerData) other;
        return t.c(this.make, vehicleDocumentContainerData.make) && t.c(this.model, vehicleDocumentContainerData.model) && t.c(this.registrationNumber, vehicleDocumentContainerData.registrationNumber) && t.c(this.vin, vehicleDocumentContainerData.vin) && t.c(this.productionYear, vehicleDocumentContainerData.productionYear) && t.c(this.engineCapacity, vehicleDocumentContainerData.engineCapacity) && t.c(this.maxPower, vehicleDocumentContainerData.maxPower) && t.c(this.kind, vehicleDocumentContainerData.kind) && t.c(this.firstRegistrationDate, vehicleDocumentContainerData.firstRegistrationDate) && t.c(this.technicalExaminationActivityDate, vehicleDocumentContainerData.technicalExaminationActivityDate) && t.c(this.technicalExaminationExpireDate, vehicleDocumentContainerData.technicalExaminationExpireDate) && t.c(this.insurances, vehicleDocumentContainerData.insurances) && t.c(this.otherDocuments, vehicleDocumentContainerData.otherDocuments) && t.c(this.subKind, vehicleDocumentContainerData.subKind) && t.c(this.vehicleCategory, vehicleDocumentContainerData.vehicleCategory) && t.c(this.vehicleApprovalCategoryCertificate, vehicleDocumentContainerData.vehicleApprovalCategoryCertificate) && t.c(this.purpose, vehicleDocumentContainerData.purpose) && t.c(this.type, vehicleDocumentContainerData.type) && t.c(this.origin, vehicleDocumentContainerData.origin) && t.c(this.isIdNumberStamped, vehicleDocumentContainerData.isIdNumberStamped) && t.c(this.nameplate, vehicleDocumentContainerData.nameplate) && t.c(this.vehicleProductionMethod, vehicleDocumentContainerData.vehicleProductionMethod) && t.c(this.kWperkg, vehicleDocumentContainerData.kWperkg) && t.c(this.fuelType, vehicleDocumentContainerData.fuelType) && t.c(this.firstAlternativeFuelType, vehicleDocumentContainerData.firstAlternativeFuelType) && t.c(this.secondAlternativeFuelType, vehicleDocumentContainerData.secondAlternativeFuelType) && t.c(this.isCatalyst, vehicleDocumentContainerData.isCatalyst) && t.c(this.combinedFuelConsumption, vehicleDocumentContainerData.combinedFuelConsumption) && t.c(this.combinedFuelConsumptionWLTP, vehicleDocumentContainerData.combinedFuelConsumptionWLTP) && t.c(this.co2Emission, vehicleDocumentContainerData.co2Emission) && t.c(this.co2EmissionWLTP, vehicleDocumentContainerData.co2EmissionWLTP) && t.c(this.maxWeight, vehicleDocumentContainerData.maxWeight) && t.c(this.maxAllowedWeight, vehicleDocumentContainerData.maxAllowedWeight) && t.c(this.maxLoad, vehicleDocumentContainerData.maxLoad) && t.c(this.standingPlaces, vehicleDocumentContainerData.standingPlaces) && t.c(this.seats, vehicleDocumentContainerData.seats) && t.c(this.allPlaces, vehicleDocumentContainerData.allPlaces) && t.c(this.axisQuantity, vehicleDocumentContainerData.axisQuantity) && t.c(this.kerbWeight, vehicleDocumentContainerData.kerbWeight) && t.c(this.maxAllowedWeightOfCarSet, vehicleDocumentContainerData.maxAllowedWeightOfCarSet) && t.c(this.maxWeigthOfTrailerWithBrake, vehicleDocumentContainerData.maxWeigthOfTrailerWithBrake) && t.c(this.maxWeigthOfTrailerWithoutBrake, vehicleDocumentContainerData.maxWeigthOfTrailerWithoutBrake) && t.c(this.wheelbase, vehicleDocumentContainerData.wheelbase) && t.c(this.minTrackWidth, vehicleDocumentContainerData.minTrackWidth) && t.c(this.maxTrackWidth, vehicleDocumentContainerData.maxTrackWidth) && t.c(this.avgTrackWidth, vehicleDocumentContainerData.avgTrackWidth) && t.c(this.maxAllowedAxisEmphasis, vehicleDocumentContainerData.maxAllowedAxisEmphasis) && t.c(this.isCarHook, vehicleDocumentContainerData.isCarHook) && t.c(this.imageCode, vehicleDocumentContainerData.imageCode) && this.meterValue == vehicleDocumentContainerData.meterValue && t.c(this.meterUnit, vehicleDocumentContainerData.meterUnit) && t.c(this.dataImporter, vehicleDocumentContainerData.dataImporter) && t.c(this.meterSavingDate, vehicleDocumentContainerData.meterSavingDate) && this.isEuroNorm == vehicleDocumentContainerData.isEuroNorm && t.c(this.emissionLevelEuro, vehicleDocumentContainerData.emissionLevelEuro) && t.c(this.distanceMeter, vehicleDocumentContainerData.distanceMeter) && t.c(this.timeMeter, vehicleDocumentContainerData.timeMeter) && this.vehicleType == vehicleDocumentContainerData.vehicleType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BigDecimal getCombinedFuelConsumption() {
        return this.combinedFuelConsumption;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final BigDecimal getCombinedFuelConsumptionWLTP() {
        return this.combinedFuelConsumptionWLTP;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final DistanceMeter getDistanceMeter() {
        return this.distanceMeter;
    }

    public int hashCode() {
        String str = this.make;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.model;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.registrationNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.vin;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productionYear;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.engineCapacity;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.maxPower;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str6 = this.kind;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Date date = this.firstRegistrationDate;
        int iHashCode9 = (iHashCode8 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.technicalExaminationActivityDate;
        int iHashCode10 = (iHashCode9 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.technicalExaminationExpireDate;
        int iHashCode11 = (iHashCode10 + (date3 == null ? 0 : date3.hashCode())) * 31;
        List<VehicleInsuranceModel> list = this.insurances;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List<DocumentModel> list2 = this.otherDocuments;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.subKind;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.vehicleCategory;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.vehicleApprovalCategoryCertificate;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.purpose;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.type;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.origin;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.isIdNumberStamped;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.nameplate;
        int iHashCode21 = (iHashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.vehicleProductionMethod;
        int iHashCode22 = (iHashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.kWperkg;
        int iHashCode23 = (iHashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.fuelType;
        int iHashCode24 = (iHashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.firstAlternativeFuelType;
        int iHashCode25 = (iHashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.secondAlternativeFuelType;
        int iHashCode26 = (iHashCode25 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.isCatalyst;
        int iHashCode27 = (iHashCode26 + (str20 == null ? 0 : str20.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.combinedFuelConsumption;
        int iHashCode28 = (iHashCode27 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.combinedFuelConsumptionWLTP;
        int iHashCode29 = (iHashCode28 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.co2Emission;
        int iHashCode30 = (iHashCode29 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str21 = this.co2EmissionWLTP;
        int iHashCode31 = (iHashCode30 + (str21 == null ? 0 : str21.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.maxWeight;
        int iHashCode32 = (iHashCode31 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.maxAllowedWeight;
        int iHashCode33 = (iHashCode32 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.maxLoad;
        int iHashCode34 = (iHashCode33 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.standingPlaces;
        int iHashCode35 = (iHashCode34 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.seats;
        int iHashCode36 = (iHashCode35 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.allPlaces;
        int iHashCode37 = (iHashCode36 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.axisQuantity;
        int iHashCode38 = (iHashCode37 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.kerbWeight;
        int iHashCode39 = (iHashCode38 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.maxAllowedWeightOfCarSet;
        int iHashCode40 = (iHashCode39 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.maxWeigthOfTrailerWithBrake;
        int iHashCode41 = (iHashCode40 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.maxWeigthOfTrailerWithoutBrake;
        int iHashCode42 = (iHashCode41 + (bigDecimal16 == null ? 0 : bigDecimal16.hashCode())) * 31;
        BigDecimal bigDecimal17 = this.wheelbase;
        int iHashCode43 = (iHashCode42 + (bigDecimal17 == null ? 0 : bigDecimal17.hashCode())) * 31;
        BigDecimal bigDecimal18 = this.minTrackWidth;
        int iHashCode44 = (iHashCode43 + (bigDecimal18 == null ? 0 : bigDecimal18.hashCode())) * 31;
        BigDecimal bigDecimal19 = this.maxTrackWidth;
        int iHashCode45 = (iHashCode44 + (bigDecimal19 == null ? 0 : bigDecimal19.hashCode())) * 31;
        BigDecimal bigDecimal20 = this.avgTrackWidth;
        int iHashCode46 = (iHashCode45 + (bigDecimal20 == null ? 0 : bigDecimal20.hashCode())) * 31;
        BigDecimal bigDecimal21 = this.maxAllowedAxisEmphasis;
        int iHashCode47 = (iHashCode46 + (bigDecimal21 == null ? 0 : bigDecimal21.hashCode())) * 31;
        String str22 = this.isCarHook;
        int iHashCode48 = (iHashCode47 + (str22 == null ? 0 : str22.hashCode())) * 31;
        BigDecimal bigDecimal22 = this.imageCode;
        int iHashCode49 = (((iHashCode48 + (bigDecimal22 == null ? 0 : bigDecimal22.hashCode())) * 31) + Integer.hashCode(this.meterValue)) * 31;
        String str23 = this.meterUnit;
        int iHashCode50 = (iHashCode49 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.dataImporter;
        int iHashCode51 = (iHashCode50 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Date date4 = this.meterSavingDate;
        int iHashCode52 = (((iHashCode51 + (date4 == null ? 0 : date4.hashCode())) * 31) + Boolean.hashCode(this.isEuroNorm)) * 31;
        String str25 = this.emissionLevelEuro;
        int iHashCode53 = (iHashCode52 + (str25 == null ? 0 : str25.hashCode())) * 31;
        DistanceMeter distanceMeter = this.distanceMeter;
        int iHashCode54 = (iHashCode53 + (distanceMeter == null ? 0 : distanceMeter.hashCode())) * 31;
        TimeMeter timeMeter = this.timeMeter;
        return ((iHashCode54 + (timeMeter != null ? timeMeter.hashCode() : 0)) * 31) + this.vehicleType.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getEmissionLevelEuro() {
        return this.emissionLevelEuro;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final BigDecimal getEngineCapacity() {
        return this.engineCapacity;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getFirstAlternativeFuelType() {
        return this.firstAlternativeFuelType;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Date getFirstRegistrationDate() {
        return this.firstRegistrationDate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getFuelType() {
        return this.fuelType;
    }

    public final List<VehicleInsuranceModel> n() {
        return this.insurances;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final BigDecimal getKerbWeight() {
        return this.kerbWeight;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getMake() {
        return this.make;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final BigDecimal getMaxAllowedAxisEmphasis() {
        return this.maxAllowedAxisEmphasis;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final BigDecimal getMaxAllowedWeight() {
        return this.maxAllowedWeight;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final BigDecimal getMaxAllowedWeightOfCarSet() {
        return this.maxAllowedWeightOfCarSet;
    }

    public String toString() {
        return "VehicleDocumentContainerData(make=" + this.make + ", model=" + this.model + ", registrationNumber=" + this.registrationNumber + ", vin=" + this.vin + ", productionYear=" + this.productionYear + ", engineCapacity=" + this.engineCapacity + ", maxPower=" + this.maxPower + ", kind=" + this.kind + ", firstRegistrationDate=" + this.firstRegistrationDate + ", technicalExaminationActivityDate=" + this.technicalExaminationActivityDate + ", technicalExaminationExpireDate=" + this.technicalExaminationExpireDate + ", insurances=" + this.insurances + ", otherDocuments=" + this.otherDocuments + ", subKind=" + this.subKind + ", vehicleCategory=" + this.vehicleCategory + ", vehicleApprovalCategoryCertificate=" + this.vehicleApprovalCategoryCertificate + ", purpose=" + this.purpose + ", type=" + this.type + ", origin=" + this.origin + ", isIdNumberStamped=" + this.isIdNumberStamped + ", nameplate=" + this.nameplate + ", vehicleProductionMethod=" + this.vehicleProductionMethod + ", kWperkg=" + this.kWperkg + ", fuelType=" + this.fuelType + ", firstAlternativeFuelType=" + this.firstAlternativeFuelType + ", secondAlternativeFuelType=" + this.secondAlternativeFuelType + ", isCatalyst=" + this.isCatalyst + ", combinedFuelConsumption=" + this.combinedFuelConsumption + ", combinedFuelConsumptionWLTP=" + this.combinedFuelConsumptionWLTP + ", co2Emission=" + this.co2Emission + ", co2EmissionWLTP=" + this.co2EmissionWLTP + ", maxWeight=" + this.maxWeight + ", maxAllowedWeight=" + this.maxAllowedWeight + ", maxLoad=" + this.maxLoad + ", standingPlaces=" + this.standingPlaces + ", seats=" + this.seats + ", allPlaces=" + this.allPlaces + ", axisQuantity=" + this.axisQuantity + ", kerbWeight=" + this.kerbWeight + ", maxAllowedWeightOfCarSet=" + this.maxAllowedWeightOfCarSet + ", maxWeigthOfTrailerWithBrake=" + this.maxWeigthOfTrailerWithBrake + ", maxWeigthOfTrailerWithoutBrake=" + this.maxWeigthOfTrailerWithoutBrake + ", wheelbase=" + this.wheelbase + ", minTrackWidth=" + this.minTrackWidth + ", maxTrackWidth=" + this.maxTrackWidth + ", avgTrackWidth=" + this.avgTrackWidth + ", maxAllowedAxisEmphasis=" + this.maxAllowedAxisEmphasis + ", isCarHook=" + this.isCarHook + ", imageCode=" + this.imageCode + ", meterValue=" + this.meterValue + ", meterUnit=" + this.meterUnit + ", dataImporter=" + this.dataImporter + ", meterSavingDate=" + this.meterSavingDate + ", isEuroNorm=" + this.isEuroNorm + ", emissionLevelEuro=" + this.emissionLevelEuro + ", distanceMeter=" + this.distanceMeter + ", timeMeter=" + this.timeMeter + ", vehicleType=" + this.vehicleType + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final BigDecimal getMaxLoad() {
        return this.maxLoad;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final BigDecimal getMaxPower() {
        return this.maxPower;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final BigDecimal getMaxTrackWidth() {
        return this.maxTrackWidth;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final BigDecimal getMaxWeight() {
        return this.maxWeight;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final BigDecimal getMaxWeigthOfTrailerWithoutBrake() {
        return this.maxWeigthOfTrailerWithoutBrake;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final BigDecimal getMinTrackWidth() {
        return this.minTrackWidth;
    }
}
