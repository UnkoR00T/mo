package f4;

import androidx.compose.ui.node.Owner;
import fr.w;
import java.util.HashSet;
import java.util.Iterator;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001e\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006$"}, d2 = {"Lf4/f;", "", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroidx/compose/ui/node/Owner;)V", "Lf3/m$c;", "node", "Lf4/c;", "key", "", "Landroidx/compose/ui/node/a;", "set", "Loq/i0;", "c", "(Lf3/m$c;Lf4/c;Ljava/util/Set;)V", "b", "()V", "e", "f", "(Landroidx/compose/ui/node/a;Lf4/c;)V", "a", "d", "Landroidx/compose/ui/node/Owner;", "getOwner", "()Landroidx/compose/ui/node/Owner;", "Ln2/c;", "Ln2/c;", "inserted", "insertedLocal", "Landroidx/compose/ui/node/g;", "removed", "removedLocal", "", "Z", "invalidated", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Owner owner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n2.c<androidx.compose.ui.node.a> inserted = new n2.c<>(new androidx.compose.ui.node.a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n2.c<c<?>> insertedLocal = new n2.c<>(new c[16], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n2.c<androidx.compose.ui.node.g> removed = new n2.c<>(new androidx.compose.ui.node.g[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n2.c<c<?>> removedLocal = new n2.c<>(new c[16], 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean invalidated;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.a<i0> {
        a() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            f.this.e();
        }
    }

    public f(Owner owner) {
        this.owner = owner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    private final void c(f3.m.c r13, f4.c<?> r14, java.util.Set<androidx.compose.ui.node.a> r15) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.f.c(f3.m$c, f4.c, java.util.Set):void");
    }

    public final void a(androidx.compose.ui.node.a node, c<?> key) {
        this.inserted.d(node);
        this.insertedLocal.d(key);
        b();
    }

    public final void b() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.Q(new a());
    }

    public final void d(androidx.compose.ui.node.a node, c<?> key) {
        this.removed.d(g4.h.s(node));
        this.removedLocal.d(key);
        b();
    }

    public final void e() {
        this.invalidated = false;
        HashSet hashSet = new HashSet();
        n2.c<androidx.compose.ui.node.g> cVar = this.removed;
        androidx.compose.ui.node.g[] gVarArr = cVar.content;
        int size = cVar.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            androidx.compose.ui.node.g gVar = gVarArr[i15];
            c<?> cVar2 = this.removedLocal.content[i15];
            if (gVar.getNodes().getHead().getIsAttached()) {
                c(gVar.getNodes().getHead(), cVar2, hashSet);
            }
        }
        this.removed.j();
        this.removedLocal.j();
        n2.c<androidx.compose.ui.node.a> cVar3 = this.inserted;
        androidx.compose.ui.node.a[] aVarArr = cVar3.content;
        int size2 = cVar3.getSize();
        for (int i16 = 0; i16 < size2; i16++) {
            androidx.compose.ui.node.a aVar = aVarArr[i16];
            c<?> cVar4 = this.insertedLocal.content[i16];
            if (aVar.getIsAttached()) {
                c(aVar, cVar4, hashSet);
            }
        }
        this.inserted.j();
        this.insertedLocal.j();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.node.a) it.next()).v3();
        }
    }

    public final void f(androidx.compose.ui.node.a node, c<?> key) {
        this.inserted.d(node);
        this.insertedLocal.d(key);
        b();
    }
}
