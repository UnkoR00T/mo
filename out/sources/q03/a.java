package q03;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096B¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq03/a;", "Ln03/a;", "<init>", "()V", "Ln03/a$a;", "params", "Lm03/a;", "d", "(Ln03/a$a;Ltq/e;)Ljava/lang/Object;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements n03.a {
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(n03.a.Params params, tq.e<? super m03.a> eVar) {
        String plateNumber = params.getPlateNumber();
        if (plateNumber.length() == 0) {
            return m03.a.EMPTY;
        }
        if (!b.f163528a.matcher(plateNumber).find() && plateNumber.length() <= 9) {
            return (plateNumber.length() >= 4 || !params.getWasPlateVerified()) ? m03.a.CORRECT : m03.a.INCORRECT;
        }
        return m03.a.INCORRECT;
    }
}
