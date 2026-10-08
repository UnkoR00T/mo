package p056h1;

import android.os.Trace;
import c1.e;
import c5.b;
import er.l;
import er.p;
import fr.k;
import fr.p0;
import fr.t;
import g4.p1;
import g4.q1;
import gu.m;
import java.util.List;
import oq.g;
import oq.i0;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.r2;
import p071kotlin.Metadata;
import p076m2.e5;
import p076m2.r;
import pq.v;
import w0.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\n*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010'R(\u0010.\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010'\u0012\u0004\b-\u0010\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lh1/v2;", "", "Lh1/k0;", "itemContentFactory", "Le4/r2;", "subcomposeLayoutState", "Lh1/z2;", "executor", "<init>", "(Lh1/k0;Le4/r2;Lh1/z2;)V", "Loq/i0;", "g", "()V", "", "index", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Lh1/w2;", "prefetchMetrics", "", "isHighPriority", "Lkotlin/Function1;", "Lh1/l1$c;", "onItemPremeasured", "Lh1/l1$b;", "h", "(IJLh1/w2;ZLer/l;)Lh1/l1$b;", "Lh1/x2;", "request", "e", "(Lh1/z2;Lh1/x2;Z)V", "d", "(ILh1/w2;)Lh1/x2;", "a", "Lh1/k0;", "b", "Le4/r2;", "c", "Lh1/z2;", "Z", "isStateActive", "f", "()Z", "setShouldPauseBetweenPrecompositionAndPremeasure$foundation", "(Z)V", "getShouldPauseBetweenPrecompositionAndPremeasure$foundation$annotations", "shouldPauseBetweenPrecompositionAndPremeasure", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k0 itemContentFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r2 subcomposeLayoutState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z2 executor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isStateActive = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean shouldPauseBetweenPrecompositionAndPremeasure;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBA\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u0015*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010&\u001a\u00020\u000b*\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010\u001cJ\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010\u001aJ\u0019\u0010.\u001a\f\u0018\u00010,R\u00060\u0000R\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010\u001cJ\u000f\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u0010\u001cJ\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00020\u0015*\u00020\u001eH\u0016¢\u0006\u0004\b6\u0010 J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010=R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010LR\u0016\u0010N\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010LR\u0016\u0010P\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010LR\u0018\u0010R\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010QR\u0016\u0010S\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010LR \u0010U\u001a\f\u0018\u00010,R\u00060\u0000R\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010TR\u0016\u0010V\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010LR\u0016\u0010\u0018\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010XR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010XR\u0016\u0010]\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010LR\u0014\u0010_\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010^R\u0014\u0010`\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<¨\u0006a"}, d2 = {"Lh1/v2$a;", "Lh1/l1$b;", "Lh1/x2;", "Lh1/l1$c;", "", "index", "Lh1/w2;", "prefetchMetrics", "Lh1/b3;", "priorityPrefetchScheduler", "Lkotlin/Function1;", "Loq/i0;", "onItemPremeasured", "<init>", "(Lh1/v2;ILh1/w2;Lh1/b3;Ler/l;)V", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "(Lh1/v2;IJLh1/w2;Lh1/b3;Ler/l;Lfr/k;)V", "", "available", "average", "", "s", "(JJ)Z", "availableTimeNanos", "p", "(J)V", "t", "()V", "h", "Lh1/y2;", "i", "(Lh1/y2;)Z", "", "key", CMSAttributeTableGenerator.CONTENT_TYPE, "Lh1/c;", "averages", "n", "(Lh1/y2;Ljava/lang/Object;Ljava/lang/Object;Lh1/c;)V", "l", "(Ljava/lang/Object;Ljava/lang/Object;)V", "k", "m", "Lh1/v2$a$a;", "Lh1/v2;", "q", "()Lh1/v2$a$a;", "cancel", "a", "placeableIndex", "Lc5/r;", "d", "(I)J", "b", "", "toString", "()Ljava/lang/String;", "I", "getIndex", "()I", "Lh1/w2;", "c", "Lh1/b3;", "Ler/l;", "e", "Lc5/b;", "premeasureConstraints", "Le4/r2$b;", "f", "Le4/r2$b;", "precomposeHandle", "Le4/r2$a;", "g", "Le4/r2$a;", "pausedPrecomposition", "Z", "isMeasured", "isCanceled", "j", "isApplied", "Ljava/lang/Object;", "keyUsedForComposition", "hasResolvedNestedPrefetches", "Lh1/v2$a$a;", "nestedPrefetchController", "isUrgent", "o", "J", "elapsedTimeNanos", "Lgu/m$a$a;", "startTime", "r", "pauseRequested", "()Z", "isComposed", "placeablesCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class a implements l1.b, x2, l1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final w2 prefetchMetrics;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final b3 priorityPrefetchScheduler;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final l<l1.c, i0> onItemPremeasured;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private b premeasureConstraints;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private r2.b precomposeHandle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private r2.a pausedPrecomposition;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean isMeasured;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean isCanceled;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean isApplied;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Object keyUsedForComposition;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private boolean hasResolvedNestedPrefetches;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private C1811a nestedPrefetchController;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private boolean isUrgent;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private long availableTimeNanos;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private long elapsedTimeNanos;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private long startTime;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private boolean pauseRequested;

        /* JADX INFO: renamed from: h1.v2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\"\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c\"\u0004\b\u001a\u0010\u001d¨\u0006\u001f"}, d2 = {"Lh1/v2$a$a;", "", "", "Lh1/l1;", "states", "<init>", "(Lh1/v2$a;Ljava/util/List;)V", "Lh1/y2;", "", "nestedPrefetchCount", "", "isUrgent", "c", "(Lh1/y2;IZ)Z", "a", "()I", "b", "Ljava/util/List;", "", "Lh1/x2;", "[Ljava/util/List;", "requestsByState", "I", "stateIndex", "d", "requestIndex", "e", "Z", "()Z", "(Z)V", "executedNestedPrefetch", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private final class C1811a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final List<l1> states;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final List<x2>[] requestsByState;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int stateIndex;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int requestIndex;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private boolean executedNestedPrefetch;

            public C1811a(List<l1> list) {
                this.states = list;
                this.requestsByState = new List[list.size()];
                if (list.isEmpty()) {
                    e.a("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final int a() {
                List<l1> list = this.states;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i15 = 0; i15 < size; i15++) {
                    iMin = Math.min(iMin, list.get(i15).getIdealNestedPrefetchCount());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }

            public final int b() {
                List<l1> list = this.states;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i15 = 0; i15 < size; i15++) {
                    iMin = Math.min(iMin, list.get(i15).getLastNumberOfNestedPrefetchItems());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }

            public final boolean c(y2 y2Var, int i15, boolean z15) {
                if (this.stateIndex >= this.states.size()) {
                    return false;
                }
                if (a.this.isCanceled) {
                    e.c("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                try {
                    List<l1> list = this.states;
                    int size = list.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        list.get(i16).l(i15);
                    }
                    i0 i0Var = i0.f148189a;
                    Trace.endSection();
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (this.stateIndex < this.states.size()) {
                        try {
                            if (this.requestsByState[this.stateIndex] == null) {
                                if (y2Var.a() <= 0) {
                                    Trace.endSection();
                                    return true;
                                }
                                List<x2>[] listArr = this.requestsByState;
                                int i17 = this.stateIndex;
                                listArr[i17] = this.states.get(i17).b();
                            }
                            List<x2> list2 = this.requestsByState[this.stateIndex];
                            while (this.requestIndex < list2.size()) {
                                x2 x2Var = list2.get(this.requestIndex);
                                if (z15) {
                                    a aVar = x2Var instanceof a ? (a) x2Var : null;
                                    if (aVar != null) {
                                        aVar.a();
                                    }
                                }
                                this.executedNestedPrefetch = true;
                                if (x2Var.b(y2Var)) {
                                    Trace.endSection();
                                    return true;
                                }
                                this.requestIndex++;
                            }
                            this.requestIndex = 0;
                            this.stateIndex++;
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                    i0 i0Var2 = i0.f148189a;
                    Trace.endSection();
                    return false;
                } catch (Throwable th5) {
                    Trace.endSection();
                    throw th5;
                }
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getExecutedNestedPrefetch() {
                return this.executedNestedPrefetch;
            }

            public final void e(boolean z15) {
                this.executedNestedPrefetch = z15;
            }
        }

        public /* synthetic */ a(v2 v2Var, int i15, long j15, w2 w2Var, b3 b3Var, l lVar, k kVar) {
            this(v2Var, i15, j15, w2Var, b3Var, lVar);
        }

        private final void h() {
            r2.a aVar = this.pausedPrecomposition;
            if (aVar != null) {
                aVar.cancel();
            }
            this.pausedPrecomposition = null;
            r2.b bVar = this.precomposeHandle;
            if (bVar != null) {
                bVar.j();
            }
            this.precomposeHandle = null;
            this.nestedPrefetchController = null;
        }

        private final boolean i(y2 y2Var) {
            e5.a.a("compose:lazy:prefetch:execute:item", getIndex());
            o0 o0VarA = v2.this.itemContentFactory.d().a();
            if (!this.isCanceled) {
                int iA = o0VarA.a();
                int index = getIndex();
                if (index >= 0 && index < iA) {
                    Object objD = o0VarA.d(getIndex());
                    Object obj = this.keyUsedForComposition;
                    if (obj != null && !t.c(objD, obj)) {
                        h();
                        return false;
                    }
                    Object objF = o0VarA.f(getIndex());
                    c cVarA = this.prefetchMetrics.a(objF);
                    boolean zJ = j();
                    p(y2Var.a());
                    if (!j()) {
                        if (g0.isPausableCompositionInPrefetchEnabled) {
                            if (s(this.availableTimeNanos, cVarA.getResumeTimeNanos() + cVarA.getPauseTimeNanos())) {
                                Trace.beginSection("compose:lazy:prefetch:compose");
                                try {
                                    n(y2Var, objD, objF, cVarA);
                                    i0 i0Var = i0.f148189a;
                                    Trace.endSection();
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                        } else if (s(this.availableTimeNanos, cVarA.getCompositionTimeNanos())) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                l(objD, objF);
                                i0 i0Var2 = i0.f148189a;
                                Trace.endSection();
                                t();
                                cVarA.k(this.elapsedTimeNanos);
                            } catch (Throwable th5) {
                                Trace.endSection();
                                throw th5;
                            }
                        }
                        if (!j()) {
                            return true;
                        }
                    }
                    if (this.pausedPrecomposition != null) {
                        if (!s(this.availableTimeNanos, cVarA.getApplyTimeNanos())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            k();
                            i0 i0Var3 = i0.f148189a;
                            Trace.endSection();
                            t();
                            cVarA.j(this.elapsedTimeNanos);
                        } catch (Throwable th6) {
                            Trace.endSection();
                            throw th6;
                        }
                    }
                    if (!this.hasResolvedNestedPrefetches) {
                        if (this.availableTimeNanos <= 0) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.nestedPrefetchController = q();
                            this.hasResolvedNestedPrefetches = true;
                            i0 i0Var4 = i0.f148189a;
                            Trace.endSection();
                        } catch (Throwable th7) {
                            Trace.endSection();
                            throw th7;
                        }
                    }
                    C1811a c1811a = this.nestedPrefetchController;
                    if (c1811a != null ? c1811a.c(y2Var, cVarA.getNestedPrefetchCount(), this.isUrgent) : false) {
                        return true;
                    }
                    C1811a c1811a2 = this.nestedPrefetchController;
                    if (c1811a2 != null && c1811a2.getExecutedNestedPrefetch()) {
                        t();
                        e5.a.a("compose:lazy:prefetch:execute:item", getIndex());
                        C1811a c1811a3 = this.nestedPrefetchController;
                        if (c1811a3 != null) {
                            c1811a3.e(false);
                        }
                    }
                    b bVar = this.premeasureConstraints;
                    if (!this.isMeasured && bVar != null) {
                        if ((v2.this.getShouldPauseBetweenPrecompositionAndPremeasure() && !zJ) || !s(this.availableTimeNanos, cVarA.getMeasureTimeNanos())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            m(bVar.getValue());
                            i0 i0Var5 = i0.f148189a;
                            Trace.endSection();
                            t();
                            cVarA.l(this.elapsedTimeNanos);
                            l<l1.c, i0> lVar = this.onItemPremeasured;
                            if (lVar != null) {
                                lVar.b(this);
                            }
                        } catch (Throwable th8) {
                            Trace.endSection();
                            throw th8;
                        }
                    }
                    C1811a c1811a4 = this.nestedPrefetchController;
                    if (this.isMeasured && this.hasResolvedNestedPrefetches && c1811a4 != null) {
                        int iA2 = c1811a4.a();
                        cVarA.m(iA2);
                        if (c1811a4.b() < iA2) {
                            cVarA.c();
                        }
                    }
                    return false;
                }
            }
            h();
            return false;
        }

        private final boolean j() {
            r2.a aVar;
            return this.isApplied || ((aVar = this.pausedPrecomposition) != null && aVar.getIsComplete());
        }

        private final void k() {
            r2.a aVar = this.pausedPrecomposition;
            if (aVar == null) {
                throw new IllegalArgumentException("Nothing to apply!");
            }
            this.precomposeHandle = aVar.apply();
            this.pausedPrecomposition = null;
            this.isApplied = true;
        }

        private final void l(Object key, Object contentType) {
            if (!(this.precomposeHandle == null)) {
                e.a("Request was already composed!");
            }
            p<r, Integer, i0> pVarB = v2.this.itemContentFactory.b(getIndex(), key, contentType);
            this.keyUsedForComposition = key;
            this.precomposeHandle = v2.this.subcomposeLayoutState.j(key, pVarB);
            this.isApplied = true;
        }

        private final void m(long constraints) {
            if (this.isCanceled) {
                e.a("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.isMeasured) {
                e.a("Request was already measured!");
            }
            this.isMeasured = true;
            r2.b bVar = this.precomposeHandle;
            if (bVar == null) {
                e.b("performComposition() must be called before performMeasure()");
                throw new g();
            }
            int iC = bVar.c();
            for (int i15 = 0; i15 < iC; i15++) {
                bVar.f(i15, constraints);
            }
        }

        private final void n(y2 y2Var, Object obj, Object obj2, final c cVar) {
            r2.a aVarD = this.pausedPrecomposition;
            if (aVarD == null) {
                v2 v2Var = v2.this;
                aVarD = v2Var.subcomposeLayoutState.d(obj, v2Var.itemContentFactory.b(getIndex(), obj, obj2));
                this.pausedPrecomposition = aVarD;
                this.keyUsedForComposition = obj;
            }
            this.pauseRequested = false;
            while (!aVarD.getIsComplete() && !this.pauseRequested) {
                aVarD.b(new e5() { // from class: h1.u2
                    @Override // p076m2.e5
                    public final boolean a() {
                        return v2.a.o(this.f79563a, cVar);
                    }
                });
            }
            t();
            if (this.pauseRequested) {
                cVar.n(this.elapsedTimeNanos);
            } else {
                cVar.o(this.elapsedTimeNanos);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(a aVar, c cVar) {
            if (!aVar.pauseRequested) {
                aVar.t();
                cVar.o(aVar.elapsedTimeNanos);
                aVar.pauseRequested = !aVar.s(aVar.availableTimeNanos, cVar.getResumeTimeNanos() + cVar.getPauseTimeNanos());
            }
            return aVar.pauseRequested;
        }

        private final void p(long availableTimeNanos) {
            this.availableTimeNanos = availableTimeNanos;
            this.startTime = m.a.f76977a.b();
            this.elapsedTimeNanos = 0L;
            e5.a.a("compose:lazy:prefetch:available_time_nanos", availableTimeNanos);
        }

        private final C1811a q() {
            r2.b bVar = this.precomposeHandle;
            if (bVar == null) {
                e.b("Should precompose before resolving nested prefetch states");
                throw new g();
            }
            final p0 p0Var = new p0();
            bVar.e("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new l() { // from class: h1.t2
                @Override // er.l
                public final Object b(Object obj) {
                    return v2.a.r(p0Var, (q1) obj);
                }
            });
            List list = (List) p0Var.f66410a;
            if (list != null) {
                return new C1811a(list);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final p1 r(p0 p0Var, q1 q1Var) {
            T t15;
            l1 l1VarN3 = ((g3) q1Var).getPrefetchState();
            List list = (List) p0Var.f66410a;
            if (list != null) {
                list.add(l1VarN3);
                t15 = list;
            } else {
                t15 = v.t(l1VarN3);
            }
            p0Var.f66410a = t15;
            return p1.SkipSubtreeAndContinueTraversal;
        }

        private final boolean s(long available, long average) {
            if (this.isUrgent) {
                average = 0;
            }
            return available > average;
        }

        private final void t() {
            long jB = m.a.f76977a.b();
            long jD = gu.b.D(m.a.C1742a.o(jB, this.startTime));
            this.elapsedTimeNanos = jD;
            long j15 = this.availableTimeNanos - jD;
            this.availableTimeNanos = j15;
            this.startTime = jB;
            e5.a.a("compose:lazy:prefetch:available_time_nanos", j15);
        }

        @Override // h1.l1.b
        public void a() {
            this.isUrgent = true;
        }

        @Override // p056h1.x2
        public boolean b(y2 y2Var) {
            boolean zI;
            if (!v2.this.isStateActive) {
                return false;
            }
            if (this.isUrgent) {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    zI = i(y2Var);
                    Trace.endSection();
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            } else {
                zI = i(y2Var);
            }
            e5.a.a("compose:lazy:prefetch:execute:item", -1L);
            return zI;
        }

        @Override // h1.l1.c
        public int c() {
            r2.b bVar = this.precomposeHandle;
            if (bVar != null) {
                return bVar.c();
            }
            return 0;
        }

        @Override // h1.l1.b
        public void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            h();
        }

        @Override // h1.l1.c
        public long d(int placeableIndex) {
            r2.b bVar = this.precomposeHandle;
            return bVar != null ? bVar.d(placeableIndex) : c5.r.INSTANCE.a();
        }

        @Override // h1.l1.c
        public int getIndex() {
            return this.index;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + getIndex() + ", constraints = " + this.premeasureConstraints + ", isComposed = " + j() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i15, w2 w2Var, b3 b3Var, l<? super l1.c, i0> lVar) {
            this.index = i15;
            this.prefetchMetrics = w2Var;
            this.priorityPrefetchScheduler = b3Var;
            this.onItemPremeasured = lVar;
            this.startTime = m.a.f76977a.b();
        }

        private a(v2 v2Var, int i15, long j15, w2 w2Var, b3 b3Var, l<? super l1.c, i0> lVar) {
            this(i15, w2Var, b3Var, lVar);
            this.premeasureConstraints = b.a(j15);
        }
    }

    public v2(k0 k0Var, r2 r2Var, z2 z2Var) {
        this.itemContentFactory = k0Var;
        this.subcomposeLayoutState = r2Var;
        this.executor = z2Var;
    }

    public final x2 d(int index, w2 prefetchMetrics) {
        z2 z2Var = this.executor;
        return new a(index, prefetchMetrics, z2Var instanceof b3 ? (b3) z2Var : null, null);
    }

    public final void e(z2 z2Var, x2 x2Var, boolean z15) {
        if (!(z2Var instanceof b3)) {
            z2Var.a(x2Var);
        } else if (z15) {
            ((b3) z2Var).b(x2Var);
        } else {
            ((b3) z2Var).c(x2Var);
        }
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShouldPauseBetweenPrecompositionAndPremeasure() {
        return this.shouldPauseBetweenPrecompositionAndPremeasure;
    }

    public final void g() {
        this.isStateActive = false;
    }

    public final l1.b h(int index, long constraints, w2 prefetchMetrics, boolean isHighPriority, l<? super l1.c, i0> onItemPremeasured) {
        z2 z2Var = this.executor;
        a aVar = new a(this, index, constraints, prefetchMetrics, z2Var instanceof b3 ? (b3) z2Var : null, onItemPremeasured, null);
        e(this.executor, aVar, isHighPriority);
        e5.a.a("compose:lazy:schedule_prefetch:index", index);
        return aVar;
    }
}
