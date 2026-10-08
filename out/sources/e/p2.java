package e;

import android.content.Context;
import android.media.MediaCodec;
import android.util.Pair;
import android.util.Size;
import d.UseCaseCameraConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p071kotlin.Metadata;
import v.SurfaceConfig;
import v.j3;
import v.l3;
import v.n3;
import v.w3;
import v.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u007fB©\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0003¢\u0006\u0004\b)\u0010*J\u001d\u0010.\u001a\u00020(2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u00020(2\f\u00100\u001a\b\u0012\u0004\u0012\u00020,0+H\u0003¢\u0006\u0004\b1\u0010/J\u000f\u00102\u001a\u00020(H\u0003¢\u0006\u0004\b2\u0010*J\u0017\u00105\u001a\u00020(2\u0006\u00104\u001a\u000203H\u0003¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020(2\u0006\u00104\u001a\u000203H\u0003¢\u0006\u0004\b7\u00106J\u0015\u00108\u001a\b\u0012\u0004\u0012\u00020,0+H\u0003¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020:2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0003¢\u0006\u0004\b;\u0010<J\u001d\u0010=\u001a\u00020:2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0003¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u00020:*\b\u0012\u0004\u0012\u00020,0>H\u0002¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020:2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0003¢\u0006\u0004\bA\u0010<J\u001d\u0010B\u001a\u00020:2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0003¢\u0006\u0004\bB\u0010<J\u000f\u0010C\u001a\u00020(H\u0003¢\u0006\u0004\bC\u0010*J\u000f\u0010D\u001a\u00020(H\u0003¢\u0006\u0004\bD\u0010*J\u0019\u0010E\u001a\u00020:*\b\u0012\u0004\u0012\u00020,0>H\u0002¢\u0006\u0004\bE\u0010@J\u000f\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bG\u0010HJ\u001d\u0010L\u001a\u00020F2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0IH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020J0I*\b\u0012\u0004\u0012\u00020,0>H\u0002¢\u0006\u0004\bN\u0010OJ!\u0010R\u001a\u0010\u0012\f\u0012\n Q*\u0004\u0018\u00010P0P0I*\u00020,H\u0002¢\u0006\u0004\bR\u0010SJ\u0019\u0010T\u001a\u00020:*\b\u0012\u0004\u0012\u00020,0>H\u0002¢\u0006\u0004\bT\u0010@J\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0I*\b\u0012\u0004\u0012\u00020,0>H\u0002¢\u0006\u0004\bV\u0010OJ\u000f\u0010W\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020(H\u0002¢\u0006\u0004\bY\u0010*J\u0017\u0010[\u001a\u00020(2\u0006\u0010Z\u001a\u00020:H\u0000¢\u0006\u0004\b[\u0010\\J\u0011\u0010^\u001a\u0004\u0018\u00010]H\u0000¢\u0006\u0004\b^\u0010_J\u001b\u0010a\u001a\u00020(2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020,0I¢\u0006\u0004\ba\u0010bJ\u001b\u0010c\u001a\u00020(2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020,0I¢\u0006\u0004\bc\u0010bJ\u0015\u0010e\u001a\u00020(2\u0006\u0010d\u001a\u00020,¢\u0006\u0004\be\u0010fJ\u0015\u0010g\u001a\u00020(2\u0006\u0010d\u001a\u00020,¢\u0006\u0004\bg\u0010fJ\u0015\u0010h\u001a\u00020(2\u0006\u0010d\u001a\u00020,¢\u0006\u0004\bh\u0010fJ\u0015\u0010i\u001a\u00020(2\u0006\u0010d\u001a\u00020,¢\u0006\u0004\bi\u0010fJ\u0015\u0010k\u001a\u00020(2\u0006\u0010j\u001a\u00020:¢\u0006\u0004\bk\u0010\\J\u0017\u0010m\u001a\u0004\u0018\u00010(2\u0006\u0010l\u001a\u00020:¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020(H\u0086@¢\u0006\u0004\bo\u0010pJ\u000f\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ)\u0010y\u001a\u0002032\u0006\u0010u\u001a\u00020t2\u0006\u0010w\u001a\u00020v2\b\b\u0002\u0010x\u001a\u00020:H\u0001¢\u0006\u0004\by\u0010zJ\u0017\u0010}\u001a\u00020(2\u0006\u0010|\u001a\u00020{H\u0000¢\u0006\u0004\b}\u0010~R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\be\u0010\u0089\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010\u008a\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bC\u0010\u008b\u0001R\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\ba\u0010\u008c\u0001R\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010\u008c\u0001R\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bo\u0010\u008c\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010\u008d\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bW\u0010\u0090\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\by\u0010\u0091\u0001R\u0016\u0010\u0093\u0001\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bg\u0010\u0092\u0001R8\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0094\u00012\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00018@@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001d\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020,0\u009d\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bc\u0010\u0089\u0001R\u001d\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00020,0\u009d\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bN\u0010\u0089\u0001R\u0019\u0010¢\u0001\u001a\u00020:8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010£\u0001\u001a\u00020:8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bG\u0010¡\u0001R\u001a\u0010¥\u0001\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bR\u0010¤\u0001R\u0017\u0010j\u001a\u00020:8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b^\u0010¡\u0001R\u001d\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020,0\u009d\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bL\u0010\u0089\u0001R\u0017\u0010©\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b8\u0010¨\u0001R\u0018\u0010¬\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010«\u0001R\u0017\u0010¯\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010®\u0001R#\u0010²\u0001\u001a\u000f\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020{0°\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bE\u0010±\u0001R\u001b\u0010µ\u0001\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b=\u0010´\u0001R\u001e\u0010¹\u0001\u001a\n\u0012\u0005\u0012\u00030·\u00010¶\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bT\u0010¸\u0001R%\u0010º\u0001\u001a\u0011\u0012\f\u0012\n Q*\u0004\u0018\u00010\r0\r0\u009d\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010\u0089\u0001R\u0017\u0010½\u0001\u001a\u0005\u0018\u00010»\u00018F¢\u0006\b\u001a\u0006\b \u0001\u0010¼\u0001¨\u0006¾\u0001"}, d2 = {"Le/p2;", "", "Lh/z;", "cameraPipe", "Lp/a;", "cameraCoordinator", "Ld/v$a;", "builder", "LPRN/x0;", "zslControl", "Le/i1;", "lowLightBoostControl", "Ljava/util/Set;", "Le/z1;", "controls", "Lg/a;", "camera2CameraControl", "LPRN/o;", "cameraStateAdapter", "Lnq/a;", "Lv/n0;", "cameraInternal", "Le/u2;", "useCaseThreads", "Lv/m0;", "cameraInfoInternal", "Lv/w1;", "encoderProfilesProvider", "Le/b0;", "cameraProperties", "Lo/e0;", "cameraXConfig", "Le/x;", "cameraGraphConfigProvider", "Landroid/content/Context;", "context", "Le/z0;", "displayInfoManager", "<init>", "(Lh/z;Lp/a;Ld/v$a;LPRN/x0;Le/i1;Ljava/util/Set;Lg/a;LPRN/o;Lnq/a;Lnq/a;Lnq/a;Lv/w1;Le/b0;Lo/e0;Le/x;Landroid/content/Context;Le/z0;)V", "Loq/i0;", "F", "()V", "", "Lo/j2;", "runningUseCases", "T", "(Ljava/util/Set;)V", "newUseCases", "E", "l", "Ld/z;", "useCaseCameraConfig", "R", "(Ld/z;)V", "j", "y", "()Ljava/util/Set;", "", "g", "(Ljava/util/Set;)Z", "C", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Ljava/util/Collection;)Z", "O", "Q", "h", "G", "B", "", "u", "()I", "", "Lv/g;", "attachedSurfaceInfoList", "x", "(Ljava/util/List;)I", "s", "(Ljava/util/Collection;)Ljava/util/List;", "Lv/x3$b;", "kotlin.jvm.PlatformType", "v", "(Lo/j2;)Ljava/util/List;", ip.a.f96138c, "Lv/q3;", "A", "n", "()Lv/q3;", "U", "createImmediately", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Z)V", "Lh/s$b;", "w", "()Lh/s$b;", "useCases", "i", "(Ljava/util/List;)V", "r", "useCase", "f", "(Lo/j2;)V", "p", ip.a.f96137b, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "isPrimary", "M", "enabled", "K", "(Z)Loq/i0;", "k", "(Ltq/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "LPRN/r0;", "sessionConfigAdapter", "LPRN/d0;", "graphStateToCameraStateAdapter", "isExtensions", "o", "(LPRN/r0;LPRN/d0;Z)Ld/z;", "Lh/s;", "cameraGraph", "I", "(Lh/s;)V", "a", "Lh/z;", "b", "Lp/a;", "c", "Ld/v$a;", "d", "LPRN/x0;", "e", "Le/i1;", "Ljava/util/Set;", "Lg/a;", "LPRN/o;", "Lnq/a;", "Lv/w1;", "m", "Le/b0;", "Lo/e0;", "Le/x;", "Ljava/lang/Object;", "lock", "Lv/l3;", "value", "q", "Lv/l3;", "z", "()Lv/l3;", "N", "(Lv/l3;)V", "sessionProcessor", "", "attachedUseCases", "activeUseCases", "t", "Z", "activeResumeEnabled", "shouldCreateCameraGraphImmediately", "Ld/z;", "deferredUseCaseCameraConfig", "pendingUseCasesToNotifyCameraControlReady", "Le/l1;", "Le/l1;", "meteringRepeating", "LPRN/v0;", "LPRN/v0;", "supportedSurfaceCombination", "Lf/d;", "Lf/d;", "dynamicRangeResolver", "Lkotlin/Function1;", "Ler/l;", "defaultCameraGraphFactory", "Ld/v;", "Ld/v;", "_activeComponent", "", "Lju/d2;", "Ljava/util/List;", "closingCameraJobs", "allControls", "Le/y1;", "()Le/y1;", "camera", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final f.d dynamicRangeResolver;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private volatile d.v _activeComponent;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Set<z1> allControls;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.z cameraPipe;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p.a cameraCoordinator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d.v.a builder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PRN.x0 zslControl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i1 lowLightBoostControl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<z1> controls;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g.a camera2CameraControl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final PRN.o cameraStateAdapter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final nq.a<v.n0> cameraInternal;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final nq.a<u2> useCaseThreads;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final nq.a<v.m0> cameraInfoInternal;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final v.w1 encoderProfilesProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final b0 cameraProperties;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final o.e0 cameraXConfig;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final x cameraGraphConfigProvider;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private l3 sessionProcessor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean activeResumeEnabled;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private UseCaseCameraConfig deferredUseCaseCameraConfig;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final l1 meteringRepeating;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final PRN.v0 supportedSurfaceCombination;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Set<o.j2> attachedUseCases = new LinkedHashSet();

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Set<o.j2> activeUseCases = new LinkedHashSet();

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCameraGraphImmediately = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean isPrimary = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Set<o.j2> pendingUseCasesToNotifyCameraControlReady = new LinkedHashSet();

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final er.l<h.s.b, h.s> defaultCameraGraphFactory = new er.l() { // from class: e.o2
        @Override // er.l
        public final Object b(Object obj) {
            return p2.q(this.f46183a, (h.s.b) obj);
        }
    };

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final List<ju.d2> closingCameraJobs = new ArrayList();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Le/p2$a;", "", "", "Lo/j2;", "runningUseCases", "Loq/i0;", "a", "(Ljava/util/Set;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void a(Set<? extends o.j2> runningUseCases);
    }

    public p2(h.z zVar, p.a aVar, d.v.a aVar2, PRN.x0 x0Var, i1 i1Var, Set<z1> set, g.a aVar3, PRN.o oVar, nq.a<v.n0> aVar4, nq.a<u2> aVar5, nq.a<v.m0> aVar6, v.w1 w1Var, b0 b0Var, o.e0 e0Var, x xVar, Context context, z0 z0Var) {
        this.cameraPipe = zVar;
        this.cameraCoordinator = aVar;
        this.builder = aVar2;
        this.zslControl = x0Var;
        this.lowLightBoostControl = i1Var;
        this.controls = set;
        this.camera2CameraControl = aVar3;
        this.cameraStateAdapter = oVar;
        this.cameraInternal = aVar4;
        this.useCaseThreads = aVar5;
        this.cameraInfoInternal = aVar6;
        this.encoderProfilesProvider = w1Var;
        this.cameraProperties = b0Var;
        this.cameraXConfig = e0Var;
        this.cameraGraphConfigProvider = xVar;
        this.meteringRepeating = new l1.a(b0Var, z0Var).b();
        this.supportedSurfaceCombination = new PRN.v0(context, b0Var.getMetadata(), w1Var, r.a.f169767b);
        this.dynamicRangeResolver = new f.d(b0Var.getMetadata());
        Set<z1> setJ1 = pq.v.j1(set);
        setJ1.add(aVar3);
        this.allControls = setJ1;
    }

    private final List<SurfaceConfig> A(Collection<? extends o.j2> collection) {
        ArrayList arrayList = new ArrayList();
        for (o.j2 j2Var : collection) {
            Iterator<T> it = j2Var.z().p().iterator();
            while (it.hasNext()) {
                arrayList.add(this.supportedSurfaceCombination.m0(u(), j2Var.l().r(), ((v.u1) it.next()).h(), j2Var.l().V()));
            }
        }
        return arrayList;
    }

    private final boolean B(Collection<? extends o.j2> collection) {
        if (this.meteringRepeating.h() == null) {
            this.meteringRepeating.q0();
        }
        List<v.g> listS = s(collection);
        if (listS.isEmpty()) {
            return false;
        }
        List<SurfaceConfig> listA = A(collection);
        PRN.v0 v0Var = this.supportedSurfaceCombination;
        PRN.v0.FeatureSettings featureSettings = new PRN.v0.FeatureSettings(u(), x(listS), y.z.b(collection), y.z.e(collection, null, 1, null), D(collection), false, false, false, null, false, 992, null);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listA);
        arrayList.add(n());
        oq.i0 i0Var = oq.i0.f148189a;
        boolean zG = PRN.v0.g(v0Var, featureSettings, arrayList, null, null, null, 28, null);
        c cVar = c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = c.TRUNCATED_TAG;
            Objects.toString(listA);
            Objects.toString(this.meteringRepeating);
        }
        return zG;
    }

    private final boolean C(Set<? extends o.j2> runningUseCases) {
        if (!this.cameraXConfig.r0()) {
            return false;
        }
        Set<? extends o.j2> set = runningUseCases;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (o.j2 j2Var : set) {
                if (!fr.t.c(j2Var, this.meteringRepeating) && !j2Var.z().p().isEmpty()) {
                    Set<o.j2> set2 = this.attachedUseCases;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : set2) {
                        if (!fr.t.c((o.j2) obj, this.meteringRepeating)) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty() && P(arrayList) && B(arrayList)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean D(Collection<? extends o.j2> collection) {
        w3<?> w3VarL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj instanceof o.t0) {
                arrayList.add(obj);
            }
        }
        o.t0 t0Var = (o.t0) pq.v.n0(arrayList);
        return (t0Var == null || (w3VarL = t0Var.l()) == null || w3VarL.r() != 4101) ? false : true;
    }

    private final void E(Set<? extends o.j2> newUseCases) {
        Pair<Integer, Integer> pairF;
        Integer num;
        l();
        List listF1 = pq.v.f1(newUseCases);
        if (listF1.isEmpty()) {
            for (z1 z1Var : this.allControls) {
                z1Var.b(null);
                z1Var.reset();
            }
            return;
        }
        if (!this.shouldCreateCameraGraphImmediately) {
            Iterator<z1> it = this.allControls.iterator();
            while (it.hasNext()) {
                it.next().b(null);
            }
        }
        PRN.d0 d0Var = new PRN.d0(this.cameraStateAdapter);
        l3 l3VarZ = z();
        boolean z15 = false;
        if (l3VarZ != null && (pairF = l3VarZ.f()) != null && (num = (Integer) pairF.first) != null && num.intValue() == 1) {
            z15 = true;
        }
        PRN.r0 r0Var = new PRN.r0(listF1, this.isPrimary);
        if (z15) {
            c cVar = c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = c.TRUNCATED_TAG;
            }
            z().h(this.cameraInfoInternal.get(), null);
        }
        R(o(r0Var, d0Var, z15));
    }

    private final void F() {
        if (this.attachedUseCases.isEmpty()) {
            return;
        }
        Set<o.j2> setY = y();
        if (O(setY)) {
            h();
        } else if (Q(setY)) {
            G();
        } else {
            T(setY);
        }
    }

    private final void G() {
        p(this.meteringRepeating);
        r(pq.v.e(this.meteringRepeating));
        this.meteringRepeating.e0(this.cameraInternal.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.s J(h.s sVar, h.s.b bVar) {
        return sVar;
    }

    private final boolean O(Set<? extends o.j2> runningUseCases) {
        return this.cameraXConfig.r0() && !this.attachedUseCases.contains(this.meteringRepeating) && C(runningUseCases);
    }

    private final boolean P(Collection<? extends o.j2> collection) {
        boolean z15;
        if (collection.isEmpty()) {
            return false;
        }
        j3.h hVar = new j3.h();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            hVar.b(((o.j2) it.next()).z());
        }
        j3 j3VarC = hVar.c();
        List<v.u1> listH = j3VarC.l().h();
        List<v.u1> listP = j3VarC.p();
        if (listP.isEmpty()) {
            return false;
        }
        List<v.u1> list = listP;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z15 = true;
                    break;
                }
                if (!fr.t.c(((v.u1) it4.next()).g(), MediaCodec.class)) {
                    z15 = false;
                    break;
                }
            }
        } else {
            z15 = true;
            break;
        }
        return z15 || listH.isEmpty();
    }

    private final boolean Q(Set<? extends o.j2> runningUseCases) {
        return runningUseCases.contains(this.meteringRepeating) && !C(runningUseCases);
    }

    private final void R(UseCaseCameraConfig useCaseCameraConfig) {
        if (this.shouldCreateCameraGraphImmediately) {
            j(useCaseCameraConfig);
        } else {
            this.deferredUseCaseCameraConfig = useCaseCameraConfig;
            this.cameraCoordinator.e(this.cameraInfoInternal.get());
        }
    }

    private final void T(Set<? extends o.j2> runningUseCases) {
        y1 y1VarT = t();
        if (y1VarT != null) {
            y1VarT.a(this.isPrimary, runningUseCases);
            for (z1 z1Var : this.allControls) {
                if (z1Var instanceof a) {
                    ((a) z1Var).a(runningUseCases);
                }
            }
        }
    }

    private final void U() {
        Set<o.j2> set = this.attachedUseCases;
        boolean z15 = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (((o.j2) it.next()).l().R(false)) {
                    z15 = true;
                    break;
                }
            }
        }
        this.zslControl.f(z15);
    }

    private final boolean g(Set<? extends o.j2> runningUseCases) {
        if (O(runningUseCases)) {
            h();
            return true;
        }
        if (!Q(runningUseCases)) {
            return false;
        }
        G();
        return true;
    }

    private final void h() {
        this.meteringRepeating.d(this.cameraInternal.get(), null, null, null);
        this.meteringRepeating.q0();
        i(pq.v.e(this.meteringRepeating));
        f(this.meteringRepeating);
    }

    private final void j(UseCaseCameraConfig useCaseCameraConfig) {
        this._activeComponent = this.builder.a(useCaseCameraConfig).build();
        y1 y1VarT = t();
        if (y1VarT == null) {
            throw new IllegalStateException("Required value was null.");
        }
        y1VarT.start();
        Iterator<z1> it = this.allControls.iterator();
        while (it.hasNext()) {
            it.next().b(y1VarT.c());
        }
        y1VarT.d(this.activeResumeEnabled);
        T(y());
        c cVar = c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = c.TRUNCATED_TAG;
            Objects.toString(this.pendingUseCasesToNotifyCameraControlReady);
        }
        Iterator<o.j2> it4 = this.pendingUseCasesToNotifyCameraControlReady.iterator();
        while (it4.hasNext()) {
            it4.next().P();
        }
        this.pendingUseCasesToNotifyCameraControlReady.clear();
    }

    private final void l() {
        final ju.d2 d2VarClose;
        y1 y1VarT = t();
        this._activeComponent = null;
        this.cameraCoordinator.c(this.cameraInfoInternal.get());
        if (y1VarT != null && (d2VarClose = y1VarT.close()) != null) {
            this.closingCameraJobs.add(d2VarClose);
            d2VarClose.C0(new er.l() { // from class: e.m2
                @Override // er.l
                public final Object b(Object obj) {
                    return p2.m(this.f46166a, d2VarClose, (Throwable) obj);
                }
            });
        }
        l3 l3VarZ = z();
        if (l3VarZ != null) {
            l3VarZ.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(p2 p2Var, ju.d2 d2Var, Throwable th4) {
        synchronized (p2Var.lock) {
            p2Var.closingCameraJobs.remove(d2Var);
        }
        return oq.i0.f148189a;
    }

    private final SurfaceConfig n() {
        return this.supportedSurfaceCombination.m0(u(), this.meteringRepeating.p(), this.meteringRepeating.h(), this.meteringRepeating.l().V());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.s q(p2 p2Var, h.s.b bVar) {
        return p2Var.cameraPipe.d(bVar);
    }

    private final List<v.g> s(Collection<? extends o.j2> collection) {
        ArrayList arrayList = new ArrayList();
        for (o.j2 j2Var : collection) {
            Size sizeH = j2Var.h();
            n3 n3VarG = j2Var.g();
            if (sizeH == null || n3VarG == null) {
                c cVar = c.f45719a;
                if (o.e1.k("CXCP")) {
                    io.sentry.android.core.c2.g(c.TRUNCATED_TAG, "Invalid surface resolution or stream spec is found.");
                }
                arrayList.clear();
                break;
            }
            SurfaceConfig surfaceConfigM0 = this.supportedSurfaceCombination.m0(u(), j2Var.l().r(), sizeH, j2Var.l().V());
            int iR = j2Var.l().r();
            o.i0 i0VarB = n3VarG.b();
            List<x3.b> listV = v(j2Var);
            v.p1 p1VarD = n3VarG.d();
            if (p1VarD == null) {
                p1VarD = v.u2.l0();
            }
            arrayList.add(v.g.a(surfaceConfigM0, iR, sizeH, i0VarB, listV, p1VarD, n3VarG.g(), n3VarG.c(), j2Var.l().E(), j2Var.l().X(sizeH)));
        }
        return arrayList;
    }

    private final int u() {
        synchronized (this.lock) {
            if (this.cameraCoordinator.f() == 2) {
                return 1;
            }
            oq.i0 i0Var = oq.i0.f148189a;
            return 0;
        }
    }

    private final List<x3.b> v(o.j2 j2Var) {
        return j2Var instanceof k0.g ? ((k0.i) ((k0.g) j2Var).l()).i0() : pq.v.e(j2Var.l().W());
    }

    private final int x(List<? extends v.g> attachedSurfaceInfoList) {
        Iterator<Map.Entry<w3<?>, o.i0>> it = this.dynamicRangeResolver.g(attachedSurfaceInfoList, pq.v.e(this.meteringRepeating.l()), pq.v.e(0)).entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    private final Set<o.j2> y() {
        return pq.v.r0(this.attachedUseCases, this.activeUseCases);
    }

    public final void H(o.j2 useCase) {
        synchronized (this.lock) {
            try {
                if (this.attachedUseCases.contains(useCase)) {
                    E(this.attachedUseCases);
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void I(final h.s cameraGraph) {
        synchronized (this.lock) {
            UseCaseCameraConfig useCaseCameraConfig = this.deferredUseCaseCameraConfig;
            if (useCaseCameraConfig == null) {
                throw new IllegalStateException("Required value was null.");
            }
            j(UseCaseCameraConfig.d(useCaseCameraConfig, new er.l() { // from class: e.n2
                @Override // er.l
                public final Object b(Object obj) {
                    return p2.J(cameraGraph, (h.s.b) obj);
                }
            }, null, null, null, null, 30, null));
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    public final oq.i0 K(boolean enabled) {
        oq.i0 i0Var;
        synchronized (this.lock) {
            this.activeResumeEnabled = enabled;
            y1 y1VarT = t();
            if (y1VarT != null) {
                y1VarT.d(enabled);
                i0Var = oq.i0.f148189a;
            } else {
                i0Var = null;
            }
        }
        return i0Var;
    }

    public final void L(boolean createImmediately) {
        synchronized (this.lock) {
            try {
                this.shouldCreateCameraGraphImmediately = createImmediately;
                if (createImmediately) {
                    this.deferredUseCaseCameraConfig = null;
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void M(boolean isPrimary) {
        synchronized (this.lock) {
            this.isPrimary = isPrimary;
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    public final void N(l3 l3Var) {
        synchronized (this.lock) {
            this.sessionProcessor = l3Var;
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    public final void S(o.j2 useCase) {
        synchronized (this.lock) {
            try {
                if (this.attachedUseCases.contains(useCase)) {
                    F();
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void f(o.j2 useCase) {
        synchronized (this.lock) {
            try {
                if (this.activeUseCases.add(useCase)) {
                    F();
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void i(List<? extends o.j2> useCases) {
        synchronized (this.lock) {
            if (useCases.isEmpty()) {
                c cVar = c.f45719a;
                if (o.e1.k("CXCP")) {
                    io.sentry.android.core.c2.g(c.TRUNCATED_TAG, "Attach [] from " + this + " (Ignored)");
                }
                return;
            }
            c cVar2 = c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = c.TRUNCATED_TAG;
                useCases.toString();
                toString();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : useCases) {
                if (!this.attachedUseCases.contains((o.j2) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((o.j2) it.next()).S();
            }
            if (this.attachedUseCases.addAll(useCases) && !g(y())) {
                U();
                this.lowLightBoostControl.q(pq.v.f1(this.attachedUseCases));
                E(this.attachedUseCases);
            }
            if (this.shouldCreateCameraGraphImmediately) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((o.j2) it4.next()).P();
                }
            } else {
                this.pendingUseCasesToNotifyCameraControlReady.addAll(arrayList);
            }
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    public final Object k(tq.e<? super oq.i0> eVar) {
        List listF1;
        synchronized (this.lock) {
            l();
            this.meteringRepeating.W();
            listF1 = pq.v.f1(this.closingCameraJobs);
        }
        Object objC = ju.f.c(listF1, eVar);
        return objC == uq.b.e() ? objC : oq.i0.f148189a;
    }

    public final UseCaseCameraConfig o(PRN.r0 sessionConfigAdapter, PRN.d0 graphStateToCameraStateAdapter, boolean isExtensions) {
        return UseCaseCameraConfig.INSTANCE.b(sessionConfigAdapter, this.cameraGraphConfigProvider, this.defaultCameraGraphFactory, graphStateToCameraStateAdapter, z(), isExtensions);
    }

    public final void p(o.j2 useCase) {
        synchronized (this.lock) {
            try {
                if (this.activeUseCases.remove(useCase)) {
                    F();
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void r(List<? extends o.j2> useCases) {
        synchronized (this.lock) {
            if (useCases.isEmpty()) {
                c cVar = c.f45719a;
                if (o.e1.k("CXCP")) {
                    io.sentry.android.core.c2.g(c.TRUNCATED_TAG, "Detaching [] from " + this + " (Ignored)");
                }
                return;
            }
            c cVar2 = c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = c.TRUNCATED_TAG;
                useCases.toString();
                toString();
            }
            this.activeUseCases.removeAll(useCases);
            for (o.j2 j2Var : useCases) {
                if (this.attachedUseCases.contains(j2Var)) {
                    j2Var.T();
                }
            }
            if (this.attachedUseCases.removeAll(useCases)) {
                if (g(y())) {
                    return;
                }
                if (this.attachedUseCases.isEmpty()) {
                    this.zslControl.f(false);
                    this.lowLightBoostControl.q(pq.v.n());
                } else {
                    U();
                    this.lowLightBoostControl.q(pq.v.f1(this.attachedUseCases));
                }
                E(this.attachedUseCases);
            }
            this.pendingUseCasesToNotifyCameraControlReady.removeAll(useCases);
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    public final y1 t() {
        d.v vVar = this._activeComponent;
        if (vVar != null) {
            return vVar.a();
        }
        return null;
    }

    public String toString() {
        return "UseCaseManager<" + this.cameraGraphConfigProvider + '>';
    }

    public final h.s.b w() {
        h.s.b bVarE;
        synchronized (this.lock) {
            UseCaseCameraConfig useCaseCameraConfig = this.deferredUseCaseCameraConfig;
            bVarE = useCaseCameraConfig != null ? useCaseCameraConfig.e() : null;
        }
        return bVarE;
    }

    public final l3 z() {
        l3 l3Var;
        synchronized (this.lock) {
            l3Var = this.sessionProcessor;
        }
        return l3Var;
    }
}
