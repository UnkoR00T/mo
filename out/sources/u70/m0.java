package u70;

import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lu70/m0;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "a", "Lmx/a;", "()Lmx/a;", "", "", "b", "Ljava/util/List;", "weights", "validators_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m0 implements hz.a<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label errorMessage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> weights = pq.v.q(1, 3, 7, 9, 1, 3, 7, 9, 1, 3);

    public m0(Label label) {
        this.errorMessage = label;
    }

    @Override // hz.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public Label getErrorMessage() {
        return this.errorMessage;
    }

    @Override // hz.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(String value) {
        if (value.length() == 11) {
            for (int i15 = 0; i15 < value.length(); i15++) {
                if (Character.isDigit(value.charAt(i15))) {
                }
            }
            int iIntValue = 0;
            int i16 = 0;
            for (Object obj : this.weights) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    pq.v.x();
                }
                iIntValue += ((Number) obj).intValue() * fu.a.f(value.charAt(i16));
                i16 = i17;
            }
            int i18 = iIntValue % 10;
            int i19 = i18 + ((((i18 ^ 10) & ((-i18) | i18)) >> 31) & 10);
            if ((i19 == 0 ? 0 : 10 - i19) == fu.a.f(fu.r.F1(value))) {
                return true;
            }
        }
        return false;
    }
}
