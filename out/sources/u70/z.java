package u70;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lu70/z;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "a", "Lmx/a;", "()Lmx/a;", "validators_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements hz.a<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label errorMessage;

    public z(Label label) {
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
        for (int i15 = 0; i15 < value.length(); i15++) {
            if (!Character.isDigit(value.charAt(i15))) {
                return false;
            }
        }
        List<oq.r<Character, Character>> listO1 = fu.r.O1(value);
        if (!(listO1 instanceof Collection) || !listO1.isEmpty()) {
            Iterator<T> it = listO1.iterator();
            while (it.hasNext()) {
                oq.r rVar = (oq.r) it.next();
                if (((Character) rVar.b()).charValue() - ((Character) rVar.a()).charValue() != 1) {
                    List<oq.r<Character, Character>> listO2 = fu.r.O1(value);
                    if (!(listO2 instanceof Collection) || !listO2.isEmpty()) {
                        Iterator<T> it4 = listO2.iterator();
                        while (it4.hasNext()) {
                            oq.r rVar2 = (oq.r) it4.next();
                            if (((Character) rVar2.a()).charValue() - ((Character) rVar2.b()).charValue() != 1) {
                                return true;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        return false;
    }
}
