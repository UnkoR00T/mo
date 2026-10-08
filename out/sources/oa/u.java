package oa;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import io.sentry.android.core.c2;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ju.d2;
import ju.p0;
import ju.q0;
import ju.v1;
import ju.z2;
import p071kotlin.Metadata;
import p101pRn.l2;
import pq.e1;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0018\b&\u0018\u0000 -2\u00020\u0001:\u0006aXdZ\u0013]B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J#\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0012\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u001a\u0010\u001f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH\u0017¢\u0006\u0004\b\"\u0010#J1\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 2\u001a\u0010\u001f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\r\u0012\u0004\u0012\u00020\u001e0\u001cH\u0017¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0015H\u0015¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0015¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H$¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0007¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u000202H\u0000¢\u0006\u0004\b5\u00104J)\u00106\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0 0\u001cH\u0015¢\u0006\u0004\b6\u00107J)\u00108\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0 0\u001cH\u0015¢\u0006\u0004\b8\u00107J\u001d\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d09H\u0017¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\r09H\u0017¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\u0003J\u000f\u0010>\u001a\u00020\u0004H\u0017¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\u0004H\u0017¢\u0006\u0004\b?\u0010\u0003JB\u0010F\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010A\u001a\u00020@2\"\u0010E\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020C\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D\u0012\u0006\u0012\u0004\u0018\u00010\u00010BH\u0087@¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020@H\u0007¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0004H\u0017¢\u0006\u0004\bJ\u0010\u0003J\u000f\u0010K\u001a\u00020\u0004H\u0017¢\u0006\u0004\bK\u0010\u0003J\u000f\u0010L\u001a\u00020\u0004H\u0017¢\u0006\u0004\bL\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020MH\u0016¢\u0006\u0004\b\b\u0010NJ#\u0010Q\u001a\u00028\u0000\"\u0004\b\u0000\u0010O2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000PH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\u00042\u0006\u0010T\u001a\u00020SH\u0005¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020@H\u0016¢\u0006\u0004\bW\u0010IR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010c\u001a\u00020`8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020`8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bd\u0010bR\u0016\u0010g\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010fR\u0016\u0010i\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010hR\u001a\u0010n\u001a\u00020j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010k\u001a\u0004\bl\u0010mR\u0016\u0010p\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010oR\u0018\u0010s\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010rR\u001d\u0010x\u001a\b\u0012\u0004\u0012\u0002020t8G¢\u0006\f\n\u0004\b$\u0010u\u001a\u0004\bv\u0010wR$\u0010|\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R#\u0010\u0080\u0001\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010o\u001a\u0004\b}\u0010I\"\u0004\b~\u0010\u007fR\u0016\u0010\u0082\u0001\u001a\u00020@8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010IR\u0017\u0010\u0085\u0001\u001a\u00020`8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0088\u0001\u001a\u00020&8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010\u008a\u0001\u001a\u00020,8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010.R0\u0010\u008c\u0001\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0 0\u001c8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u00107R\u0016\u0010\u008e\u0001\u001a\u00020@8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010IR\u0016\u0010\u0090\u0001\u001a\u00020@8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010I¨\u0006\u0091\u0001"}, d2 = {"Loa/u;", "", "<init>", "()V", "Loq/i0;", "Q", "K", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "T", "Lkotlin/Function0;", "body", "R", "(Ler/a;)Ljava/lang/Object;", "Lmr/c;", "klass", "F", "(Lmr/c;)Ljava/lang/Object;", "kclass", "converter", "f", "(Lmr/c;Ljava/lang/Object;)V", "Loa/c;", "configuration", "J", "(Loa/c;)V", "Loa/p;", "m", "(Loa/c;)Loa/p;", "", "Ljava/lang/Class;", "Lra/a;", "autoMigrationSpecs", "", "Lra/b;", "r", "(Ljava/util/Map;)Ljava/util/List;", "k", "config", "Lza/d;", "p", "(Loa/c;)Lza/d;", "Loa/b0;", "o", "()Loa/b0;", "Landroidx/room/c;", "n", "()Landroidx/room/c;", "Lju/p0;", "t", "()Lju/p0;", "Ltq/i;", "w", "()Ltq/i;", ip.a.f96138c, "B", "()Ljava/util/Map;", "z", "", "y", "()Ljava/util/Set;", "x", "j", "g", "h", "", "isReadOnly", "Lkotlin/Function2;", "Loa/g0;", "Ltq/e;", "block", "Y", "(ZLer/p;Ltq/e;)Ljava/lang/Object;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Z", "i", "q", "X", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "V", "Ljava/util/concurrent/Callable;", ip.a.f96137b, "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Lya/b;", "connection", "M", "(Lya/b;)V", "I", "a", "Loa/c;", "b", "Lju/p0;", "coroutineScope", "c", "Ltq/i;", "transactionContext", "Ljava/util/concurrent/Executor;", "d", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "e", "internalTransactionExecutor", "Loa/p;", "connectionManager", "Landroidx/room/c;", "internalTracker", "Lpa/a;", "Lpa/a;", "s", "()Lpa/a;", "closeBarrier", "Z", "allowMainThreadQueries", "Lsa/b;", "Lsa/b;", "autoCloser", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal;", "C", "()Ljava/lang/ThreadLocal;", "suspendingTransactionContext", "", "l", "Ljava/util/Map;", "typeConverters", "G", "setUseTempTrackingTable$room_runtime", "(Z)V", "useTempTrackingTable", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "isThreadInSuspendingTransaction", "E", "()Ljava/util/concurrent/Executor;", "transactionExecutor", "v", "()Lza/d;", "openHelper", "u", "invalidationTracker", "A", "requiredTypeConverterClassesMap", "O", "isOpenInternal", "N", "isMainThread", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private c configuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private p0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private tq.i transactionContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Executor internalQueryExecutor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Executor internalTransactionExecutor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private p connectionManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private androidx.room.c internalTracker;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean allowMainThreadQueries;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private sa.b autoCloser;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final pa.a closeBarrier = new pa.a(new g(this));

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ThreadLocal<tq.i> suspendingTransactionContext = new ThreadLocal<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Map<mr.c<?>, Object> typeConverters = new LinkedHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean useTempTrackingTable = true;

    @Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010+R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u001f0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00102R\u0018\u00107\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020P0O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010RR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020V0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010/R\u0016\u0010Z\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00109R\u0016\u0010\\\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00109R\u0016\u0010^\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u00109R\u0018\u0010`\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010+R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001e\u0010i\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010q\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u00109¨\u0006t"}, d2 = {"Loa/u$a;", "Loa/u;", "T", "", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "Lza/d$c;", "factory", "g", "(Lza/d$c;)Loa/u$a;", "", "Lra/b;", "migrations", "b", "([Lra/b;)Loa/u$a;", "d", "()Loa/u$a;", "Ljava/util/concurrent/Executor;", "executor", "h", "(Ljava/util/concurrent/Executor;)Loa/u$a;", "", "dropAllTables", "f", "(Z)Loa/u$a;", "Loa/u$b;", "callback", "a", "(Loa/u$b;)Loa/u$a;", "typeConverter", "c", "(Ljava/lang/Object;)Loa/u$a;", "e", "()Loa/u;", "Lmr/c;", "Lmr/c;", "Landroid/content/Context;", "Ljava/lang/String;", "Lkotlin/Function0;", "Ler/a;", "", "Ljava/util/List;", "callbacks", "typeConverters", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "i", "Lza/d$c;", "supportOpenHelperFactory", "j", "Z", "allowMainThreadQueries", "Loa/u$d;", "k", "Loa/u$d;", "journalMode", "Landroid/content/Intent;", "l", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "", "m", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "n", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Loa/u$e;", "o", "Loa/u$e;", "migrationContainer", "", "", "p", "Ljava/util/Set;", "migrationsNotRequiredFrom", "q", "migrationStartAndEndVersions", "Lra/a;", "r", "autoMigrationSpecs", "s", "requireMigration", "t", "allowDestructiveMigrationOnDowngrade", "u", "allowDestructiveMigrationForAllTables", "v", "copyFromAssetPath", "Ljava/io/File;", "w", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "x", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "Lya/c;", "y", "Lya/c;", "driver", "Ltq/i;", "z", "Ltq/i;", "queryCoroutineContext", "A", "inMemoryTrackingTableMode", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class a<T extends u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final mr.c<T> klass;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Executor queryExecutor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Executor transactionExecutor;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private za.d.c supportOpenHelperFactory;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean allowMainThreadQueries;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private Intent multiInstanceInvalidationIntent;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private TimeUnit autoCloseTimeUnit;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private boolean allowDestructiveMigrationOnDowngrade;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private boolean allowDestructiveMigrationForAllTables;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private String copyFromAssetPath;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private File copyFromFile;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private Callable<InputStream> copyFromInputStream;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        private ya.c driver;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        private tq.i queryCoroutineContext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<b> callbacks = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<Object> typeConverters = new ArrayList();

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private d journalMode = d.AUTOMATIC;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private long autoCloseTimeout = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final e migrationContainer = new e();

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private Set<Integer> migrationsNotRequiredFrom = new LinkedHashSet();

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final Set<Integer> migrationStartAndEndVersions = new LinkedHashSet();

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final List<ra.a> autoMigrationSpecs = new ArrayList();

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private boolean requireMigration = true;

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private boolean inMemoryTrackingTableMode = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final er.a<T> factory = null;

        public a(Context context, Class<T> cls, String str) {
            this.klass = dr.a.e(cls);
            this.context = context;
            this.name = str;
        }

        public a<T> a(b callback) {
            this.callbacks.add(callback);
            return this;
        }

        public a<T> b(ra.b... migrations) {
            for (ra.b bVar : migrations) {
                this.migrationStartAndEndVersions.add(Integer.valueOf(bVar.startVersion));
                this.migrationStartAndEndVersions.add(Integer.valueOf(bVar.endVersion));
            }
            this.migrationContainer.b((ra.b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a<T> c(Object typeConverter) {
            this.typeConverters.add(typeConverter);
            return this;
        }

        public a<T> d() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public T e() {
            za.d.c mVar;
            za.d.c cVar;
            T tA;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor executorF = l2.f();
                this.transactionExecutor = executorF;
                this.queryExecutor = executorF;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            v.c(this.migrationStartAndEndVersions, this.migrationsNotRequiredFrom);
            ya.c cVar2 = this.driver;
            if (cVar2 == null && this.supportOpenHelperFactory == null) {
                mVar = new ab.i();
            } else if (cVar2 == null) {
                mVar = this.supportOpenHelperFactory;
            } else {
                if (this.supportOpenHelperFactory != null) {
                    throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                mVar = null;
            }
            boolean z15 = this.autoCloseTimeout > 0;
            boolean z16 = (this.copyFromAssetPath == null && this.copyFromFile == null && this.copyFromInputStream == null) ? false : true;
            if (mVar != null) {
                if (z15) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j15 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    mVar = new sa.k(mVar, new sa.b(j15, timeUnit, null, 4, null));
                }
                if (z16) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    String str = this.copyFromAssetPath;
                    int i15 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i16 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i15 + i16 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    mVar = new sa.m(str, file, callable, mVar);
                }
                cVar = mVar;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                if (z15) {
                    throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.");
                }
                if (z16) {
                    throw new IllegalArgumentException("Pre-Package Database is not supported when an SQLiteDriver is configured.");
                }
            }
            Context context = this.context;
            String str2 = this.name;
            e eVar = this.migrationContainer;
            List<b> list = this.callbacks;
            boolean z17 = this.allowMainThreadQueries;
            d dVarE = this.journalMode.e(context);
            Executor executor2 = this.queryExecutor;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.transactionExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c cVar3 = new c(context, str2, cVar, eVar, list, z17, dVarE, executor2, executor3, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, null, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, this.driver, this.queryCoroutineContext);
            cVar3.g(this.inMemoryTrackingTableMode);
            er.a<T> aVar = this.factory;
            if (aVar == null || (tA = aVar.a()) == null) {
                tA = (T) ta.f.b(dr.a.b(this.klass), null, 2, null);
            }
            tA.J(cVar3);
            return tA;
        }

        public final a<T> f(boolean dropAllTables) {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = dropAllTables;
            return this;
        }

        public a<T> g(za.d.c factory) {
            this.supportOpenHelperFactory = factory;
            return this;
        }

        public a<T> h(Executor executor) {
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.queryExecutor = executor;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Loa/u$b;", "", "<init>", "()V", "Lza/c;", "db", "Loq/i0;", "b", "(Lza/c;)V", "Lya/b;", "connection", "a", "(Lya/b;)V", "d", "c", "f", "e", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {
        public void a(ya.b connection) {
            if (connection instanceof bb.a) {
                b(((bb.a) connection).getDb());
            }
        }

        public void b(za.c db5) {
        }

        public void c(ya.b connection) {
            if (connection instanceof bb.a) {
                d(((bb.a) connection).getDb());
            }
        }

        public void d(za.c db5) {
        }

        public void e(ya.b connection) {
            if (connection instanceof bb.a) {
                f(((bb.a) connection).getDb());
            }
        }

        public void f(za.c db5) {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Loa/u$d;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/content/Context;", "context", "e", "(Landroid/content/Context;)Loa/u$d;", "a", "b", "c", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f143809e = wq.b.a(b());

        public final d e(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001e\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010\u001fR,\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#¨\u0006$"}, d2 = {"Loa/u$e;", "", "<init>", "()V", "", "Lra/b;", "migrations", "Loq/i0;", "b", "([Lra/b;)V", "migration", "a", "(Lra/b;)V", "", "", "e", "()Ljava/util/Map;", "start", "end", "", "d", "(II)Ljava/util/List;", "startVersion", "endVersion", "", "c", "(II)Z", "migrationStart", "Loq/r;", "", "g", "(I)Loq/r;", "f", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<Integer, TreeMap<Integer, ra.b>> migrations = new LinkedHashMap();

        public final void a(ra.b migration) {
            int i15 = migration.startVersion;
            int i16 = migration.endVersion;
            Map<Integer, TreeMap<Integer, ra.b>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i15);
            TreeMap<Integer, ra.b> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, ra.b> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i16))) {
                c2.g("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i16)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i16), migration);
        }

        public void b(ra.b... migrations) {
            for (ra.b bVar : migrations) {
                a(bVar);
            }
        }

        public final boolean c(int startVersion, int endVersion) {
            return ta.h.a(this, startVersion, endVersion);
        }

        public List<ra.b> d(int start, int end) {
            return ta.h.b(this, start, end);
        }

        public Map<Integer, Map<Integer, ra.b>> e() {
            return this.migrations;
        }

        public final oq.r<Map<Integer, ra.b>, Iterable<Integer>> f(int migrationStart) {
            TreeMap<Integer, ra.b> treeMap = this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return oq.y.a(treeMap, treeMap.descendingKeySet());
        }

        public final oq.r<Map<Integer, ra.b>, Iterable<Integer>> g(int migrationStart) {
            TreeMap<Integer, ra.b> treeMap = this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return oq.y.a(treeMap, treeMap.keySet());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loa/u$f;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class g extends fr.q implements er.a<oq.i0> {
        g(Object obj) {
            super(0, obj, u.class, "onClosed", "onClosed()V", 0);
        }

        public final void E() {
            ((u) this.f66391b).Q();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class h extends fr.q implements er.p<er.l<? super tq.e<? super Object>, ? extends Object>, tq.e<? super Object>, Object> {
        h(Object obj) {
            super(2, obj, x.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // er.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Object B(er.l<? super tq.e<Object>, ? extends Object> lVar, tq.e<Object> eVar) {
            return v.a((u) this.f66391b, lVar, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class i extends fr.q implements er.p<er.l<? super tq.e<? super Object>, ? extends Object>, tq.e<? super Object>, Object> {
        i(Object obj) {
            super(2, obj, x.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // er.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Object B(er.l<? super tq.e<Object>, ? extends Object> lVar, tq.e<Object> eVar) {
            return v.a((u) this.f66391b, lVar, eVar);
        }
    }

    private final void K() {
        g();
        za.c cVarG3 = v().g3();
        if (!cVarG3.l0()) {
            u().B();
        }
        if (cVarG3.P3()) {
            cVarG3.b1();
        } else {
            cVarG3.q0();
        }
    }

    private final void L() {
        v().g3().r1();
        if (I()) {
            return;
        }
        u().v();
    }

    private final boolean P() {
        tq.i iVar = this.suspendingTransactionContext.get();
        return (iVar != null ? (c0) iVar.m(c0.INSTANCE) : null) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        p0 p0Var = this.coroutineScope;
        if (p0Var == null) {
            p0Var = null;
        }
        q0.d(p0Var, null, 1, null);
        u().z();
        p pVar = this.connectionManager;
        (pVar != null ? pVar : null).F();
    }

    private final <T> T R(final er.a<? extends T> body) {
        if (!H()) {
            return (T) ta.a.c(this, false, true, new er.l() { // from class: oa.t
                @Override // er.l
                public final Object b(Object obj) {
                    return u.W(body, (ya.b) obj);
                }
            });
        }
        i();
        try {
            T tA = body.a();
            X();
            return tA;
        } finally {
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(Runnable runnable) {
        runnable.run();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object V(Callable callable) {
        return callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object W(er.a aVar, ya.b bVar) {
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final za.d l(u uVar, c cVar) {
        return uVar.p(cVar);
    }

    public final Map<mr.c<?>, List<mr.c<?>>> A() {
        return z();
    }

    protected Map<Class<?>, List<Class<?>>> B() {
        return v0.i();
    }

    public final ThreadLocal<tq.i> C() {
        return this.suspendingTransactionContext;
    }

    public final tq.i D() {
        tq.i iVar = this.transactionContext;
        if (iVar == null) {
            return null;
        }
        return iVar;
    }

    public Executor E() {
        Executor executor = this.internalTransactionExecutor;
        if (executor == null) {
            return null;
        }
        return executor;
    }

    public final <T> T F(mr.c<T> klass) {
        return (T) this.typeConverters.get(klass);
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    public final boolean H() {
        p pVar = this.connectionManager;
        if (pVar == null) {
            pVar = null;
        }
        return pVar.getSupportOpenHelper() != null;
    }

    public boolean I() {
        return O() && v().g3().l0();
    }

    public void J(c configuration) {
        tq.i coroutineContext;
        this.configuration = configuration;
        this.useTempTrackingTable = configuration.getUseTempTrackingTable();
        this.connectionManager = m(configuration);
        this.internalTracker = n();
        v.b(this, configuration);
        v.d(this, configuration);
        tq.i iVar = configuration.queryCoroutineContext;
        if (iVar != null) {
            ju.l0 l0Var = (ju.l0) iVar.m(tq.f.INSTANCE);
            Executor executorA = v1.a(l0Var);
            this.internalQueryExecutor = executorA;
            if (executorA == null) {
                executorA = null;
            }
            this.internalTransactionExecutor = new e0(executorA);
            this.coroutineScope = q0.a(configuration.queryCoroutineContext.n0(z2.a((d2) configuration.queryCoroutineContext.m(d2.INSTANCE))));
            if (H()) {
                p0 p0Var = this.coroutineScope;
                if (p0Var == null) {
                    p0Var = null;
                }
                coroutineContext = p0Var.getCoroutineContext().n0(l0Var.Q1(1));
            } else {
                p0 p0Var2 = this.coroutineScope;
                if (p0Var2 == null) {
                    p0Var2 = null;
                }
                coroutineContext = p0Var2.getCoroutineContext();
            }
            this.transactionContext = coroutineContext;
        } else {
            this.internalQueryExecutor = configuration.queryExecutor;
            this.internalTransactionExecutor = new e0(configuration.transactionExecutor);
            Executor executor = this.internalQueryExecutor;
            if (executor == null) {
                executor = null;
            }
            p0 p0VarA = q0.a(v1.b(executor).n0(z2.b(null, 1, null)));
            this.coroutineScope = p0VarA;
            if (p0VarA == null) {
                p0VarA = null;
            }
            tq.i coroutineContext2 = p0VarA.getCoroutineContext();
            Executor executor2 = this.internalTransactionExecutor;
            if (executor2 == null) {
                executor2 = null;
            }
            this.transactionContext = coroutineContext2.n0(v1.b(executor2));
        }
        this.allowMainThreadQueries = configuration.allowMainThreadQueries;
        p pVar = this.connectionManager;
        if (pVar == null) {
            pVar = null;
        }
        za.d dVarG = pVar.getSupportOpenHelper();
        if (dVarG != null) {
            while (!(dVarG instanceof sa.l)) {
                if (!(dVarG instanceof oa.d)) {
                    dVarG = null;
                    break;
                }
                dVarG = ((oa.d) dVarG).getDelegate();
            }
        } else {
            dVarG = null;
            break;
        }
        sa.l lVar = (sa.l) dVarG;
        if (lVar != null) {
            lVar.p(configuration);
        }
        p pVar2 = this.connectionManager;
        if (pVar2 == null) {
            pVar2 = null;
        }
        za.d dVarG2 = pVar2.getSupportOpenHelper();
        if (dVarG2 != null) {
            while (!(dVarG2 instanceof sa.g)) {
                if (!(dVarG2 instanceof oa.d)) {
                    dVarG2 = null;
                    break;
                }
                dVarG2 = ((oa.d) dVarG2).getDelegate();
            }
        } else {
            dVarG2 = null;
            break;
        }
        sa.g gVar = (sa.g) dVarG2;
        if (gVar != null) {
            this.autoCloser = gVar.getAutoCloser();
            sa.b bVarH = gVar.getAutoCloser();
            p0 p0Var3 = this.coroutineScope;
            bVarH.k(p0Var3 != null ? p0Var3 : null);
            u().y(gVar.getAutoCloser());
        }
        if (configuration.multiInstanceInvalidationServiceIntent != null) {
            if (configuration.name == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            u().n(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
        }
    }

    protected final void M(ya.b connection) {
        u().o(connection);
    }

    public final boolean N() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean O() {
        sa.b bVar = this.autoCloser;
        if (bVar != null) {
            za.c cVarI = bVar.getDelegateDatabase();
            if (cVarI != null) {
                return cVarI.isOpen();
            }
            return false;
        }
        p pVar = this.connectionManager;
        if (pVar == null) {
            pVar = null;
        }
        return pVar.J();
    }

    public <V> V S(final Callable<V> body) {
        return (V) R(new er.a() { // from class: oa.r
            @Override // er.a
            public final Object a() {
                return u.V(body);
            }
        });
    }

    public void T(final Runnable body) {
        R(new er.a() { // from class: oa.s
            @Override // er.a
            public final Object a() {
                return u.U(body);
            }
        });
    }

    @oq.a
    public void X() {
        v().g3().X0();
    }

    public final <R> Object Y(boolean z15, er.p<? super g0, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super R> eVar) {
        p pVar2 = this.connectionManager;
        if (pVar2 == null) {
            pVar2 = null;
        }
        return pVar2.K(z15, pVar, eVar);
    }

    public final void f(mr.c<?> kclass, Object converter) {
        this.typeConverters.put(kclass, converter);
    }

    public void g() {
        if (!this.allowMainThreadQueries && N()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void h() {
        if (H() && !I() && P()) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @oq.a
    public void i() {
        g();
        K();
    }

    public void j() {
        this.closeBarrier.b();
    }

    public List<ra.b> k(Map<mr.c<? extends ra.a>, ? extends ra.a> autoMigrationSpecs) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(autoMigrationSpecs.size()));
        Iterator<T> it = autoMigrationSpecs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(dr.a.b((mr.c) entry.getKey()), entry.getValue());
        }
        return r(linkedHashMap);
    }

    public final p m(c configuration) {
        a0 a0Var;
        try {
            a0Var = (a0) o();
        } catch (oq.q unused) {
            a0Var = null;
        }
        return a0Var == null ? new p(configuration, (er.l<? super c, ? extends za.d>) new er.l() { // from class: oa.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.l(this.f143761a, (c) obj);
            }
        }, new h(this)) : new p(configuration, a0Var, new i(this));
    }

    protected abstract androidx.room.c n();

    protected b0 o() {
        throw new oq.q(null, 1, null);
    }

    @oq.a
    protected za.d p(c config) {
        throw new oq.q(null, 1, null);
    }

    @oq.a
    public void q() {
        L();
    }

    @oq.a
    public List<ra.b> r(Map<Class<? extends ra.a>, ra.a> autoMigrationSpecs) {
        return pq.v.n();
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final pa.a getCloseBarrier() {
        return this.closeBarrier;
    }

    public final p0 t() {
        p0 p0Var = this.coroutineScope;
        if (p0Var == null) {
            return null;
        }
        return p0Var;
    }

    public androidx.room.c u() {
        androidx.room.c cVar = this.internalTracker;
        if (cVar == null) {
            return null;
        }
        return cVar;
    }

    public za.d v() {
        p pVar = this.connectionManager;
        if (pVar == null) {
            pVar = null;
        }
        za.d dVarG = pVar.getSupportOpenHelper();
        if (dVarG != null) {
            return dVarG;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final tq.i w() {
        p0 p0Var = this.coroutineScope;
        if (p0Var == null) {
            p0Var = null;
        }
        return p0Var.getCoroutineContext();
    }

    public Set<mr.c<? extends ra.a>> x() {
        Set<Class<? extends ra.a>> setY = y();
        ArrayList arrayList = new ArrayList(pq.v.y(setY, 10));
        Iterator<T> it = setY.iterator();
        while (it.hasNext()) {
            arrayList.add(dr.a.e((Class) it.next()));
        }
        return pq.v.k1(arrayList);
    }

    @oq.a
    public Set<Class<? extends ra.a>> y() {
        return e1.e();
    }

    protected Map<mr.c<?>, List<mr.c<?>>> z() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = B().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            mr.c cVarE = dr.a.e(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList.add(dr.a.e((Class) it4.next()));
            }
            oq.r rVarA = oq.y.a(cVarE, arrayList);
            linkedHashMap.put(rVarA.c(), rVarA.d());
        }
        return linkedHashMap;
    }
}
