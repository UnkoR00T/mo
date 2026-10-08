package p076m2;

import c3.w;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import e3.ComposeStackTraceFrame;
import e3.ObjectLocation;
import e3.h;
import e3.k;
import e3.m;
import e3.s;
import er.l;
import er.p;
import fr.t;
import fr.w0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import n2.g;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;
import pq.v;
import r0.h0;
import r0.h1;
import r0.j0;
import r0.t0;
import r0.u0;
import r2.a0;
import r2.b0;
import r2.c0;
import r2.f;
import r2.o;
import r2.r;
import s2.d;
import s2.e;
import tq.j;
import y2.IntRef;
import y2.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002Ã\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0004ª\u0001§\u0001BQ\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010#\u001a\u00020\u00142\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!H\u0003¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010\u0016J\u000f\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010\u0016J!\u0010-\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u0010\u0016J\u001f\u00103\u001a\u00020\u00142\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020%H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0014H\u0002¢\u0006\u0004\b5\u0010\u0016J\u000f\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u0010\u0016J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u001b\u0010<\u001a\u0002072\n\u0010;\u001a\u000600j\u0002`:H\u0002¢\u0006\u0004\b<\u0010=J+\u0010B\u001a\u00020\u00142\u001a\u0010A\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020@\u0012\u0006\u0012\u0004\u0018\u00010@0?0>H\u0003¢\u0006\u0004\bB\u0010CJg\u0010K\u001a\u00028\u0000\"\u0004\b\u0000\u0010D2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010E2\f\b\u0002\u0010H\u001a\u000600j\u0002`:2\u001c\b\u0002\u0010I\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0?0>2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0002¢\u0006\u0004\bK\u0010LJ9\u0010Q\u001a\u00020\u00142\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0M2\u0006\u0010N\u001a\u0002072\b\u0010O\u001a\u0004\u0018\u00010\u001f2\u0006\u0010P\u001a\u00020%H\u0003¢\u0006\u0004\bQ\u0010RJ\u001b\u0010U\u001a\u00020%2\n\u0010;\u001a\u00060Sj\u0002`TH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0014H\u0003¢\u0006\u0004\bW\u0010\u0016J\u000f\u0010X\u001a\u00020\u0014H\u0002¢\u0006\u0004\bX\u0010\u0016J\u001b\u0010Z\u001a\u00020\u00142\n\u0010Y\u001a\u00060Sj\u0002`TH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\u00142\u0006\u0010\\\u001a\u000207H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0014H\u0002¢\u0006\u0004\b_\u0010\u0016J\u001b\u0010a\u001a\u00020\u00142\n\u0010`\u001a\u00060Sj\u0002`TH\u0002¢\u0006\u0004\ba\u0010[J\u0017\u0010c\u001a\u00020\u00142\u0006\u0010b\u001a\u00020%H\u0002¢\u0006\u0004\bc\u0010(J\u001b\u0010d\u001a\u00020\u001e2\n\u0010;\u001a\u000600j\u0002`:H\u0002¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020%2\n\u0010;\u001a\u000600j\u0002`:H\u0002¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u0002002\n\u0010;\u001a\u000600j\u0002`:H\u0002¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u0014H\u0002¢\u0006\u0004\bj\u0010\u0016J\u000f\u0010k\u001a\u00020\u0014H\u0002¢\u0006\u0004\bk\u0010\u0016J3\u0010q\u001a\u00020\u00142\u0006\u0010l\u001a\u0002002\b\u0010m\u001a\u0004\u0018\u00010\u001f2\u0006\u0010o\u001a\u00020n2\b\u0010p\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\bq\u0010rJ!\u0010t\u001a\u00020\u00142\u0006\u0010l\u001a\u0002002\b\u0010s\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\bt\u0010uJ!\u0010v\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\b\u0010p\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020\u0014H\u0002¢\u0006\u0004\bx\u0010\u0016J'\u0010{\u001a\b\u0012\u0004\u0012\u00020z0>2\u0006\u0010;\u001a\u0002002\b\u0010y\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b{\u0010|J&\u0010\u0080\u0001\u001a\u00020\u00142\n\u0010~\u001a\u00060Sj\u0002`}2\u0006\u0010\u007f\u001a\u000200H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J(\u0010\u0084\u0001\u001a\u00020\u00142\u000b\u0010\u0082\u0001\u001a\u00060Sj\u0002`}2\u0007\u0010\u0083\u0001\u001a\u000200H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0081\u0001J$\u0010\u0087\u0001\u001a\u0002072\u0007\u0010\u0085\u0001\u001a\u0002072\u0007\u0010\u0086\u0001\u001a\u000207H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001d\u0010\u008a\u0001\u001a\u00020\u00142\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001f\u0010\u008c\u0001\u001a\u0002002\u000b\u0010\u0082\u0001\u001a\u00060Sj\u0002`}H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001a\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001f*\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001b\u0010\u0091\u0001\u001a\u00020\u00142\u0007\u0010\u0090\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J+\u0010\u0095\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0094\u0001\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0093\u00012\u0007\u0010\u0090\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0097\u0001\u0010\u0016J\u0011\u0010\u0098\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0098\u0001\u0010\u0016J \u0010\u0099\u0001\u001a\u00020\u00142\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00140!H\u0010¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001c\u0010\u009c\u0001\u001a\u00020\u00142\b\u0010\u0090\u0001\u001a\u00030\u009b\u0001H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001JD\u0010¡\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010\u009e\u0001\"\u0005\b\u0001\u0010\u009f\u00012\u0007\u0010\u0089\u0001\u001a\u00028\u00002\u0019\u0010J\u001a\u0015\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140 \u0001H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0012\u0010\u009f\u0001\u001a\u00020\u0004H\u0017¢\u0006\u0006\b\u009f\u0001\u0010£\u0001J\u001d\u0010¤\u0001\u001a\u00020%2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001d\u0010¦\u0001\u001a\u00020%2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0006\b¦\u0001\u0010¥\u0001J\u001b\u0010§\u0001\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u00020%H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001c\u0010ª\u0001\u001a\u00020%2\b\u0010\u0089\u0001\u001a\u00030©\u0001H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001a\u0010¬\u0001\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u00020SH\u0016¢\u0006\u0005\b¬\u0001\u0010VJ\u001a\u0010\u00ad\u0001\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u000200H\u0016¢\u0006\u0005\b\u00ad\u0001\u0010gJ\u0011\u0010®\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b®\u0001\u0010\u0016J@\u0010±\u0001\u001a\u00020\u00142\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140!2\n\u0010°\u0001\u001a\u0005\u0018\u00010¯\u0001H\u0011¢\u0006\u0006\b±\u0001\u0010²\u0001J(\u0010´\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u009f\u00012\r\u0010l\u001a\t\u0012\u0004\u0012\u00028\u00000³\u0001H\u0017¢\u0006\u0006\b´\u0001\u0010µ\u0001J(\u0010·\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010\u009f\u00012\r\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0006\b·\u0001\u0010\u009a\u0001J\u0011\u0010¸\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b¸\u0001\u0010\u0016J\u001a\u0010º\u0001\u001a\u00020\u00142\u0007\u0010¹\u0001\u001a\u00020%H\u0016¢\u0006\u0005\bº\u0001\u0010(J\u0011\u0010»\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b»\u0001\u0010\u0016J\u0011\u0010¼\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b¼\u0001\u0010\u0016J\u0011\u0010½\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b½\u0001\u0010\u0016J\u0011\u0010¾\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¾\u0001\u0010\u0016J\u0011\u0010¿\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¿\u0001\u0010\u0016J\u0011\u0010\u009e\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u009e\u0001\u0010\u0016J\u0015\u0010Á\u0001\u001a\u0005\u0018\u00010À\u0001H\u0016¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u000f\u0010D\u001a\u00020\u0014H\u0017¢\u0006\u0004\bD\u0010\u0016J\u0011\u0010Ã\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bÃ\u0001\u0010\u0016J\u0011\u0010Ä\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\bÄ\u0001\u0010\u0016J\u0011\u0010Å\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bÅ\u0001\u0010\u0016J)\u0010Æ\u0001\u001a\u00020\u00142\u000b\u0010\u0089\u0001\u001a\u0006\u0012\u0002\b\u00030M2\b\u0010O\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J-\u0010È\u0001\u001a\u00020\u00142\u001a\u0010A\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020@\u0012\u0006\u0012\u0004\u0018\u00010@0?0>H\u0017¢\u0006\u0005\bÈ\u0001\u0010CJ\u0018\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020z0>H\u0010¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J2\u0010Ë\u0001\u001a\u00020%2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\n\u0010°\u0001\u001a\u0005\u0018\u00010¯\u0001H\u0011¢\u0006\u0006\bË\u0001\u0010Ì\u0001J!\u0010Î\u0001\u001a\u00020\u00142\r\u0010Í\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140!H\u0017¢\u0006\u0006\bÎ\u0001\u0010\u009a\u0001J\u0014\u0010Ï\u0001\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J$\u0010Ó\u0001\u001a\u00020%2\u0007\u0010Ñ\u0001\u001a\u00020%2\u0007\u0010Ò\u0001\u001a\u000200H\u0017¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0011\u0010Õ\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bÕ\u0001\u0010\u0016J\u0011\u0010Ö\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bÖ\u0001\u0010\u0016J\u001d\u0010×\u0001\u001a\u00020\u001a2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0010¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u0011\u0010Ù\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bÙ\u0001\u0010\u0016J\u0011\u0010Ú\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bÚ\u0001\u0010\u0016J \u0010Ü\u0001\u001a\u00020\u00142\f\u0010\u0089\u0001\u001a\u0007\u0012\u0002\b\u00030Û\u0001H\u0017¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J)\u0010à\u0001\u001a\u00020\u00142\u0015\u0010ß\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030Û\u00010Þ\u0001H\u0017¢\u0006\u0006\bà\u0001\u0010á\u0001J\u001a\u0010â\u0001\u001a\u00020\u00142\u0006\u0010l\u001a\u000200H\u0016¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u001a\u0010ä\u0001\u001a\u00020\u00142\u0006\u0010l\u001a\u000200H\u0016¢\u0006\u0006\bä\u0001\u0010ã\u0001J\u001b\u0010æ\u0001\u001a\u00030å\u00012\u0006\u0010l\u001a\u000200H\u0016¢\u0006\u0006\bæ\u0001\u0010ç\u0001J#\u0010è\u0001\u001a\u00020\u00142\u0006\u0010l\u001a\u0002002\b\u0010s\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0005\bè\u0001\u0010uJ\u0011\u0010é\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bé\u0001\u0010\u0016J\u0011\u0010ê\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\bê\u0001\u0010\u0016J#\u0010ë\u0001\u001a\u00020\u00142\u0006\u0010l\u001a\u0002002\b\u0010s\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0005\bë\u0001\u0010uJ&\u0010í\u0001\u001a\u00020%2\u0007\u0010\u0090\u0001\u001a\u00020\u001e2\t\u0010ì\u0001\u001a\u0004\u0018\u00010\u001fH\u0010¢\u0006\u0006\bí\u0001\u0010î\u0001J&\u0010ï\u0001\u001a\u00020\u00142\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0010¢\u0006\u0006\bï\u0001\u0010ð\u0001J\u001d\u0010ñ\u0001\u001a\u00020\u00142\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0006\bñ\u0001\u0010\u008b\u0001J\u0011\u0010ò\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bò\u0001\u0010\u0016J\u0014\u0010ó\u0001\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0006\bó\u0001\u0010Ð\u0001J\u0014\u0010ô\u0001\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0006\bô\u0001\u0010Ð\u0001J\u001d\u0010õ\u0001\u001a\u00020\u00142\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0006\bõ\u0001\u0010\u008b\u0001J\u0011\u0010ö\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\bö\u0001\u0010\u0016J\u001d\u0010÷\u0001\u001a\u00020\u00142\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0006\b÷\u0001\u0010\u008b\u0001R\"\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010û\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010ü\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010ý\u0001R\u0018\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u0018\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010ÿ\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010\u0080\u0002R\u001e\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0081\u0002\u0010\u0082\u0002\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002R\"\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u0085\u0002R \u0010\u0088\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010+0\u0086\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010\u0087\u0002R\u001b\u0010\u008a\u0002\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010\u0089\u0002R\u0019\u0010\u008b\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Ù\u0001R\u0019\u0010\u008c\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Ù\u0001R\u0019\u0010\u008d\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ù\u0001R\u0018\u0010\u0090\u0002\u001a\u00030\u008e\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010\u008f\u0002R\u001c\u0010\u0094\u0002\u001a\u0005\u0018\u00010\u0091\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002R\u001c\u0010\u0095\u0002\u001a\u0005\u0018\u00010\u0091\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010\u0093\u0002R\u0019\u0010\u0097\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0002\u0010±\u0001R\u0019\u0010\u0099\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010±\u0001R\u0019\u0010\u009a\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010±\u0001R\u0018\u0010\u009b\u0002\u001a\u00030\u008e\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0001\u0010\u008f\u0002R\u0019\u0010\u009d\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010\u009c\u0002R\"\u0010 \u0002\u001a\u000b\u0012\u0004\u0012\u000207\u0018\u00010\u009e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010\u009f\u0002R\u0019\u0010¡\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010±\u0001R\u0018\u0010¢\u0002\u001a\u00030\u008e\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010\u008f\u0002R\u0019\u0010¤\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0002\u0010±\u0001R\u0019\u0010¥\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ù\u0001R\u001b\u0010¦\u0002\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010\u009c\u0002R*\u0010\u00ad\u0002\u001a\u00030§\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÜ\u0001\u0010¨\u0002\u001a\u0006\b©\u0002\u0010ª\u0002\"\u0006\b«\u0002\u0010¬\u0002R\u001a\u0010°\u0002\u001a\u00030®\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010¯\u0002R\u0019\u0010²\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0002\u0010±\u0001R\u0018\u0010µ\u0002\u001a\u00030³\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010´\u0002R\u001c\u0010¸\u0002\u001a\u0005\u0018\u00010¶\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010·\u0002R\u0019\u0010¹\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ù\u0001R\u001a\u0010¼\u0002\u001a\u00030º\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010»\u0002R\u0019\u0010½\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010Ù\u0001R\u0019\u0010¾\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010Ù\u0001R(\u0010Â\u0002\u001a\u00020%8\u0010@\u0010X\u0090\u000e¢\u0006\u0017\n\u0006\bè\u0001\u0010±\u0001\u001a\u0006\b¿\u0002\u0010À\u0002\"\u0005\bÁ\u0002\u0010(R\u0018\u0010Å\u0002\u001a\u00030Ã\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010Ä\u0002R\u001e\u0010Æ\u0002\u001a\t\u0012\u0004\u0012\u00020\u001e0\u0086\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010\u0087\u0002R*\u0010È\u0002\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u00020%8\u0010@RX\u0090\u000e¢\u0006\u0010\n\u0006\b¿\u0001\u0010±\u0001\u001a\u0006\bÇ\u0002\u0010À\u0002R*\u0010Ë\u0002\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u00020%8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bÉ\u0002\u0010±\u0001\u001a\u0006\bÊ\u0002\u0010À\u0002R:\u0010Ï\u0002\u001a\u00070Sj\u0003`Ì\u00022\f\u0010\u0089\u0001\u001a\u00070Sj\u0003`Ì\u00028\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0005\bD\u0010ë\u0001\u0012\u0005\bÎ\u0002\u0010\u0016\u001a\u0006\b\u0092\u0002\u0010Í\u0002R+\u0010Õ\u0002\u001a\u0004\u0018\u00010\u000b8\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\bÐ\u0002\u0010ÿ\u0001\u001a\u0006\bÑ\u0002\u0010Ò\u0002\"\u0006\bÓ\u0002\u0010Ô\u0002R\u001c\u0010×\u0002\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010Ö\u0002R\"\u0010Ü\u0002\u001a\u0005\u0018\u00010Ø\u00028PX\u0090\u0004¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Ù\u0002\u001a\u0006\bÚ\u0002\u0010Û\u0002R)\u00102\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u00020%8\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010±\u0001\u001a\u0006\bþ\u0001\u0010À\u0002R'\u0010á\u0002\u001a\u00030Ý\u00028\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\b¤\u0001\u0010Þ\u0002\u0012\u0005\bà\u0002\u0010\u0016\u001a\u0006\b\u0096\u0002\u0010ß\u0002R\u0017\u0010ä\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\bâ\u0002\u0010ã\u0002R\u0017\u0010æ\u0002\u001a\u00020%8PX\u0090\u0004¢\u0006\b\u001a\u0006\bå\u0002\u0010À\u0002R\u0019\u0010é\u0002\u001a\u0004\u0018\u00010\u001e8PX\u0090\u0004¢\u0006\b\u001a\u0006\bç\u0002\u0010è\u0002R\u0017\u0010ê\u0002\u001a\u00020%8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010À\u0002R\u001a\u0010ì\u0002\u001a\u0005\u0018\u00010\u009b\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0002\u0010ë\u0002R\u0017\u0010í\u0002\u001a\u00020%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010À\u0002R\u0018\u0010ï\u0002\u001a\u00030¶\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0002\u0010î\u0002R\u0018\u0010ò\u0002\u001a\u00030ð\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0002\u0010ñ\u0002¨\u0006ó\u0002"}, d2 = {"Lm2/f2;", "Lm2/q1;", "Lm2/c;", "applier", "Lm2/v;", "parentContext", "", "Lm2/u4;", "abandonSet", "Lr2/o;", "slotTable", "Lm2/i;", "changes", "lateChanges", "Lm2/g0;", "observerHolder", "Lm2/x;", "composition", "<init>", "(Lm2/c;Lm2/v;Ljava/util/Set;Lr2/o;Lm2/i;Lm2/i;Lm2/g0;Lm2/x;)V", "Loq/i0;", "w0", "()V", "A0", "B0", "C0", "Le3/a;", "F0", "()Le3/a;", "Ln2/g;", "Lm2/f4;", "", "invalidationsRequested", "Lkotlin/Function0;", "content", "G0", "(Lr0/t0;Ler/p;)V", "", "isNode", "I0", "(Z)V", "J0", "K0", "Lm2/i2;", "newPending", "M0", "(ZLm2/i2;)V", "O0", "", "expectedNodeCount", "inserting", "P0", "(IZ)V", "L0", "R0", "Lm2/v3;", "D0", "()Lm2/v3;", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "E0", "(I)Lm2/v3;", "", "Loq/r;", "Lm2/s2;", "references", "V0", "(Ljava/util/List;)V", "R", "Lm2/l0;", "from", "to", "address", "invalidations", "block", "f1", "(Lm2/l0;Lm2/l0;ILjava/util/List;Ler/a;)Ljava/lang/Object;", "Lm2/o2;", "locals", "parameter", "force", "Y0", "(Lm2/o2;Lm2/v3;Ljava/lang/Object;Z)V", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "b1", "(J)Z", "h1", "i1", "source", "j1", "(J)V", "providers", "k1", "(Lm2/v3;)V", "l1", "groupBeingRemoved", "m1", "dispose", "s1", "q1", "(I)Lm2/f4;", "r1", "(I)Z", "e1", "(I)I", "w1", "x1", "key", "objectKey", "Lo2/c;", "kind", "data", "A1", "(ILjava/lang/Object;ILjava/lang/Object;)V", "dataKey", "B1", "(ILjava/lang/Object;)V", "C1", "(ZLjava/lang/Object;)V", "D1", "dataOffset", "Le3/d;", "y1", "(ILjava/lang/Integer;)Ljava/util/List;", "Landroidx/compose/runtime/VirtualGroupHandle;", "virtualGroup", "count", "G1", "(JI)V", "virtualHandle", "newCount", i.f37088o, "parentScope", "currentProviders", "I1", "(Lm2/v3;Lm2/v3;)Lm2/v3;", "value", "J1", "(Ljava/lang/Object;)V", "L1", "(J)I", "E1", "(Ljava/lang/Object;)Ljava/lang/Object;", "scope", "N0", "(Lm2/f4;)V", "Lkotlin/Function1;", "Lm2/u;", "Q0", "(Lm2/f4;)Ler/l;", "M1", "N1", "k0", "(Ler/a;)V", "Lm2/d4;", i.f37094u, "(Lm2/d4;)V", "V", "T", "Lkotlin/Function2;", "j", "(Ljava/lang/Object;Ler/p;)V", "()Lm2/v;", "W", "(Ljava/lang/Object;)Z", "G", "a", "(Z)Z", "", "b", "(F)Z", "d", "c", "z", "Lm2/e5;", "shouldPause", "Z", "(Lr0/t0;Ler/p;Lm2/e5;)V", "Lm2/z;", "N", "(Lm2/z;)Ljava/lang/Object;", "factory", i.f37087n, "a0", "changed", "g", "b0", "y", "x", "w", i.f37086m, "Lm2/d5;", "m", "()Lm2/d5;", "B", "c0", "U", "o", "(Lm2/o2;Ljava/lang/Object;)V", "k", "j0", "()Ljava/util/List;", "l0", "(Lr0/t0;Lm2/e5;)Z", "effect", "p", "E", "()Ljava/lang/Object;", "parametersChanged", "flags", "r", "(ZI)Z", "v1", "O", "m0", "(Ljava/lang/Object;)Le3/a;", "I", "n", "Lm2/c4;", ip.a.f96138c, "(Lm2/c4;)V", "", "values", "e", "([Lm2/c4;)V", "C", "(I)V", "X", "Lm2/r;", "h", "(I)Lm2/r;", "M", "K", "n0", "J", "instance", "o0", "(Lm2/f4;Ljava/lang/Object;)Z", "p0", "(Lr0/t0;)V", "v", "u", "c1", "d1", "K1", "Y", "F1", "Lm2/c;", "l", "()Lm2/c;", "Lm2/v;", "Ljava/util/Set;", "Lr2/o;", "f", "Lm2/i;", "Lm2/g0;", "i", "Lm2/x;", "S0", "()Lm2/x;", "Lr0/t0;", "Lm2/e6;", "Ljava/util/ArrayList;", "pendingStack", "Lm2/i2;", "pending", "nodeIndex", "groupNodeCount", "rGroupIndex", "Lm2/o1;", "Lm2/o1;", "parentStateStack", "Lr0/h0;", "q", "Lr0/h0;", "nodeCountOverrides", "nodeCountVirtualOverrides", "s", "forceRecomposeScopes", "t", "forciblyRecompose", "nodeExpected", "entersStack", "Lm2/v3;", "rootProvider", "Lr0/j0;", "Lr0/j0;", "providerUpdates", "providersInvalid", "providersInvalidStack", "A", "reusing", "reusingGroup", "providerCache", "Lr2/b0;", "Lr2/b0;", "T0", "()Lr2/b0;", "setReader$runtime", "(Lr2/b0;)V", "reader", "Lr2/r;", "Lr2/r;", "builder", "F", "builderHasAProvider", "Ls2/c;", "Ls2/c;", "changeListWriter", "Le3/h;", "Le3/h;", "_compositionData", "lastPlacedChildGroup", "Ls2/e;", "Ls2/e;", "insertFixups", "childrenComposing", "compositionToken", "h0", "()Z", "u1", "sourceMarkersEnabled", "m2/f2$c", "Lm2/f2$c;", "derivedStateObserver", "invalidateStack", "i0", "isComposing", "Q", "isDisposed$runtime", "isDisposed", "Landroidx/compose/runtime/CompositeKeyHashCode;", "()J", "getCompositeKeyHashCode$annotations", "compositeKeyHashCode", ip.a.f96137b, "f0", "()Lm2/i;", "t1", "(Lm2/i;)V", "deferredChanges", "Lm2/e5;", "shouldPauseCallback", "Le3/k;", "Le3/k;", "g0", "()Le3/k;", "errorContext", "Ltq/i;", "Ltq/i;", "()Ltq/i;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "U0", "()Lr2/o;", "readerTable", "d0", "areChildrenComposing", "e0", "()Lm2/f4;", "currentRecomposeScope", "defaultsInvalid", "()Lm2/d4;", "recomposeScope", "skipping", "()Le3/h;", "compositionData", "Lm2/e0;", "()Lm2/e0;", "currentCompositionLocalMap", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f2 extends q1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean reusing;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private v3 providerCache;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private b0 reader;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private r builder;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean builderHasAProvider;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final s2.c changeListWriter;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private h _compositionData;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private int lastPlacedChildGroup;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private e insertFixups;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private int childrenComposing;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private int compositionToken;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean sourceMarkersEnabled;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final c derivedStateObserver;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final ArrayList<f4> invalidateStack;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private boolean isComposing;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private boolean isDisposed;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private long compositeKeyHashCode;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private i deferredChanges;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private e5 shouldPauseCallback;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final k errorContext;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private boolean inserting;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final tq.i applyCoroutineContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p076m2.c<?> applier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v parentContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<u4> abandonSet;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o slotTable;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private i changes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private i lateChanges;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g0 observerHolder;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final x composition;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private i2 pending;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int nodeIndex;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int groupNodeCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int rGroupIndex;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private h0 nodeCountOverrides;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private h0 nodeCountVirtualOverrides;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean forceRecomposeScopes;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean forciblyRecompose;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean nodeExpected;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private j0<v3> providerUpdates;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean providersInvalid;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, Object> invalidations = g.e(null, 1, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<i2> pendingStack = e6.c(null, 1, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final o1 parentStateStack = new o1();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final o1 entersStack = new o1();

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private v3 rootProvider = y2.r.a();

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final o1 providersInvalidStack = new o1();

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int reusingGroup = -1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm2/f2$a;", "Lm2/u4;", "Lm2/f2$b;", "Lm2/f2;", "ref", "<init>", "(Lm2/f2$b;)V", "Loq/i0;", "c", "()V", "d", "e", "a", "Lm2/f2$b;", "()Lm2/f2$b;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements u4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b ref;

        public a(b bVar) {
            this.ref = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getRef() {
            return this.ref;
        }

        @Override // p076m2.u4
        public void c() {
        }

        @Override // p076m2.u4
        public void d() {
            this.ref.A();
        }

        @Override // p076m2.u4
        public void e() {
            this.ref.A();
        }
    }

    @Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0011¢\u0006\u0004\b#\u0010$J3\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0010¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b(\u0010\u0017J\u000f\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020)¢\u0006\u0004\b,\u0010-J\u001d\u00101\u001a\u00020\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0010¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0010¢\u0006\u0004\b3\u0010\u000eJ\u000f\u00104\u001a\u00020\fH\u0010¢\u0006\u0004\b4\u0010\u000eJ\u0017\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b9\u00108J\u0019\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b;\u0010<J+\u0010@\u001a\u00020\f2\u0006\u00106\u001a\u0002052\u0006\u0010=\u001a\u00020:2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030>H\u0010¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\bB\u0010\u0017J\u001d\u0010E\u001a\u00020D2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0016¢\u0006\u0004\bE\u0010FR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001e\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0006\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0007\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010J\u001a\u0004\bM\u0010LR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u0010N\u001a\u0004\bO\u0010PR0\u0010V\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u00102R\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020W0.8\u0006¢\u0006\f\n\u0004\bK\u0010R\u001a\u0004\bX\u0010TR+\u0010^\u001a\u00020)2\u0006\u0010Z\u001a\u00020)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010[\u001a\u0004\b\\\u0010+\"\u0004\b]\u0010-R\u0014\u0010_\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010LR\u0014\u0010a\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b`\u0010LR\u0014\u0010e\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010\u0015\u001a\u00020f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006i"}, d2 = {"Lm2/f2$b;", "Lm2/v;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyHashCode", "", "collectingParameterInformation", "collectingSourceInformation", "Lm2/g0;", "observerHolder", "<init>", "(Lm2/f2;JZZLm2/g0;)V", "Loq/i0;", "A", "()V", "Lm2/r;", "composer", "t", "(Lm2/r;)V", "y", "Lm2/l0;", "composition", "z", "(Lm2/l0;)V", "Lm2/f4;", "scope", "u", "(Lm2/f4;)V", "Lkotlin/Function0;", "content", "a", "(Lm2/l0;Ler/p;)V", "Lm2/e5;", "shouldPause", "Lr0/h1;", "b", "(Lm2/l0;Lm2/e5;Ler/p;)Lr0/h1;", "invalidScopes", "r", "(Lm2/l0;Lm2/e5;Lr0/h1;)Lr0/h1;", "o", "Lm2/v3;", "j", "()Lm2/v3;", "E", "(Lm2/v3;)V", "", "Le3/h;", "table", "s", "(Ljava/util/Set;)V", "x", "d", "Lm2/s2;", "reference", "n", "(Lm2/s2;)V", "c", "Lm2/r2;", "q", "(Lm2/s2;)Lm2/r2;", "data", "Lm2/c;", "applier", "p", "(Lm2/s2;Lm2/r2;Lm2/c;)V", "v", "action", "Lm2/g;", "w", "(Ler/a;)Lm2/g;", "J", "h", "()J", "Z", "f", "()Z", "g", "Lm2/g0;", "l", "()Lm2/g0;", "e", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "inspectionTables", "Lm2/f2;", "B", "composers", "<set-?>", "Lm2/a3;", "C", ip.a.f96138c, "compositionLocalScope", "collectingCallByInformation", "m", "stackTraceEnabled", "Ltq/i;", "k", "()Ltq/i;", "effectCoroutineContext", "Lm2/u;", "i", "()Lm2/u;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long compositeKeyHashCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean collectingParameterInformation;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean collectingSourceInformation;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final g0 observerHolder;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Set<Set<h>> inspectionTables;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Set<f2> composers = new LinkedHashSet();

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final a3 compositionLocalScope = x5.i(y2.r.a(), x5.o());

        public b(long j15, boolean z15, boolean z16, g0 g0Var) {
            this.compositeKeyHashCode = j15;
            this.collectingParameterInformation = z15;
            this.collectingSourceInformation = z16;
            this.observerHolder = g0Var;
        }

        private final v3 C() {
            return (v3) this.compositionLocalScope.getValue();
        }

        private final void D(v3 v3Var) {
            this.compositionLocalScope.setValue(v3Var);
        }

        public final void A() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<h>> set = this.inspectionTables;
            if (set != null) {
                for (f2 f2Var : this.composers) {
                    Iterator<Set<h>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(f2Var.F());
                    }
                }
            }
            this.composers.clear();
        }

        public final Set<f2> B() {
            return this.composers;
        }

        public final void E(v3 scope) {
            D(scope);
        }

        @Override // p076m2.v
        public void a(l0 composition, p<? super r, ? super Integer, i0> content) {
            f2.this.parentContext.a(composition, content);
        }

        @Override // p076m2.v
        public h1<f4> b(l0 composition, e5 shouldPause, p<? super r, ? super Integer, i0> content) {
            return f2.this.parentContext.b(composition, shouldPause, content);
        }

        @Override // p076m2.v
        public void c(s2 reference) {
            f2.this.parentContext.c(reference);
        }

        @Override // p076m2.v
        public void d() {
            f2.this.childrenComposing--;
        }

        @Override // p076m2.v
        public boolean e() {
            return f2.this.parentContext.e();
        }

        @Override // p076m2.v
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // p076m2.v
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @Override // p076m2.v
        /* JADX INFO: renamed from: h, reason: from getter */
        public long getCompositeKeyHashCode() {
            return this.compositeKeyHashCode;
        }

        @Override // p076m2.v
        public u i() {
            return f2.this.getComposition();
        }

        @Override // p076m2.v
        public v3 j() {
            return C();
        }

        @Override // p076m2.v
        /* JADX INFO: renamed from: k */
        public tq.i getEffectCoroutineContext() {
            return f2.this.parentContext.getEffectCoroutineContext();
        }

        @Override // p076m2.v
        /* JADX INFO: renamed from: l, reason: from getter */
        public g0 getObserverHolder() {
            return this.observerHolder;
        }

        @Override // p076m2.v
        public boolean m() {
            return f2.this.parentContext.m();
        }

        @Override // p076m2.v
        public void n(s2 reference) {
            f2.this.parentContext.n(reference);
        }

        @Override // p076m2.v
        public void o(l0 composition) {
            f2.this.parentContext.o(f2.this.getComposition());
            f2.this.parentContext.o(composition);
        }

        @Override // p076m2.v
        public void p(s2 reference, r2 data, p076m2.c<?> applier) {
            f2.this.parentContext.p(reference, data, applier);
        }

        @Override // p076m2.v
        public r2 q(s2 reference) {
            return f2.this.parentContext.q(reference);
        }

        @Override // p076m2.v
        public h1<f4> r(l0 composition, e5 shouldPause, h1<f4> invalidScopes) {
            return f2.this.parentContext.r(composition, shouldPause, invalidScopes);
        }

        @Override // p076m2.v
        public void s(Set<h> table) {
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // p076m2.v
        public void t(r composer) {
            super.t(composer);
            this.composers.add(g2.j(composer));
        }

        @Override // p076m2.v
        public void u(f4 scope) {
            f2.this.parentContext.u(scope);
        }

        @Override // p076m2.v
        public void v(l0 composition) {
            f2.this.parentContext.v(composition);
        }

        @Override // p076m2.v
        public g w(er.a<i0> action) {
            return f2.this.parentContext.w(action);
        }

        @Override // p076m2.v
        public void x() {
            f2.this.childrenComposing++;
        }

        @Override // p076m2.v
        public void y(r composer) {
            Set<Set<h>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(g2.j(composer).F());
                }
            }
            w0.a(this.composers).remove(composer);
        }

        @Override // p076m2.v
        public void z(l0 composition) {
            f2.this.parentContext.z(composition);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"m2/f2$c", "Lm2/p0;", "Lm2/o0;", "derivedState", "Loq/i0;", "b", "(Lm2/o0;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements p0 {
        c() {
        }

        @Override // p076m2.p0
        public void a(o0<?> derivedState) {
            f2.this.childrenComposing--;
        }

        @Override // p076m2.p0
        public void b(o0<?> derivedState) {
            f2.this.childrenComposing++;
        }
    }

    public f2(p076m2.c<?> cVar, v vVar, Set<u4> set, o oVar, i iVar, i iVar2, g0 g0Var, x xVar) {
        this.applier = cVar;
        this.parentContext = vVar;
        this.abandonSet = set;
        this.slotTable = oVar;
        this.changes = iVar;
        this.lateChanges = iVar2;
        this.observerHolder = g0Var;
        this.composition = xVar;
        b0 b0VarY = oVar.Y();
        b0VarY.d();
        this.reader = b0VarY;
        r rVar = new r(oVar.getAddressSpace(), false, false);
        rVar.g();
        this.builder = rVar;
        this.changeListWriter = new s2.c(this, s2.b.a(this.changes));
        this.lastPlacedChildGroup = -1;
        this.insertFixups = new e();
        this.sourceMarkersEnabled = vVar.getCollectingSourceInformation() || vVar.e();
        this.derivedStateObserver = new c();
        this.invalidateStack = e6.c(null, 1, null);
        this.errorContext = new k(this);
        tq.i effectCoroutineContext = vVar.getEffectCoroutineContext();
        tq.i iVarG0 = g0();
        this.applyCoroutineContext = effectCoroutineContext.n0(iVarG0 == null ? j.f191408a : iVarG0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    private final void A0() {
        f4 f4Var;
        boolean z15;
        if (getInserting()) {
            f4 f4Var2 = new f4(getComposition());
            e6.j(this.invalidateStack, f4Var2);
            K1(f4Var2);
            N0(f4Var2);
            return;
        }
        int parent = this.reader.getParent();
        f4 f4VarQ = g2.q(this.reader, parent);
        Object objL = f4VarQ != null ? g.l(this.invalidations, f4VarQ) : null;
        boolean zV = this.reader.V(parent);
        if (zV) {
            this.reader.W(67108864);
        }
        Object objQ = this.reader.Q();
        if (t.c(objQ, r.INSTANCE.a())) {
            f4Var = new f4(getComposition());
            K1(f4Var);
        } else {
            f4Var = (f4) objQ;
        }
        if (zV || objL != null) {
            z15 = true;
        } else {
            boolean zL = f4Var.l();
            if (zL) {
                f4Var.G(false);
            }
            if (zL) {
                z15 = true;
            } else {
                z15 = false;
            }
        }
        f4Var.I(z15);
        e6.j(this.invalidateStack, f4Var);
        N0(f4Var);
        if (f4Var.m()) {
            f4Var.H(false);
            f4Var.L(true);
            this.changeListWriter.V(f4Var);
            if (this.reusing || !f4Var.r()) {
                return;
            }
            this.reusing = true;
            this.reusingGroup = this.reader.getParent();
            f4Var.K(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0205  */
    /* JADX WARN: Code duplicated, block: B:103:0x0207  */
    /* JADX WARN: Code duplicated, block: B:107:0x0239  */
    /* JADX WARN: Code duplicated, block: B:108:0x023b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:80:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01df  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fc  */
    private final void A1(int key, Object objectKey, int kind, Object data) {
        long jRotateLeft;
        long j15;
        o2.c.Companion companion;
        boolean z15;
        i2 i2Var;
        boolean z16;
        i2 i2Var2;
        r rVar;
        Object objA;
        int i15;
        Object objA2;
        int i16;
        int i17;
        r.Companion companion2;
        Object objA3;
        int i18;
        r rVar2;
        Object objA4;
        int i19;
        Object objA5;
        int i25;
        i2 i2Var3;
        r.Companion companion3;
        Object objA6;
        int i26;
        N1();
        int i27 = this.rGroupIndex;
        if (objectKey == null) {
            if (data == null || key != 207 || t.c(data, r.INSTANCE.a())) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) key), 3);
                j15 = i27;
            } else {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) data.hashCode()), 3) ^ ((long) i27);
            }
            if (objectKey == null) {
                this.rGroupIndex++;
            }
            companion = o2.c.INSTANCE;
            if (kind != companion.a()) {
                z15 = true;
            } else {
                z15 = false;
            }
            i2Var = null;
            if (getInserting()) {
                this.reader.c();
                rVar2 = this.builder;
                if (z15) {
                    companion3 = r.INSTANCE;
                    objA6 = companion3.a();
                    Object objA7 = companion3.a();
                    if (objA6 == companion3.a()) {
                        i26 = 8388608;
                    } else {
                        i26 = 25165824;
                    }
                    rVar2.B(key, i26, objA6, null, objA7);
                } else if (data != null) {
                    if (objectKey == null) {
                        objA5 = r.INSTANCE.a();
                    } else {
                        objA5 = objectKey;
                    }
                    if (objA5 == r.INSTANCE.a()) {
                        i25 = 33554432;
                    } else {
                        i25 = 50331648;
                    }
                    rVar2.B(key, i25, objA5, data, null);
                } else {
                    if (objectKey == null) {
                        objA4 = r.INSTANCE.a();
                    } else {
                        objA4 = objectKey;
                    }
                    if (objA4 == r.INSTANCE.a()) {
                        i19 = 0;
                    } else {
                        i19 = 16777216;
                    }
                    rVar2.B(key, i19, objA4, null, null);
                }
                i2Var3 = this.pending;
                if (i2Var3 != null) {
                    r2.h hVar = new r2.h(key, -1, g2.t(rVar2.l()), -1, 0);
                    i2Var3.k(hVar, this.nodeIndex - i2Var3.getStartIndex());
                    i2Var3.j(hVar);
                }
                M0(z15, null);
                return;
            }
            if (kind != companion.b() && this.reusing) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (this.pending == null) {
                int iO = this.reader.o();
                if (z16 && iO == key && t.c(objectKey, this.reader.p())) {
                    C1(z15, data);
                } else {
                    this.pending = new i2(this.reader.g(), this.nodeIndex);
                }
            }
            i2Var2 = this.pending;
            if (i2Var2 != null) {
                r2.h hVarD = i2Var2.d(key, objectKey);
                if (!z16 || hVarD == null) {
                    this.reader.c();
                    this.inserting = true;
                    this.providerCache = null;
                    L0();
                    rVar = this.builder;
                    if (z15) {
                        companion2 = r.INSTANCE;
                        objA3 = companion2.a();
                        Object objA8 = companion2.a();
                        if (objA3 == companion2.a()) {
                            i18 = 8388608;
                        } else {
                            i18 = 25165824;
                        }
                        rVar.B(key, i18, objA3, null, objA8);
                    } else if (data != null) {
                        if (objectKey == null) {
                            objA2 = r.INSTANCE.a();
                        } else {
                            objA2 = objectKey;
                        }
                        if (objA2 == r.INSTANCE.a()) {
                            i16 = 33554432;
                        } else {
                            i16 = 50331648;
                        }
                        rVar.B(key, i16, objA2, data, null);
                    } else {
                        if (objectKey == null) {
                            objA = r.INSTANCE.a();
                        } else {
                            objA = objectKey;
                        }
                        if (objA == r.INSTANCE.a()) {
                            i15 = 0;
                        } else {
                            i15 = 16777216;
                        }
                        rVar.B(key, i15, objA, null, null);
                    }
                    r2.h hVar2 = new r2.h(key, -1, g2.t(rVar.l()), -1, 0);
                    i2Var2.k(hVar2, this.nodeIndex - i2Var2.getStartIndex());
                    i2Var2.j(hVar2);
                    ArrayList arrayList = new ArrayList();
                    if (z15) {
                        i17 = 0;
                    } else {
                        i17 = this.nodeIndex;
                    }
                    i2Var = new i2(arrayList, i17);
                } else {
                    i2Var2.j(hVarD);
                    long handle = hVarD.getHandle();
                    this.nodeIndex = i2Var2.i(hVarD) + i2Var2.getStartIndex();
                    int iO2 = i2Var2.o(hVarD);
                    int iA = iO2 - i2Var2.getGroupIndex();
                    i2Var2.m(iO2, i2Var2.getGroupIndex());
                    if (iA > 0) {
                        this.reader.Z(i2Var2.g());
                        this.changeListWriter.x(iA);
                    }
                    i2Var2.h(hVarD.getIndex());
                    this.reader.Z(handle);
                    C1(z15, data);
                }
            }
            M0(z15, i2Var);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) (objectKey instanceof Enum ? ((Enum) objectKey).ordinal() : objectKey.hashCode())), 3);
        j15 = 0;
        this.compositeKeyHashCode = jRotateLeft ^ j15;
        if (objectKey == null) {
            this.rGroupIndex++;
        }
        companion = o2.c.INSTANCE;
        if (kind != companion.a()) {
            z15 = true;
        } else {
            z15 = false;
        }
        i2Var = null;
        if (getInserting()) {
            this.reader.c();
            rVar2 = this.builder;
            if (z15) {
                companion3 = r.INSTANCE;
                objA6 = companion3.a();
                Object objA9 = companion3.a();
                if (objA6 == companion3.a()) {
                    i26 = 8388608;
                } else {
                    i26 = 25165824;
                }
                rVar2.B(key, i26, objA6, null, objA9);
            } else if (data != null) {
                if (objectKey == null) {
                    objA5 = r.INSTANCE.a();
                } else {
                    objA5 = objectKey;
                }
                if (objA5 == r.INSTANCE.a()) {
                    i25 = 33554432;
                } else {
                    i25 = 50331648;
                }
                rVar2.B(key, i25, objA5, data, null);
            } else {
                if (objectKey == null) {
                    objA4 = r.INSTANCE.a();
                } else {
                    objA4 = objectKey;
                }
                if (objA4 == r.INSTANCE.a()) {
                    i19 = 0;
                } else {
                    i19 = 16777216;
                }
                rVar2.B(key, i19, objA4, null, null);
            }
            i2Var3 = this.pending;
            if (i2Var3 != null) {
                r2.h hVar3 = new r2.h(key, -1, g2.t(rVar2.l()), -1, 0);
                i2Var3.k(hVar3, this.nodeIndex - i2Var3.getStartIndex());
                i2Var3.j(hVar3);
            }
            M0(z15, null);
            return;
        }
        if (kind != companion.b()) {
            z16 = false;
        } else {
            z16 = true;
        }
        if (this.pending == null) {
            int iO3 = this.reader.o();
            if (z16) {
                this.pending = new i2(this.reader.g(), this.nodeIndex);
            } else {
                this.pending = new i2(this.reader.g(), this.nodeIndex);
            }
        }
        i2Var2 = this.pending;
        if (i2Var2 != null) {
            r2.h hVarD2 = i2Var2.d(key, objectKey);
            if (z16) {
                this.reader.c();
                this.inserting = true;
                this.providerCache = null;
                L0();
                rVar = this.builder;
                if (z15) {
                    companion2 = r.INSTANCE;
                    objA3 = companion2.a();
                    Object objA10 = companion2.a();
                    if (objA3 == companion2.a()) {
                        i18 = 8388608;
                    } else {
                        i18 = 25165824;
                    }
                    rVar.B(key, i18, objA3, null, objA10);
                } else if (data != null) {
                    if (objectKey == null) {
                        objA2 = r.INSTANCE.a();
                    } else {
                        objA2 = objectKey;
                    }
                    if (objA2 == r.INSTANCE.a()) {
                        i16 = 33554432;
                    } else {
                        i16 = 50331648;
                    }
                    rVar.B(key, i16, objA2, data, null);
                } else {
                    if (objectKey == null) {
                        objA = r.INSTANCE.a();
                    } else {
                        objA = objectKey;
                    }
                    if (objA == r.INSTANCE.a()) {
                        i15 = 0;
                    } else {
                        i15 = 16777216;
                    }
                    rVar.B(key, i15, objA, null, null);
                }
                r2.h hVar4 = new r2.h(key, -1, g2.t(rVar.l()), -1, 0);
                i2Var2.k(hVar4, this.nodeIndex - i2Var2.getStartIndex());
                i2Var2.j(hVar4);
                ArrayList arrayList2 = new ArrayList();
                if (z15) {
                    i17 = 0;
                } else {
                    i17 = this.nodeIndex;
                }
                i2Var = new i2(arrayList2, i17);
            } else {
                this.reader.c();
                this.inserting = true;
                this.providerCache = null;
                L0();
                rVar = this.builder;
                if (z15) {
                    companion2 = r.INSTANCE;
                    objA3 = companion2.a();
                    Object objA11 = companion2.a();
                    if (objA3 == companion2.a()) {
                        i18 = 8388608;
                    } else {
                        i18 = 25165824;
                    }
                    rVar.B(key, i18, objA3, null, objA11);
                } else if (data != null) {
                    if (objectKey == null) {
                        objA2 = r.INSTANCE.a();
                    } else {
                        objA2 = objectKey;
                    }
                    if (objA2 == r.INSTANCE.a()) {
                        i16 = 33554432;
                    } else {
                        i16 = 50331648;
                    }
                    rVar.B(key, i16, objA2, data, null);
                } else {
                    if (objectKey == null) {
                        objA = r.INSTANCE.a();
                    } else {
                        objA = objectKey;
                    }
                    if (objA == r.INSTANCE.a()) {
                        i15 = 0;
                    } else {
                        i15 = 16777216;
                    }
                    rVar.B(key, i15, objA, null, null);
                }
                r2.h hVar5 = new r2.h(key, -1, g2.t(rVar.l()), -1, 0);
                i2Var2.k(hVar5, this.nodeIndex - i2Var2.getStartIndex());
                i2Var2.j(hVar5);
                ArrayList arrayList3 = new ArrayList();
                if (z15) {
                    i17 = 0;
                } else {
                    i17 = this.nodeIndex;
                }
                i2Var = new i2(arrayList3, i17);
            }
        }
        M0(z15, i2Var);
    }

    private final void B0() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compositeKeyHashCode = 0L;
        this.nodeExpected = false;
        e6.a(this.invalidateStack);
        C0();
    }

    private final void B1(int key, Object dataKey) {
        A1(key, dataKey, o2.c.INSTANCE.a(), null);
    }

    private final void C0() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final void C1(boolean isNode, Object data) {
        if (isNode) {
            this.reader.h0();
            return;
        }
        if (data != null && this.reader.n() != data) {
            this.changeListWriter.W(data);
        }
        this.reader.g0();
    }

    private final v3 D0() {
        v3 v3Var = this.providerCache;
        return v3Var != null ? v3Var : E0(this.reader.getParent());
    }

    private final void D1() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.Y();
        o2.c.Companion companion = o2.c.INSTANCE;
        A1(100, null, companion.a(), null);
        this.parentContext.x();
        v3 v3VarJ = this.parentContext.j();
        this.providersInvalidStack.i(g2.i(this.providersInvalid));
        this.providersInvalid = W(v3VarJ);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!getSourceMarkersEnabled()) {
            u1(this.parentContext.getCollectingSourceInformation());
        }
        if (getSourceMarkersEnabled()) {
            v3VarJ = v3VarJ.n1(m.c(), new StaticValueHolder(g0()));
        }
        this.rootProvider = v3VarJ;
        Set<h> set = (Set) f0.b(v3VarJ, s.c());
        if (set != null) {
            set.add(F());
            this.parentContext.s(set);
        }
        A1(Long.hashCode(this.parentContext.getCompositeKeyHashCode()), null, companion.a(), null);
    }

    private final v3 E0(int group) {
        v3 v3VarB;
        if (getInserting() && this.builderHasAProvider) {
            int parent = this.builder.getParent();
            while (parent >= 0) {
                if (this.builder.p(parent) == 202 && t.c(this.builder.q(parent), t.f())) {
                    v3 v3Var = (v3) this.builder.o(parent);
                    this.providerCache = v3Var;
                    return v3Var;
                }
                parent = this.builder.v(parent);
            }
        }
        if (!this.reader.M()) {
            while (group >= 0) {
                if (this.reader.F(group) == 202 && t.c(this.reader.H(group), t.f())) {
                    j0<v3> j0Var = this.providerUpdates;
                    if (j0Var == null || (v3VarB = j0Var.b(group)) == null) {
                        v3VarB = (v3) this.reader.E(group);
                    }
                    this.providerCache = v3VarB;
                    return v3VarB;
                }
                group = this.reader.U(group);
            }
        }
        v3 v3Var2 = this.rootProvider;
        this.providerCache = v3Var2;
        return v3Var2;
    }

    private final Object E1(Object obj) {
        return obj instanceof v4 ? ((v4) obj).getWrapped() : obj;
    }

    private final e3.a F0() {
        if (!getSourceMarkersEnabled()) {
            return null;
        }
        List listC = v.c();
        listC.addAll(r2.s.a(this.builder));
        listC.addAll(c0.a(this.reader));
        listC.addAll(j0());
        return new e3.a(v.a(listC), getSourceMarkersEnabled());
    }

    private final void G0(t0<Object, Object> invalidationsRequested, p<? super r, ? super Integer, i0> content) {
        if (getIsComposing()) {
            t.b("Reentrant composition is not supported");
        }
        this.observerHolder.a();
        y2.b0 b0Var = y2.b0.f223360a;
        Object objA = b0Var.a("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(w.K().getSnapshotId());
            this.providerUpdates = null;
            p0(invalidationsRequested);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                D1();
                Object objC1 = c1();
                if (objC1 != content && content != null) {
                    K1(content);
                }
                c cVar = this.derivedStateObserver;
                n2.c<p0> cVarC = x5.c();
                try {
                    cVarC.d(cVar);
                    if (content != null) {
                        B1(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, t.g());
                        n.a(this, content);
                        J0();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || objC1 == null || t.c(objC1, r.INSTANCE.a())) {
                        v1();
                    } else {
                        B1(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, t.g());
                        n.a(this, (p) w0.g(objC1, 2));
                        J0();
                    }
                    cVarC.v(cVarC.getSize() - 1);
                    K0();
                    this.isComposing = false;
                    s1(false);
                    i0 i0Var = i0.f148189a;
                    b0Var.b(objA);
                } catch (Throwable th4) {
                    cVarC.v(cVarC.getSize() - 1);
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    throw e3.e.b(th5, new er.a() { // from class: m2.z1
                        @Override // er.a
                        public final Object a() {
                            return f2.H0(this.f123265a);
                        }
                    });
                } catch (Throwable th6) {
                    this.isComposing = false;
                    w0();
                    s1(true);
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            y2.b0.f223360a.b(objA);
            throw th7;
        }
    }

    private final void G1(long virtualGroup, int count) {
        if (L1(virtualGroup) != count) {
            if (g2.r(virtualGroup)) {
                h0 h0Var = this.nodeCountVirtualOverrides;
                if (h0Var == null) {
                    h0Var = new h0(0, 1, null);
                    this.nodeCountVirtualOverrides = h0Var;
                }
                h0Var.u(f.b(virtualGroup), count);
                return;
            }
            h0 h0Var2 = this.nodeCountOverrides;
            if (h0Var2 == null) {
                h0Var2 = new h0(0, 1, null);
                this.nodeCountOverrides = h0Var2;
            }
            g2.r(virtualGroup);
            h0Var2.u(f.b(virtualGroup), count);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e3.a H0(f2 f2Var) {
        return f2Var.F0();
    }

    private final void H1(long virtualHandle, int newCount) {
        int iL1 = L1(virtualHandle);
        if (iL1 != newCount) {
            int i15 = newCount - iL1;
            int iD = e6.d(this.pendingStack) - 1;
            while (f.b(virtualHandle) != -1) {
                int iL2 = L1(virtualHandle) + i15;
                G1(virtualHandle, iL2);
                for (int i16 = iD; -1 < i16; i16--) {
                    i2 i2Var = (i2) e6.h(this.pendingStack, i16);
                    if (i2Var != null && i2Var.p(f.b(virtualHandle), iL2)) {
                        iD = i16 - 1;
                        break;
                    }
                }
                if (g2.r(virtualHandle)) {
                    virtualHandle = this.reader.x();
                } else {
                    int[] groups = U0().getAddressSpace().getGroups();
                    int iB = f.b(virtualHandle);
                    if ((groups[iB + 4] & 8388608) == 8388608) {
                        return;
                    }
                    virtualHandle = (((long) oq.b0.e(groups[iB + 2])) & BodyPartID.bodyIdMax) | (((long) 0) << 32);
                }
            }
        }
    }

    private final void I0(boolean isNode) {
        long jRotateRight;
        long j15;
        long jRotateRight2;
        long j16;
        int iE = this.parentStateStack.e() - 1;
        if (getInserting()) {
            int parent = this.builder.getParent();
            int iP = this.builder.p(parent);
            Object objQ = this.builder.q(parent);
            Object objO = this.builder.o(parent);
            if (objQ != null) {
                int iOrdinal = objQ instanceof Enum ? ((Enum) objQ).ordinal() : objQ.hashCode();
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3);
                j16 = iOrdinal;
            } else if (objO == null || iP != 207 || t.c(objO, r.INSTANCE.a())) {
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3);
                j16 = iP;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) objO.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight2 ^ j16, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iF = this.reader.F(parent2);
            Object objH = this.reader.H(parent2);
            Object objE = this.reader.E(parent2);
            if (objH != null) {
                int iOrdinal2 = objH instanceof Enum ? ((Enum) objH).ordinal() : objH.hashCode();
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3);
                j15 = iOrdinal2;
            } else if (objE == null || iF != 207 || t.c(objE, r.INSTANCE.a())) {
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3);
                j15 = iF;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) objE.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight ^ j15, 3);
        }
        int i15 = this.groupNodeCount;
        i2 i2Var = this.pending;
        if (i2Var != null && !i2Var.b().isEmpty()) {
            List<r2.h> listB = i2Var.b();
            List<r2.h> listF = i2Var.f();
            Set setE = c3.c.e(listF);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listF.size();
            int size2 = listB.size();
            int i16 = 0;
            int i17 = 0;
            int iQ = 0;
            while (i16 < size2) {
                r2.h hVar = listB.get(i16);
                if (!setE.contains(hVar)) {
                    this.changeListWriter.L(i2Var.i(hVar) + i2Var.getStartIndex(), hVar.getNodes());
                    i2Var.p(f.b(hVar.getHandle()), 0);
                    this.reader.Z(hVar.getHandle());
                    i1();
                    this.reader.e0();
                } else if (!linkedHashSet.contains(hVar)) {
                    if (i17 < size) {
                        r2.h hVar2 = listF.get(i17);
                        if (hVar2 != hVar) {
                            int i18 = i2Var.i(hVar2);
                            linkedHashSet.add(hVar2);
                            if (i18 != iQ) {
                                int iQ2 = i2Var.q(hVar2);
                                this.changeListWriter.y(i18 + i2Var.getStartIndex(), iQ + i2Var.getStartIndex(), iQ2);
                                i2Var.l(i18, iQ, iQ2);
                            }
                        } else {
                            i16++;
                        }
                        i17++;
                        iQ += i2Var.q(hVar2);
                        listB = listB;
                        listF = listF;
                    }
                }
                i16++;
            }
            this.changeListWriter.k();
            if (!listB.isEmpty()) {
                this.reader.f0();
            }
        }
        boolean inserting = getInserting();
        if (!inserting) {
            int i19 = this.nodeIndex;
            int i25 = this.reader.get_previousSibling();
            o oVarU0 = U0();
            int iM = this.reader.m();
            int[] groups = oVarU0.getAddressSpace().getGroups();
            while (true) {
                int i26 = iM;
                int i27 = i25;
                i25 = i26;
                if (i25 < 0) {
                    break;
                }
                m1(f.c(this.reader.getParent(), i27, i25));
                this.changeListWriter.L(i19, this.reader.T(i25));
                this.changeListWriter.k();
                iM = groups[i25 + 1];
            }
            this.changeListWriter.M(this.reader.m(), this.reader.B());
        }
        if (inserting) {
            if (isNode) {
                this.insertFixups.d();
                i15 = 1;
            }
            this.lastPlacedChildGroup = this.builder.getParent();
            this.reader.e();
            this.builder.i();
            if (!this.reader.s()) {
                long jT = this.builder.t();
                j1(jT);
                this.inserting = false;
                if (!U0().isEmpty()) {
                    long jT2 = g2.t(jT);
                    G1(jT2, 0);
                    H1(jT2, i15);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.z();
            }
            long jX = this.reader.x();
            if (i15 != L1(jX)) {
                H1(jX, i15);
            }
            int i28 = isNode ? 1 : i15;
            this.lastPlacedChildGroup = f.b(jX);
            this.reader.f();
            this.changeListWriter.k();
            i15 = i28;
        }
        P0(i15, inserting);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, m2.v3] */
    private final v3 I1(v3 parentScope, v3 currentProviders) {
        t2.f.a<z<Object>, o6<Object>> aVarBuilder2 = parentScope.builder2();
        aVarBuilder2.putAll(currentProviders);
        ?? Build2 = aVarBuilder2.build2();
        B1(204, t.i());
        J1(Build2);
        J1(currentProviders);
        J0();
        return Build2;
    }

    private final void J0() {
        I0(false);
    }

    private final void J1(Object value) {
        c1();
        K1(value);
    }

    private final void K0() {
        J0();
        this.parentContext.d();
        J0();
        R0();
        this.reader.d();
        this.forciblyRecompose = false;
        this.providersInvalid = g2.h(this.providersInvalidStack.g());
    }

    private final void L0() {
        if (this.builder.getIsClosed()) {
            r rVar = new r(this.slotTable.getAddressSpace(), this.slotTable.getRecordSourceInformation(), this.slotTable.getRecordCallByInformation());
            this.builder = rVar;
            rVar.f();
            this.builderHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final int L1(long virtualHandle) {
        int iE;
        if (g2.r(virtualHandle)) {
            h0 h0Var = this.nodeCountVirtualOverrides;
            if (h0Var != null) {
                return h0Var.e(f.b(virtualHandle), 0);
            }
            return 0;
        }
        g2.r(virtualHandle);
        int iB = f.b(virtualHandle);
        h0 h0Var2 = this.nodeCountOverrides;
        return (h0Var2 == null || (iE = h0Var2.e(iB, -1)) < 0) ? U0().getAddressSpace().getGroups()[iB + 4] & 8388607 : iE;
    }

    private final void M0(boolean isNode, i2 newPending) {
        e6.j(this.pendingStack, this.pending);
        this.pending = newPending;
        this.parentStateStack.i(this.groupNodeCount);
        this.parentStateStack.i(this.rGroupIndex);
        this.parentStateStack.i(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
        this.lastPlacedChildGroup = -1;
    }

    private final void M1() {
        if (!this.nodeExpected) {
            t.b("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void N0(f4 scope) {
        scope.P(this.compositionToken);
        this.observerHolder.a();
    }

    private final void N1() {
        if (this.nodeExpected) {
            t.b("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void O0() {
        r2.t tVarX = this.slotTable.X();
        try {
            s2.b.a(this.changes).e(j6.f122982a, tVarX, o2.f.f140683a, g0());
            i0 i0Var = i0.f148189a;
        } finally {
            tVarX.b();
        }
    }

    private final void P0(int expectedNodeCount, boolean inserting) {
        i2 i2Var = (i2) e6.i(this.pendingStack);
        if (i2Var != null && !inserting) {
            i2Var.n(i2Var.getGroupIndex() + 1);
        }
        this.pending = i2Var;
        this.nodeIndex = this.parentStateStack.g() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.g();
        this.groupNodeCount = this.parentStateStack.g() + expectedNodeCount;
    }

    private final l<u, i0> Q0(f4 scope) {
        this.observerHolder.a();
        return scope.f(this.compositionToken);
    }

    private final void R0() {
        this.changeListWriter.n();
        if (!e6.e(this.pendingStack)) {
            t.b("Start/end imbalance");
        }
        B0();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r1v2 */
    private final void V0(List<oq.r<s2, s2>> references) throws Throwable {
        s2.c cVar;
        s2.a aVar;
        s2.c cVar2;
        s2.a aVar2;
        o oVarF;
        o oVar;
        b0 b0VarY;
        b0 b0Var;
        b0 b0Var2;
        h0 h0Var;
        j0<v3> j0Var;
        s2.c cVar3;
        s2.a changeList;
        s2.c cVar4;
        s2.c cVar5;
        boolean implicitRootStart;
        s2.c cVar6;
        int i15;
        d dVar;
        d addressMode;
        long j15;
        d dVar2;
        long j16;
        i5 slotStorage;
        o oVarF2;
        i5 slotStorage2;
        b0 b0Var3;
        f2 f2Var = this;
        List<oq.r<s2, s2>> list = references;
        s2.c cVar7 = f2Var.changeListWriter;
        s2.a aVarA = s2.b.a(f2Var.lateChanges);
        s2.a changeList2 = cVar7.getChangeList();
        try {
            cVar7.R(aVarA);
            f2Var.changeListWriter.N();
            int size = list.size();
            boolean z15 = 0;
            int i16 = 0;
            final f2 f2Var2 = f2Var;
            while (i16 < size) {
                try {
                    oq.r<s2, s2> rVar = list.get(i16);
                    final s2 s2VarA = rVar.a();
                    s2 s2VarB = rVar.b();
                    long j17 = ((long) z15) << 32;
                    final long jE = (((long) oq.b0.e(r2.j.c(s2VarA.getAnchor()).getAddress())) & BodyPartID.bodyIdMax) | j17;
                    IntRef intRef = new IntRef(z15, 1, null);
                    f2Var2.changeListWriter.g(intRef, jE);
                    if (s2VarB == null) {
                        o oVarF3 = a0.f(s2VarA.getSlotStorage());
                        if (t.c(oVarF3, f2Var2.builder.getTable())) {
                            f2Var2.s1(z15);
                        }
                        final b0 b0VarY2 = oVarF3.Y();
                        try {
                            b0VarY2.Z(jE);
                            final s2.a aVar3 = new s2.a();
                            er.a aVar4 = new er.a() { // from class: m2.a2
                                @Override // er.a
                                public final Object a() {
                                    return f2.W0(this.f122783a, aVar3, b0VarY2, jE, s2VarA);
                                }
                            };
                            b0Var3 = b0VarY2;
                            f2Var2 = this;
                            try {
                                g1(f2Var2, null, null, 0, null, aVar4, 15, null);
                                f2Var2.changeListWriter.s(aVar3, intRef);
                                i0 i0Var = i0.f148189a;
                                b0Var3.d();
                                cVar2 = cVar7;
                                aVar2 = changeList2;
                                i15 = size;
                            } catch (Throwable th4) {
                                th = th4;
                                b0Var3.d();
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            b0Var3 = b0VarY2;
                        }
                    } else {
                        r2 r2VarQ = f2Var2.parentContext.q(s2VarB);
                        if (r2VarQ == null || (slotStorage2 = r2VarQ.getSlotStorage()) == null || (oVarF = a0.f(slotStorage2)) == null) {
                            oVarF = a0.f(s2VarB.getSlotStorage());
                        }
                        int address = (r2VarQ == null || (slotStorage = r2VarQ.getSlotStorage()) == null || (oVarF2 = a0.f(slotStorage)) == null) ? r2.j.c(s2VarB.getAnchor()).getAddress() : oVarF2.getRoot();
                        List<? extends Object> listL = g2.l(oVarF, address);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (listL.isEmpty()) {
                                                                                        oVar = oVarF;
                                                                                    } else {
                                                                                        f2Var2.changeListWriter.d(listL, intRef);
                                                                                        oVar = oVarF;
                                                                                        if (t.c(s2VarA.getSlotStorage(), f2Var2.slotTable)) {
                                                                                            f2Var2.G1(j17 | (((long) oq.b0.e(r2.j.c(s2VarA.getAnchor()).getAddress())) & BodyPartID.bodyIdMax), f2Var2.L1(j17 | (((long) oq.b0.e(r2.j.c(s2VarA.getAnchor()).getAddress())) & BodyPartID.bodyIdMax)) + listL.size());
                                                                                        }
                                                                                        f2Var2.changeListWriter.e(r2VarQ, f2Var2.parentContext, s2VarB, s2VarA);
                                                                                        b0VarY = oVar.Y();
                                                                                        b0Var2 = f2Var2.reader;
                                                                                        h0Var = f2Var2.nodeCountOverrides;
                                                                                        j0Var = f2Var2.providerUpdates;
                                                                                        f2Var2.nodeCountOverrides = null;
                                                                                        f2Var2.providerUpdates = null;
                                                                                        f2Var2.reader = b0VarY;
                                                                                        b0VarY.Y(address);
                                                                                        s2.a aVar5 = new s2.a();
                                                                                        cVar3 = f2Var2.changeListWriter;
                                                                                        changeList = cVar3.getChangeList();
                                                                                        cVar3.R(aVar5);
                                                                                        b0Var = b0VarY;
                                                                                        cVar5 = f2Var2.changeListWriter;
                                                                                        implicitRootStart = cVar5.getImplicitRootStart();
                                                                                        cVar5.S(false);
                                                                                        cVar6 = f2Var2.changeListWriter;
                                                                                        i15 = size;
                                                                                        j0Var = j0Var;
                                                                                        cVar6.editorCurrentPosition = f2Var2.reader.I();
                                                                                        dVar = d.RelativeAddressing;
                                                                                        addressMode = cVar6.getAddressMode();
                                                                                        j15 = cVar6.editorCurrentPosition;
                                                                                        cVar6.Q(dVar);
                                                                                        s2VarB.j();
                                                                                        l0 composition = s2VarB.getComposition();
                                                                                        l0 composition2 = s2VarA.getComposition();
                                                                                        int iM = f2Var2.reader.m();
                                                                                        List<oq.r<f4, Object>> listD = s2VarB.d();
                                                                                        er.a aVar6 = new er.a() { // from class: m2.b2
                                                                                            @Override // er.a
                                                                                            public final Object a() {
                                                                                                return f2.X0(this.f122810a, s2VarA);
                                                                                            }
                                                                                        };
                                                                                        s2.a aVar7 = changeList2;
                                                                                        cVar4 = cVar3;
                                                                                        aVar2 = aVar7;
                                                                                        cVar2 = cVar7;
                                                                                        dVar2 = addressMode;
                                                                                        f2Var2.f1(composition, composition2, iM, listD, aVar6);
                                                                                        cVar6.Q(dVar2);
                                                                                        if (dVar2 == dVar) {
                                                                                            j16 = j15;
                                                                                        } else {
                                                                                            j16 = -1;
                                                                                        }
                                                                                        cVar6.editorCurrentPosition = j16;
                                                                                        cVar5.S(implicitRootStart);
                                                                                        cVar4.R(changeList);
                                                                                        f2Var2.changeListWriter.s(aVar5, intRef);
                                                                                        i0 i0Var2 = i0.f148189a;
                                                                                        f2Var2.reader = b0Var2;
                                                                                        f2Var2.nodeCountOverrides = h0Var;
                                                                                        f2Var2.providerUpdates = j0Var;
                                                                                        b0Var.d();
                                                                                        f2Var2.changeListWriter.h(r2VarQ);
                                                                                    }
                                                                                    b0Var.d();
                                                                                    f2Var2.changeListWriter.h(r2VarQ);
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    aVar = aVar2;
                                                                                    cVar = cVar2;
                                                                                    cVar.R(aVar);
                                                                                    throw th;
                                                                                }
                                                                                f2Var2.reader = b0Var2;
                                                                                f2Var2.nodeCountOverrides = h0Var;
                                                                                f2Var2.providerUpdates = j0Var;
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                b0Var.d();
                                                                                throw th;
                                                                            }
                                                                            cVar4.R(changeList);
                                                                            f2Var2.changeListWriter.s(aVar5, intRef);
                                                                            i0 i0Var3 = i0.f148189a;
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                            j0Var = j0Var;
                                                                            h0Var = h0Var;
                                                                            f2Var2.reader = b0Var2;
                                                                            f2Var2.nodeCountOverrides = h0Var;
                                                                            f2Var2.providerUpdates = j0Var;
                                                                            throw th;
                                                                        }
                                                                        cVar5.S(implicitRootStart);
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                        j0Var = j0Var;
                                                                        h0Var = h0Var;
                                                                        try {
                                                                            cVar4.R(changeList);
                                                                            throw th;
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            f2Var2.reader = b0Var2;
                                                                            f2Var2.nodeCountOverrides = h0Var;
                                                                            f2Var2.providerUpdates = j0Var;
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    cVar6.Q(dVar2);
                                                                    if (dVar2 == dVar) {
                                                                        j16 = j15;
                                                                    } else {
                                                                        j16 = -1;
                                                                    }
                                                                    cVar6.editorCurrentPosition = j16;
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    j0Var = j0Var;
                                                                    h0Var = h0Var;
                                                                    try {
                                                                        cVar5.S(implicitRootStart);
                                                                        throw th;
                                                                    } catch (Throwable th12) {
                                                                        th = th12;
                                                                        cVar4.R(changeList);
                                                                        throw th;
                                                                    }
                                                                }
                                                                f2Var2.f1(composition, composition2, iM, listD, aVar6);
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                h0Var = h0Var;
                                                                try {
                                                                    cVar6.Q(dVar2);
                                                                    cVar6.editorCurrentPosition = dVar2 == d.RelativeAddressing ? j15 : -1L;
                                                                    throw th;
                                                                } catch (Throwable th14) {
                                                                    th = th14;
                                                                    cVar5.S(implicitRootStart);
                                                                    throw th;
                                                                }
                                                            }
                                                            l0 composition3 = s2VarA.getComposition();
                                                            int iM2 = f2Var2.reader.m();
                                                            List<oq.r<f4, Object>> listD2 = s2VarB.d();
                                                            er.a aVar8 = new er.a() { // from class: m2.b2
                                                                @Override // er.a
                                                                public final Object a() {
                                                                    return f2.X0(this.f122810a, s2VarA);
                                                                }
                                                            };
                                                            s2.a aVar9 = changeList2;
                                                            cVar4 = cVar3;
                                                            aVar2 = aVar9;
                                                            cVar2 = cVar7;
                                                            dVar2 = addressMode;
                                                        } catch (Throwable th15) {
                                                            th = th15;
                                                            h0Var = h0Var;
                                                            dVar2 = addressMode;
                                                            cVar4 = cVar3;
                                                        }
                                                        l0 composition4 = s2VarB.getComposition();
                                                    } catch (Throwable th16) {
                                                        th = th16;
                                                        h0Var = h0Var;
                                                        dVar2 = addressMode;
                                                        cVar4 = cVar3;
                                                    }
                                                    s2VarB.j();
                                                } catch (Throwable th17) {
                                                    th = th17;
                                                    dVar2 = addressMode;
                                                    cVar4 = cVar3;
                                                    h0Var = h0Var;
                                                }
                                                cVar6.editorCurrentPosition = f2Var2.reader.I();
                                                dVar = d.RelativeAddressing;
                                                addressMode = cVar6.getAddressMode();
                                                j15 = cVar6.editorCurrentPosition;
                                                cVar6.Q(dVar);
                                            } catch (Throwable th18) {
                                                th = th18;
                                                h0Var = h0Var;
                                                j0Var = j0Var;
                                                cVar4 = cVar3;
                                                cVar5.S(implicitRootStart);
                                                throw th;
                                            }
                                            cVar5.S(false);
                                            cVar6 = f2Var2.changeListWriter;
                                            i15 = size;
                                            j0Var = j0Var;
                                        } catch (Throwable th19) {
                                            th = th19;
                                        }
                                        cVar5 = f2Var2.changeListWriter;
                                        implicitRootStart = cVar5.getImplicitRootStart();
                                    } catch (Throwable th20) {
                                        th = th20;
                                        cVar4 = cVar3;
                                        cVar4.R(changeList);
                                        throw th;
                                    }
                                    cVar3.R(aVar5);
                                    b0Var = b0VarY;
                                } catch (Throwable th21) {
                                    th = th21;
                                    b0Var = b0VarY;
                                }
                                f2Var2.reader = b0VarY;
                                b0VarY.Y(address);
                                s2.a aVar10 = new s2.a();
                                cVar3 = f2Var2.changeListWriter;
                                changeList = cVar3.getChangeList();
                            } catch (Throwable th22) {
                                th = th22;
                                b0Var = b0VarY;
                            }
                            b0Var2 = f2Var2.reader;
                            h0Var = f2Var2.nodeCountOverrides;
                            j0Var = f2Var2.providerUpdates;
                            f2Var2.nodeCountOverrides = null;
                            f2Var2.providerUpdates = null;
                        } catch (Throwable th23) {
                            th = th23;
                            b0Var = b0VarY;
                        }
                        f2Var2.changeListWriter.e(r2VarQ, f2Var2.parentContext, s2VarB, s2VarA);
                        b0VarY = oVar.Y();
                    }
                    i16++;
                    list = references;
                    changeList2 = aVar2;
                    size = i15;
                    cVar7 = cVar2;
                    z15 = 0;
                    f2Var2 = f2Var2;
                } catch (Throwable th24) {
                    th = th24;
                    cVar2 = cVar7;
                    aVar2 = changeList2;
                }
            }
            s2.c cVar8 = cVar7;
            s2.a aVar11 = changeList2;
            f2Var2.s1(z15);
            f2Var2.changeListWriter.j();
            cVar8.R(aVar11);
        } catch (Throwable th25) {
            th = th25;
            cVar = cVar7;
            aVar = changeList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W0(f2 f2Var, s2.a aVar, b0 b0Var, long j15, s2 s2Var) {
        long j16;
        s2.c cVar = f2Var.changeListWriter;
        s2.a changeList = cVar.getChangeList();
        try {
            cVar.R(aVar);
            b0 b0Var2 = f2Var.reader;
            h0 h0Var = f2Var.nodeCountOverrides;
            j0<v3> j0Var = f2Var.providerUpdates;
            f2Var.nodeCountOverrides = null;
            f2Var.providerUpdates = null;
            try {
                f2Var.reader = b0Var;
                s2.c cVar2 = f2Var.changeListWriter;
                boolean implicitRootStart = cVar2.getImplicitRootStart();
                try {
                    cVar2.S(false);
                    s2.c cVar3 = f2Var.changeListWriter;
                    cVar3.editorCurrentPosition = j15;
                    d dVar = d.RelativeAddressing;
                    d addressMode = cVar3.getAddressMode();
                    long j17 = cVar3.editorCurrentPosition;
                    cVar3.Q(dVar);
                    try {
                        j16 = j17;
                        try {
                            f2Var.Y0(s2Var.c(), s2Var.getLocals(), s2Var.getParameter(), true);
                            cVar3.Q(addressMode);
                            cVar3.editorCurrentPosition = addressMode == dVar ? j16 : -1L;
                            cVar2.S(implicitRootStart);
                            i0 i0Var = i0.f148189a;
                            f2Var.reader = b0Var2;
                            f2Var.nodeCountOverrides = h0Var;
                            f2Var.providerUpdates = j0Var;
                            cVar.R(changeList);
                            return i0.f148189a;
                        } catch (Throwable th4) {
                            th = th4;
                            cVar3.Q(addressMode);
                            cVar3.editorCurrentPosition = addressMode == d.RelativeAddressing ? j16 : -1L;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        j16 = j17;
                    }
                } catch (Throwable th6) {
                    cVar2.S(implicitRootStart);
                    throw th6;
                }
            } catch (Throwable th7) {
                f2Var.reader = b0Var2;
                f2Var.nodeCountOverrides = h0Var;
                f2Var.providerUpdates = j0Var;
                throw th7;
            }
        } catch (Throwable th8) {
            cVar.R(changeList);
            throw th8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X0(f2 f2Var, s2 s2Var) {
        f2Var.Y0(s2Var.c(), s2Var.getLocals(), s2Var.getParameter(), true);
        return i0.f148189a;
    }

    private final void Y0(final o2<Object> content, v3 locals, final Object parameter, boolean force) {
        J(126665345, content);
        J1(parameter);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        try {
            this.compositeKeyHashCode = 126665345;
            if (getInserting()) {
                this.builder.b(268435456);
            }
            boolean z15 = false;
            if (!getInserting() && !t.c(this.reader.n(), locals)) {
                z15 = true;
            }
            if (z15) {
                k1(locals);
            }
            A1(202, t.f(), o2.c.INSTANCE.a(), locals);
            this.providerCache = null;
            if (!getInserting() || force) {
                boolean z16 = this.providersInvalid;
                this.providersInvalid = z15;
                this.changeListWriter.O(this.reader.I(), true);
                s2.c cVar = this.changeListWriter;
                cVar.editorCurrentPosition = -1L;
                d dVar = d.AnchorAddressing;
                d addressMode = cVar.getAddressMode();
                long j15 = cVar.editorCurrentPosition;
                cVar.Q(dVar);
                try {
                    n.a(this, y2.m.b(-1241221479, true, new p() { // from class: m2.d2
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f2.Z0(content, parameter, (r) obj, ((Integer) obj2).intValue());
                        }
                    }));
                    cVar.Q(addressMode);
                    cVar.editorCurrentPosition = addressMode == d.RelativeAddressing ? j15 : -1L;
                    this.providersInvalid = z16;
                } catch (Throwable th4) {
                    cVar.Q(addressMode);
                    cVar.editorCurrentPosition = addressMode == d.RelativeAddressing ? j15 : -1L;
                    throw th4;
                }
            } else {
                this.builderHasAProvider = true;
                r rVar = this.builder;
                this.parentContext.n(new s2(content, parameter, getComposition(), this.builder.getTable(), this.builder.getTable().getAddressSpace().d(rVar.v(rVar.getParent())), v.n(), D0(), null));
            }
            J0();
            this.providerCache = null;
            this.compositeKeyHashCode = compositeKeyHashCode;
            U();
        } catch (Throwable th5) {
            try {
                throw e3.e.b(th5, new er.a() { // from class: m2.e2
                    @Override // er.a
                    public final Object a() {
                        return f2.a1(this.f122880a);
                    }
                });
            } catch (Throwable th6) {
                J0();
                this.providerCache = null;
                this.compositeKeyHashCode = compositeKeyHashCode;
                U();
                throw th6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z0(o2 o2Var, Object obj, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1241221479, i15, -1, "androidx.compose.runtime.LinkComposer.invokeMovableContentLambda.<anonymous>.<anonymous> (LinkComposer.kt:2031)");
            }
            o2Var.a().w(obj, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e3.a a1(f2 f2Var) {
        return f2Var.F0();
    }

    private final boolean b1(long group) {
        long jI = this.reader.I();
        return jI == -1 || g2.p(U0(), group, jI) == jI;
    }

    private final int e1(int group) {
        int iU = this.reader.U(group);
        int[] groups = U0().getAddressSpace().getGroups();
        int i15 = 0;
        for (int root = iU < 0 ? U0().getRoot() : this.reader.h(iU); root >= 0 && root != group; root = groups[root + 1]) {
            if (!this.reader.J(root)) {
                i15++;
            }
        }
        return i15;
    }

    private final <R> R f1(l0 from, l0 to4, int address, List<? extends oq.r<f4, ? extends Object>> invalidations, er.a<? extends R> block) {
        R rA;
        boolean isComposing = getIsComposing();
        int i15 = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i16 = 0; i16 < size; i16++) {
                oq.r<f4, ? extends Object> rVar = invalidations.get(i16);
                f4 f4VarA = rVar.a();
                Object objB = rVar.b();
                if (objB != null) {
                    o0(f4VarA, objB);
                } else {
                    o0(f4VarA, null);
                }
            }
            if (from == null || (rA = (R) from.f(to4, address, block)) == null) {
                rA = block.a();
            }
            return rA;
        } finally {
            this.isComposing = isComposing;
            this.nodeIndex = i15;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object g1(f2 f2Var, l0 l0Var, l0 l0Var2, int i15, List list, er.a aVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            l0Var = null;
        }
        if ((i16 & 2) != 0) {
            l0Var2 = null;
        }
        if ((i16 & 4) != 0) {
            i15 = -1;
        }
        if ((i16 & 8) != 0) {
            list = v.n();
        }
        return f2Var.f1(l0Var, l0Var2, i15, list, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0277 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0188  */
    /* JADX WARN: Code duplicated, block: B:54:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x019b  */
    /* JADX WARN: Code duplicated, block: B:58:0x019e  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x026b  */
    private final void h1() {
        long j15;
        char c15;
        int i15;
        int iH;
        int i16;
        int iU;
        int i17;
        long compositeKeyHashCode;
        int iL1;
        int i18;
        long jRotateLeft;
        long j16;
        int i19;
        boolean isComposing = getIsComposing();
        int i25 = 1;
        this.isComposing = true;
        b0 b0Var = this.reader;
        int parent = b0Var.getParent();
        int i26 = this.nodeIndex;
        long compositeKeyHashCode2 = getCompositeKeyHashCode();
        int i27 = this.groupNodeCount;
        int i28 = this.rGroupIndex;
        int iH2 = b0Var.h(parent);
        int i29 = 0;
        loop0: while (true) {
            int i35 = i25;
            int i36 = -1;
            if (iH2 == -1) {
                i26 = i26;
                compositeKeyHashCode2 = compositeKeyHashCode2;
                j15 = BodyPartID.bodyIdMax;
                c15 = ' ';
                break;
            }
            if (b0Var.V(iH2)) {
                b0Var.Y(iH2);
                j15 = BodyPartID.bodyIdMax;
                f4 f4VarQ1 = q1(iH2);
                if (f4VarQ1.x(g.h(this.invalidations, f4VarQ1))) {
                    this.providerCache = null;
                    e1(iH2);
                    f4VarQ1.e(this);
                    this.providerCache = null;
                    i29 = i35;
                    i15 = i29;
                } else {
                    e6.j(this.invalidateStack, f4VarQ1);
                    this.observerHolder.a();
                    f4VarQ1.B();
                    e6.i(this.invalidateStack);
                }
                iH = b0Var.h(iH2);
                c15 = ' ';
                if (i15 == 0 || iH == -1) {
                    i26 = i26;
                    compositeKeyHashCode2 = compositeKeyHashCode2;
                    i16 = i29;
                    i15 = i15;
                } else {
                    boolean zK = b0Var.K(iH2);
                    if (zK) {
                        if (b0Var.H(iH2) instanceof o2) {
                            i16 = i29;
                            this.compositeKeyHashCode = 126665345;
                            i26 = i26;
                            compositeKeyHashCode2 = compositeKeyHashCode2;
                            i15 = i15;
                        } else {
                            i16 = i29;
                            int iF = b0Var.F(iH2);
                            int i37 = this.rGroupIndex;
                            Object objH = b0Var.H(iH2);
                            Object objE = b0Var.E(iH2);
                            if (objH != null) {
                                if (objH instanceof Enum) {
                                    jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) ((Enum) objH).ordinal()), 3);
                                    i18 = 0;
                                } else {
                                    i18 = 0;
                                    jRotateLeft = Long.rotateLeft(((long) objH.hashCode()) ^ Long.rotateLeft(getCompositeKeyHashCode(), 3), 3);
                                }
                                j16 = i18;
                            } else if (objE == null || iF != 207 || t.c(objE, r.INSTANCE.a())) {
                                jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) iF), 3);
                                j16 = i37;
                            } else {
                                int iHashCode = objE.hashCode();
                                i15 = i15;
                                i26 = i26;
                                compositeKeyHashCode2 = compositeKeyHashCode2;
                                this.compositeKeyHashCode = ((long) i37) ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) iHashCode), 3);
                            }
                            this.compositeKeyHashCode = jRotateLeft ^ j16;
                        }
                        this.parentStateStack.i(this.nodeIndex);
                        this.parentStateStack.i(this.rGroupIndex);
                        if (b0Var.P(iH2)) {
                            this.changeListWriter.w(b0Var.S(iH2));
                            i19 = 0;
                            this.nodeIndex = 0;
                        } else {
                            i19 = 0;
                        }
                        this.rGroupIndex = i19;
                    } else {
                        i26 = i26;
                        compositeKeyHashCode2 = compositeKeyHashCode2;
                        i16 = i29;
                        i15 = i15;
                        this.nodeIndex += b0Var.P(iH2) ? i35 : L1((((long) 0) << 32) | (((long) oq.b0.e(iH2)) & j15));
                        if (!b0Var.J(iH2)) {
                            this.rGroupIndex++;
                        }
                    }
                    if (zK) {
                        iH2 = iH;
                    } else {
                        i36 = -1;
                    }
                    i25 = i35;
                    i29 = i16;
                    i26 = i26;
                    compositeKeyHashCode2 = compositeKeyHashCode2;
                }
                if (iH == i36 && i15 == 0) {
                    int i38 = this.nodeIndex;
                    if (b0Var.P(iH2)) {
                        iL1 = i35;
                    } else {
                        iL1 = L1((((long) 0) << 32) | (((long) oq.b0.e(iH2)) & j15));
                    }
                    this.nodeIndex = i38 + iL1;
                    if (!b0Var.J(iH2)) {
                        this.rGroupIndex++;
                    }
                }
                int i39 = iH2;
                iH2 = b0Var.R(iH2);
                iU = i39;
                while (iH2 == -1) {
                    iU = b0Var.U(iU);
                    if (iU != -1 || iU == parent) {
                        i29 = i16;
                        break loop0;
                    }
                    if (b0Var.P(iU)) {
                        this.changeListWriter.z();
                    }
                    this.rGroupIndex = this.parentStateStack.g();
                    long j17 = 0;
                    this.nodeIndex = this.parentStateStack.g() + L1((j17 << 32) | (((long) oq.b0.e(iU)) & j15));
                    int iF2 = b0Var.F(iU);
                    int i45 = this.rGroupIndex;
                    Object objH2 = b0Var.H(iU);
                    Object objE2 = b0Var.E(iU);
                    if (objH2 == null) {
                        if (objE2 == null || iF2 != 207 || t.c(objE2, r.INSTANCE.a())) {
                            i17 = 3;
                            compositeKeyHashCode = getCompositeKeyHashCode() ^ ((long) i45);
                        } else {
                            this.compositeKeyHashCode = Long.rotateRight(((long) objE2.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i45), 3), 3);
                        }
                        if (!b0Var.J(iU)) {
                            this.rGroupIndex++;
                        }
                        iH2 = b0Var.R(iU);
                    } else {
                        i17 = 3;
                        iF2 = objH2 instanceof Enum ? ((Enum) objH2).ordinal() : objH2.hashCode();
                        compositeKeyHashCode = j17 ^ getCompositeKeyHashCode();
                    }
                    this.compositeKeyHashCode = Long.rotateRight(((long) iF2) ^ Long.rotateRight(compositeKeyHashCode, i17), i17);
                    if (!b0Var.J(iU)) {
                        this.rGroupIndex++;
                    }
                    iH2 = b0Var.R(iU);
                }
                i25 = i35;
                i29 = i16;
                i26 = i26;
                compositeKeyHashCode2 = compositeKeyHashCode2;
            } else {
                j15 = BodyPartID.bodyIdMax;
            }
            i15 = 0;
            iH = b0Var.h(iH2);
            c15 = ' ';
            if (i15 == 0) {
                i26 = i26;
                compositeKeyHashCode2 = compositeKeyHashCode2;
                i16 = i29;
                i15 = i15;
                if (iH == i36) {
                    int i310 = this.nodeIndex;
                    if (b0Var.P(iH2)) {
                        iL1 = i35;
                    } else {
                        iL1 = L1((((long) 0) << 32) | (((long) oq.b0.e(iH2)) & j15));
                    }
                    this.nodeIndex = i310 + iL1;
                    if (!b0Var.J(iH2)) {
                        this.rGroupIndex++;
                    }
                }
                int i311 = iH2;
                iH2 = b0Var.R(iH2);
                iU = i311;
                while (true) {
                    iU = b0Var.U(iU);
                    if (iU != -1) {
                    }
                    i29 = i16;
                    iH2 = b0Var.R(iU);
                }
            } else {
                i26 = i26;
                compositeKeyHashCode2 = compositeKeyHashCode2;
                i16 = i29;
                i15 = i15;
                if (iH == i36) {
                    int i312 = this.nodeIndex;
                    if (b0Var.P(iH2)) {
                        iL1 = i35;
                    } else {
                        iL1 = L1((((long) 0) << 32) | (((long) oq.b0.e(iH2)) & j15));
                    }
                    this.nodeIndex = i312 + iL1;
                    if (!b0Var.J(iH2)) {
                        this.rGroupIndex++;
                    }
                }
                int i313 = iH2;
                iH2 = b0Var.R(iH2);
                iU = i313;
                while (true) {
                    iU = b0Var.U(iU);
                    if (iU != -1) {
                    }
                    i29 = i16;
                    iH2 = b0Var.R(iU);
                }
            }
            i25 = i35;
            i29 = i16;
            i26 = i26;
            compositeKeyHashCode2 = compositeKeyHashCode2;
        }
        b0Var.a0(parent);
        if (i29 != 0) {
            b0Var.f0();
            int iL2 = L1((((long) 0) << c15) | (((long) oq.b0.e(parent)) & j15));
            this.nodeIndex = i26 + iL2;
            this.groupNodeCount = i27 + iL2;
            this.rGroupIndex = i28;
        } else {
            x1();
        }
        this.compositeKeyHashCode = compositeKeyHashCode2;
        this.isComposing = isComposing;
    }

    private final void i1() {
        m1(this.reader.I());
        this.changeListWriter.K();
    }

    private final void j1(long source) {
        if (this.insertFixups.f()) {
            this.changeListWriter.t(this.builder.getTable(), source);
        } else {
            this.changeListWriter.u(this.builder.getTable(), source, this.insertFixups);
            this.insertFixups = new e();
        }
    }

    private final void k1(v3 providers) {
        j0<v3> j0Var = this.providerUpdates;
        if (j0Var == null) {
            j0Var = new j0<>(0, 1, null);
            this.providerUpdates = j0Var;
        }
        j0Var.r(this.reader.m(), providers);
    }

    private final void l1() {
        if (this.slotTable.A(PKIFailureInfo.duplicateCertReq)) {
            getComposition().e0();
            s2.a aVar = new s2.a();
            t1(aVar);
            b0 b0VarY = this.slotTable.Y();
            try {
                this.reader = b0VarY;
                s2.c cVar = this.changeListWriter;
                s2.a changeList = cVar.getChangeList();
                try {
                    cVar.R(aVar);
                    m1(b0VarY.b0());
                    cVar.R(changeList);
                    i0 i0Var = i0.f148189a;
                    b0VarY.d();
                } catch (Throwable th4) {
                    cVar.R(changeList);
                    throw th4;
                }
            } catch (Throwable th5) {
                b0VarY.d();
                throw th5;
            }
        }
    }

    private final void m1(long groupBeingRemoved) {
        int iB = f.b(groupBeingRemoved);
        boolean z15 = (this.reader.i(iB) & 8388608) == 8388608;
        if (z15) {
            this.changeListWriter.k();
            this.changeListWriter.w(this.reader.S(iB));
        }
        p1(this, groupBeingRemoved, z15, 0);
        this.changeListWriter.k();
        if (z15) {
            this.changeListWriter.z();
        }
    }

    private static final s2 n1(f2 f2Var, int i15, List<s2> list) {
        o2 o2Var = (o2) f2Var.reader.H(i15);
        Object objK = f2Var.reader.k(i15, 0);
        List<oq.r<f4, Object>> listN = g2.n(f2Var.reader, i15, f2Var.invalidations);
        return new s2(o2Var, objK, f2Var.getComposition(), f2Var.U0(), f2Var.U0().getAddressSpace().d(i15), listN, f2Var.E0(i15), list);
    }

    private static final s2 o1(f2 f2Var, int i15) {
        boolean z15;
        int i16 = f2Var.reader.i(i15);
        List listA = null;
        if ((i16 & 268435456) != 268435456) {
            return null;
        }
        if ((i16 & PKIFailureInfo.duplicateCertReq) == 536870912) {
            List listC = v.c();
            b0 b0Var = f2Var.reader;
            int iH = b0Var.h(i15);
            loop0: while (iH != -1) {
                if ((f2Var.reader.i(iH) & 268435456) == 268435456) {
                    s2 s2VarO1 = o1(f2Var, iH);
                    if (s2VarO1 != null) {
                        listC.add(s2VarO1);
                    }
                    z15 = true;
                } else {
                    z15 = false;
                }
                int iH2 = b0Var.h(iH);
                if (z15 || iH2 == -1 || (f2Var.reader.i(iH) & PKIFailureInfo.duplicateCertReq) != 536870912) {
                    int iU = iH;
                    iH = b0Var.R(iH);
                    while (iH == -1) {
                        iU = b0Var.U(iU);
                        if (iU == -1 || iU == i15) {
                            break loop0;
                        }
                        iH = b0Var.R(iU);
                    }
                } else {
                    iH = iH2;
                }
            }
            listA = v.a(listC);
        }
        return n1(f2Var, i15, listA);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a A[PHI: r0
      0x004a: PHI (r0v5 int) = (r0v2 int), (r0v4 int), (r0v9 int) binds: [B:64:0x0134, B:34:0x00a3, B:13:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    private static final int p1(f2 f2Var, long j15, boolean z15, int i15) {
        int i16;
        int iB = f.b(j15);
        int i17 = 0;
        if (iB < 0) {
            return 0;
        }
        int i18 = f2Var.reader.i(iB);
        if ((i18 & 268435456) == 268435456) {
            s2 s2VarO1 = o1(f2Var, iB);
            if (s2VarO1 != null) {
                f2Var.parentContext.c(s2VarO1);
                f2Var.changeListWriter.H(f2Var.getComposition(), f2Var.parentContext, s2VarO1);
            }
            if (z15) {
                f2Var.changeListWriter.l(i15, iB);
            } else {
                i16 = f2Var.reader.i(iB);
                if ((i16 & 8388608) == 8388608) {
                    i17 = 1;
                } else {
                    i17 = i16 & 8388607;
                }
            }
        } else if ((i18 & 1073741824) == 1073741824) {
            Object objK = f2Var.reader.k(iB, 0);
            v4 v4Var = objK instanceof v4 ? (v4) objK : null;
            u4 wrapped = v4Var != null ? v4Var.getWrapped() : null;
            a aVar = wrapped instanceof a ? (a) wrapped : null;
            if (aVar != null) {
                for (f2 f2Var2 : aVar.getRef().B()) {
                    f2Var2.l1();
                    f2Var.parentContext.v(f2Var2.getComposition());
                }
            }
            i16 = f2Var.reader.i(iB);
            if ((i16 & 8388608) == 8388608) {
                i17 = 1;
            } else {
                i17 = i16 & 8388607;
            }
        } else if ((i18 & PKIFailureInfo.duplicateCertReq) == 536870912 || (i18 & PKIFailureInfo.systemUnavail) == Integer.MIN_VALUE) {
            b0 b0Var = f2Var.reader;
            long jE = (((long) (-1)) << 32) | (((long) oq.b0.e(b0Var.h(iB))) & BodyPartID.bodyIdMax);
            int iP1 = 0;
            for (int i19 = -1; f.b(jE) != i19; i19 = -1) {
                int iB2 = f.b(jE);
                int i25 = (f2Var.reader.i(iB2) & 8388608) == 8388608 ? 1 : i17;
                if (i25 != 0) {
                    f2Var.changeListWriter.k();
                    f2Var.changeListWriter.w(f2Var.reader.S(iB2));
                }
                iP1 += p1(f2Var, jE, i25 != 0 || z15, i25 != 0 ? 0 : i15 + iP1);
                if (i25 != 0) {
                    f2Var.changeListWriter.k();
                    f2Var.changeListWriter.z();
                }
                jE = (((long) f.b(jE)) << 32) | (((long) oq.b0.e(b0Var.R(f.b(jE)))) & BodyPartID.bodyIdMax);
                i17 = 0;
            }
            i17 = iP1;
        } else {
            i16 = f2Var.reader.i(iB);
            if ((i16 & 8388608) == 8388608) {
                i17 = 1;
            } else {
                i17 = i16 & 8388607;
            }
        }
        if ((i18 & 8388608) == 8388608) {
            return 1;
        }
        return i17;
    }

    private final f4 q1(int group) {
        Object objK = this.reader.k(group, 0);
        if (t.c(objK, r.INSTANCE.a())) {
            t.b("Cannot obtain RecomposeScope. Group does not have a corresponding slot.");
        }
        if (!(objK instanceof f4)) {
            t.b("Expected a RecomposeScope in the first non-utility slot, found " + objK + '.');
        }
        return (f4) objK;
    }

    private final boolean r1(int group) {
        return this.reader.K(group);
    }

    private final void s1(boolean dispose) {
        if (!this.builder.getIsClosed()) {
            o oVarD = this.builder.d();
            if (dispose) {
                oVarD.i();
            }
        }
        r rVar = new r(this.slotTable.getAddressSpace(), false, false);
        rVar.g();
        this.builder = rVar;
    }

    private final void w0() {
        B0();
        e6.a(this.pendingStack);
        this.parentStateStack.a();
        this.entersStack.a();
        this.providersInvalidStack.a();
        this.providerUpdates = null;
        this.insertFixups.a();
        this.compositeKeyHashCode = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getIsClosed()) {
            this.reader.d();
        }
        s1(false);
    }

    private final void w1() {
        this.groupNodeCount += this.reader.e0();
    }

    private final void x1() {
        this.groupNodeCount = this.reader.z();
        this.reader.f0();
    }

    private final List<ComposeStackTraceFrame> y1(int group, Integer dataOffset) {
        if (!getSourceMarkersEnabled()) {
            return v.n();
        }
        b0 b0VarY = this.slotTable.Y();
        try {
            return c0.b(b0VarY, group, dataOffset);
        } finally {
            b0VarY.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z1(Object obj, Object obj2) {
        if (obj2 == obj) {
            return true;
        }
        v4 v4Var = obj2 instanceof v4 ? (v4) obj2 : null;
        return (v4Var != null ? v4Var.getWrapped() : null) == obj;
    }

    @Override // p076m2.r
    public d4 A() {
        return e0();
    }

    @Override // p076m2.r
    public void B() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        I0(false);
    }

    @Override // p076m2.r
    public void C(int key) {
        A1(key, null, o2.c.INSTANCE.a(), null);
    }

    @Override // p076m2.r
    public void D(c4<?> value) {
        v3 v3VarD0 = D0();
        B1(201, t.h());
        Object objE = E();
        o6<?> o6Var = t.c(objE, r.INSTANCE.a()) ? null : (o6) objE;
        z<?> zVarB = value.b();
        o6<?> o6VarB = zVarB.b(value, o6Var);
        boolean zC = t.c(o6VarB, o6Var);
        if (!zC) {
            v(o6VarB);
        }
        boolean z15 = true;
        boolean z16 = false;
        if (getInserting()) {
            if (value.getCanOverride() || !f0.a(v3VarD0, zVarB)) {
                v3VarD0 = v3VarD0.n1(zVarB, o6VarB);
            }
            this.builderHasAProvider = true;
        } else {
            b0 b0Var = this.reader;
            v3 v3Var = (v3) b0Var.E(b0Var.m());
            if (!(i() && zC) && (value.getCanOverride() || !f0.a(v3VarD0, zVarB))) {
                v3VarD0 = v3VarD0.n1(zVarB, o6VarB);
            } else if ((zC && !this.providersInvalid) || !this.providersInvalid) {
                v3VarD0 = v3Var;
            }
            if (!this.reusing && v3Var == v3VarD0) {
                z15 = false;
            }
            z16 = z15;
        }
        if (z16 && !getInserting()) {
            k1(v3VarD0);
        }
        this.providersInvalidStack.i(g2.i(this.providersInvalid));
        this.providersInvalid = z16;
        this.providerCache = v3VarD0;
        A1(202, t.f(), o2.c.INSTANCE.a(), v3VarD0);
    }

    @Override // p076m2.r
    public Object E() {
        return E1(d1());
    }

    @Override // p076m2.r
    public h F() {
        h hVar = this._compositionData;
        if (hVar != null) {
            return hVar;
        }
        h2 h2Var = new h2(getComposition());
        this._compositionData = h2Var;
        return h2Var;
    }

    public final void F1(Object value) {
        boolean z15 = value instanceof u4;
        Object obj = value;
        if (z15) {
            j2 j2Var = new j2((u4) value, U0().getAddressSpace().d(this.lastPlacedChildGroup));
            if (getInserting()) {
                this.changeListWriter.I(j2Var);
            }
            this.abandonSet.add(value);
            obj = j2Var;
        }
        K1(obj);
    }

    @Override // p076m2.r
    public boolean G(Object value) {
        if (c1() == value) {
            return false;
        }
        K1(value);
        return true;
    }

    @Override // p076m2.r
    public <T> void H(er.a<? extends T> factory) {
        M1();
        if (!getInserting()) {
            t.b("createNode() can only be called when inserting");
        }
        int iC = this.parentStateStack.c();
        this.groupNodeCount++;
        long jL = this.builder.l();
        if (!this.changeListWriter.v()) {
            this.insertFixups.b(factory, iC, this.builder.l());
        } else {
            this.insertFixups.c(factory, iC, this.builder.getTable().getAddressSpace().d(f.b(jL)));
        }
    }

    @Override // p076m2.r
    public void I() {
        A1(-127, null, o2.c.INSTANCE.a(), null);
    }

    @Override // p076m2.r
    public void J(int key, Object dataKey) {
        A1(key, dataKey, o2.c.INSTANCE.a(), null);
    }

    @Override // p076m2.r
    public void K() {
        A1(125, null, o2.c.INSTANCE.c(), null);
        this.nodeExpected = true;
    }

    public final void K1(Object value) {
        if (getInserting()) {
            this.builder.c(value);
        } else if (this.reader.getHadNext()) {
            this.changeListWriter.Z(this.reader.v() - 1, value);
        } else {
            this.changeListWriter.c(value);
        }
    }

    @Override // p076m2.r
    public void L(d4 scope) {
        f4 f4Var = scope instanceof f4 ? (f4) scope : null;
        if (f4Var != null) {
            f4Var.O(true);
        }
    }

    @Override // p076m2.r
    public void M(int key, Object dataKey) {
        if (!getInserting() && this.reader.o() == key && !t.c(this.reader.n(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.m();
            this.reusing = true;
        }
        A1(key, null, o2.c.INSTANCE.a(), dataKey);
    }

    @Override // p076m2.r
    public <T> T N(z<T> key) {
        return (T) f0.b(D0(), key);
    }

    @Override // p076m2.r
    public void O() {
        if (!(this.groupNodeCount == 0)) {
            t.b("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        f4 f4VarE0 = e0();
        if (f4VarE0 != null) {
            f4VarE0.C();
        }
        if (this.reader.m() < 0 || !r1(this.reader.getParent())) {
            x1();
        } else {
            h1();
        }
    }

    @Override // p076m2.r
    public void P() {
        J0();
        J0();
        this.providersInvalid = g2.h(this.providersInvalidStack.g());
        this.providerCache = null;
    }

    @Override // p076m2.r
    public boolean Q() {
        f4 f4VarE0;
        return !i() || this.providersInvalid || ((f4VarE0 = e0()) != null && f4VarE0.k());
    }

    @Override // p076m2.r
    public void R() {
        J0();
    }

    /* JADX INFO: renamed from: S0, reason: from getter */
    public x getComposition() {
        return this.composition;
    }

    @Override // p076m2.r
    public v T() {
        B1(206, t.j());
        if (getInserting()) {
            this.builder.b(1073741824);
        }
        Object objC1 = c1();
        b5 a5Var = objC1 instanceof b5 ? (b5) objC1 : null;
        if (a5Var == null) {
            a5Var = new a5(new a(new b(getCompositeKeyHashCode(), this.forceRecomposeScopes, getSourceMarkersEnabled(), getComposition().getObserverHolder())), r2.j.e());
            K1(a5Var);
        }
        a aVar = (a) a5Var.getWrapped();
        aVar.getRef().E(D0());
        J0();
        return aVar.getRef();
    }

    /* JADX INFO: renamed from: T0, reason: from getter */
    public final b0 getReader() {
        return this.reader;
    }

    @Override // p076m2.r
    public void U() {
        J0();
    }

    public final o U0() {
        return this.reader.getTable();
    }

    @Override // p076m2.r
    public void V() {
        J0();
    }

    @Override // p076m2.r
    public boolean W(Object value) {
        if (t.c(c1(), value)) {
            return false;
        }
        K1(value);
        return true;
    }

    @Override // p076m2.r
    public void X(int key) {
        if (this.pending != null) {
            A1(key, null, o2.c.INSTANCE.a(), null);
            return;
        }
        N1();
        this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) key), 3) ^ ((long) this.rGroupIndex);
        this.rGroupIndex++;
        b0 b0Var = this.reader;
        if (getInserting()) {
            b0Var.c();
            r rVar = this.builder;
            r.Companion companion = r.INSTANCE;
            Object objA = companion.a();
            rVar.B(key, objA == companion.a() ? 0 : 16777216, objA, null, null);
            M0(false, null);
            return;
        }
        if (b0Var.o() == key && !b0Var.r()) {
            b0Var.g0();
            M0(false, null);
            return;
        }
        if (!b0Var.N()) {
            int i15 = this.nodeIndex;
            i1();
            this.changeListWriter.L(i15, b0Var.e0());
        }
        b0Var.c();
        this.inserting = true;
        this.providerCache = null;
        L0();
        r rVar2 = this.builder;
        r.Companion companion2 = r.INSTANCE;
        Object objA2 = companion2.a();
        rVar2.B(key, objA2 == companion2.a() ? 0 : 16777216, objA2, null, null);
        M0(false, null);
    }

    @Override // p076m2.q1
    public void Y() {
        this.providerUpdates = null;
    }

    @Override // p076m2.q1
    public void Z(t0<Object, Object> invalidationsRequested, p<? super r, ? super Integer, i0> content, e5 shouldPause) {
        if (!this.changes.c()) {
            t.b("Expected applyChanges() to have been called");
        }
        this.shouldPauseCallback = shouldPause;
        try {
            G0(invalidationsRequested, content);
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    @Override // p076m2.r
    public boolean a(boolean value) {
        Object objC1 = c1();
        if ((objC1 instanceof Boolean) && value == ((Boolean) objC1).booleanValue()) {
            return false;
        }
        K1(Boolean.valueOf(value));
        return true;
    }

    @Override // p076m2.q1
    public void a0() {
        e6.a(this.invalidateStack);
        g.c(this.invalidations);
        this.changes.a();
        this.providerUpdates = null;
    }

    @Override // p076m2.r
    public boolean b(float value) {
        Object objC1 = c1();
        if ((objC1 instanceof Float) && t.a(value, (Float) objC1)) {
            return false;
        }
        K1(Float.valueOf(value));
        return true;
    }

    @Override // p076m2.q1
    public void b0() {
        this.slotTable.i();
        this.parentContext.y(this);
        a0();
        l().clear();
        this.isDisposed = true;
    }

    @Override // p076m2.r
    public boolean c(int value) {
        Object objC1 = c1();
        if ((objC1 instanceof Integer) && value == ((Number) objC1).intValue()) {
            return false;
        }
        K1(Integer.valueOf(value));
        return true;
    }

    @Override // p076m2.q1
    public void c0() {
        int i15 = this.reusingGroup;
        if (!(!getIsComposing() && (i15 < 0 ? 100 : this.reader.F(i15)) == 100)) {
            w3.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    public final Object c1() {
        if (getInserting()) {
            N1();
            return r.INSTANCE.a();
        }
        Object objQ = this.reader.Q();
        return (!this.reusing || (objQ instanceof b5)) ? objQ : r.INSTANCE.a();
    }

    @Override // p076m2.r
    public boolean d(long value) {
        Object objC1 = c1();
        if ((objC1 instanceof Long) && value == ((Number) objC1).longValue()) {
            return false;
        }
        K1(Long.valueOf(value));
        return true;
    }

    @Override // p076m2.q1
    public boolean d0() {
        return this.childrenComposing > 0;
    }

    public final Object d1() {
        if (getInserting()) {
            N1();
            return r.INSTANCE.a();
        }
        Object objQ = this.reader.Q();
        if (this.reusing && !(objQ instanceof b5)) {
            return r.INSTANCE.a();
        }
        if (objQ instanceof v4) {
            this.changeListWriter.Y(g2.k((v4) objQ), U0().getAddressSpace().d(this.lastPlacedChildGroup));
        }
        return objQ;
    }

    @Override // p076m2.r
    public void e(c4<?>[] values) {
        v3 v3VarI1;
        v3 v3VarD0 = D0();
        B1(201, t.h());
        boolean z15 = true;
        boolean z16 = false;
        if (getInserting()) {
            v3VarI1 = I1(v3VarD0, f0.d(values, v3VarD0, null, 4, null));
            this.builderHasAProvider = true;
        } else {
            v3 v3Var = (v3) this.reader.j(0);
            v3 v3Var2 = (v3) this.reader.j(1);
            v3 v3VarC = f0.c(values, v3VarD0, v3Var2);
            if (i() && !this.reusing && t.c(v3Var2, v3VarC)) {
                w1();
                v3VarI1 = v3Var;
            } else {
                v3VarI1 = I1(v3VarD0, v3VarC);
                if (!this.reusing && t.c(v3VarI1, v3Var)) {
                    z15 = false;
                }
                z16 = z15;
            }
        }
        if (z16 && !getInserting()) {
            k1(v3VarI1);
        }
        this.providersInvalidStack.i(g2.i(this.providersInvalid));
        this.providersInvalid = z16;
        this.providerCache = v3VarI1;
        A1(202, t.f(), o2.c.INSTANCE.a(), v3VarI1);
    }

    @Override // p076m2.q1
    public f4 e0() {
        ArrayList<f4> arrayList = this.invalidateStack;
        if (this.childrenComposing == 0 && e6.f(arrayList)) {
            return (f4) e6.g(arrayList);
        }
        return null;
    }

    @Override // p076m2.r
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // p076m2.q1
    /* JADX INFO: renamed from: f0, reason: from getter */
    public i getDeferredChanges() {
        return this.deferredChanges;
    }

    @Override // p076m2.r
    public void g(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            t.b("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            x1();
        } else {
            this.changeListWriter.f();
            this.reader.f0();
        }
    }

    @Override // p076m2.q1
    public k g0() {
        if (getSourceMarkersEnabled()) {
            return this.errorContext;
        }
        return null;
    }

    @Override // p076m2.r
    public r h(int key) {
        X(key);
        A0();
        return this;
    }

    @Override // p076m2.q1
    /* JADX INFO: renamed from: h0, reason: from getter */
    public boolean getSourceMarkersEnabled() {
        return this.sourceMarkersEnabled;
    }

    @Override // p076m2.r
    public boolean i() {
        f4 f4VarE0;
        return (getInserting() || this.reusing || this.providersInvalid || (f4VarE0 = e0()) == null || f4VarE0.n() || this.forciblyRecompose) ? false : true;
    }

    @Override // p076m2.q1
    /* JADX INFO: renamed from: i0, reason: from getter */
    public boolean getIsComposing() {
        return this.isComposing;
    }

    @Override // p076m2.r
    public <V, T> void j(V value, p<? super T, ? super V, i0> block) {
        if (getInserting()) {
            this.insertFixups.g(value, block);
        } else {
            this.changeListWriter.X(value, block);
        }
    }

    @Override // p076m2.q1
    public List<ComposeStackTraceFrame> j0() {
        Integer numO;
        u uVarI = this.parentContext.i();
        x xVar = uVarI instanceof x ? (x) uVarI : null;
        if (xVar != null && (numO = g2.o(a0.f(xVar.getSlotStorage()), this.parentContext)) != null) {
            b0 b0VarY = a0.f(xVar.getSlotStorage()).Y();
            try {
                return v.L0(c0.b(b0VarY, numO.intValue(), 0), xVar.getComposer().j0());
            } finally {
                b0VarY.d();
            }
        }
        return v.n();
    }

    @Override // p076m2.r
    public void k(List<oq.r<s2, s2>> references) {
        try {
            V0(references);
            B0();
        } catch (Throwable th4) {
            w0();
            throw th4;
        }
    }

    @Override // p076m2.q1
    public void k0(er.a<i0> block) {
        if (getIsComposing()) {
            t.b("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.a();
        } finally {
            this.isComposing = false;
        }
    }

    @Override // p076m2.r
    public p076m2.c<?> l() {
        return this.applier;
    }

    @Override // p076m2.q1
    public boolean l0(t0<Object, Object> invalidationsRequested, e5 shouldPause) {
        if (!this.changes.c()) {
            t.b("Expected applyChanges() to have been called");
        }
        if (g.i(invalidationsRequested) <= 0 && !g.k(this.invalidations) && ((this.slotTable.getRoot() < 0 || !r1(this.slotTable.getRoot())) && !this.forciblyRecompose)) {
            return false;
        }
        this.shouldPauseCallback = shouldPause;
        try {
            this.changeListWriter.U();
            G0(invalidationsRequested, null);
            this.shouldPauseCallback = null;
            if (s2.b.a(this.changes).f()) {
                return true;
            }
            if (!this.changes.d()) {
                return false;
            }
            O0();
            return false;
        } catch (Throwable th4) {
            this.shouldPauseCallback = null;
            throw th4;
        }
    }

    @Override // p076m2.r
    public d5 m() {
        f4 f4Var = null;
        f4 f4Var2 = e6.f(this.invalidateStack) ? (f4) e6.i(this.invalidateStack) : null;
        if (f4Var2 != null) {
            f4Var2.I(false);
            l<u, i0> lVarQ0 = Q0(f4Var2);
            if (lVarQ0 != null) {
                this.changeListWriter.i(lVarQ0, getComposition());
            }
            if (f4Var2.q()) {
                f4Var2.L(false);
                this.changeListWriter.m(f4Var2);
                f4Var2.M(false);
                if (f4Var2.p() && this.reusingGroup == this.reader.getParent()) {
                    f4Var2.K(false);
                    this.reusingGroup = -1;
                    this.reusing = false;
                }
            }
        }
        if (f4Var2 != null && !f4Var2.s() && (f4Var2.t() || this.forceRecomposeScopes)) {
            if (f4Var2.getAnchor() == null) {
                f4Var2.D(getInserting() ? this.builder.j() : this.reader.u());
            }
            f4Var2.F(false);
            f4Var = f4Var2;
        }
        I0(false);
        return f4Var;
    }

    @Override // p076m2.q1
    public e3.a m0(final Object value) {
        List listN;
        if (!getSourceMarkersEnabled()) {
            return new e3.a(v.n(), false);
        }
        ObjectLocation objectLocationJ = a0.j(this.slotTable, new l() { // from class: m2.c2
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(f2.z1(value, obj));
            }
        });
        if (objectLocationJ == null || (listN = v.L0(y1(objectLocationJ.getGroup(), objectLocationJ.getDataOffset()), j0())) == null) {
            listN = v.n();
        }
        return new e3.a(listN, getSourceMarkersEnabled());
    }

    @Override // p076m2.r
    public void n() {
        A1(125, null, o2.c.INSTANCE.b(), null);
        this.nodeExpected = true;
    }

    @Override // p076m2.q1
    public void n0() {
        this.reusingGroup = this.slotTable.getRoot();
        this.reusing = true;
    }

    @Override // p076m2.r
    public void o(o2<?> value, Object parameter) {
        Y0(value, D0(), parameter, false);
    }

    @Override // p076m2.q1
    public boolean o0(f4 scope, Object instance) {
        int address;
        p076m2.b anchor = scope.getAnchor();
        if (anchor == null || (address = r2.j.c(anchor).getAddress()) < 0 || !getIsComposing() || !b1((((long) 0) << 32) | (((long) oq.b0.e(address)) & BodyPartID.bodyIdMax))) {
            return false;
        }
        this.reader.b(address, 67108864);
        if (instance != null) {
            c5 c5Var = c5.f122830a;
            if (!t.c(instance, c5Var)) {
                if (instance instanceof h1) {
                    g.b(this.invalidations, scope, (h1) instance);
                    return true;
                }
                if (t.c(g.h(this.invalidations, scope), c5Var)) {
                    return true;
                }
                g.a(this.invalidations, scope, instance);
                return true;
            }
        }
        g.o(this.invalidations, scope, c5.f122830a);
        return true;
    }

    @Override // p076m2.r
    public void p(er.a<i0> effect) {
        this.changeListWriter.T(effect);
    }

    @Override // p076m2.q1
    public void p0(t0<Object, Object> invalidationsRequested) {
        Object[] objArr = invalidationsRequested.keys;
        Object[] objArr2 = invalidationsRequested.values;
        long[] jArr = invalidationsRequested.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        int i18 = (i15 << 3) + i17;
                        Object obj = objArr[i18];
                        Object obj2 = objArr2[i18];
                        p076m2.b anchor = ((f4) obj).getAnchor();
                        r2.i iVarC = anchor != null ? r2.j.c(anchor) : null;
                        if (iVarC != null && iVarC.a()) {
                            int address = iVarC.getAddress();
                            this.reader.b(address, 67108864);
                            c5 c5Var = c5.f122830a;
                            if (t.c(obj2, c5Var)) {
                                g.o(this.invalidations, obj, c5Var);
                            } else if (obj2 instanceof u0) {
                                g.b(this.invalidations, obj, (h1) obj2);
                            } else {
                                g.a(this.invalidations, obj, obj2);
                            }
                            this.reader.b(address, 67108864);
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    @Override // p076m2.r
    /* JADX INFO: renamed from: q, reason: from getter */
    public long getCompositeKeyHashCode() {
        return this.compositeKeyHashCode;
    }

    @Override // p076m2.r
    public boolean r(boolean parametersChanged, int flags) {
        f4 f4VarE0;
        if ((flags & 1) != 0 || (!getInserting() && !this.reusing)) {
            return parametersChanged || !i();
        }
        e5 e5Var = this.shouldPauseCallback;
        if (e5Var == null || (f4VarE0 = e0()) == null || !e5Var.a() || f4VarE0.q()) {
            return true;
        }
        f4VarE0.O(true);
        f4VarE0.M(this.reusing);
        f4VarE0.H(true);
        this.changeListWriter.J(f4VarE0);
        this.parentContext.u(f4VarE0);
        return false;
    }

    @Override // p076m2.r
    /* JADX INFO: renamed from: s, reason: from getter */
    public tq.i getApplyCoroutineContext() {
        return this.applyCoroutineContext;
    }

    @Override // p076m2.r
    public e0 t() {
        return D0();
    }

    public void t1(i iVar) {
        this.deferredChanges = iVar;
    }

    @Override // p076m2.r
    public void u() {
        M1();
        if (getInserting()) {
            t.b("useNode() called while inserting");
        }
        Object objY = this.reader.y();
        this.changeListWriter.w(objY);
        if (this.reusing && (objY instanceof n)) {
            this.changeListWriter.a0(objY);
        }
    }

    public void u1(boolean z15) {
        this.sourceMarkersEnabled = z15;
    }

    @Override // p076m2.r
    public void v(Object value) {
        F1(value);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    public void v1() {
        long jRotateLeft;
        long j15;
        if (!r1(this.reader.m())) {
            w1();
            return;
        }
        b0 b0Var = this.reader;
        int iO = b0Var.o();
        Object objP = b0Var.p();
        Object objN = b0Var.n();
        int i15 = this.rGroupIndex;
        if (objP == null) {
            if (objN == null || iO != 207 || t.c(objN, r.INSTANCE.a())) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) iO), 3);
                j15 = i15;
            } else {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) objN.hashCode()), 3) ^ ((long) i15);
            }
            C1(b0Var.O(), null);
            h1();
            b0Var.f();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objN == null && iO == 207 && !t.c(objN, r.INSTANCE.a())) {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i15), 3) ^ ((long) objN.hashCode()), 3);
                return;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) iO) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i15), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        j15 = 0;
        this.compositeKeyHashCode = jRotateLeft ^ j15;
        C1(b0Var.O(), null);
        h1();
        b0Var.f();
        if (objP != null) {
            if (objN == null) {
            }
            this.compositeKeyHashCode = Long.rotateRight(((long) iO) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i15), 3), 3);
        } else if (objP instanceof Enum) {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    @Override // p076m2.r
    public void w() {
        J0();
        J0();
        this.providersInvalid = g2.h(this.providersInvalidStack.g());
        this.providerCache = null;
    }

    @Override // p076m2.r
    public void x() {
        I0(true);
    }

    @Override // p076m2.r
    public void y() {
        J0();
        f4 f4VarE0 = e0();
        if (f4VarE0 == null || !f4VarE0.t()) {
            return;
        }
        f4VarE0.E(true);
    }

    @Override // p076m2.r
    public void z() {
        this.forceRecomposeScopes = true;
        u1(true);
        this.slotTable.g();
        this.builder.h();
    }
}
