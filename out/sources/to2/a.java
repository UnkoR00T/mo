package to2;

import mx.c;
import oo2.b;
import oq.i0;
import p071kotlin.Metadata;
import wy3.SetPasswordSetupData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lto2/a;", "Lxw/f;", "Loq/i0;", "Lwy3/c;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Loq/i0;)Lwy3/c;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<i0, SetPasswordSetupData> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f191371b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SetPasswordSetupData b(i0 params) {
        return new SetPasswordSetupData(true, null, this.labelProvider.c(b.C), this.labelProvider.c(b.B), this.labelProvider.c(b.f147856m), this.labelProvider.c(b.f147857n), true, false);
    }
}
