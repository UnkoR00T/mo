package gu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"", "value", "Lgu/e;", "sourceUnit", "targetUnit", "a", "(DLgu/e;Lgu/e;)D", "", "c", "(JLgu/e;Lgu/e;)J", "b", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class f {
    public static final double a(double d15, e eVar, e eVar2) {
        long jConvert = eVar2.getTimeUnit().convert(1L, eVar.getTimeUnit());
        return jConvert > 0 ? d15 * jConvert : d15 / eVar.getTimeUnit().convert(1L, eVar2.getTimeUnit());
    }

    public static final long b(long j15, e eVar, e eVar2) {
        return eVar2.getTimeUnit().convert(j15, eVar.getTimeUnit());
    }

    public static final long c(long j15, e eVar, e eVar2) {
        return eVar2.getTimeUnit().convert(j15, eVar.getTimeUnit());
    }
}
