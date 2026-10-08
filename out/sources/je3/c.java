package je3;

import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lje3/c;", "", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "testTag", "statementNumber", "Lmx/a;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lmx/a;", "a", "Lmx/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    public final Label a(String testTag, String statementNumber) {
        Label labelC;
        if (statementNumber == null || (labelC = this.labelProvider.e(md3.b.f125872y4, statementNumber)) == null) {
            labelC = this.labelProvider.c(md3.b.f125864x4);
        }
        return labelC.n(testTag);
    }

    public final Label b(String testTag, String statementNumber) {
        Label labelC;
        if (statementNumber == null || (labelC = this.labelProvider.e(md3.b.f125816r4, statementNumber)) == null) {
            labelC = this.labelProvider.c(md3.b.X);
        }
        return labelC.n(testTag);
    }
}
