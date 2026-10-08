package sf0;

import p071kotlin.Metadata;
import tf0.SimpleDeactivateData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsf0/a;", "Ldx/a;", "<init>", "()V", "", "clearData", "Ldx/b;", "b", "(Z)Ldx/b;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements dx.a {
    @Override // dx.a
    public dx.b b(boolean clearData) {
        return new dx.b.Deactivate(new SimpleDeactivateData(clearData));
    }
}
