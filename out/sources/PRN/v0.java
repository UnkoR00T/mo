package PRN;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p071kotlin.Metadata;
import s.FpsRangeFeature;
import v.SurfaceConfig;
import v.SurfaceStreamSpecQueryResult;
import v.j3;
import v.n3;
import v.o3;
import v.p3;
import v.r3;
import v.u1;
import v.w1;
import v.w3;
import v.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010!\n\u0002\b&\n\u0002\u0010\u0011\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u0093\u00012\u00020\u0001:\u00072Ó\u0001Õ\u0001×\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ]\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u00112\u0012\b\u0002\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000e2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010!\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"Je\u0010,\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u00162\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u001c\u0010%\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\u00112\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018¢\u0006\u0004\b,\u0010-JU\u0010/\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\u00112\u001c\u0010%\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\u00112\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010.\u001a\u00020\u0018H\u0001¢\u0006\u0004\b/\u00100J+\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u001c\u001a\u00020\u0016H\u0007¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\u0016H\u0007¢\u0006\u0004\b6\u00107J7\u0010=\u001a\u0004\u0018\u00010\u001d2\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00182\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0004\b=\u0010>JY\u0010A\u001a\u00020@2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u00112\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eH\u0002¢\u0006\u0004\bA\u0010BJ]\u0010F\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020#0C2\u0016\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140CH\u0002¢\u0006\u0004\bF\u0010GJ\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bI\u0010JJ\u008b\u0001\u0010O\u001a\u00020+2\u0006\u0010L\u001a\u00020K2\u0006\u0010\r\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u001c\u0010M\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\u00112\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0016\u0010N\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\bO\u0010PJ\u0083\u0001\u0010Q\u001a\u00020+2\u0006\u0010\r\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u001c\u0010M\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\u00112\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0016\u0010N\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\bQ\u0010RJE\u0010X\u001a\u00020K2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00120S2\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010U2\u0006\u0010'\u001a\u00020&2\u0006\u0010W\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0018H\u0002¢\u0006\u0004\bX\u0010YJu\u0010^\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00182\u0016\u0010N\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010'\u001a\u00020&2\u0006\u0010W\u001a\u00020\u00182\u0006\u0010Z\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00182\u0006\u0010[\u001a\u00020\u00182\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00160U2\u0006\u0010]\u001a\u00020\u0018H\u0002¢\u0006\u0004\b^\u0010_J\u0013\u0010`\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b`\u0010aJC\u0010b\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u001c\u0010%\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\u0011H\u0002¢\u0006\u0004\bb\u0010cJ\u008d\u0001\u0010e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0012\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020#0C2\u0016\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140CH\u0002¢\u0006\u0004\be\u0010fJ\u008d\u0001\u0010n\u001a\u00020m2\u0006\u0010h\u001a\u00020g2\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020j0C2\u0016\u0010l\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020j0C2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020#0C2\u0016\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140CH\u0002¢\u0006\u0004\bn\u0010oJY\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\u000e2\u001c\u0010%\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\u00112\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eH\u0002¢\u0006\u0004\bp\u0010qJK\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00160U2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010]\u001a\u00020\u0018H\u0002¢\u0006\u0004\br\u0010sJ/\u0010t\u001a\u00020\u00182\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000eH\u0002¢\u0006\u0004\bt\u0010uJ%\u0010v\u001a\u00020\u00162\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0006\u0010Z\u001a\u00020\u0018H\u0002¢\u0006\u0004\bv\u0010wJg\u0010~\u001a\u00020m2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010x\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u00182\u0018\u0010{\u001a\u0014\u0012\u0004\u0012\u00020y\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160z0C2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001d0|H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0098\u0001\u0010\u0082\u0001\u001a\u0004\u0018\u00010g2\u0012\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000e2\u0007\u0010\u0080\u0001\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0016\u0010N\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020\u00120\u00112\u0007\u0010\u0081\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J2\u0010\u0085\u0001\u001a\u00020\u00182\u0007\u0010\u0080\u0001\u001a\u00020\u00162\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00160U2\u0007\u0010\u0084\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001Jj\u0010\u0087\u0001\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020j0C2\u0006\u0010h\u001a\u00020g2\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0016\u0010N\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J*\u0010\u0089\u0001\u001a\u00020\u00162\u0016\u0010N\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0096\u0001\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001b\u001a\u00020\u00162\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\r\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0014\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020#\u0018\u00010C2\u0018\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0018\u00010C2\u0007\u0010\u008c\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001JR\u0010\u008f\u0001\u001a\u00020\u00162\r\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0007\u0010\u0084\u0001\u001a\u00020\u00162\u0006\u0010Z\u001a\u00020\u0018H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J2\u0010\u0091\u0001\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010Z\u001a\u00020\u00182\u0006\u0010x\u001a\u00020\u0016H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\"\u0010\u0093\u0001\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J!\u0010\u0096\u0001\u001a\u00020\u00162\r\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160UH\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J0\u0010\u009a\u0001\u001a\u00020\u00162\r\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160U2\r\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160UH\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001JE\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160U2\r\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160U2\r\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160U2\r\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160UH\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001JJ\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160U2\r\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160U2\u0007\u0010¢\u0001\u001a\u00020\u00162\u0018\u0010¤\u0001\u001a\u0013\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00160U\u0018\u00010£\u0001H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J>\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160U2\r\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160U2\r\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160U2\u0006\u0010]\u001a\u00020\u0018H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J&\u0010\u00ad\u0001\u001a\u00020\u00182\u0007\u0010«\u0001\u001a\u00020\u00182\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J;\u0010°\u0001\u001a\u00020\u00162\u0007\u0010¯\u0001\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010Z\u001a\u00020\u00182\u0006\u0010x\u001a\u00020\u0016H\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0012\u0010²\u0001\u001a\u00020mH\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0012\u0010´\u0001\u001a\u00020mH\u0002¢\u0006\u0006\b´\u0001\u0010³\u0001J\u0012\u0010µ\u0001\u001a\u00020mH\u0002¢\u0006\u0006\bµ\u0001\u0010³\u0001J\u0012\u0010¶\u0001\u001a\u00020mH\u0002¢\u0006\u0006\b¶\u0001\u0010³\u0001J\u0012\u0010·\u0001\u001a\u00020mH\u0002¢\u0006\u0006\b·\u0001\u0010³\u0001J\u0012\u0010¸\u0001\u001a\u00020mH\u0002¢\u0006\u0006\b¸\u0001\u0010³\u0001J\u0012\u0010¹\u0001\u001a\u00020mH\u0002¢\u0006\u0006\b¹\u0001\u0010³\u0001J\u0012\u0010º\u0001\u001a\u00020mH\u0002¢\u0006\u0006\bº\u0001\u0010³\u0001J\u0012\u0010»\u0001\u001a\u00020mH\u0002¢\u0006\u0006\b»\u0001\u0010³\u0001J\u0012\u0010¼\u0001\u001a\u00020mH\u0002¢\u0006\u0006\b¼\u0001\u0010³\u0001J\u0012\u0010½\u0001\u001a\u00020mH\u0002¢\u0006\u0006\b½\u0001\u0010³\u0001J8\u0010À\u0001\u001a\u00020m2\u0013\u0010¾\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0C2\u0007\u0010¿\u0001\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u0016H\u0002¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J;\u0010Â\u0001\u001a\u00020m2\u0013\u0010¾\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0C2\u0006\u00104\u001a\u00020\u00162\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J/\u0010Ä\u0001\u001a\u00020m2\u0013\u0010¾\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0C2\u0006\u00104\u001a\u00020\u0016H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u0012\u0010Æ\u0001\u001a\u00020\u001dH\u0002¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u0013\u0010É\u0001\u001a\u00030È\u0001H\u0002¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u0014\u0010Ë\u0001\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0006\bË\u0001\u0010Ç\u0001J\u0014\u0010Ì\u0001\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0006\bÌ\u0001\u0010Ç\u0001J*\u0010Í\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000eH\u0002¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J9\u0010Ï\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u001d\u0018\u00010£\u00012\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010\u001c\u001a\u00020\u00162\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J3\u0010Ò\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0|0\u000e2\u0013\u0010Ñ\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\u000eH\u0002¢\u0006\u0006\bÒ\u0001\u0010Î\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R\u0017\u0010Û\u0001\u001a\u00030Ù\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010Ú\u0001R\u0016\u0010Ü\u0001\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b´\u0001\u0010vR\u001c\u0010Þ\u0001\u001a\b\u0012\u0004\u0012\u00020H0|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010Ý\u0001R\u001d\u0010à\u0001\u001a\b\u0012\u0004\u0012\u00020H0|8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010Ý\u0001R\u001d\u0010á\u0001\u001a\b\u0012\u0004\u0012\u00020H0|8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010Ý\u0001R\u001c\u0010â\u0001\u001a\b\u0012\u0004\u0012\u00020H0|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010Ý\u0001R\u001c\u0010ã\u0001\u001a\b\u0012\u0004\u0012\u00020H0|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b^\u0010Ý\u0001R\u001c\u0010ä\u0001\u001a\b\u0012\u0004\u0012\u00020H0|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010Ý\u0001R)\u0010æ\u0001\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u000e0C8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010å\u0001R\u001d\u0010è\u0001\u001a\b\u0012\u0004\u0012\u00020H0|8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0001\u0010Ý\u0001R\u001d\u0010ê\u0001\u001a\b\u0012\u0004\u0012\u00020H0|8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010Ý\u0001R\u0018\u0010ë\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010rR\u0018\u0010ì\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b·\u0001\u0010rR\u0016\u0010í\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¹\u0001\u0010rR\u0016\u0010î\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¸\u0001\u0010rR\u0018\u0010ï\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u0010rR\u0018\u0010ð\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010rR\u0018\u0010ñ\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bµ\u0001\u0010rR)\u0010÷\u0001\u001a\u0002058\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b½\u0001\u0010ò\u0001\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R\u001d\u0010ø\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160|8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010Ý\u0001R\u0018\u0010ú\u0001\u001a\u00030È\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010ù\u0001R\u0018\u0010ý\u0001\u001a\u00030û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010ü\u0001R\u0018\u0010\u0080\u0002\u001a\u00030þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010ÿ\u0001R\u0017\u0010\u0083\u0002\u001a\u00030\u0081\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bX\u0010\u0082\u0002R\u0018\u0010\u0086\u0002\u001a\u00030\u0084\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010\u0085\u0002R\u0018\u0010\u0089\u0002\u001a\u00030\u0087\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010\u0088\u0002R\u0018\u0010\u008c\u0002\u001a\u00030\u008a\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008b\u0002¨\u0006\u008e\u0002²\u0006\r\u0010\u008d\u0002\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"LPRN/v0;", "", "Landroid/content/Context;", "context", "Lh/x;", "cameraMetadata", "Lv/w1;", "encoderProfilesProvider", "Lr/a;", "featureCombinationQuery", "<init>", "(Landroid/content/Context;Lh/x;Lv/w1;Lr/a;)V", "LPRN/v0$d;", "featureSettings", "", "Lv/q3;", "surfaceConfigList", "", "Lo/i0;", "dynamicRangesBySurfaceConfig", "Lv/w3;", "newUseCaseConfigs", "", "useCasesPriorityOrder", "", "f", "(LPRN/v0$d;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Z", "cameraMode", "imageFormat", "Landroid/util/Size;", "size", "Lv/o3;", "streamUseCase", "m0", "(IILandroid/util/Size;Lv/o3;)Lv/q3;", "Lv/g;", "attachedSurfaces", "newUseCaseConfigsSupportedSizeMap", "Lx/a;", "videoStabilization", "hasVideoCapture", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "Lv/s3;", "U", "(ILjava/util/List;Ljava/util/Map;Lx/a;ZZZ)Lv/s3;", "forceUniqueMaxFpsFiltering", "k", "(Ljava/util/Map;LPRN/v0$d;Z)Ljava/util/Map;", "sizeList", "d", "(Ljava/util/List;I)Ljava/util/List;", "format", "Lv/r3;", "a0", "(I)Lv/r3;", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "map", "highResolutionIncluded", "Landroid/util/Rational;", "aspectRatio", "G", "(Landroid/hardware/camera2/params/StreamConfigurationMap;IZLandroid/util/Rational;)Landroid/util/Size;", "useCasePriorityOrder", "Lv/j3;", "i", "(LPRN/v0$d;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Lv/j3;", "", "surfaceConfigIndexAttachedSurfaceInfoMap", "surfaceConfigIndexUseCaseConfigMap", "J", "(LPRN/v0$d;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;", "Lv/p3;", "W", "(LPRN/v0$d;)Ljava/util/List;", "LPRN/v0$b;", "checkingMethod", "filteredNewUseCaseConfigsSupportedSizeMap", "resolvedDynamicRanges", "j0", "(LPRN/v0$b;LPRN/v0$d;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Z)Lv/s3;", "k0", "(LPRN/v0$d;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Z)Lv/s3;", "", "dynamicRanges", "Landroid/util/Range;", "fps", "isUltraHdrOn", "A", "(Ljava/util/Collection;Landroid/util/Range;Lx/a;ZZ)LPRN/v0$b;", "isHighSpeedOn", "requiresFeatureComboQuery", "targetFpsRange", "isStrictFpsRequired", "j", "(IZLjava/util/Map;Lx/a;ZZZZLandroid/util/Range;Z)LPRN/v0$d;", "r0", "(LPRN/v0$d;)LPRN/v0$d;", "f0", "(LPRN/v0$d;Ljava/util/List;Ljava/util/Map;)Z", "allPossibleSizeArrangements", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LPRN/v0$d;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;", "LPRN/v0$a;", "bestSizesAndMaxFps", "orderedSurfaceConfigListForStreamUseCase", "Lv/n3;", "attachedSurfaceStreamSpecMap", "suggestedStreamSpecMap", "Loq/i0;", "h0", "(LPRN/v0$a;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "V", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Z", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)Landroid/util/Range;", "e0", "(Ljava/util/List;Ljava/util/List;)Z", "I", "(Ljava/util/List;Z)I", "customMaxFps", "Lv/q3$b;", "", "configSizeUniqueMaxFpsMap", "", "reducedSizeList", "g0", "(LPRN/v0$d;Landroid/util/Size;IILv/o3;ZLjava/util/Map;Ljava/util/List;)V", "existingSurfaceFrameRateCeiling", "findMaxFpsForAllSizes", "l", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;LPRN/v0$d;Ljava/util/List;Ljava/util/Map;Z)LPRN/v0$a;", "currentConfigFrameRateCeiling", "d0", "(ILandroid/util/Range;I)Z", "t", "(LPRN/v0$a;Ljava/util/List;Ljava/util/List;Ljava/util/Map;LPRN/v0$d;)Ljava/util/Map;", ip.a.f96137b, "(Ljava/util/Map;)I", "possibleSizeList", "checkViaFeatureComboQuery", "X", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Z)Ljava/util/List;", ip.a.f96138c, "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IZ)I", "F", "(ILandroid/util/Size;ZI)I", "E", "(ILandroid/util/Size;)I", "range", "O", "(Landroid/util/Range;)I", "firstRange", "secondRange", "N", "(Landroid/util/Range;Landroid/util/Range;)I", "targetFps", "storedRange", "newRange", "h", "(Landroid/util/Range;Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;", "targetFrameRate", "maxFps", "", "availableFpsRanges", "B", "(Landroid/util/Range;I[Landroid/util/Range;)Landroid/util/Range;", "newTargetFrameRate", "storedTargetFrameRate", "b0", "(Landroid/util/Range;Landroid/util/Range;Z)Landroid/util/Range;", "newIsStrictFpsRequired", "storedIsStrictFpsRequired", "z", "(ZLjava/lang/Boolean;)Z", "combinedMaxFps", "C", "(IILandroid/util/Size;ZI)I", "i0", "()V", "e", "u", "x", "p", "r", "q", "o", "w", "s", "v", "sizeMap", "targetSize", "p0", "(Ljava/util/Map;Landroid/util/Size;I)V", "n0", "(Ljava/util/Map;ILandroid/util/Rational;)V", "q0", "(Ljava/util/Map;I)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "()Landroid/util/Size;", "La/u;", "T", "()La/u;", "R", "Q", "c0", "(Ljava/util/List;)Ljava/util/List;", "M", "(Landroid/hardware/camera2/params/StreamConfigurationMap;ILandroid/util/Rational;)[Landroid/util/Size;", "supportedOutputSizesList", "y", "a", "Lh/x;", "b", "Lv/w1;", "c", "Lr/a;", "", "Ljava/lang/String;", "cameraId", "hardwareLevel", "Ljava/util/List;", "concurrentSurfaceCombinations", "g", "surfaceCombinations", "surfaceCombinationsStreamUseCase", "ultraHighSurfaceCombinations", "previewStabilizationSurfaceCombinations", "highSpeedSurfaceCombinations", "Ljava/util/Map;", "featureSettingsToSupportedCombinationsMap", "m", "surfaceCombinations10Bit", "n", "surfaceCombinationsUltraHdr", "isRawSupported", "isBurstCaptureSupported", "isConcurrentCameraModeSupported", "isStreamUseCaseSupported", "isUltraHighResolutionSensorSupported", "isPreviewStabilizationSupported", "isManualSensorSupported", "Lv/r3;", "Y", "()Lv/r3;", "l0", "(Lv/r3;)V", "surfaceSizeDefinition", "surfaceSizeDefinitionFormats", "La/u;", "streamConfigurationMapCompat", "Lc/k;", "Lc/k;", "extraSupportedSurfaceCombinationsContainer", "Le/z0;", "Le/z0;", "displayInfoManager", "Lc/c0;", "Lc/c0;", "resolutionCorrector", "Lc/f0;", "Lc/f0;", "targetAspectRatio", "Lf/d;", "Lf/d;", "dynamicRangeResolver", "Lf/i;", "Lf/i;", "highSpeedResolver", "isSupported", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final c.c0 resolutionCorrector;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final c.f0 targetAspectRatio;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final f.d dynamicRangeResolver;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final f.i highSpeedResolver;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.x cameraMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w1 encoderProfilesProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r.a featureCombinationQuery;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String cameraId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int hardwareLevel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<p3> concurrentSurfaceCombinations;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<p3> surfaceCombinations;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<p3> surfaceCombinationsStreamUseCase;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<p3> ultraHighSurfaceCombinations;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<p3> previewStabilizationSurfaceCombinations;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<p3> highSpeedSurfaceCombinations;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Map<FeatureSettings, List<p3>> featureSettingsToSupportedCombinationsMap;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List<p3> surfaceCombinations10Bit;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List<p3> surfaceCombinationsUltraHdr;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isRawSupported;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isBurstCaptureSupported;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean isConcurrentCameraModeSupported;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean isStreamUseCaseSupported;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isUltraHighResolutionSensorSupported;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isPreviewStabilizationSupported;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean isManualSensorSupported;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public r3 surfaceSizeDefinition;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> surfaceSizeDefinitionFormats;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final a.u streamConfigurationMapCompat;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final c.k extraSupportedSurfaceCombinationsContainer;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final e.z0 displayInfoManager;

    /* JADX INFO: renamed from: PRN.v0$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001d"}, d2 = {"LPRN/v0$a;", "", "", "Landroid/util/Size;", "bestSizes", "bestSizesForStreamUseCase", "", "maxFpsForBestSizes", "maxFpsForStreamUseCase", "maxFpsForAllSizes", "<init>", "(Ljava/util/List;Ljava/util/List;III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "I", "d", "e", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BestSizesAndMaxFpsForConfigs {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Size> bestSizes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Size> bestSizesForStreamUseCase;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxFpsForBestSizes;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxFpsForStreamUseCase;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxFpsForAllSizes;

        public BestSizesAndMaxFpsForConfigs(List<Size> list, List<Size> list2, int i15, int i16, int i17) {
            this.bestSizes = list;
            this.bestSizesForStreamUseCase = list2;
            this.maxFpsForBestSizes = i15;
            this.maxFpsForStreamUseCase = i16;
            this.maxFpsForAllSizes = i17;
        }

        public final List<Size> a() {
            return this.bestSizes;
        }

        public final List<Size> b() {
            return this.bestSizesForStreamUseCase;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMaxFpsForAllSizes() {
            return this.maxFpsForAllSizes;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMaxFpsForBestSizes() {
            return this.maxFpsForBestSizes;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getMaxFpsForStreamUseCase() {
            return this.maxFpsForStreamUseCase;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BestSizesAndMaxFpsForConfigs)) {
                return false;
            }
            BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs = (BestSizesAndMaxFpsForConfigs) other;
            return fr.t.c(this.bestSizes, bestSizesAndMaxFpsForConfigs.bestSizes) && fr.t.c(this.bestSizesForStreamUseCase, bestSizesAndMaxFpsForConfigs.bestSizesForStreamUseCase) && this.maxFpsForBestSizes == bestSizesAndMaxFpsForConfigs.maxFpsForBestSizes && this.maxFpsForStreamUseCase == bestSizesAndMaxFpsForConfigs.maxFpsForStreamUseCase && this.maxFpsForAllSizes == bestSizesAndMaxFpsForConfigs.maxFpsForAllSizes;
        }

        public int hashCode() {
            int iHashCode = this.bestSizes.hashCode() * 31;
            List<Size> list = this.bestSizesForStreamUseCase;
            return ((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.maxFpsForBestSizes)) * 31) + Integer.hashCode(this.maxFpsForStreamUseCase)) * 31) + Integer.hashCode(this.maxFpsForAllSizes);
        }

        public String toString() {
            return "BestSizesAndMaxFpsForConfigs(bestSizes=" + this.bestSizes + ", bestSizesForStreamUseCase=" + this.bestSizesForStreamUseCase + ", maxFpsForBestSizes=" + this.maxFpsForBestSizes + ", maxFpsForStreamUseCase=" + this.maxFpsForStreamUseCase + ", maxFpsForAllSizes=" + this.maxFpsForAllSizes + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LPRN/v0$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        WITHOUT_FEATURE_COMBO,
        WITH_FEATURE_COMBO,
        WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f822e = wq.b.a(b());
    }

    /* JADX INFO: renamed from: PRN.v0$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u001c\u0010\n\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0007H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LPRN/v0$c;", "", "<init>", "()V", "", "Lv/g;", "attachedSurfaces", "", "Lv/w3;", "Landroid/util/Size;", "newUseCaseConfigsSupportedSizeMap", "", "b", "(Ljava/util/List;Ljava/util/Map;)Z", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(List<? extends v.g> attachedSurfaces, Map<w3<?>, ? extends List<Size>> newUseCaseConfigsSupportedSizeMap) {
            Iterator<? extends v.g> it = attachedSurfaces.iterator();
            while (it.hasNext()) {
                if (it.next().e() == 4101) {
                    return true;
                }
            }
            Iterator<w3<?>> it4 = newUseCaseConfigsSupportedSizeMap.keySet().iterator();
            while (it4.hasNext()) {
                if (it4.next().r() == 4101) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f833a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.WITHOUT_FEATURE_COMBO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.WITH_FEATURE_COMBO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f833a = iArr;
        }
    }

    public v0(Context context, h.x xVar, w1 w1Var, r.a aVar) {
        this.cameraMetadata = xVar;
        this.encoderProfilesProvider = w1Var;
        this.featureCombinationQuery = aVar;
        this.cameraId = xVar.getCamera();
        Integer num = (Integer) xVar.J(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.hardwareLevel = num != null ? num.intValue() : 2;
        this.concurrentSurfaceCombinations = new ArrayList();
        this.surfaceCombinations = new ArrayList();
        this.surfaceCombinationsStreamUseCase = new ArrayList();
        this.ultraHighSurfaceCombinations = new ArrayList();
        this.previewStabilizationSurfaceCombinations = new ArrayList();
        this.highSpeedSurfaceCombinations = new ArrayList();
        this.featureSettingsToSupportedCombinationsMap = new LinkedHashMap();
        this.surfaceCombinations10Bit = new ArrayList();
        this.surfaceCombinationsUltraHdr = new ArrayList();
        this.isPreviewStabilizationSupported = h.x.INSTANCE.g(xVar);
        this.surfaceSizeDefinitionFormats = new ArrayList();
        this.streamConfigurationMapCompat = T();
        this.extraSupportedSurfaceCombinationsContainer = new c.k();
        this.displayInfoManager = e.z0.INSTANCE.a(context);
        this.resolutionCorrector = new c.c0();
        this.targetAspectRatio = new c.f0();
        f.d dVar = new f.d(xVar);
        this.dynamicRangeResolver = dVar;
        this.highSpeedResolver = new f.i(xVar);
        e();
        u();
        if (this.isUltraHighResolutionSensorSupported) {
            x();
        }
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        this.isConcurrentCameraModeSupported = zHasSystemFeature;
        if (zHasSystemFeature) {
            p();
        }
        if (dVar.getIs10BitSupported()) {
            o();
        }
        if (this.isPreviewStabilizationSupported) {
            r();
        }
        boolean zI = f.l.f54477a.i(xVar);
        this.isStreamUseCaseSupported = zI;
        if (zI) {
            s();
        }
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    private final b A(Collection<o.i0> dynamicRanges, Range<Integer> fps, x.a videoStabilization, boolean isUltraHdrOn, boolean isFeatureComboInvocation) {
        int i15;
        int i16;
        Integer num;
        if (!isFeatureComboInvocation) {
            return b.WITHOUT_FEATURE_COMBO;
        }
        ?? Contains = dynamicRanges.contains(o.i0.f140013f);
        if (fps != null && (num = (Integer) fps.getUpper()) != null && num.intValue() == 60) {
            i15 = Contains;
            i15 = Contains;
            i15 = Contains;
            i15 = Contains + 1;
        }
        i15 = Contains;
        i15 = Contains;
        i15 = Contains;
        i15 = Contains;
        i15 = Contains;
        i15 = Contains;
        if (videoStabilization == x.a.ON || videoStabilization == x.a.PREVIEW) {
            i16 = i15;
            i16 = i15 + 1;
        }
        if (isUltraHdrOn) {
            i16++;
        }
        if (i16 > 1) {
            return b.WITH_FEATURE_COMBO;
        }
        return i16 == 1 ? b.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT : b.WITHOUT_FEATURE_COMBO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Range<Integer> B(Range<Integer> targetFrameRate, int maxFps, Range<Integer>[] availableFpsRanges) {
        Range<Integer> rangeH = n3.f202727a;
        if (fr.t.c(targetFrameRate, rangeH) || availableFpsRanges == null) {
            return rangeH;
        }
        Range<T> range = new Range<>(Integer.valueOf(Math.min(((Number) targetFrameRate.getLower()).intValue(), maxFps)), Integer.valueOf(Math.min(((Number) targetFrameRate.getUpper()).intValue(), maxFps)));
        int iO = 0;
        for (Range<Integer> range2 : availableFpsRanges) {
            if (maxFps >= ((Number) range2.getLower()).intValue()) {
                if (fr.t.c(rangeH, n3.f202727a)) {
                    rangeH = range2;
                }
                if (fr.t.c(range2, range)) {
                    return range2;
                }
                try {
                    int iO2 = O(range2.intersect(range));
                    if (iO == 0) {
                        rangeH = range2;
                        iO = iO2;
                    } else if (iO2 >= iO) {
                        rangeH = h(range, rangeH, range2);
                        iO = O(range.intersect(rangeH));
                    }
                } catch (IllegalArgumentException unused) {
                    if (iO == 0 && (N(range2, range) < N(rangeH, range) || (N(range2, range) == N(rangeH, range) && (((Number) range2.getLower()).intValue() > ((Number) rangeH.getUpper()).intValue() || O(range2) < O(rangeH))))) {
                        rangeH = range2;
                    }
                }
            }
        }
        return rangeH;
    }

    private final int C(int combinedMaxFps, int imageFormat, Size size, boolean isHighSpeedOn, int customMaxFps) {
        return Math.min(combinedMaxFps, F(imageFormat, size, isHighSpeedOn, customMaxFps));
    }

    private final int D(List<Size> possibleSizeList, List<? extends w3<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, int currentConfigFrameRateCeiling, boolean isHighSpeedOn) {
        int i15 = 0;
        int iC = currentConfigFrameRateCeiling;
        for (Size size : possibleSizeList) {
            int i16 = i15 + 1;
            w3<?> w3Var = newUseCaseConfigs.get(useCasesPriorityOrder.get(i15).intValue());
            iC = C(iC, w3Var.r(), size, isHighSpeedOn, w3Var.X(size));
            i15 = i16;
        }
        return iC;
    }

    private final int E(int imageFormat, Size size) {
        long jE = T().e(imageFormat, size);
        if (jE > 0) {
            return (int) (1.0E9d / jE);
        }
        if (!this.isManualSensorSupported) {
            return Integer.MAX_VALUE;
        }
        e.c cVar = e.c.f45719a;
        if (!o.e1.k("CXCP")) {
            return 0;
        }
        c2.g(e.c.TRUNCATED_TAG, "minFrameDuration: " + jE + " is invalid for imageFormat = " + imageFormat + ", size = " + size);
        return 0;
    }

    private final int F(int imageFormat, Size size, boolean isHighSpeedOn, int customMaxFps) {
        int iE;
        if (!isHighSpeedOn) {
            iE = E(imageFormat, size);
        } else {
            if (imageFormat != 34) {
                throw new IllegalStateException("Check failed.");
            }
            iE = this.highSpeedResolver.j(size);
        }
        return Math.min(customMaxFps, iE);
    }

    public static /* synthetic */ Size H(v0 v0Var, StreamConfigurationMap streamConfigurationMap, int i15, boolean z15, Rational rational, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            rational = null;
        }
        return v0Var.G(streamConfigurationMap, i15, z15, rational);
    }

    private final int I(List<? extends v.g> attachedSurfaces, boolean isHighSpeedOn) {
        int iC = Integer.MAX_VALUE;
        for (v.g gVar : attachedSurfaces) {
            iC = C(iC, gVar.e(), gVar.h(), isHighSpeedOn, gVar.c());
        }
        return iC;
    }

    private final List<SurfaceConfig> J(FeatureSettings featureSettings, List<SurfaceConfig> surfaceConfigList, Map<Integer, v.g> surfaceConfigIndexAttachedSurfaceInfoMap, Map<Integer, w3<?>> surfaceConfigIndexUseCaseConfigMap) {
        if (!f.l.f54477a.o(featureSettings)) {
            return null;
        }
        Iterator<p3> it = this.surfaceCombinationsStreamUseCase.iterator();
        while (it.hasNext()) {
            final List<SurfaceConfig> listD = it.next().d(surfaceConfigList);
            if (listD != null) {
                boolean zA = f.l.f54477a.a(surfaceConfigIndexAttachedSurfaceInfoMap, surfaceConfigIndexUseCaseConfigMap, listD);
                oq.k kVarA = oq.l.a(new er.a() { // from class: PRN.t0
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(v0.K(this.f775a, listD));
                    }
                });
                if (zA && ((Boolean) kVarA.getValue()).booleanValue()) {
                    return listD;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(v0 v0Var, List list) {
        return f.l.f54477a.c(v0Var.cameraMetadata, list);
    }

    private final List<SurfaceConfig> L(List<? extends List<Size>> allPossibleSizeArrangements, List<? extends v.g> attachedSurfaces, List<? extends w3<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, FeatureSettings featureSettings, Map<Integer, v.g> surfaceConfigIndexAttachedSurfaceInfoMap, Map<Integer, w3<?>> surfaceConfigIndexUseCaseConfigMap) {
        Iterator<? extends List<Size>> it = allPossibleSizeArrangements.iterator();
        List<SurfaceConfig> listJ = null;
        while (it.hasNext()) {
            listJ = J(featureSettings, X(featureSettings.getCameraMode(), attachedSurfaces, it.next(), newUseCaseConfigs, useCasesPriorityOrder, surfaceConfigIndexAttachedSurfaceInfoMap, surfaceConfigIndexUseCaseConfigMap, false), surfaceConfigIndexAttachedSurfaceInfoMap, surfaceConfigIndexUseCaseConfigMap);
            if (listJ != null) {
                return listJ;
            }
            surfaceConfigIndexAttachedSurfaceInfoMap.clear();
            surfaceConfigIndexUseCaseConfigMap.clear();
        }
        return listJ;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    private final Size[] M(StreamConfigurationMap map, int imageFormat, Rational aspectRatio) {
        Object objB;
        Size[] outputSizes;
        try {
            oq.t.Companion companion = oq.t.INSTANCE;
            if (imageFormat == 34) {
                if (map != null) {
                    outputSizes = map.getOutputSizes(SurfaceTexture.class);
                } else {
                    outputSizes = null;
                }
            } else if (map != null) {
                outputSizes = map.getOutputSizes(imageFormat);
            } else {
                outputSizes = null;
            }
            objB = oq.t.b(outputSizes);
        } catch (Throwable th4) {
            oq.t.Companion companion2 = oq.t.INSTANCE;
            objB = oq.t.b(oq.u.a(th4));
        }
        if (oq.t.f(objB)) {
            objB = null;
        }
        Size[] sizeArr = (Size[]) objB;
        if (sizeArr == null) {
            return null;
        }
        if (aspectRatio != null) {
            ArrayList arrayList = new ArrayList();
            for (Size size : sizeArr) {
                if (y.a.a(size, aspectRatio)) {
                    arrayList.add(size);
                }
            }
            sizeArr = (Size[]) arrayList.toArray(new Size[0]);
        }
        return sizeArr;
    }

    private final int N(Range<Integer> firstRange, Range<Integer> secondRange) {
        if (firstRange.contains(secondRange.getUpper()) || firstRange.contains(secondRange.getLower())) {
            throw new IllegalArgumentException("Ranges must not intersect");
        }
        return ((Number) firstRange.getLower()).intValue() > ((Number) secondRange.getUpper()).intValue() ? ((Number) firstRange.getLower()).intValue() - ((Number) secondRange.getUpper()).intValue() : ((Number) secondRange.getLower()).intValue() - ((Number) firstRange.getUpper()).intValue();
    }

    private final int O(Range<Integer> range) {
        return (((Number) range.getUpper()).intValue() - ((Number) range.getLower()).intValue()) + 1;
    }

    private final Size P() {
        try {
            Integer.parseInt(this.cameraId);
            Size sizeQ = Q();
            if (sizeQ != null) {
                return sizeQ;
            }
        } catch (NumberFormatException unused) {
        }
        Size sizeR = R();
        return sizeR != null ? sizeR : f0.d.f54495d;
    }

    private final Size Q() {
        x1 x1VarB;
        Iterator it = pq.v.q(1, 13, 10, 8, 12, 6, 5, 4).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (this.encoderProfilesProvider.a(iIntValue) && (x1VarB = this.encoderProfilesProvider.b(iIntValue)) != null && !x1VarB.b().isEmpty()) {
                return x1VarB.b().get(0).k();
            }
        }
        return null;
    }

    private final Size R() {
        Object objB;
        StreamConfigurationMap streamConfigurationMapG = this.streamConfigurationMapCompat.g();
        try {
            oq.t.Companion companion = oq.t.INSTANCE;
            objB = oq.t.b(streamConfigurationMapG != null ? streamConfigurationMapG.getOutputSizes(MediaRecorder.class) : null);
        } catch (Throwable th4) {
            oq.t.Companion companion2 = oq.t.INSTANCE;
            objB = oq.t.b(oq.u.a(th4));
        }
        if (oq.t.f(objB)) {
            objB = null;
        }
        Size[] sizeArr = (Size[]) objB;
        if (sizeArr == null) {
            return null;
        }
        Arrays.sort(sizeArr, new y.d(true));
        for (Size size : sizeArr) {
            int width = size.getWidth();
            Size size2 = f0.d.f54497f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return null;
    }

    private final int S(Map<w3<?>, o.i0> resolvedDynamicRanges) {
        Iterator<o.i0> it = resolvedDynamicRanges.values().iterator();
        while (it.hasNext()) {
            if (it.next().a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    private final a.u T() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.cameraMetadata.J(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            return new a.u(streamConfigurationMap, new c.a0(this.cameraMetadata, streamConfigurationMap));
        }
        throw new IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    private final List<List<Size>> V(Map<w3<?>, ? extends List<Size>> newUseCaseConfigsSupportedSizeMap, List<? extends w3<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = useCasesPriorityOrder.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            arrayList.add(d(newUseCaseConfigsSupportedSizeMap.get(newUseCaseConfigs.get(iIntValue)), newUseCaseConfigs.get(iIntValue).r()));
        }
        return arrayList;
    }

    private final List<p3> W(FeatureSettings featureSettings) {
        if (this.featureSettingsToSupportedCombinationsMap.containsKey(featureSettings)) {
            return this.featureSettingsToSupportedCombinationsMap.get(featureSettings);
        }
        List<p3> arrayList = new ArrayList<>();
        if (featureSettings.getRequiresFeatureComboQuery()) {
            arrayList.addAll(h0.f662a.t(this.cameraMetadata, featureSettings.getVideoStabilization()));
        } else if (featureSettings.getIsUltraHdrOn()) {
            if (this.surfaceCombinationsUltraHdr.isEmpty()) {
                w();
            }
            if (featureSettings.getCameraMode() == 0) {
                arrayList.addAll(this.surfaceCombinationsUltraHdr);
            }
        } else if (featureSettings.getIsHighSpeedOn()) {
            if (this.highSpeedSurfaceCombinations.isEmpty()) {
                q();
            }
            arrayList.addAll(this.highSpeedSurfaceCombinations);
        } else if (featureSettings.getRequiredMaxBitDepth() == 8) {
            int cameraMode = featureSettings.getCameraMode();
            if (cameraMode == 1) {
                arrayList = this.concurrentSurfaceCombinations;
            } else if (cameraMode != 2) {
                arrayList.addAll(featureSettings.getVideoStabilization() == x.a.PREVIEW ? this.previewStabilizationSurfaceCombinations : this.surfaceCombinations);
            } else {
                arrayList.addAll(this.ultraHighSurfaceCombinations);
                arrayList.addAll(this.surfaceCombinations);
            }
        } else if (featureSettings.getRequiredMaxBitDepth() == 10 && featureSettings.getCameraMode() == 0) {
            arrayList.addAll(this.surfaceCombinations10Bit);
        }
        this.featureSettingsToSupportedCombinationsMap.put(featureSettings, arrayList);
        return arrayList;
    }

    private final List<SurfaceConfig> X(int cameraMode, List<? extends v.g> attachedSurfaces, List<Size> possibleSizeList, List<? extends w3<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, Map<Integer, v.g> surfaceConfigIndexAttachedSurfaceInfoMap, Map<Integer, w3<?>> surfaceConfigIndexUseCaseConfigMap, boolean checkViaFeatureComboQuery) {
        ArrayList arrayList = new ArrayList();
        for (v.g gVar : attachedSurfaces) {
            arrayList.add(gVar.i());
            if (surfaceConfigIndexAttachedSurfaceInfoMap != null) {
                surfaceConfigIndexAttachedSurfaceInfoMap.put(Integer.valueOf(arrayList.size() - 1), gVar);
            }
        }
        int i15 = 0;
        for (Size size : possibleSizeList) {
            int i16 = i15 + 1;
            w3<?> w3Var = newUseCaseConfigs.get(useCasesPriorityOrder.get(i15).intValue());
            int iR = w3Var.r();
            arrayList.add(SurfaceConfig.INSTANCE.d(iR, size, a0(iR), cameraMode, checkViaFeatureComboQuery ? SurfaceConfig.c.FEATURE_COMBINATION_TABLE : SurfaceConfig.c.CAPTURE_SESSION_TABLES, w3Var.V()));
            if (surfaceConfigIndexUseCaseConfigMap != null) {
                surfaceConfigIndexUseCaseConfigMap.put(Integer.valueOf(arrayList.size() - 1), w3Var);
            }
            i15 = i16;
        }
        return arrayList;
    }

    private final Range<Integer> Z(List<? extends v.g> attachedSurfaces, List<? extends w3<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, boolean isStrictFpsRequired) {
        Range<Integer> rangeB0 = n3.f202727a;
        Iterator<? extends v.g> it = attachedSurfaces.iterator();
        while (it.hasNext()) {
            rangeB0 = b0(it.next().j(), rangeB0, isStrictFpsRequired);
        }
        Iterator<Integer> it4 = useCasesPriorityOrder.iterator();
        while (it4.hasNext()) {
            rangeB0 = b0(newUseCaseConfigs.get(it4.next().intValue()).z(n3.f202727a), rangeB0, isStrictFpsRequired);
        }
        return rangeB0;
    }

    private final Range<Integer> b0(Range<Integer> newTargetFrameRate, Range<Integer> storedTargetFrameRate, boolean isStrictFpsRequired) {
        Range<Integer> range = n3.f202727a;
        if (fr.t.c(storedTargetFrameRate, range) && fr.t.c(newTargetFrameRate, range)) {
            return range;
        }
        if (fr.t.c(storedTargetFrameRate, range)) {
            return newTargetFrameRate;
        }
        if (!fr.t.c(newTargetFrameRate, range)) {
            if (isStrictFpsRequired) {
                i6.i.j(fr.t.c(newTargetFrameRate, storedTargetFrameRate), "All targetFrameRate should be the same if strict fps is required");
                return newTargetFrameRate;
            }
            try {
                return storedTargetFrameRate.intersect(newTargetFrameRate);
            } catch (IllegalArgumentException unused) {
            }
        }
        return storedTargetFrameRate;
    }

    private final List<Integer> c0(List<? extends w3<?>> newUseCaseConfigs) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends w3<?>> it = newUseCaseConfigs.iterator();
        while (it.hasNext()) {
            int iB = it.next().B(0);
            if (!arrayList2.contains(Integer.valueOf(iB))) {
                arrayList2.add(Integer.valueOf(iB));
            }
        }
        pq.v.B(arrayList2);
        pq.v.X(arrayList2);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            int iIntValue = ((Number) it4.next()).intValue();
            for (w3<?> w3Var : newUseCaseConfigs) {
                if (iIntValue == w3Var.B(0)) {
                    arrayList.add(Integer.valueOf(newUseCaseConfigs.indexOf(w3Var)));
                }
            }
        }
        return arrayList;
    }

    private final boolean d0(int existingSurfaceFrameRateCeiling, Range<Integer> targetFpsRange, int currentConfigFrameRateCeiling) {
        return fr.t.c(targetFpsRange, n3.f202727a) || currentConfigFrameRateCeiling >= existingSurfaceFrameRateCeiling || currentConfigFrameRateCeiling >= ((Number) targetFpsRange.getUpper()).intValue();
    }

    private final void e() {
        int[] iArr = (int[]) this.cameraMetadata.J(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            this.isRawSupported = pq.n.d0(iArr, 3);
            this.isBurstCaptureSupported = pq.n.d0(iArr, 6);
            this.isUltraHighResolutionSensorSupported = pq.n.d0(iArr, 16);
            this.isManualSensorSupported = pq.n.d0(iArr, 1);
        }
    }

    private final boolean e0(List<? extends v.g> attachedSurfaces, List<? extends w3<?>> newUseCaseConfigs) {
        Iterator<? extends v.g> it = attachedSurfaces.iterator();
        Boolean boolValueOf = null;
        while (it.hasNext()) {
            boolValueOf = Boolean.valueOf(z(it.next().k(), boolValueOf));
        }
        Iterator<? extends w3<?>> it4 = newUseCaseConfigs.iterator();
        while (it4.hasNext()) {
            boolValueOf = Boolean.valueOf(z(it4.next().E(), boolValueOf));
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private final boolean f0(FeatureSettings featureSettings, List<? extends v.g> attachedSurfaces, Map<w3<?>, ? extends List<Size>> newUseCaseConfigsSupportedSizeMap) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends v.g> it = attachedSurfaces.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().i());
        }
        y.d dVar = new y.d();
        for (w3<?> w3Var : newUseCaseConfigsSupportedSizeMap.keySet()) {
            List<Size> list = newUseCaseConfigsSupportedSizeMap.get(w3Var);
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException(("No available output size is found for " + w3Var + '.').toString());
            }
            Size size = (Size) Collections.min(list, dVar);
            int iR = w3Var.r();
            arrayList.add(SurfaceConfig.INSTANCE.d(iR, size, a0(iR), featureSettings.getCameraMode(), SurfaceConfig.c.CAPTURE_SESSION_TABLES, w3Var.V()));
        }
        return g(this, featureSettings, arrayList, null, null, null, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean g(v0 v0Var, FeatureSettings featureSettings, List list, Map map, List list2, List list3, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            map = pq.v0.i();
        }
        Map map2 = map;
        if ((i15 & 8) != 0) {
            list2 = pq.v.n();
        }
        List list4 = list2;
        if ((i15 & 16) != 0) {
            list3 = pq.v.n();
        }
        return v0Var.f(featureSettings, list, map2, list4, list3);
    }

    private final void g0(FeatureSettings featureSettings, Size size, int imageFormat, int customMaxFps, o3 streamUseCase, boolean forceUniqueMaxFpsFiltering, Map<SurfaceConfig.b, Set<Integer>> configSizeUniqueMaxFpsMap, List<Size> reducedSizeList) {
        SurfaceConfig.b configSize = SurfaceConfig.INSTANCE.d(imageFormat, size, a0(imageFormat), featureSettings.getCameraMode(), featureSettings.getRequiresFeatureComboQuery() ? SurfaceConfig.c.FEATURE_COMBINATION_TABLE : SurfaceConfig.c.CAPTURE_SESSION_TABLES, streamUseCase).getConfigSize();
        Range<Integer> rangeG = featureSettings.g();
        Range<Integer> range = n3.f202727a;
        int iF = (!fr.t.c(rangeG, range) || forceUniqueMaxFpsFiltering) ? F(imageFormat, size, featureSettings.getIsHighSpeedOn(), customMaxFps) : Integer.MAX_VALUE;
        if (featureSettings.getIsFeatureComboInvocation()) {
            if (configSize == SurfaceConfig.b.f202806s) {
                return;
            }
            if (!fr.t.c(featureSettings.g(), range) && iF < ((Number) featureSettings.g().getUpper()).intValue()) {
                return;
            }
        }
        Set<Integer> linkedHashSet = configSizeUniqueMaxFpsMap.get(configSize);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            configSizeUniqueMaxFpsMap.put(configSize, linkedHashSet);
        }
        if (linkedHashSet.contains(Integer.valueOf(iF))) {
            return;
        }
        reducedSizeList.add(size);
        linkedHashSet.add(Integer.valueOf(iF));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x005d A[RETURN] */
    private final Range<Integer> h(Range<Integer> targetFps, Range<Integer> storedRange, Range<Integer> newRange) {
        double dO = O(storedRange.intersect(targetFps));
        double dO2 = O(newRange.intersect(targetFps));
        double dO3 = dO2 / ((double) O(newRange));
        double dO4 = dO / ((double) O(storedRange));
        if (dO2 > dO) {
            if (dO3 >= 0.5d || dO3 >= dO4) {
                return newRange;
            }
            return storedRange;
        }
        if (dO2 != dO) {
            if (dO4 >= 0.5d || dO3 <= dO4) {
                return storedRange;
            }
            return newRange;
        }
        if (dO3 <= dO4 && (dO3 != dO4 || ((Number) newRange.getLower()).intValue() <= ((Number) storedRange.getLower()).intValue())) {
            return storedRange;
        }
        return newRange;
    }

    private final void h0(BestSizesAndMaxFpsForConfigs bestSizesAndMaxFps, List<SurfaceConfig> orderedSurfaceConfigListForStreamUseCase, List<? extends v.g> attachedSurfaces, Map<v.g, n3> attachedSurfaceStreamSpecMap, Map<w3<?>, n3> suggestedStreamSpecMap, Map<Integer, v.g> surfaceConfigIndexAttachedSurfaceInfoMap, Map<Integer, w3<?>> surfaceConfigIndexUseCaseConfigMap) {
        if (orderedSurfaceConfigListForStreamUseCase != null && bestSizesAndMaxFps.getMaxFpsForBestSizes() == bestSizesAndMaxFps.getMaxFpsForStreamUseCase() && bestSizesAndMaxFps.a().size() == bestSizesAndMaxFps.b().size()) {
            List<oq.r> listP1 = pq.v.p1(bestSizesAndMaxFps.a(), bestSizesAndMaxFps.b());
            if (!(listP1 instanceof Collection) || !listP1.isEmpty()) {
                for (oq.r rVar : listP1) {
                    if (!fr.t.c(rVar.c(), rVar.d())) {
                        return;
                    }
                }
            }
            f.l lVar = f.l.f54477a;
            if (lVar.l(this.cameraMetadata, attachedSurfaces, suggestedStreamSpecMap, attachedSurfaceStreamSpecMap)) {
                return;
            }
            lVar.m(suggestedStreamSpecMap, attachedSurfaceStreamSpecMap, surfaceConfigIndexAttachedSurfaceInfoMap, surfaceConfigIndexUseCaseConfigMap, orderedSurfaceConfigListForStreamUseCase);
        }
    }

    private final j3 i(FeatureSettings featureSettings, List<SurfaceConfig> surfaceConfigList, Map<SurfaceConfig, o.i0> dynamicRangesBySurfaceConfig, List<? extends w3<?>> newUseCaseConfigs, List<Integer> useCasePriorityOrder) {
        j3.h hVar = new j3.h();
        int i15 = 0;
        for (Object obj : surfaceConfigList) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
            Size sizeE = surfaceConfig.e(a0(surfaceConfig.getImageFormat()));
            w3<?> w3Var = newUseCaseConfigs.get(useCasePriorityOrder.get(i15).intValue());
            r.a.Companion companion = r.a.INSTANCE;
            o.i0 i0Var = dynamicRangesBySurfaceConfig.get(surfaceConfig);
            if (i0Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            j3.b bVarA = companion.a(w3Var, sizeE, i0Var);
            Range<Integer> rangeG = featureSettings.g();
            if (fr.t.c(rangeG, n3.f202727a)) {
                rangeG = null;
            }
            if (rangeG == null) {
                rangeG = FpsRangeFeature.f176984k;
            }
            bVarA.s(rangeG);
            if (featureSettings.getVideoStabilization() == x.a.PREVIEW) {
                bVarA.w(2);
            } else if (featureSettings.getVideoStabilization() == x.a.ON) {
                bVarA.z(2);
            }
            hVar.b(bVarA.o());
            i6.i.j(hVar.f(), "Cannot create a combined SessionConfig for feature combo after adding " + w3Var + " with " + surfaceConfig + " due to [" + hVar.d() + "]; surfaceConfigList = " + surfaceConfigList + ", featureSettings = " + featureSettings + ", newUseCaseConfigs = " + newUseCaseConfigs);
            i15 = i16;
        }
        return hVar.c();
    }

    private final void i0() {
        this.displayInfoManager.l();
        if (this.surfaceSizeDefinition == null) {
            v();
        } else {
            l0(r3.a(Y().b(), Y().n(), this.displayInfoManager.k(), Y().l(), Y().j(), Y().h(), Y().f(), Y().d(), Y().p()));
        }
    }

    private final FeatureSettings j(int cameraMode, boolean hasVideoCapture, Map<w3<?>, o.i0> resolvedDynamicRanges, x.a videoStabilization, boolean isUltraHdrOn, boolean isHighSpeedOn, boolean isFeatureComboInvocation, boolean requiresFeatureComboQuery, Range<Integer> targetFpsRange, boolean isStrictFpsRequired) {
        return r0(new FeatureSettings(cameraMode, S(resolvedDynamicRanges), hasVideoCapture, videoStabilization, isUltraHdrOn, isHighSpeedOn, isFeatureComboInvocation, requiresFeatureComboQuery, targetFpsRange, isStrictFpsRequired));
    }

    private final SurfaceStreamSpecQueryResult j0(b checkingMethod, FeatureSettings featureSettings, List<? extends v.g> attachedSurfaces, Map<w3<?>, ? extends List<Size>> filteredNewUseCaseConfigsSupportedSizeMap, List<? extends w3<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, Map<w3<?>, o.i0> resolvedDynamicRanges, boolean findMaxSupportedFrameRate) {
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            Objects.toString(checkingMethod);
        }
        int i15 = e.f833a[checkingMethod.ordinal()];
        if (i15 == 1) {
            return k0(r0(FeatureSettings.b(featureSettings, 0, 0, false, null, false, false, false, false, null, false, 895, null)), attachedSurfaces, filteredNewUseCaseConfigsSupportedSizeMap, newUseCaseConfigs, useCasesPriorityOrder, resolvedDynamicRanges, findMaxSupportedFrameRate);
        }
        if (i15 == 2) {
            Range<Integer> rangeG = (featureSettings.getIsFeatureComboInvocation() && featureSettings.g() == n3.f202727a && featureSettings.getRequiresFeatureComboQuery()) ? FpsRangeFeature.f176984k : featureSettings.g();
            return k0(r0(FeatureSettings.b(featureSettings, 0, 0, false, null, false, false, false, true, rangeG, false, 639, null)), attachedSurfaces, filteredNewUseCaseConfigsSupportedSizeMap, newUseCaseConfigs, useCasesPriorityOrder, resolvedDynamicRanges, findMaxSupportedFrameRate);
        }
        if (i15 != 3) {
            throw new oq.p();
        }
        try {
            return k0(r0(FeatureSettings.b(featureSettings, 0, 0, false, null, false, false, false, false, null, false, 895, null)), attachedSurfaces, filteredNewUseCaseConfigsSupportedSizeMap, newUseCaseConfigs, useCasesPriorityOrder, resolvedDynamicRanges, findMaxSupportedFrameRate);
        } catch (IllegalArgumentException unused2) {
            e.c cVar2 = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused3 = e.c.TRUNCATED_TAG;
            }
            return k0(r0(FeatureSettings.b(featureSettings, 0, 0, false, null, false, false, false, true, null, false, 895, null)), attachedSurfaces, filteredNewUseCaseConfigsSupportedSizeMap, newUseCaseConfigs, useCasesPriorityOrder, resolvedDynamicRanges, findMaxSupportedFrameRate);
        }
    }

    private final SurfaceStreamSpecQueryResult k0(FeatureSettings featureSettings, List<? extends v.g> attachedSurfaces, Map<w3<?>, ? extends List<Size>> filteredNewUseCaseConfigsSupportedSizeMap, List<? extends w3<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, Map<w3<?>, o.i0> resolvedDynamicRanges, boolean findMaxSupportedFrameRate) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        List<SurfaceConfig> listL;
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            Objects.toString(featureSettings);
        }
        if (!featureSettings.getIsFeatureComboInvocation() && !f0(featureSettings, attachedSurfaces, filteredNewUseCaseConfigsSupportedSizeMap)) {
            throw new IllegalArgumentException(("No supported surface combination is found for camera device - Id : " + this.cameraId + ". May be attempting to bind too many use cases. Existing surfaces: " + attachedSurfaces + ". New configs: " + newUseCaseConfigs + ". GroupableFeature settings: " + featureSettings + '.').toString());
        }
        List<List<Size>> listV = V(k(filteredNewUseCaseConfigsSupportedSizeMap, featureSettings, findMaxSupportedFrameRate), newUseCaseConfigs, useCasesPriorityOrder);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        List<List<Size>> listL2 = featureSettings.getIsHighSpeedOn() ? this.highSpeedResolver.l(listV) : y(listV);
        boolean zD = f.l.f54477a.d(attachedSurfaces, newUseCaseConfigs);
        if (!this.isStreamUseCaseSupported || zD) {
            linkedHashMap = linkedHashMap3;
            linkedHashMap2 = linkedHashMap4;
            listL = null;
        } else {
            listL = L(listL2, attachedSurfaces, newUseCaseConfigs, useCasesPriorityOrder, featureSettings, linkedHashMap3, linkedHashMap4);
            linkedHashMap = linkedHashMap3;
            linkedHashMap2 = linkedHashMap4;
            if (o.e1.f("CXCP")) {
                String unused2 = e.c.TRUNCATED_TAG;
                Objects.toString(listL);
            }
        }
        List<SurfaceConfig> list = listL;
        BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigsL = l(listL2, attachedSurfaces, newUseCaseConfigs, I(attachedSurfaces, featureSettings.getIsHighSpeedOn()), useCasesPriorityOrder, featureSettings, list, resolvedDynamicRanges, findMaxSupportedFrameRate);
        if (bestSizesAndMaxFpsForConfigsL != null) {
            if (o.e1.f("CXCP")) {
                String unused3 = e.c.TRUNCATED_TAG;
                Objects.toString(bestSizesAndMaxFpsForConfigsL);
            }
            Map<w3<?>, n3> mapT = t(bestSizesAndMaxFpsForConfigsL, newUseCaseConfigs, useCasesPriorityOrder, resolvedDynamicRanges, featureSettings);
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            h0(bestSizesAndMaxFpsForConfigsL, list, attachedSurfaces, linkedHashMap5, mapT, linkedHashMap, linkedHashMap2);
            return new SurfaceStreamSpecQueryResult(mapT, linkedHashMap5, bestSizesAndMaxFpsForConfigsL.getMaxFpsForAllSizes());
        }
        throw new IllegalArgumentException(("No supported surface combination is found for camera device - Id : " + this.cameraId + " and Hardware level: " + this.hardwareLevel + ". May be the specified resolution is too large and not supported. Existing surfaces: " + attachedSurfaces + ". New configs: " + newUseCaseConfigs + '.').toString());
    }

    /* JADX WARN: Code duplicated, block: B:46:0x010f A[PHI: r14 r15 r17
      0x010f: PHI (r14v3 int) = (r14v1 int), (r14v1 int), (r14v5 int), (r14v6 int) binds: [B:33:0x00ec, B:35:0x00f2, B:41:0x00ff, B:45:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r15v2 boolean) = (r15v1 boolean), (r15v1 boolean), (r15v1 boolean), (r15v3 boolean) binds: [B:33:0x00ec, B:35:0x00f2, B:41:0x00ff, B:45:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r17v3 java.util.List<android.util.Size>) = 
      (r17v1 java.util.List<android.util.Size>)
      (r17v1 java.util.List<android.util.Size>)
      (r17v5 java.util.List<android.util.Size>)
      (r17v6 java.util.List<android.util.Size>)
     binds: [B:33:0x00ec, B:35:0x00f2, B:41:0x00ff, B:45:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    private final BestSizesAndMaxFpsForConfigs l(List<? extends List<Size>> allPossibleSizeArrangements, List<? extends v.g> attachedSurfaces, final List<? extends w3<?>> newUseCaseConfigs, int existingSurfaceFrameRateCeiling, final List<Integer> useCasesPriorityOrder, final FeatureSettings featureSettings, List<SurfaceConfig> orderedSurfaceConfigListForStreamUseCase, Map<w3<?>, o.i0> resolvedDynamicRanges, boolean findMaxFpsForAllSizes) {
        FeatureSettings featureSettings2;
        int i15;
        BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs;
        o.i0 i0Var;
        o.i0 i0VarD;
        Iterator<? extends List<Size>> it = allPossibleSizeArrangements.iterator();
        int i16 = Integer.MAX_VALUE;
        int i17 = Integer.MAX_VALUE;
        int i18 = Integer.MAX_VALUE;
        boolean z15 = false;
        boolean z16 = false;
        List<Size> list = null;
        List<Size> list2 = null;
        while (true) {
            if (!it.hasNext()) {
                featureSettings2 = featureSettings;
                i15 = i16;
                bestSizesAndMaxFpsForConfigs = null;
                break;
            }
            List<Size> next = it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            i15 = i16;
            bestSizesAndMaxFpsForConfigs = null;
            final List<SurfaceConfig> listX = X(featureSettings.getCameraMode(), attachedSurfaces, next, newUseCaseConfigs, useCasesPriorityOrder, linkedHashMap, linkedHashMap2, featureSettings.getRequiresFeatureComboQuery());
            int iD = D(next, newUseCaseConfigs, useCasesPriorityOrder, existingSurfaceFrameRateCeiling, featureSettings.getIsHighSpeedOn());
            boolean zD0 = d0(existingSurfaceFrameRateCeiling, featureSettings.g(), iD);
            final LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            int i19 = 0;
            for (Object obj : listX) {
                int i25 = i19 + 1;
                if (i19 < 0) {
                    pq.v.x();
                }
                SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
                v.g gVar = linkedHashMap.get(Integer.valueOf(i19));
                if (gVar == null || (i0VarD = gVar.d()) == null) {
                    o.i0 i0Var2 = resolvedDynamicRanges.get(linkedHashMap2.get(Integer.valueOf(i19)));
                    if (i0Var2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    i0Var = i0Var2;
                } else {
                    i0Var = i0VarD;
                }
                linkedHashMap3.put(surfaceConfig, i0Var);
                i19 = i25;
            }
            Iterator<? extends List<Size>> it4 = it;
            oq.k kVarB = oq.l.b(oq.o.NONE, new er.a() { // from class: PRN.u0
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(v0.m(this.f779a, featureSettings, listX, linkedHashMap3, newUseCaseConfigs, useCasesPriorityOrder));
                }
            });
            if (findMaxFpsForAllSizes && n(kVarB) && (i17 == Integer.MAX_VALUE || i17 < iD)) {
                i17 = iD;
            }
            if (!z15 && n(kVarB)) {
                if (i18 == Integer.MAX_VALUE || i18 < iD) {
                    i18 = iD;
                    list = next;
                }
                if (!zD0) {
                    i16 = orderedSurfaceConfigListForStreamUseCase == null ? i15 : i15;
                    it = it4;
                } else {
                    if (z16 && !findMaxFpsForAllSizes) {
                        featureSettings2 = featureSettings;
                        i18 = iD;
                        list = next;
                        break;
                    }
                    z15 = true;
                    i18 = iD;
                    list = next;
                    if (orderedSurfaceConfigListForStreamUseCase == null) {
                    }
                    it = it4;
                }
            } else {
                if (orderedSurfaceConfigListForStreamUseCase == null && !z16) {
                    featureSettings2 = featureSettings;
                    if (J(featureSettings2, listX, linkedHashMap, linkedHashMap2) != null) {
                        if (i15 == Integer.MAX_VALUE || i15 < iD) {
                            i15 = iD;
                            list2 = next;
                        }
                        if (zD0) {
                            if (z15 && !findMaxFpsForAllSizes) {
                                i15 = iD;
                                list2 = next;
                                break;
                            }
                            z16 = true;
                            i16 = iD;
                            list2 = next;
                        }
                    }
                    it = it4;
                }
                it = it4;
            }
        }
        if (list == null) {
            return bestSizesAndMaxFpsForConfigs;
        }
        return (!featureSettings2.getIsFeatureComboInvocation() || fr.t.c(featureSettings2.g(), n3.f202727a) || (i18 != Integer.MAX_VALUE && i18 >= ((Number) featureSettings2.g().getUpper()).intValue())) ? new BestSizesAndMaxFpsForConfigs(list, list2, i18, i15, i17) : bestSizesAndMaxFpsForConfigs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(v0 v0Var, FeatureSettings featureSettings, List list, Map map, List list2, List list3) {
        return v0Var.f(featureSettings, list, map, list2, list3);
    }

    private static final boolean n(oq.k<Boolean> kVar) {
        return kVar.getValue().booleanValue();
    }

    private final void n0(Map<Integer, Size> sizeMap, int format, Rational aspectRatio) {
        Size sizeG = G(this.streamConfigurationMapCompat.g(), format, true, aspectRatio);
        if (sizeG != null) {
            sizeMap.put(Integer.valueOf(format), sizeG);
        }
    }

    private final void o() {
        this.surfaceCombinations10Bit.addAll(h0.j());
    }

    static /* synthetic */ void o0(v0 v0Var, Map map, int i15, Rational rational, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            rational = null;
        }
        v0Var.n0(map, i15, rational);
    }

    private final void p() {
        this.concurrentSurfaceCombinations.addAll(h0.l());
    }

    private final void p0(Map<Integer, Size> sizeMap, Size targetSize, int format) {
        if (this.isConcurrentCameraModeSupported) {
            Size sizeH = H(this, this.streamConfigurationMapCompat.g(), format, false, null, 8, null);
            Integer numValueOf = Integer.valueOf(format);
            if (sizeH != null) {
                targetSize = (Size) Collections.min(pq.v.q(targetSize, sizeH), new y.d());
            }
            sizeMap.put(numValueOf, targetSize);
        }
    }

    private final void q() {
        if (this.highSpeedResolver.o()) {
            this.highSpeedSurfaceCombinations.clear();
            Size sizeK = this.highSpeedResolver.k();
            if (sizeK != null) {
                this.highSpeedSurfaceCombinations.addAll(h0.g(sizeK, a0(34)));
            }
        }
    }

    private final void q0(Map<Integer, Size> sizeMap, int format) {
        StreamConfigurationMap streamConfigurationMap;
        Size sizeH;
        if (Build.VERSION.SDK_INT < 31 || !this.isUltraHighResolutionSensorSupported || (streamConfigurationMap = (StreamConfigurationMap) this.cameraMetadata.J(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null || (sizeH = H(this, streamConfigurationMap, format, true, null, 8, null)) == null) {
            return;
        }
        sizeMap.put(Integer.valueOf(format), sizeH);
    }

    private final void r() {
        this.previewStabilizationSurfaceCombinations.addAll(h0.q());
    }

    private final FeatureSettings r0(FeatureSettings featureSettings) {
        if (featureSettings.getCameraMode() != 0 && featureSettings.getIsUltraHdrOn()) {
            throw new IllegalArgumentException(("Camera device Id is " + this.cameraId + ". Ultra HDR is not currently supported in " + v.o0.a(featureSettings.getCameraMode()) + " camera mode.").toString());
        }
        if (featureSettings.getCameraMode() != 0 && featureSettings.getRequiredMaxBitDepth() == 10) {
            throw new IllegalArgumentException(("Camera device Id is " + this.cameraId + ". 10 bit dynamic range is not currently supported in " + v.o0.a(featureSettings.getCameraMode()) + " camera mode.").toString());
        }
        if (featureSettings.getCameraMode() == 0 || !featureSettings.getIsFeatureComboInvocation()) {
            if (featureSettings.getIsHighSpeedOn() && featureSettings.getIsFeatureComboInvocation()) {
                throw new IllegalArgumentException("High-speed session is not supported with feature combination");
            }
            if (!featureSettings.getIsHighSpeedOn() || this.highSpeedResolver.o()) {
                return featureSettings;
            }
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
        throw new IllegalArgumentException(("Camera device Id is " + this.cameraId + ". feature combination is not currently supported in " + v.o0.a(featureSettings.getCameraMode()) + " camera mode.").toString());
    }

    private final void s() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.surfaceCombinationsStreamUseCase.addAll(h0.f662a.v());
        }
    }

    private final Map<w3<?>, n3> t(BestSizesAndMaxFpsForConfigs bestSizesAndMaxFps, List<? extends w3<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder, Map<w3<?>, o.i0> resolvedDynamicRanges, FeatureSettings featureSettings) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Range<Integer> rangeB = n3.f202727a;
        if (!fr.t.c(featureSettings.g(), rangeB)) {
            Range<Integer>[] rangeArrH = featureSettings.getIsHighSpeedOn() ? this.highSpeedResolver.h(bestSizesAndMaxFps.a()) : (Range[]) this.cameraMetadata.J(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range<Integer> rangeB2 = B(featureSettings.g(), bestSizesAndMaxFps.getMaxFpsForBestSizes(), rangeArrH);
            if ((featureSettings.getIsFeatureComboInvocation() || featureSettings.getIsStrictFpsRequired()) && !fr.t.c(rangeB2, featureSettings.g())) {
                throw new IllegalArgumentException(("Target FPS range " + featureSettings.g() + " is not supported. Max FPS supported by the calculated best combination: " + bestSizesAndMaxFps.getMaxFpsForBestSizes() + ". Calculated best FPS range for device: " + rangeB2 + ". Device supported FPS ranges: " + Arrays.toString(rangeArrH) + '.').toString());
            }
            rangeB = rangeB2;
        } else if (featureSettings.getIsHighSpeedOn()) {
            rangeB = B(f.i.INSTANCE.a(), bestSizesAndMaxFps.getMaxFpsForBestSizes(), this.highSpeedResolver.h(bestSizesAndMaxFps.a()));
        }
        int i15 = 0;
        for (w3<?> w3Var : newUseCaseConfigs) {
            int i16 = i15 + 1;
            n3.a aVarG = n3.a(bestSizesAndMaxFps.a().get(useCasesPriorityOrder.indexOf(Integer.valueOf(i15)))).g(featureSettings.getIsHighSpeedOn() ? 1 : 0);
            o.i0 i0Var = resolvedDynamicRanges.get(w3Var);
            if (i0Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            n3.a aVarH = aVarG.b(i0Var).d(f.l.f54477a.f(w3Var)).h(featureSettings.getHasVideoCapture());
            if (!fr.t.c(rangeB, n3.f202727a)) {
                aVarH.c(rangeB);
            }
            linkedHashMap.put(w3Var, aVarH.a());
            i15 = i16;
        }
        return linkedHashMap;
    }

    private final void u() {
        this.surfaceCombinations.addAll(h0.h(this.hardwareLevel, this.isRawSupported, this.isBurstCaptureSupported));
        this.surfaceCombinations.addAll(this.extraSupportedSurfaceCombinationsContainer.a(this.cameraId));
    }

    private final void v() {
        l0(r3.a(f0.d.f54494c, new LinkedHashMap(), this.displayInfoManager.k(), new LinkedHashMap(), P(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap()));
    }

    private final void w() {
        this.surfaceCombinationsUltraHdr.addAll(h0.w());
    }

    private final void x() {
        this.ultraHighSurfaceCombinations.addAll(h0.x());
    }

    private final List<List<Size>> y(List<? extends List<Size>> supportedOutputSizesList) {
        Iterator<? extends List<Size>> it = supportedOutputSizesList.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= it.next().size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / supportedOutputSizesList.get(0).size();
        int size3 = supportedOutputSizesList.size();
        int i16 = size;
        for (int i17 = 0; i17 < size3; i17++) {
            List<Size> list = supportedOutputSizesList.get(i17);
            for (int i18 = 0; i18 < size; i18++) {
                ((List) arrayList.get(i18)).add(list.get((i18 % i16) / size2));
            }
            if (i17 < supportedOutputSizesList.size() - 1) {
                i16 = size2;
                size2 /= supportedOutputSizesList.get(i17 + 1).size();
            }
        }
        return arrayList;
    }

    private final boolean z(boolean newIsStrictFpsRequired, Boolean storedIsStrictFpsRequired) {
        if (storedIsStrictFpsRequired == null || fr.t.c(storedIsStrictFpsRequired, Boolean.valueOf(newIsStrictFpsRequired))) {
            return newIsStrictFpsRequired;
        }
        throw new IllegalStateException("All isStrictFpsRequired should be the same");
    }

    public final Size G(StreamConfigurationMap map, int imageFormat, boolean highResolutionIncluded, Rational aspectRatio) {
        Size[] sizeArrM = M(map, imageFormat, aspectRatio);
        if (sizeArrM == null || sizeArrM.length == 0) {
            return null;
        }
        y.d dVar = new y.d();
        Size size = (Size) Collections.max(pq.n.f(sizeArrM), dVar);
        Size size2 = f0.d.f54492a;
        if (highResolutionIncluded) {
            Size[] highResolutionOutputSizes = map != null ? map.getHighResolutionOutputSizes(imageFormat) : null;
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length != 0) {
                size2 = (Size) Collections.max(pq.n.f(highResolutionOutputSizes), dVar);
            }
        }
        return (Size) Collections.max(pq.v.q(size, size2), dVar);
    }

    public final SurfaceStreamSpecQueryResult U(int cameraMode, List<? extends v.g> attachedSurfaces, Map<w3<?>, ? extends List<Size>> newUseCaseConfigsSupportedSizeMap, x.a videoStabilization, boolean hasVideoCapture, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
        oq.r rVarA;
        i0();
        boolean zB = f.i.INSTANCE.b(attachedSurfaces, newUseCaseConfigsSupportedSizeMap.keySet());
        Map<w3<?>, ? extends List<Size>> mapF = zB ? this.highSpeedResolver.f(newUseCaseConfigsSupportedSizeMap) : newUseCaseConfigsSupportedSizeMap;
        List<? extends w3<?>> listF1 = pq.v.f1(mapF.keySet());
        List<Integer> listC0 = c0(listF1);
        Map<w3<?>, o.i0> mapG = this.dynamicRangeResolver.g(attachedSurfaces, listF1, listC0);
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            Objects.toString(mapG);
        }
        boolean zB2 = INSTANCE.b(attachedSurfaces, mapF);
        if (findMaxSupportedFrameRate) {
            rVarA = oq.y.a(Boolean.FALSE, n3.f202727a);
        } else {
            boolean zE0 = e0(attachedSurfaces, listF1);
            rVarA = oq.y.a(Boolean.valueOf(zE0), Z(attachedSurfaces, listF1, listC0, zE0));
        }
        boolean zBooleanValue = ((Boolean) rVarA.a()).booleanValue();
        Range<Integer> range = (Range) rVarA.b();
        boolean z15 = videoStabilization == x.a.PREVIEW;
        if (o.e1.f("CXCP")) {
            String unused2 = e.c.TRUNCATED_TAG;
            boolean unused3 = this.isPreviewStabilizationSupported;
        }
        if (z15 && !this.isPreviewStabilizationSupported && isFeatureComboInvocation) {
            throw new IllegalArgumentException("Preview stabilization is not supported by the camera.");
        }
        return j0(A(mapG.values(), range, videoStabilization, zB2, isFeatureComboInvocation), j(cameraMode, hasVideoCapture, mapG, videoStabilization, zB2, zB, isFeatureComboInvocation, false, range, zBooleanValue), attachedSurfaces, mapF, listF1, listC0, mapG, findMaxSupportedFrameRate);
    }

    public final r3 Y() {
        r3 r3Var = this.surfaceSizeDefinition;
        if (r3Var != null) {
            return r3Var;
        }
        return null;
    }

    public final r3 a0(int format) {
        if (!this.surfaceSizeDefinitionFormats.contains(Integer.valueOf(format))) {
            p0(Y().n(), f0.d.f54496e, format);
            p0(Y().l(), f0.d.f54498g, format);
            o0(this, Y().h(), format, null, 4, null);
            n0(Y().f(), format, y.a.f222435a);
            n0(Y().d(), format, y.a.f222437c);
            q0(Y().p(), format);
            this.surfaceSizeDefinitionFormats.add(Integer.valueOf(format));
        }
        return Y();
    }

    public final List<Size> d(List<Size> sizeList, int imageFormat) {
        Rational rational;
        List<Size> listI1;
        int iA = this.targetAspectRatio.a(this.cameraMetadata, this.streamConfigurationMapCompat);
        if (iA == 0) {
            rational = y.a.f222435a;
        } else if (iA != 1) {
            rational = null;
            if (iA == 2) {
                Size sizeG = a0(256).g(256);
                if (sizeG != null) {
                    rational = new Rational(sizeG.getWidth(), sizeG.getHeight());
                }
            } else if (iA != 3) {
                throw new AssertionError("Undefined targetAspectRatio: " + this.targetAspectRatio);
            }
        } else {
            rational = y.a.f222437c;
        }
        if (rational == null) {
            listI1 = pq.v.i1(sizeList);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : sizeList) {
                if (y.a.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            listI1 = arrayList2;
        }
        return this.resolutionCorrector.a(SurfaceConfig.INSTANCE.c(imageFormat), listI1);
    }

    public final boolean f(FeatureSettings featureSettings, List<SurfaceConfig> surfaceConfigList, Map<SurfaceConfig, o.i0> dynamicRangesBySurfaceConfig, List<? extends w3<?>> newUseCaseConfigs, List<Integer> useCasesPriorityOrder) {
        List<p3> listW = W(featureSettings);
        boolean z15 = false;
        if (!(listW instanceof Collection) || !listW.isEmpty()) {
            Iterator<T> it = listW.iterator();
            while (it.hasNext()) {
                if (((p3) it.next()).d(surfaceConfigList) != null) {
                    z15 = true;
                    break;
                }
            }
        }
        if (!z15 || !featureSettings.getRequiresFeatureComboQuery()) {
            return z15;
        }
        j3 j3VarI = i(featureSettings, surfaceConfigList, dynamicRangesBySurfaceConfig, newUseCaseConfigs, useCasesPriorityOrder);
        boolean zA = this.featureCombinationQuery.a(j3VarI);
        Iterator<T> it4 = j3VarI.p().iterator();
        while (it4.hasNext()) {
            ((u1) it4.next()).d();
        }
        return zA;
    }

    public final Map<w3<?>, List<Size>> k(Map<w3<?>, ? extends List<Size>> newUseCaseConfigsSupportedSizeMap, FeatureSettings featureSettings, boolean forceUniqueMaxFpsFiltering) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (w3<?> w3Var : newUseCaseConfigsSupportedSizeMap.keySet()) {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Size size : newUseCaseConfigsSupportedSizeMap.get(w3Var)) {
                g0(featureSettings, size, w3Var.r(), w3Var.X(size), w3Var.V(), forceUniqueMaxFpsFiltering, linkedHashMap2, arrayList);
            }
            linkedHashMap.put(w3Var, arrayList);
        }
        return linkedHashMap;
    }

    public final void l0(r3 r3Var) {
        this.surfaceSizeDefinition = r3Var;
    }

    public final SurfaceConfig m0(int cameraMode, int imageFormat, Size size, o3 streamUseCase) {
        return SurfaceConfig.INSTANCE.d(imageFormat, size, a0(imageFormat), cameraMode, SurfaceConfig.c.CAPTURE_SESSION_TABLES, streamUseCase);
    }

    /* JADX INFO: renamed from: PRN.v0$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011Jz\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b'\u0010\"R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b)\u0010,R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b-\u0010\"¨\u0006."}, d2 = {"LPRN/v0$d;", "", "", "cameraMode", "requiredMaxBitDepth", "", "hasVideoCapture", "Lx/a;", "videoStabilization", "isUltraHdrOn", "isHighSpeedOn", "isFeatureComboInvocation", "requiresFeatureComboQuery", "Landroid/util/Range;", "targetFpsRange", "isStrictFpsRequired", "<init>", "(IIZLx/a;ZZZZLandroid/util/Range;Z)V", "a", "(IIZLx/a;ZZZZLandroid/util/Range;Z)LPRN/v0$d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "c", "b", "e", "Z", "d", "()Z", "Lx/a;", "h", "()Lx/a;", "l", "f", "j", "g", "i", "Landroid/util/Range;", "()Landroid/util/Range;", "k", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeatureSettings {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int cameraMode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int requiredMaxBitDepth;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasVideoCapture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final x.a videoStabilization;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isUltraHdrOn;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isHighSpeedOn;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFeatureComboInvocation;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean requiresFeatureComboQuery;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Range<Integer> targetFpsRange;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isStrictFpsRequired;

        public FeatureSettings(int i15, int i16, boolean z15, x.a aVar, boolean z16, boolean z17, boolean z18, boolean z19, Range<Integer> range, boolean z25) {
            this.cameraMode = i15;
            this.requiredMaxBitDepth = i16;
            this.hasVideoCapture = z15;
            this.videoStabilization = aVar;
            this.isUltraHdrOn = z16;
            this.isHighSpeedOn = z17;
            this.isFeatureComboInvocation = z18;
            this.requiresFeatureComboQuery = z19;
            this.targetFpsRange = range;
            this.isStrictFpsRequired = z25;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FeatureSettings b(FeatureSettings featureSettings, int i15, int i16, boolean z15, x.a aVar, boolean z16, boolean z17, boolean z18, boolean z19, Range range, boolean z25, int i17, Object obj) {
            if ((i17 & 1) != 0) {
                i15 = featureSettings.cameraMode;
            }
            if ((i17 & 2) != 0) {
                i16 = featureSettings.requiredMaxBitDepth;
            }
            if ((i17 & 4) != 0) {
                z15 = featureSettings.hasVideoCapture;
            }
            if ((i17 & 8) != 0) {
                aVar = featureSettings.videoStabilization;
            }
            if ((i17 & 16) != 0) {
                z16 = featureSettings.isUltraHdrOn;
            }
            if ((i17 & 32) != 0) {
                z17 = featureSettings.isHighSpeedOn;
            }
            if ((i17 & 64) != 0) {
                z18 = featureSettings.isFeatureComboInvocation;
            }
            if ((i17 & 128) != 0) {
                z19 = featureSettings.requiresFeatureComboQuery;
            }
            if ((i17 & 256) != 0) {
                range = featureSettings.targetFpsRange;
            }
            if ((i17 & 512) != 0) {
                z25 = featureSettings.isStrictFpsRequired;
            }
            Range range2 = range;
            boolean z26 = z25;
            boolean z27 = z18;
            boolean z28 = z19;
            boolean z29 = z16;
            boolean z35 = z17;
            return featureSettings.a(i15, i16, z15, aVar, z29, z35, z27, z28, range2, z26);
        }

        public final FeatureSettings a(int cameraMode, int requiredMaxBitDepth, boolean hasVideoCapture, x.a videoStabilization, boolean isUltraHdrOn, boolean isHighSpeedOn, boolean isFeatureComboInvocation, boolean requiresFeatureComboQuery, Range<Integer> targetFpsRange, boolean isStrictFpsRequired) {
            return new FeatureSettings(cameraMode, requiredMaxBitDepth, hasVideoCapture, videoStabilization, isUltraHdrOn, isHighSpeedOn, isFeatureComboInvocation, requiresFeatureComboQuery, targetFpsRange, isStrictFpsRequired);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCameraMode() {
            return this.cameraMode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getHasVideoCapture() {
            return this.hasVideoCapture;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getRequiredMaxBitDepth() {
            return this.requiredMaxBitDepth;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureSettings)) {
                return false;
            }
            FeatureSettings featureSettings = (FeatureSettings) other;
            return this.cameraMode == featureSettings.cameraMode && this.requiredMaxBitDepth == featureSettings.requiredMaxBitDepth && this.hasVideoCapture == featureSettings.hasVideoCapture && this.videoStabilization == featureSettings.videoStabilization && this.isUltraHdrOn == featureSettings.isUltraHdrOn && this.isHighSpeedOn == featureSettings.isHighSpeedOn && this.isFeatureComboInvocation == featureSettings.isFeatureComboInvocation && this.requiresFeatureComboQuery == featureSettings.requiresFeatureComboQuery && fr.t.c(this.targetFpsRange, featureSettings.targetFpsRange) && this.isStrictFpsRequired == featureSettings.isStrictFpsRequired;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getRequiresFeatureComboQuery() {
            return this.requiresFeatureComboQuery;
        }

        public final Range<Integer> g() {
            return this.targetFpsRange;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final x.a getVideoStabilization() {
            return this.videoStabilization;
        }

        public int hashCode() {
            return (((((((((((((((((Integer.hashCode(this.cameraMode) * 31) + Integer.hashCode(this.requiredMaxBitDepth)) * 31) + Boolean.hashCode(this.hasVideoCapture)) * 31) + this.videoStabilization.hashCode()) * 31) + Boolean.hashCode(this.isUltraHdrOn)) * 31) + Boolean.hashCode(this.isHighSpeedOn)) * 31) + Boolean.hashCode(this.isFeatureComboInvocation)) * 31) + Boolean.hashCode(this.requiresFeatureComboQuery)) * 31) + this.targetFpsRange.hashCode()) * 31) + Boolean.hashCode(this.isStrictFpsRequired);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsFeatureComboInvocation() {
            return this.isFeatureComboInvocation;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsHighSpeedOn() {
            return this.isHighSpeedOn;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsStrictFpsRequired() {
            return this.isStrictFpsRequired;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getIsUltraHdrOn() {
            return this.isUltraHdrOn;
        }

        public String toString() {
            return "FeatureSettings(cameraMode=" + this.cameraMode + ", requiredMaxBitDepth=" + this.requiredMaxBitDepth + ", hasVideoCapture=" + this.hasVideoCapture + ", videoStabilization=" + this.videoStabilization + ", isUltraHdrOn=" + this.isUltraHdrOn + ", isHighSpeedOn=" + this.isHighSpeedOn + ", isFeatureComboInvocation=" + this.isFeatureComboInvocation + ", requiresFeatureComboQuery=" + this.requiresFeatureComboQuery + ", targetFpsRange=" + this.targetFpsRange + ", isStrictFpsRequired=" + this.isStrictFpsRequired + ')';
        }

        public /* synthetic */ FeatureSettings(int i15, int i16, boolean z15, x.a aVar, boolean z16, boolean z17, boolean z18, boolean z19, Range range, boolean z25, int i17, fr.k kVar) {
            this(i15, i16, (i17 & 4) != 0 ? false : z15, (i17 & 8) != 0 ? x.a.UNSPECIFIED : aVar, (i17 & 16) != 0 ? false : z16, (i17 & 32) != 0 ? false : z17, (i17 & 64) != 0 ? false : z18, (i17 & 128) != 0 ? false : z19, (i17 & 256) != 0 ? n3.f202727a : range, (i17 & 512) != 0 ? false : z25);
        }
    }
}
