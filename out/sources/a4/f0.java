package a4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"La4/f0;", "", "Landroidx/compose/ui/node/g;", "root", "<init>", "(Landroidx/compose/ui/node/g;)V", "La4/d0;", "pointerEvent", "La4/q0;", "positionCalculator", "", "isInBounds", "La4/r0;", "b", "(La4/d0;La4/q0;Z)I", "Loq/i0;", "c", "()V", "a", "Landroidx/compose/ui/node/g;", "getRoot", "()Landroidx/compose/ui/node/g;", "La4/f;", "La4/f;", "hitPathTracker", "La4/c0;", "La4/c0;", "pointerInputChangeEventProducer", "Lg4/t;", "d", "Lg4/t;", "hitResult", "e", "Z", "isProcessing", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.node.g root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f hitPathTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c0 pointerInputChangeEventProducer = new c0();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g4.t hitResult = new g4.t();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessing;

    public f0(androidx.compose.ui.node.g gVar) {
        this.root = gVar;
        this.hitPathTracker = new f(gVar.m());
    }

    public final void a() {
        this.hitPathTracker.c();
    }

    public final int b(d0 pointerEvent, q0 positionCalculator, boolean isInBounds) {
        int i15;
        boolean z15;
        boolean z16;
        if (this.isProcessing) {
            return g0.a(false, false, false);
        }
        boolean z17 = true;
        try {
            this.isProcessing = true;
            h hVarB = this.pointerInputChangeEventProducer.b(pointerEvent, positionCalculator);
            int iQ = hVarB.b().q();
            while (true) {
                if (i15 >= iQ) {
                    z15 = true;
                    break;
                }
                PointerInputChange pointerInputChangeS = hVarB.b().s(i15);
                i15 = (pointerInputChangeS.getPressed() || pointerInputChangeS.getPreviousPressed()) ? 0 : i15 + 1;
                z15 = false;
                break;
            }
            int iQ2 = hVarB.b().q();
            for (int i16 = 0; i16 < iQ2; i16++) {
                PointerInputChange pointerInputChangeS2 = hVarB.b().s(i16);
                if (z15 || p.b(pointerInputChangeS2)) {
                    androidx.compose.ui.node.g.N0(this.root, pointerInputChangeS2.getPosition(), this.hitResult, pointerInputChangeS2.getType(), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.b(pointerInputChangeS2.getId(), this.hitResult, p.b(pointerInputChangeS2));
                        this.hitResult.clear();
                    }
                }
            }
            boolean zD = this.hitPathTracker.d(hVarB, isInBounds);
            if (hVarB.getSuppressMovementConsumption()) {
                z16 = false;
                break;
            }
            int iQ3 = hVarB.b().q();
            int i17 = 0;
            while (true) {
                if (i17 >= iQ3) {
                    z16 = false;
                    break;
                }
                PointerInputChange pointerInputChangeS3 = hVarB.b().s(i17);
                if (p.k(pointerInputChangeS3) && pointerInputChangeS3.q()) {
                    z16 = true;
                    break;
                }
                i17++;
            }
            int iQ4 = hVarB.b().q();
            int i18 = 0;
            while (true) {
                if (i18 >= iQ4) {
                    z17 = false;
                    break;
                }
                if (hVarB.b().s(i18).q()) {
                    break;
                }
                i18++;
            }
            return g0.a(zD, z16, z17);
        } finally {
            this.isProcessing = false;
        }
    }

    public final void c() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.a();
        this.hitPathTracker.e();
    }
}
