package io.sentry.compose.viewhierarchy;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.g;
import io.sentry.g1;
import io.sentry.internal.viewhierarchy.a;
import io.sentry.protocol.i0;
import io.sentry.v0;
import java.util.ArrayList;
import java.util.Iterator;
import n2.c;
import p036e4.ModifierInfo;
import p036e4.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001e¨\u0006 "}, d2 = {"Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;", "Lio/sentry/internal/viewhierarchy/a;", "Lio/sentry/v0;", "logger", "<init>", "(Lio/sentry/v0;)V", "Lio/sentry/compose/a;", "composeHelper", "Lio/sentry/protocol/i0;", "parent", "Landroidx/compose/ui/node/g;", "rootNode", "node", "Loq/i0;", "b", "(Lio/sentry/compose/a;Lio/sentry/protocol/i0;Landroidx/compose/ui/node/g;Landroidx/compose/ui/node/g;)V", "helper", "vhNode", "d", "(Lio/sentry/compose/a;Landroidx/compose/ui/node/g;Lio/sentry/protocol/i0;)V", "c", "(Landroidx/compose/ui/node/g;Lio/sentry/protocol/i0;)V", "", "element", "", "a", "(Lio/sentry/protocol/i0;Ljava/lang/Object;)Z", "Lio/sentry/v0;", "Lio/sentry/compose/a;", "Lio/sentry/util/a;", "Lio/sentry/util/a;", "lock", "sentry-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeViewHierarchyExporter implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile io.sentry.compose.a composeHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a lock = new io.sentry.util.a();

    public ComposeViewHierarchyExporter(v0 v0Var) {
        this.logger = v0Var;
    }

    private final void b(io.sentry.compose.a composeHelper, i0 parent, g rootNode, g node) {
        if (node.p()) {
            i0 i0Var = new i0();
            d(composeHelper, node, i0Var);
            c(node, i0Var);
            String strM = i0Var.m();
            if (strM == null) {
                strM = "@Composable";
            }
            i0Var.s(strM);
            if (parent.l() == null) {
                parent.o(new ArrayList());
            }
            parent.l().add(i0Var);
            c<g> cVarK0 = node.K0();
            int size = cVarK0.getSize();
            for (int i15 = 0; i15 < size; i15++) {
                b(composeHelper, i0Var, rootNode, cVarK0.n()[i15]);
            }
        }
    }

    private final void c(g node, i0 vhNode) {
        m3.g gVarA = c0.a(node.m());
        vhNode.w(Double.valueOf(gVarA.getLeft()));
        vhNode.x(Double.valueOf(gVarA.getTop()));
        vhNode.p(Double.valueOf(gVarA.h()));
        vhNode.v(Double.valueOf(gVarA.o()));
    }

    private final void d(io.sentry.compose.a helper, g node, i0 vhNode) {
        Iterator<ModifierInfo> it = node.u0().iterator();
        while (it.hasNext()) {
            String strA = helper.a(it.next().getModifier());
            if (strA != null) {
                vhNode.r(strA);
            }
        }
    }

    @Override // io.sentry.internal.viewhierarchy.a
    public boolean a(i0 parent, Object element) throws Exception {
        if (!(element instanceof Owner)) {
            return false;
        }
        if (this.composeHelper == null) {
            g1 g1VarA = this.lock.a();
            try {
                if (this.composeHelper == null) {
                    this.composeHelper = new io.sentry.compose.a(this.logger);
                }
                oq.i0 i0Var = oq.i0.f148189a;
                cr.a.a(g1VarA, null);
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    cr.a.a(g1VarA, th4);
                    throw th5;
                }
            }
        }
        g root = ((Owner) element).getRoot();
        b(this.composeHelper, parent, root, root);
        return true;
    }
}
