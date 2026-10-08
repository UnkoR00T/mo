package io.sentry.compose.gestures;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.g;
import fr.t;
import io.sentry.compose.b;
import io.sentry.g1;
import io.sentry.internal.gestures.a;
import io.sentry.v0;
import io.sentry.z6;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import m3.f;
import n4.h0;
import n4.u;
import oq.i0;
import p036e4.ModifierInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lio/sentry/compose/gestures/ComposeGestureTargetLocator;", "Lio/sentry/internal/gestures/a;", "Lio/sentry/v0;", "logger", "<init>", "(Lio/sentry/v0;)V", "Landroidx/compose/ui/node/g;", "root", "node", "", "x", "y", "", "b", "(Landroidx/compose/ui/node/g;Landroidx/compose/ui/node/g;FF)Z", "", "Lio/sentry/internal/gestures/b$a;", "targetType", "Lio/sentry/internal/gestures/b;", "a", "(Ljava/lang/Object;FFLio/sentry/internal/gestures/b$a;)Lio/sentry/internal/gestures/b;", "Lio/sentry/v0;", "Lio/sentry/compose/a;", "Lio/sentry/compose/a;", "composeHelper", "Lio/sentry/util/a;", "c", "Lio/sentry/util/a;", "lock", "d", "sentry-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeGestureTargetLocator implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f94803e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile io.sentry.compose.a composeHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a lock = new io.sentry.util.a();

    public ComposeGestureTargetLocator(v0 v0Var) {
        this.logger = v0Var;
        z6.d().b("maven:io.sentry:sentry-compose", "8.22.0");
    }

    private final boolean b(g root, g node, float x15, float y15) {
        return b.a(node.m(), root.m()).b(f.a(x15, y15));
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    @Override // io.sentry.internal.gestures.a
    public io.sentry.internal.gestures.b a(Object root, float x15, float y15, io.sentry.internal.gestures.b.a targetType) throws Exception {
        io.sentry.internal.gestures.b bVar;
        String str;
        g gVar;
        io.sentry.internal.gestures.b bVar2 = null;
        if (!(root instanceof Owner)) {
            return null;
        }
        if (this.composeHelper == null) {
            g1 g1VarA = this.lock.a();
            try {
                if (this.composeHelper == null) {
                    this.composeHelper = new io.sentry.compose.a(this.logger);
                }
                i0 i0Var = i0.f148189a;
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
        g root2 = ((Owner) root).getRoot();
        LinkedList linkedList = new LinkedList();
        linkedList.add(root2);
        String str2 = null;
        String str3 = null;
        while (!linkedList.isEmpty()) {
            g gVar2 = (g) linkedList.poll();
            if (gVar2 != null) {
                if (gVar2.p() && b(root2, gVar2, x15, y15)) {
                    List<ModifierInfo> listU0 = gVar2.u0();
                    int size = listU0.size();
                    int i15 = 0;
                    boolean z15 = false;
                    boolean z16 = false;
                    while (i15 < size) {
                        ModifierInfo modifierInfo = listU0.get(i15);
                        io.sentry.internal.gestures.b bVar3 = bVar2;
                        g gVar3 = root2;
                        String strA = this.composeHelper.a(modifierInfo.getModifier());
                        if (strA != null) {
                            str3 = strA;
                        }
                        if (modifierInfo.getModifier() instanceof u) {
                            Iterator<Map.Entry<? extends h0<?>, ? extends Object>> it = ((u) modifierInfo.getModifier()).f().iterator();
                            while (it.hasNext()) {
                                String name = it.next().getKey().getName();
                                if (t.c("ScrollBy", name)) {
                                    z16 = true;
                                } else if (t.c("OnClick", name)) {
                                    z15 = true;
                                }
                            }
                        } else {
                            String name2 = modifierInfo.getModifier().getClass().getName();
                            if (t.c("androidx.compose.foundation.ClickableElement", name2) || t.c("androidx.compose.foundation.CombinedClickableElement", name2)) {
                                z15 = true;
                            } else if (t.c("androidx.compose.foundation.ScrollingLayoutElement", name2)) {
                                z16 = true;
                            }
                        }
                        i15++;
                        root2 = gVar3;
                        bVar2 = bVar3;
                    }
                    gVar = root2;
                    bVar = bVar2;
                    if (z15 && targetType == io.sentry.internal.gestures.b.a.CLICKABLE) {
                        str2 = str3;
                    }
                    if (z16 && targetType == io.sentry.internal.gestures.b.a.SCROLLABLE) {
                        str = str3;
                        if (str == null) {
                            return bVar;
                        }
                        return new io.sentry.internal.gestures.b(null, null, null, str, "jetpack_compose");
                    }
                } else {
                    gVar = root2;
                    bVar = bVar2;
                }
                linkedList.addAll(gVar2.K0().i());
                root2 = gVar;
                bVar2 = bVar;
            }
        }
        bVar = bVar2;
        str = str2;
        if (str == null) {
            return bVar;
        }
        return new io.sentry.internal.gestures.b(null, null, null, str, "jetpack_compose");
    }
}
