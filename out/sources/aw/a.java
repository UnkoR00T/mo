package aw;

import fr.t;
import fr.w;
import java.util.Iterator;
import java.util.List;
import oq.k;
import oq.l;
import oq.o;
import p071kotlin.Metadata;
import yv.c;
import yv.e;
import zv.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Law/a;", "Lzv/f;", "Lyv/a;", "type", "", "Lzv/a;", "children", "<init>", "(Lyv/a;Ljava/util/List;)V", "", "f", "()Z", "Loq/k;", "e", "loose", "g", "a", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class a extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k loose;

    /* JADX INFO: renamed from: aw.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Law/a$a;", "", "<init>", "()V", "Lzv/a;", "node", "", "b", "(Lzv/a;)Z", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(zv.a node) {
            Iterator<zv.a> it = node.getChildren().iterator();
            int i15 = 0;
            boolean z15 = false;
            while (it.hasNext()) {
                yv.a type = it.next().getType();
                if (t.c(type, e.f229936q)) {
                    i15++;
                } else {
                    if (t.c(type, e.A) ? true : t.c(type, e.D) ? true : t.c(type, e.N)) {
                        continue;
                    } else {
                        if (z15 && i15 > 1) {
                            return true;
                        }
                        i15 = 0;
                        z15 = true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0})
    static final class b extends w implements er.a<Boolean> {
        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.valueOf(a.this.f());
        }
    }

    public a(yv.a aVar, List<? extends zv.a> list) {
        super(aVar, list);
        this.loose = l.b(o.NONE, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f() {
        if (INSTANCE.b(this)) {
            return true;
        }
        for (zv.a aVar : getChildren()) {
            if (t.c(aVar.getType(), c.LIST_ITEM) && INSTANCE.b(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        return ((Boolean) this.loose.getValue()).booleanValue();
    }
}
