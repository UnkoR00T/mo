package i60;

import android.content.Context;
import java.util.EnumMap;
import java.util.Map;
import p071kotlin.Metadata;
import x20.i;
import x20.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"Li60/b;", "Lx20/i;", "Landroid/content/Context;", "context", "", "Li60/a$a;", "", "textureResources", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "Lx20/n;", "program", "Loq/i0;", "a", "(Lx20/n;)V", "Li60/a;", "Ljava/util/Map;", "textures", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<a.EnumC2127a, a> textures = new EnumMap(a.EnumC2127a.class);

    public b(Context context, Map<a.EnumC2127a, Integer> map) {
        for (a.EnumC2127a enumC2127a : a.EnumC2127a.values()) {
            this.textures.put(enumC2127a, new a(context, enumC2127a, map.get(enumC2127a).intValue()));
            ((a) ((EnumMap) this.textures).get(enumC2127a)).a();
        }
    }

    @Override // x20.i
    public void a(n program) {
        for (a.EnumC2127a enumC2127a : a.EnumC2127a.values()) {
            this.textures.get(enumC2127a).b(program);
        }
    }
}
