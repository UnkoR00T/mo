package u20;

import android.content.Context;
import java.util.EnumMap;
import p071kotlin.Metadata;
import x20.k;
import x20.m;
import x20.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lu20/h;", "Lx20/b;", "Landroid/content/Context;", "context", "", "giloshForegroundResourceId", "<init>", "(Landroid/content/Context;I)V", "Lx20/n;", "a", "()Lx20/n;", "Lx20/i;", "b", "()Lx20/i;", "I", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h extends x20.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int giloshForegroundResourceId;

    public h(Context context, int i15) {
        super(context);
        this.giloshForegroundResourceId = i15;
    }

    @Override // x20.b
    public n a() {
        k kVar = new k(this.f216513a);
        EnumMap enumMap = new EnumMap(m.a.class);
        enumMap.put(m.a.VERTEX_SHADER, kVar.a(c20.e.f22750h));
        enumMap.put(m.a.FRAGMENT_SHADER, kVar.a(c20.e.f22749g));
        return new n(enumMap);
    }

    @Override // x20.b
    public x20.i b() {
        EnumMap enumMap = new EnumMap(i60.a.EnumC2127a.class);
        enumMap.put(i60.a.EnumC2127a.IDENTITY_DYNAMIC_LAYER, Integer.valueOf(this.giloshForegroundResourceId));
        return new i60.b(this.f216513a, enumMap);
    }
}
