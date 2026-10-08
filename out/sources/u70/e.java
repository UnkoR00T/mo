package u70;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lu70/e;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "", "positions", "c", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "", "d", "(Ljava/lang/String;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Ljava/util/List;", "charsPositions", "validators_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements hz.a<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label errorMessage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> charsPositions = pq.v.q(18, 19, 20, 21, 22);

    public e(Label label) {
        this.errorMessage = label;
    }

    private final List<Integer> c(String value, List<Integer> positions) {
        List<Integer> list = positions;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(value.charAt(((Number) it.next()).intValue())));
        }
        return arrayList;
    }

    @Override // hz.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public Label getErrorMessage() {
        return this.errorMessage;
    }

    @Override // hz.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String value) {
        if (!Pattern.compile("AE:PL-\\d{5}-\\d{5}-[A-Z]{5}-\\d{2}").matcher(value).matches()) {
            return false;
        }
        Integer numU = fu.r.u(value.substring(6, 11));
        Integer numU2 = fu.r.u(value.substring(12, 17));
        if (numU != null && numU2 != null) {
            String strValueOf = String.valueOf(Math.abs(pq.v.W0(c(value, this.charsPositions)) - (numU.intValue() + numU2.intValue())));
            int iF = 0;
            for (int i15 = 0; i15 < strValueOf.length(); i15++) {
                iF += fu.a.f(strValueOf.charAt(i15));
            }
            Integer numU3 = fu.r.u(fu.r.I1(value, 2));
            if (numU3 != null && iF == numU3.intValue()) {
                return true;
            }
        }
        return false;
    }
}
