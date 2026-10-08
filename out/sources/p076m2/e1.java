package p076m2;

import c3.w;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import e3.ComposeStackTraceFrame;
import e3.ObjectLocation;
import e3.e;
import e3.h;
import e3.k;
import e3.m;
import e3.s;
import er.p;
import fr.t;
import fr.w0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oq.i0;
import oq.y;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;
import p2.SlotReader;
import p2.SlotWriter;
import p2.g;
import p2.l;
import pq.v;
import q2.d;
import r0.h0;
import r0.h1;
import r0.i1;
import r0.j0;
import r0.t0;
import r0.u0;
import t2.f;
import tq.j;
import y2.IntRef;
import y2.b0;
import y2.n;
import y2.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b*\u0002½\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0004Å\u0001È\u0001BQ\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010\u0016J\u0019\u0010$\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020(2\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020(2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00142\u0006\u00102\u001a\u00020(H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0014H\u0002¢\u0006\u0004\b5\u0010\u0016J\u000f\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u0010\u0016J\u000f\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\b7\u0010\u0016J!\u0010;\u001a\u00020\u00142\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b;\u0010<J3\u0010@\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010=\u001a\u0004\u0018\u00010\u001d2\u0006\u0010?\u001a\u00020>2\b\u0010:\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u00020\u00142\u0006\u00109\u001a\u0002082\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00192\u0006\u0010G\u001a\u000208H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00142\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0014H\u0002¢\u0006\u0004\bL\u0010\u0016J\u0017\u0010N\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u0019H\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u0019H\u0002¢\u0006\u0004\bQ\u0010RJ/\u0010V\u001a\u00020\u00192\u0006\u0010S\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00192\u0006\u0010T\u001a\u00020\u00192\u0006\u0010U\u001a\u00020\u0019H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\bX\u0010OJ\u0017\u0010Y\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\bY\u0010OJ\u001f\u0010[\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020\u0019H\u0002¢\u0006\u0004\b[\u0010RJ\u000f\u0010\\\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\\\u0010\u0016J'\u0010`\u001a\u00020\u00142\u0006\u0010]\u001a\u00020\u00192\u0006\u0010^\u001a\u00020\u00192\u0006\u0010_\u001a\u00020\u0019H\u0002¢\u0006\u0004\b`\u0010aJ\u001f\u0010c\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00192\u0006\u0010b\u001a\u00020\u0019H\u0002¢\u0006\u0004\bc\u0010RJ/\u0010g\u001a\u00060dj\u0002`e2\u0006\u0010+\u001a\u00020\u00192\u0006\u0010T\u001a\u00020\u00192\n\u0010f\u001a\u00060dj\u0002`eH\u0002¢\u0006\u0004\bg\u0010hJ\u001b\u0010j\u001a\u00020\u0019*\u00020i2\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u0014H\u0002¢\u0006\u0004\bl\u0010\u0016J\u000f\u0010m\u001a\u00020\u0014H\u0002¢\u0006\u0004\bm\u0010\u0016J\u0017\u0010p\u001a\u00020\u00142\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ%\u0010t\u001a\u0010\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u0014\u0018\u00010r2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bt\u0010uJ9\u0010{\u001a\u00020\u00142\u000e\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0v2\u0006\u0010x\u001a\u00020(2\b\u0010y\u001a\u0004\u0018\u00010\u001d2\u0006\u0010z\u001a\u000208H\u0002¢\u0006\u0004\b{\u0010|J/\u0010\u0081\u0001\u001a\u00020\u00142\u001b\u0010\u0080\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u007f\u0012\u0006\u0012\u0004\u0018\u00010\u007f0~0}H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001Jp\u0010\u008a\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0083\u00012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00012\f\b\u0002\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0084\u00012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00192\u001d\b\u0002\u0010\u0087\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0~0}2\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0088\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0015\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J,\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010}2\u0006\u0010+\u001a\u00020\u00192\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J9\u0010\u0095\u0001\u001a\u00020\u00142\u0014\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u0093\u00012\u000f\u0010w\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0088\u0001H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J \u0010\u0097\u0001\u001a\u0004\u0018\u00010\u001d*\u00020i2\u0006\u0010M\u001a\u00020\u0019H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0099\u0001\u0010\u0016J\u0011\u0010\u009a\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u009a\u0001\u0010\u0016J\u001c\u0010\u009d\u0001\u001a\u00020\u00142\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0011\u0010\u009f\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u009f\u0001\u0010\u0016J\u001a\u0010¡\u0001\u001a\u00020\u00142\u0007\u0010 \u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b¡\u0001\u0010\u001cJ\u0011\u0010¢\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b¢\u0001\u0010\u0016J\u0011\u0010£\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b£\u0001\u0010\u0016J\u0011\u0010¤\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b¤\u0001\u0010\u0016J\u0019\u0010¥\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0005\b¥\u0001\u0010\u001cJ\u0011\u0010¦\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¦\u0001\u0010\u0016J\u0019\u0010§\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0005\b§\u0001\u0010\u001cJ\u0011\u0010\u0083\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b\u0083\u0001\u0010\u0016J\u0011\u0010¨\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¨\u0001\u0010\u0016J\u0011\u0010©\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b©\u0001\u0010\u0016J#\u0010ª\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0005\bª\u0001\u0010 J\u0011\u0010«\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b«\u0001\u0010\u0016J\u0011\u0010¬\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b¬\u0001\u0010\u0016J\u0011\u0010\u00ad\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u00ad\u0001\u0010\u0016J\u0011\u0010®\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b®\u0001\u0010\u0016J\u0011\u0010¯\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b¯\u0001\u0010\u0016J\u0011\u0010°\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b°\u0001\u0010\u0016J\u0011\u0010±\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b±\u0001\u0010\u0016J)\u0010´\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010²\u00012\u000e\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0088\u0001H\u0016¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0011\u0010¶\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b¶\u0001\u0010\u0016J\u0011\u0010·\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b·\u0001\u0010\u0016J#\u0010¸\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0005\b¸\u0001\u0010 J\u0011\u0010¹\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b¹\u0001\u0010\u0016J\u0011\u0010º\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\bº\u0001\u0010\u0016J\u0011\u0010»\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b»\u0001\u0010\u0016JD\u0010½\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010¦\u0001\"\u0005\b\u0001\u0010²\u00012\u0006\u0010#\u001a\u00028\u00002\u001a\u0010\u0089\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140¼\u0001H\u0016¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0014\u0010¿\u0001\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u0014\u0010Á\u0001\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0006\bÁ\u0001\u0010À\u0001J\u001c\u0010Â\u0001\u001a\u0002082\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u001c\u0010Ä\u0001\u001a\u0002082\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\bÄ\u0001\u0010Ã\u0001J\u001a\u0010Å\u0001\u001a\u0002082\u0006\u0010#\u001a\u000208H\u0017¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001b\u0010È\u0001\u001a\u0002082\u0007\u0010#\u001a\u00030Ç\u0001H\u0017¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u001a\u0010Ê\u0001\u001a\u0002082\u0006\u0010#\u001a\u00020dH\u0017¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u001a\u0010Ì\u0001\u001a\u0002082\u0006\u0010#\u001a\u00020\u0019H\u0017¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u001b\u0010Î\u0001\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0005\bÎ\u0001\u0010%J\u001b\u0010Ï\u0001\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0005\bÏ\u0001\u0010%J\"\u0010Ñ\u0001\u001a\u00020\u00142\u000e\u0010Ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0088\u0001H\u0016¢\u0006\u0006\bÑ\u0001\u0010µ\u0001J\u001f\u0010Ó\u0001\u001a\u00020\u00142\u000b\u0010#\u001a\u0007\u0012\u0002\b\u00030Ò\u0001H\u0017¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0011\u0010Õ\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bÕ\u0001\u0010\u0016J)\u0010Ø\u0001\u001a\u00020\u00142\u0015\u0010×\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030Ò\u00010Ö\u0001H\u0017¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J\u0011\u0010Ú\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bÚ\u0001\u0010\u0016J(\u0010Ü\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010²\u00012\r\u0010\u001a\u001a\t\u0012\u0004\u0012\u00028\u00000Û\u0001H\u0017¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u0012\u0010²\u0001\u001a\u00020\u0004H\u0016¢\u0006\u0006\b²\u0001\u0010Þ\u0001J%\u0010à\u0001\u001a\u0002082\u0006\u0010o\u001a\u00020n2\t\u0010ß\u0001\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0006\bà\u0001\u0010á\u0001J\u0011\u0010â\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bâ\u0001\u0010\u0016J$\u0010å\u0001\u001a\u0002082\u0007\u0010ã\u0001\u001a\u0002082\u0007\u0010ä\u0001\u001a\u00020\u0019H\u0017¢\u0006\u0006\bå\u0001\u0010æ\u0001J\u0011\u0010ç\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bç\u0001\u0010\u0016J\u001a\u0010é\u0001\u001a\u00020\u00142\u0007\u0010è\u0001\u001a\u000208H\u0017¢\u0006\u0005\bé\u0001\u0010KJ\u001b\u0010ë\u0001\u001a\u00030ê\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0006\bë\u0001\u0010ì\u0001J\u0015\u0010î\u0001\u001a\u0005\u0018\u00010í\u0001H\u0017¢\u0006\u0006\bî\u0001\u0010ï\u0001J(\u0010ð\u0001\u001a\u00020\u00142\n\u0010#\u001a\u0006\u0012\u0002\b\u00030v2\b\u0010y\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\bð\u0001\u0010ñ\u0001J/\u0010ò\u0001\u001a\u00020\u00142\u001b\u0010\u0080\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u007f\u0012\u0006\u0012\u0004\u0018\u00010\u007f0~0}H\u0017¢\u0006\u0006\bò\u0001\u0010\u0082\u0001J\u001d\u0010ó\u0001\u001a\u00030\u008c\u00012\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0006\bó\u0001\u0010ô\u0001J\u0019\u0010õ\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010}H\u0010¢\u0006\u0006\bõ\u0001\u0010ö\u0001JC\u0010ù\u0001\u001a\u00020\u00142\u0014\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u0093\u00012\r\u0010w\u001a\t\u0012\u0004\u0012\u00020\u00140\u0088\u00012\n\u0010ø\u0001\u001a\u0005\u0018\u00010÷\u0001H\u0010¢\u0006\u0006\bù\u0001\u0010ú\u0001J\"\u0010û\u0001\u001a\u00020\u00142\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0088\u0001H\u0010¢\u0006\u0006\bû\u0001\u0010µ\u0001J4\u0010ü\u0001\u001a\u0002082\u0014\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u0093\u00012\n\u0010ø\u0001\u001a\u0005\u0018\u00010÷\u0001H\u0010¢\u0006\u0006\bü\u0001\u0010ý\u0001J(\u0010þ\u0001\u001a\u00020\u00142\u0014\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u0093\u0001H\u0010¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J\u0014\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0006\b\u0080\u0002\u0010À\u0001J\u001b\u0010\u0081\u0002\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0005\b\u0081\u0002\u0010%J\u001b\u0010\u0083\u0002\u001a\u00020\u00142\u0007\u0010o\u001a\u00030\u0082\u0002H\u0016¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002R\"\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÈ\u0001\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010\u0088\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010\u0089\u0002R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010\u008a\u0002R\u0018\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0018\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010\u008c\u0002R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010\u008d\u0002R\u001e\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008e\u0002\u0010\u008f\u0002\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R \u0010\u0094\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010B0\u0092\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010\u0093\u0002R\u001b\u0010\u0096\u0002\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010\u0095\u0002R\u0019\u0010\u0097\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010¨\u0001R\u0019\u0010\u0098\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010¨\u0001R\u0019\u0010\u0099\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010¨\u0001R\u0018\u0010\u009c\u0002\u001a\u00030\u009a\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010\u009b\u0002R\u001c\u0010\u009f\u0002\u001a\u0005\u0018\u00010\u009d\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010\u009e\u0002R\u001c\u0010£\u0002\u001a\u0005\u0018\u00010 \u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R\u0019\u0010¤\u0002\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010ù\u0001R\u0019\u0010¦\u0002\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010ù\u0001R\u0019\u0010¨\u0002\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0002\u0010ù\u0001R\u001f\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030ª\u00020©\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010«\u0002R\u0018\u0010¬\u0002\u001a\u00030\u009a\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u009b\u0002R\u0019\u0010®\u0002\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010\u00ad\u0002R\"\u0010±\u0002\u001a\u000b\u0012\u0004\u0012\u00020(\u0018\u00010¯\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010°\u0002R\u0019\u0010²\u0002\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ù\u0001R\u0018\u0010³\u0002\u001a\u00030\u009a\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u009b\u0002R\u0019\u0010µ\u0002\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0002\u0010ù\u0001R\u0019\u0010¶\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010¨\u0001R\u0019\u0010·\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¨\u0001R\u0019\u0010¸\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010¨\u0001R(\u0010¼\u0002\u001a\u0002088\u0010@\u0010X\u0090\u000e¢\u0006\u0017\n\u0006\b\u0080\u0002\u0010ù\u0001\u001a\u0006\b¹\u0002\u0010º\u0002\"\u0005\b»\u0002\u0010KR\u0018\u0010À\u0002\u001a\u00030½\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0002\u0010¿\u0002R\u001e\u0010Á\u0002\u001a\t\u0012\u0004\u0012\u00020n0\u0092\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010\u0093\u0002R)\u0010Ã\u0002\u001a\u0002082\u0006\u0010#\u001a\u0002088\u0010@RX\u0090\u000e¢\u0006\u0010\n\u0006\b´\u0001\u0010ù\u0001\u001a\u0006\bÂ\u0002\u0010º\u0002R)\u0010Å\u0002\u001a\u0002082\u0006\u0010#\u001a\u0002088\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¨\u0001\u0010ù\u0001\u001a\u0006\bÄ\u0002\u0010º\u0002R)\u0010Ë\u0002\u001a\u00020i8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010Æ\u0002\u001a\u0006\bÇ\u0002\u0010È\u0002\"\u0006\bÉ\u0002\u0010Ê\u0002R)\u0010Ð\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010\u0089\u0002\u001a\u0006\bÌ\u0002\u0010Í\u0002\"\u0006\bÎ\u0002\u0010Ï\u0002R\u001a\u0010Ó\u0002\u001a\u00030Ñ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0002\u0010Ò\u0002R\u0019\u0010Ô\u0002\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010ù\u0001R\u001b\u0010Õ\u0002\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010\u00ad\u0002R,\u0010Ü\u0002\u001a\u0005\u0018\u00010Ö\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\bç\u0001\u0010×\u0002\u001a\u0006\bØ\u0002\u0010Ù\u0002\"\u0006\bÚ\u0002\u0010Û\u0002R\u0018\u0010ß\u0002\u001a\u00030Ý\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Þ\u0002R\u001a\u0010â\u0002\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0002\u0010á\u0002R\u001a\u0010å\u0002\u001a\u00030ã\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010ä\u0002R\u001c\u0010è\u0002\u001a\u0005\u0018\u00010÷\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0002\u0010ç\u0002R\"\u0010í\u0002\u001a\u0005\u0018\u00010é\u00028PX\u0090\u0004¢\u0006\u0010\n\u0006\b²\u0001\u0010ê\u0002\u001a\u0006\bë\u0002\u0010ì\u0002R \u0010ñ\u0002\u001a\u00030î\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b«\u0001\u0010ï\u0002\u001a\u0006\b¥\u0002\u0010ð\u0002R/\u0010G\u001a\u0002082\u0006\u0010#\u001a\u0002088\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\b¦\u0001\u0010ù\u0001\u0012\u0005\bò\u0002\u0010\u0016\u001a\u0006\b\u008b\u0002\u0010º\u0002R8\u0010õ\u0002\u001a\u00060dj\u0002`e2\n\u0010#\u001a\u00060dj\u0002`e8\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\bÂ\u0001\u0010ª\u0001\u0012\u0005\bô\u0002\u0010\u0016\u001a\u0006\b¡\u0002\u0010ó\u0002R\u001c\u0010ø\u0002\u001a\u0005\u0018\u00010ö\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010÷\u0002R\u001d\u0010û\u0002\u001a\u0004\u0018\u00010\u001d*\u00020i8BX\u0082\u0004¢\u0006\b\u001a\u0006\bù\u0002\u0010ú\u0002R\u0017\u0010ý\u0002\u001a\u0002088PX\u0090\u0004¢\u0006\b\u001a\u0006\bü\u0002\u0010º\u0002R\u001e\u0010ÿ\u0002\u001a\u0002088VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bþ\u0002\u0010\u0016\u001a\u0006\bà\u0002\u0010º\u0002R\u001e\u0010\u0081\u0003\u001a\u0002088VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u0080\u0003\u0010\u0016\u001a\u0006\b\u008e\u0002\u0010º\u0002R\u0018\u0010\u0083\u0003\u001a\u00030ö\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¾\u0002\u0010\u0082\u0003R\u0018\u0010\u0086\u0003\u001a\u00030\u0084\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b§\u0002\u0010\u0085\u0003R\u0019\u0010\u0089\u0003\u001a\u0004\u0018\u00010n8PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0087\u0003\u0010\u0088\u0003R\u001a\u0010\u008b\u0003\u001a\u0005\u0018\u00010\u0082\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b´\u0002\u0010\u008a\u0003¨\u0006\u008c\u0003"}, d2 = {"Lm2/e1;", "Lm2/q1;", "Lm2/c;", "applier", "Lm2/v;", "parentContext", "Lp2/l;", "slotTable", "", "Lm2/u4;", "abandonSet", "Lm2/i;", "changes", "lateChanges", "Lm2/g0;", "observerHolder", "Lm2/x;", "composition", "<init>", "(Lm2/c;Lm2/v;Lp2/l;Ljava/util/Set;Lm2/i;Lm2/i;Lm2/g0;Lm2/x;)V", "Loq/i0;", "L1", "()V", "N0", "w0", "", "key", "I1", "(I)V", "", "dataKey", "J1", "(ILjava/lang/Object;)V", "M0", "D1", "value", "Q1", "(Ljava/lang/Object;)V", "t1", "()I", "Lm2/v3;", "F0", "()Lm2/v3;", "group", "G0", "(I)Lm2/v3;", "parentScope", "currentProviders", "P1", "(Lm2/v3;Lm2/v3;)Lm2/v3;", "providers", "r1", "(Lm2/v3;)V", "O0", "E0", "U0", "", "isNode", "data", "K1", "(ZLjava/lang/Object;)V", "objectKey", "Lo2/c;", "kind", i.f37088o, "(ILjava/lang/Object;ILjava/lang/Object;)V", "Lm2/j1;", "newPending", "P0", "(ZLm2/j1;)V", "expectedNodeCount", "inserting", "R0", "(IZ)V", "L0", "(Z)V", "o1", "index", "d1", "(I)I", "newCount", "O1", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "k1", "(IIII)I", "l1", "S1", "count", "N1", "C0", "oldGroup", "newGroup", "commonRoot", "s1", "(III)V", "nearestCommonRoot", "K0", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "recomposeKey", "D0", "(IIJ)J", "Lp2/j;", "Z0", "(Lp2/j;I)I", "E1", "A0", "Lm2/f4;", "scope", "Q0", "(Lm2/f4;)V", "Lkotlin/Function1;", "Lm2/u;", "S0", "(Lm2/f4;)Ler/l;", "Lm2/o2;", "content", "locals", "parameter", "force", "e1", "(Lm2/o2;Lm2/v3;Ljava/lang/Object;Z)V", "", "Loq/r;", "Lm2/s2;", "references", "a1", "(Ljava/util/List;)V", "R", "Lm2/l0;", "from", "to", "invalidations", "Lkotlin/Function0;", "block", "m1", "(Lm2/l0;Lm2/l0;Ljava/lang/Integer;Ljava/util/List;Ler/a;)Ljava/lang/Object;", "Le3/a;", "H0", "()Le3/a;", "dataOffset", "Le3/d;", "F1", "(ILjava/lang/Integer;)Ljava/util/List;", "Ln2/g;", "invalidationsRequested", "I0", "(Lr0/t0;Ler/p;)V", "j1", "(Lp2/j;I)Ljava/lang/Object;", "T1", "U1", "Lp2/c;", "anchor", "q1", "(Lp2/c;)V", "p1", "groupBeingRemoved", "v1", "u1", "T0", "B0", "C", "V", "X", "I", "y", "J", "U", "Y", "z", "b0", "a0", "n", "K", "T", "factory", i.f37087n, "(Ler/a;)V", "u", "x", "M", "B", "n0", "c0", "Lkotlin/Function2;", "j", "(Ljava/lang/Object;Ler/p;)V", "h1", "()Ljava/lang/Object;", "i1", "W", "(Ljava/lang/Object;)Z", "G", "a", "(Z)Z", "", "b", "(F)Z", "d", "(J)Z", "c", "(I)Z", "R1", "M1", "effect", "p", "Lm2/c4;", ip.a.f96138c, "(Lm2/c4;)V", "w", "", "values", "e", "([Lm2/c4;)V", i.f37086m, "Lm2/z;", "N", "(Lm2/z;)Ljava/lang/Object;", "()Lm2/v;", "instance", "o0", "(Lm2/f4;Ljava/lang/Object;)Z", "C1", "parametersChanged", "flags", "r", "(ZI)Z", "O", "changed", "g", "Lm2/r;", "h", "(I)Lm2/r;", "Lm2/d5;", "m", "()Lm2/d5;", "o", "(Lm2/o2;Ljava/lang/Object;)V", "k", "m0", "(Ljava/lang/Object;)Le3/a;", "j0", "()Ljava/util/List;", "Lm2/e5;", "shouldPause", "Z", "(Lr0/t0;Ler/p;Lm2/e5;)V", "k0", "l0", "(Lr0/t0;Lm2/e5;)Z", "p0", "(Lr0/t0;)V", "E", "v", "Lm2/d4;", i.f37094u, "(Lm2/d4;)V", "Lm2/c;", "l", "()Lm2/c;", "Lm2/v;", "Lp2/l;", "Ljava/util/Set;", "f", "Lm2/i;", "Lm2/g0;", "i", "Lm2/x;", "V0", "()Lm2/x;", "Lm2/e6;", "Ljava/util/ArrayList;", "pendingStack", "Lm2/j1;", "pending", "nodeIndex", "groupNodeCount", "rGroupIndex", "Lm2/o1;", "Lm2/o1;", "parentStateStack", "", "[I", "nodeCountOverrides", "Lr0/h0;", "q", "Lr0/h0;", "nodeCountVirtualOverrides", "forceRecomposeScopes", "s", "forciblyRecompose", "t", "nodeExpected", "", "Lm2/r1;", "Ljava/util/List;", "entersStack", "Lm2/v3;", "rootProvider", "Lr0/j0;", "Lr0/j0;", "providerUpdates", "providersInvalid", "providersInvalidStack", "A", "reusing", "reusingGroup", "childrenComposing", "compositionToken", "h0", "()Z", "B1", "sourceMarkersEnabled", "m2/e1$c", "F", "Lm2/e1$c;", "derivedStateObserver", "invalidateStack", "i0", "isComposing", "isDisposed$runtime", "isDisposed", "Lp2/j;", "Y0", "()Lp2/j;", "setReader$runtime", "(Lp2/j;)V", "reader", "getInsertTable$runtime", "()Lp2/l;", "setInsertTable$runtime", "(Lp2/l;)V", "insertTable", "Lp2/o;", "Lp2/o;", "writer", "writerHasAProvider", "providerCache", "Lq2/a;", "Lq2/a;", "W0", "()Lq2/a;", "A1", "(Lq2/a;)V", "deferredChanges", "Lq2/c;", "Lq2/c;", "changeListWriter", "Q", "Lp2/c;", "insertAnchor", "Lq2/d;", "Lq2/d;", "insertFixups", ip.a.f96137b, "Lm2/e5;", "shouldPauseCallback", "Le3/k;", "Le3/k;", "g0", "()Le3/k;", "errorContext", "Ltq/i;", "Ltq/i;", "()Ltq/i;", "applyCoroutineContext", "getInserting$annotations", "()J", "getCompositeKeyHashCode$annotations", "compositeKeyHashCode", "Le3/h;", "Le3/h;", "_compositionData", "X0", "(Lp2/j;)Ljava/lang/Object;", "node", "d0", "areChildrenComposing", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping$annotations", "skipping", "()Le3/h;", "compositionData", "Lm2/e0;", "()Lm2/e0;", "currentCompositionLocalMap", "e0", "()Lm2/f4;", "currentRecomposeScope", "()Lm2/d4;", "recomposeScope", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1 extends q1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean reusing;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int childrenComposing;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int compositionToken;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean sourceMarkersEnabled;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final c derivedStateObserver;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final ArrayList<f4> invalidateStack;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean isComposing;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean isDisposed;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private SlotReader reader;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private l insertTable;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private SlotWriter writer;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean writerHasAProvider;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private v3 providerCache;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private q2.a deferredChanges;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final q2.c changeListWriter;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private p2.c insertAnchor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private d insertFixups;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private e5 shouldPauseCallback;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final k errorContext;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final tq.i applyCoroutineContext;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private boolean inserting;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private long compositeKeyHashCode;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private h _compositionData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p076m2.c<?> applier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v parentContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l slotTable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<u4> abandonSet;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private i changes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private i lateChanges;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g0 observerHolder;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final x composition;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private j1 pending;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int nodeIndex;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int groupNodeCount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int rGroupIndex;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int[] nodeCountOverrides;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private h0 nodeCountVirtualOverrides;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean forceRecomposeScopes;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean forciblyRecompose;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean nodeExpected;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private j0<v3> providerUpdates;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean providersInvalid;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<j1> pendingStack = e6.c(null, 1, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final o1 parentStateStack = new o1();

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final List<r1> invalidations = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final o1 entersStack = new o1();

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private v3 rootProvider = r.a();

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final o1 providersInvalidStack = new o1();

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int reusingGroup = -1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm2/e1$a;", "Lm2/u4;", "Lm2/e1$b;", "Lm2/e1;", "ref", "<init>", "(Lm2/e1$b;)V", "Loq/i0;", "c", "()V", "d", "e", "a", "Lm2/e1$b;", "()Lm2/e1$b;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0011¢\u0006\u0004\b#\u0010$J3\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0010¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b(\u0010\u0017J\u000f\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020)¢\u0006\u0004\b,\u0010-J\u001d\u00101\u001a\u00020\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0010¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0010¢\u0006\u0004\b3\u0010\u000eJ\u000f\u00104\u001a\u00020\fH\u0010¢\u0006\u0004\b4\u0010\u000eJ\u0017\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b9\u00108J\u0019\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b;\u0010<J+\u0010@\u001a\u00020\f2\u0006\u00106\u001a\u0002052\u0006\u0010=\u001a\u00020:2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030>H\u0010¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\bB\u0010\u0017J\u001d\u0010E\u001a\u00020D2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0016¢\u0006\u0004\bE\u0010FR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001e\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0006\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0007\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010J\u001a\u0004\bM\u0010LR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u0010N\u001a\u0004\bO\u0010PR0\u0010V\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u00102R\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020X0W8\u0006¢\u0006\f\n\u0004\bK\u0010Y\u001a\u0004\bZ\u0010[R+\u0010a\u001a\u00020)2\u0006\u0010]\u001a\u00020)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010^\u001a\u0004\b_\u0010+\"\u0004\b`\u0010-R\u0014\u0010b\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010LR\u0014\u0010d\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bc\u0010LR\u0014\u0010h\u001a\u00020e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010\u0015\u001a\u00020i8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006l"}, d2 = {"Lm2/e1$b;", "Lm2/v;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyHashCode", "", "collectingParameterInformation", "collectingSourceInformation", "Lm2/g0;", "observerHolder", "<init>", "(Lm2/e1;JZZLm2/g0;)V", "Loq/i0;", "A", "()V", "Lm2/r;", "composer", "t", "(Lm2/r;)V", "y", "Lm2/l0;", "composition", "z", "(Lm2/l0;)V", "Lm2/f4;", "scope", "u", "(Lm2/f4;)V", "Lkotlin/Function0;", "content", "a", "(Lm2/l0;Ler/p;)V", "Lm2/e5;", "shouldPause", "Lr0/h1;", "b", "(Lm2/l0;Lm2/e5;Ler/p;)Lr0/h1;", "invalidScopes", "r", "(Lm2/l0;Lm2/e5;Lr0/h1;)Lr0/h1;", "o", "Lm2/v3;", "j", "()Lm2/v3;", "E", "(Lm2/v3;)V", "", "Le3/h;", "table", "s", "(Ljava/util/Set;)V", "x", "d", "Lm2/s2;", "reference", "n", "(Lm2/s2;)V", "c", "Lm2/r2;", "q", "(Lm2/s2;)Lm2/r2;", "data", "Lm2/c;", "applier", "p", "(Lm2/s2;Lm2/r2;Lm2/c;)V", "v", "action", "Lm2/g;", "w", "(Ler/a;)Lm2/g;", "J", "h", "()J", "Z", "f", "()Z", "g", "Lm2/g0;", "l", "()Lm2/g0;", "e", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "inspectionTables", "Lr0/u0;", "Lm2/e1;", "Lr0/u0;", "B", "()Lr0/u0;", "composers", "<set-?>", "Lm2/a3;", "C", ip.a.f96138c, "compositionLocalScope", "collectingCallByInformation", "m", "stackTraceEnabled", "Ltq/i;", "k", "()Ltq/i;", "effectCoroutineContext", "Lm2/u;", "i", "()Lm2/u;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        private final u0<e1> composers = i1.b();

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final a3 compositionLocalScope = x5.i(r.a(), x5.o());

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

        /* JADX WARN: Code duplicated, block: B:21:0x0063 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0065 A[LOOP:0: B:9:0x0019->B:22:0x0065, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:26:0x0068 A[EDGE_INSN: B:26:0x0068->B:23:0x0068 BREAK  A[LOOP:0: B:9:0x0019->B:22:0x0065], SYNTHETIC] */
        public final void A() {
            if (this.composers.f()) {
                Set<Set<h>> set = this.inspectionTables;
                if (set != null) {
                    u0<e1> u0Var = this.composers;
                    Object[] objArr = u0Var.elements;
                    long[] jArr = u0Var.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j15 = jArr[i15];
                            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i15 != length) {
                                    break;
                                    break;
                                }
                                i15++;
                            } else {
                                int i16 = 8 - ((~(i15 - length)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((255 & j15) < 128) {
                                        e1 e1Var = (e1) objArr[(i15 << 3) + i17];
                                        Iterator<Set<h>> it = set.iterator();
                                        while (it.hasNext()) {
                                            it.next().remove(e1Var.F());
                                        }
                                    }
                                    j15 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                } else if (i15 != length) {
                                    break;
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                }
                this.composers.n();
            }
        }

        public final u0<e1> B() {
            return this.composers;
        }

        public final void E(v3 scope) {
            D(scope);
        }

        @Override // p076m2.v
        public void a(l0 composition, p<? super r, ? super Integer, i0> content) {
            e1.this.parentContext.a(composition, content);
        }

        @Override // p076m2.v
        public h1<f4> b(l0 composition, e5 shouldPause, p<? super r, ? super Integer, i0> content) {
            return e1.this.parentContext.b(composition, shouldPause, content);
        }

        @Override // p076m2.v
        public void c(s2 reference) {
            e1.this.parentContext.c(reference);
        }

        @Override // p076m2.v
        public void d() {
            e1.this.childrenComposing--;
        }

        @Override // p076m2.v
        public boolean e() {
            return e1.this.parentContext.e();
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
            return e1.this.getComposition();
        }

        @Override // p076m2.v
        public v3 j() {
            return C();
        }

        @Override // p076m2.v
        /* JADX INFO: renamed from: k */
        public tq.i getEffectCoroutineContext() {
            return e1.this.parentContext.getEffectCoroutineContext();
        }

        @Override // p076m2.v
        /* JADX INFO: renamed from: l, reason: from getter */
        public g0 getObserverHolder() {
            return this.observerHolder;
        }

        @Override // p076m2.v
        public boolean m() {
            return e1.this.parentContext.m();
        }

        @Override // p076m2.v
        public void n(s2 reference) {
            e1.this.parentContext.n(reference);
        }

        @Override // p076m2.v
        public void o(l0 composition) {
            e1.this.parentContext.o(e1.this.getComposition());
            e1.this.parentContext.o(composition);
        }

        @Override // p076m2.v
        public void p(s2 reference, r2 data, p076m2.c<?> applier) {
            e1.this.parentContext.p(reference, data, applier);
        }

        @Override // p076m2.v
        public r2 q(s2 reference) {
            return e1.this.parentContext.q(reference);
        }

        @Override // p076m2.v
        public h1<f4> r(l0 composition, e5 shouldPause, h1<f4> invalidScopes) {
            return e1.this.parentContext.r(composition, shouldPause, invalidScopes);
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
            super.t((e1) composer);
            this.composers.i(composer);
        }

        @Override // p076m2.v
        public void u(f4 scope) {
            e1.this.parentContext.u(scope);
        }

        @Override // p076m2.v
        public void v(l0 composition) {
            e1.this.parentContext.v(composition);
        }

        @Override // p076m2.v
        public g w(er.a<i0> action) {
            return e1.this.parentContext.w(action);
        }

        @Override // p076m2.v
        public void x() {
            e1.this.childrenComposing++;
        }

        @Override // p076m2.v
        public void y(r composer) {
            Set<Set<h>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((e1) composer).F());
                }
            }
            if (composer instanceof e1) {
                this.composers.z(composer);
            }
        }

        @Override // p076m2.v
        public void z(l0 composition) {
            e1.this.parentContext.z(composition);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"m2/e1$c", "Lm2/p0;", "Lm2/o0;", "derivedState", "Loq/i0;", "b", "(Lm2/o0;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements p0 {
        c() {
        }

        @Override // p076m2.p0
        public void a(o0<?> derivedState) {
            e1.this.childrenComposing--;
        }

        @Override // p076m2.p0
        public void b(o0<?> derivedState) {
            e1.this.childrenComposing++;
        }
    }

    public e1(p076m2.c<?> cVar, v vVar, l lVar, Set<u4> set, i iVar, i iVar2, g0 g0Var, x xVar) {
        this.applier = cVar;
        this.parentContext = vVar;
        this.slotTable = lVar;
        this.abandonSet = set;
        this.changes = iVar;
        this.lateChanges = iVar2;
        this.observerHolder = g0Var;
        this.composition = xVar;
        this.sourceMarkersEnabled = vVar.getCollectingSourceInformation() || vVar.e();
        this.derivedStateObserver = new c();
        this.invalidateStack = e6.c(null, 1, null);
        SlotReader slotReaderU = lVar.U();
        slotReaderU.d();
        this.reader = slotReaderU;
        l lVar2 = new l();
        if (vVar.getCollectingSourceInformation()) {
            lVar2.g();
        }
        if (vVar.e()) {
            lVar2.f();
        }
        this.insertTable = lVar2;
        SlotWriter slotWriterV = lVar2.V();
        slotWriterV.K(true);
        this.writer = slotWriterV;
        this.changeListWriter = new q2.c(this, q2.b.a(this.changes));
        SlotReader slotReaderU2 = this.insertTable.U();
        try {
            p2.c cVarA = slotReaderU2.a(0);
            slotReaderU2.d();
            this.insertAnchor = cVarA;
            this.insertFixups = new d();
            this.errorContext = new k(this);
            tq.i effectCoroutineContext = vVar.getEffectCoroutineContext();
            tq.i iVarG0 = g0();
            this.applyCoroutineContext = effectCoroutineContext.n0(iVarG0 == null ? j.f191408a : iVarG0);
        } catch (Throwable th4) {
            slotReaderU2.d();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    private final void A0() {
        f4 f4Var;
        boolean z15;
        if (getInserting()) {
            f4 f4Var2 = new f4(getComposition());
            e6.j(this.invalidateStack, f4Var2);
            R1(f4Var2);
            Q0(f4Var2);
            return;
        }
        r1 r1VarF = h1.F(this.invalidations, this.reader.getParent());
        Object objL = this.reader.L();
        if (t.c(objL, r.INSTANCE.a())) {
            f4Var = new f4(getComposition());
            R1(f4Var);
        } else {
            f4Var = (f4) objL;
        }
        if (r1VarF != null) {
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
        Q0(f4Var);
        if (f4Var.m()) {
            f4Var.H(false);
            f4Var.L(true);
            this.changeListWriter.Z(f4Var);
            if (this.reusing || !f4Var.r()) {
                return;
            }
            this.reusing = true;
            this.reusingGroup = this.reader.getParent();
            f4Var.K(true);
        }
    }

    private final void B0() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compositeKeyHashCode = 0L;
        this.nodeExpected = false;
        this.changeListWriter.U();
        e6.a(this.invalidateStack);
        C0();
    }

    private final void C0() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final long D0(int group, int recomposeGroup, long recomposeKey) {
        long jRotateLeft;
        long jRotateLeft2 = 0;
        int i15 = 3;
        int i16 = 0;
        while (group >= 0) {
            if (group == recomposeGroup) {
                jRotateLeft = Long.rotateLeft(recomposeKey, i16);
            } else {
                int iZ0 = Z0(this.reader, group);
                if (iZ0 == 126665345) {
                    jRotateLeft = Long.rotateLeft(iZ0, i16);
                } else {
                    jRotateLeft2 = (jRotateLeft2 ^ Long.rotateLeft(iZ0, i15)) ^ Long.rotateLeft(this.reader.H(group) ? 0 : l1(group), i16);
                    i15 = (i15 + 6) % 64;
                    i16 = (i16 + 6) % 64;
                    group = this.reader.Q(group);
                }
            }
            return jRotateLeft ^ jRotateLeft2;
        }
        return jRotateLeft2;
    }

    private final void D1() {
        this.groupNodeCount += this.reader.T();
    }

    private final void E0() {
        if (!this.writer.getClosed()) {
            t.b("Check failed");
        }
        U0();
    }

    private final void E1() {
        this.groupNodeCount = this.reader.v();
        this.reader.U();
    }

    private final v3 F0() {
        v3 v3Var = this.providerCache;
        return v3Var != null ? v3Var : G0(this.reader.getParent());
    }

    private final List<ComposeStackTraceFrame> F1(int group, Integer dataOffset) {
        SlotReader slotReaderU = this.slotTable.U();
        try {
            return e3.c.g(slotReaderU, group, dataOffset);
        } finally {
            slotReaderU.d();
        }
    }

    private final v3 G0(int group) {
        v3 v3VarB;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.j0(parent) == 202 && t.c(this.writer.k0(parent), t.f())) {
                    v3 v3Var = (v3) this.writer.h0(parent);
                    this.providerCache = v3Var;
                    return v3Var;
                }
                parent = this.writer.L0(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.D(group) == 202 && t.c(this.reader.E(group), t.f())) {
                    j0<v3> j0Var = this.providerUpdates;
                    if (j0Var == null || (v3VarB = j0Var.b(group)) == null) {
                        v3VarB = (v3) this.reader.A(group);
                    }
                    this.providerCache = v3VarB;
                    return v3VarB;
                }
                group = this.reader.Q(group);
            }
        }
        v3 v3Var2 = this.rootProvider;
        this.providerCache = v3Var2;
        return v3Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G1(Object obj, Object obj2) {
        if (obj2 == obj) {
            return true;
        }
        v4 v4Var = obj2 instanceof v4 ? (v4) obj2 : null;
        return (v4Var != null ? v4Var.getWrapped() : null) == obj;
    }

    private final e3.a H0() {
        if (!this.parentContext.m()) {
            return null;
        }
        List listC = v.c();
        listC.addAll(e3.c.c(this.writer, null, 0, null, 7, null));
        listC.addAll(e3.c.a(this.reader));
        listC.addAll(j0());
        return new e3.a(v.a(listC), getSourceMarkersEnabled());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:74:0x0189  */
    /* JADX WARN: Code duplicated, block: B:76:0x0193  */
    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ca  */
    private final void H1(int key, Object objectKey, int kind, Object data) {
        long jRotateLeft;
        o2.c.Companion companion;
        boolean z15;
        j1 j1Var;
        boolean z16;
        j1 j1Var2;
        int currentGroup;
        j1 j1Var3;
        U1();
        int i15 = this.rGroupIndex;
        if (objectKey == null) {
            if (data == null || key != 207 || t.c(data, r.INSTANCE.a())) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) key), 3) ^ ((long) i15);
            } else {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) data.hashCode()), 3) ^ ((long) i15);
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
            j1Var = null;
            if (getInserting()) {
                this.reader.c();
                currentGroup = this.writer.getCurrentGroup();
                if (z15) {
                    this.writer.p1(key, r.INSTANCE.a());
                } else if (data != null) {
                    SlotWriter slotWriter = this.writer;
                    if (objectKey == null) {
                        objectKey = r.INSTANCE.a();
                    }
                    slotWriter.l1(key, objectKey, data);
                } else {
                    SlotWriter slotWriter2 = this.writer;
                    if (objectKey == null) {
                        objectKey = r.INSTANCE.a();
                    }
                    slotWriter2.n1(key, objectKey);
                }
                j1Var3 = this.pending;
                if (j1Var3 != null) {
                    g gVar = new g(key, -1, d1(currentGroup), -1, 0);
                    j1Var3.i(gVar, this.nodeIndex - j1Var3.getStartIndex());
                    j1Var3.h(gVar);
                }
                P0(z15, null);
                return;
            }
            if (kind != companion.b() && this.reusing) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (this.pending == null) {
                int iN = this.reader.n();
                if (z16 && iN == key && t.c(objectKey, this.reader.o())) {
                    K1(z15, data);
                } else {
                    this.pending = new j1(this.reader.h(), this.nodeIndex);
                }
            }
            j1Var2 = this.pending;
            if (j1Var2 != null) {
                g gVarD = j1Var2.d(key, objectKey);
                if (!z16 || gVarD == null) {
                    this.reader.c();
                    this.inserting = true;
                    this.providerCache = null;
                    O0();
                    this.writer.F();
                    int currentGroup2 = this.writer.getCurrentGroup();
                    if (z15) {
                        this.writer.p1(key, r.INSTANCE.a());
                    } else if (data != null) {
                        SlotWriter slotWriter3 = this.writer;
                        if (objectKey == null) {
                            objectKey = r.INSTANCE.a();
                        }
                        slotWriter3.l1(key, objectKey, data);
                    } else {
                        SlotWriter slotWriter4 = this.writer;
                        if (objectKey == null) {
                            objectKey = r.INSTANCE.a();
                        }
                        slotWriter4.n1(key, objectKey);
                    }
                    this.insertAnchor = this.writer.B(currentGroup2);
                    g gVar2 = new g(key, -1, d1(currentGroup2), -1, 0);
                    j1Var2.i(gVar2, this.nodeIndex - j1Var2.getStartIndex());
                    j1Var2.h(gVar2);
                    j1Var = new j1(new ArrayList(), z15 ? 0 : this.nodeIndex);
                } else {
                    j1Var2.h(gVarD);
                    int location = gVarD.getLocation();
                    this.nodeIndex = j1Var2.g(gVarD) + j1Var2.getStartIndex();
                    int iM = j1Var2.m(gVarD);
                    int groupIndex = iM - j1Var2.getGroupIndex();
                    j1Var2.k(iM, j1Var2.getGroupIndex());
                    this.changeListWriter.z(location);
                    this.reader.R(location);
                    if (groupIndex > 0) {
                        this.changeListWriter.w(groupIndex);
                    }
                    K1(z15, data);
                }
            }
            P0(z15, j1Var);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) (objectKey instanceof Enum ? ((Enum) objectKey).ordinal() : objectKey.hashCode())), 3) ^ ((long) 0);
        this.compositeKeyHashCode = jRotateLeft;
        if (objectKey == null) {
            this.rGroupIndex++;
        }
        companion = o2.c.INSTANCE;
        if (kind != companion.a()) {
            z15 = true;
        } else {
            z15 = false;
        }
        j1Var = null;
        if (getInserting()) {
            this.reader.c();
            currentGroup = this.writer.getCurrentGroup();
            if (z15) {
                this.writer.p1(key, r.INSTANCE.a());
            } else if (data != null) {
                SlotWriter slotWriter5 = this.writer;
                if (objectKey == null) {
                    objectKey = r.INSTANCE.a();
                }
                slotWriter5.l1(key, objectKey, data);
            } else {
                SlotWriter slotWriter6 = this.writer;
                if (objectKey == null) {
                    objectKey = r.INSTANCE.a();
                }
                slotWriter6.n1(key, objectKey);
            }
            j1Var3 = this.pending;
            if (j1Var3 != null) {
                g gVar3 = new g(key, -1, d1(currentGroup), -1, 0);
                j1Var3.i(gVar3, this.nodeIndex - j1Var3.getStartIndex());
                j1Var3.h(gVar3);
            }
            P0(z15, null);
            return;
        }
        if (kind != companion.b()) {
            z16 = false;
        } else {
            z16 = true;
        }
        if (this.pending == null) {
            int iN2 = this.reader.n();
            if (z16) {
                this.pending = new j1(this.reader.h(), this.nodeIndex);
            } else {
                this.pending = new j1(this.reader.h(), this.nodeIndex);
            }
        }
        j1Var2 = this.pending;
        if (j1Var2 != null) {
            g gVarD2 = j1Var2.d(key, objectKey);
            if (z16) {
                this.reader.c();
                this.inserting = true;
                this.providerCache = null;
                O0();
                this.writer.F();
                int currentGroup3 = this.writer.getCurrentGroup();
                if (z15) {
                    this.writer.p1(key, r.INSTANCE.a());
                } else if (data != null) {
                    SlotWriter slotWriter7 = this.writer;
                    if (objectKey == null) {
                        objectKey = r.INSTANCE.a();
                    }
                    slotWriter7.l1(key, objectKey, data);
                } else {
                    SlotWriter slotWriter8 = this.writer;
                    if (objectKey == null) {
                        objectKey = r.INSTANCE.a();
                    }
                    slotWriter8.n1(key, objectKey);
                }
                this.insertAnchor = this.writer.B(currentGroup3);
                g gVar4 = new g(key, -1, d1(currentGroup3), -1, 0);
                j1Var2.i(gVar4, this.nodeIndex - j1Var2.getStartIndex());
                j1Var2.h(gVar4);
                j1Var = new j1(new ArrayList(), z15 ? 0 : this.nodeIndex);
            } else {
                this.reader.c();
                this.inserting = true;
                this.providerCache = null;
                O0();
                this.writer.F();
                int currentGroup4 = this.writer.getCurrentGroup();
                if (z15) {
                    this.writer.p1(key, r.INSTANCE.a());
                } else if (data != null) {
                    SlotWriter slotWriter9 = this.writer;
                    if (objectKey == null) {
                        objectKey = r.INSTANCE.a();
                    }
                    slotWriter9.l1(key, objectKey, data);
                } else {
                    SlotWriter slotWriter10 = this.writer;
                    if (objectKey == null) {
                        objectKey = r.INSTANCE.a();
                    }
                    slotWriter10.n1(key, objectKey);
                }
                this.insertAnchor = this.writer.B(currentGroup4);
                g gVar5 = new g(key, -1, d1(currentGroup4), -1, 0);
                j1Var2.i(gVar5, this.nodeIndex - j1Var2.getStartIndex());
                j1Var2.h(gVar5);
                j1Var = new j1(new ArrayList(), z15 ? 0 : this.nodeIndex);
            }
        }
        P0(z15, j1Var);
    }

    private final void I0(t0<Object, Object> invalidationsRequested, p<? super r, ? super Integer, i0> content) {
        if (getIsComposing()) {
            t.b("Reentrant composition is not supported");
        }
        this.observerHolder.a();
        b0 b0Var = b0.f223360a;
        Object objA = b0Var.a("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(w.K().getSnapshotId());
            this.providerUpdates = null;
            p0(invalidationsRequested);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                L1();
                Object objH1 = h1();
                if (objH1 != content && content != null) {
                    R1(content);
                }
                c cVar = this.derivedStateObserver;
                n2.c<p0> cVarC = x5.c();
                try {
                    cVarC.d(cVar);
                    if (content != null) {
                        J1(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, t.g());
                        n.a(this, content);
                        M0();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || objH1 == null || t.c(objH1, r.INSTANCE.a())) {
                        C1();
                    } else {
                        J1(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, t.g());
                        n.a(this, (p) w0.g(objH1, 2));
                        M0();
                    }
                    cVarC.v(cVarC.getSize() - 1);
                    N0();
                    this.isComposing = false;
                    this.invalidations.clear();
                    E0();
                    i0 i0Var = i0.f148189a;
                    b0Var.b(objA);
                } catch (Throwable th4) {
                    cVarC.v(cVarC.getSize() - 1);
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    throw e.b(th5, new er.a() { // from class: m2.b1
                        @Override // er.a
                        public final Object a() {
                            return e1.J0(this.f122809a);
                        }
                    });
                } catch (Throwable th6) {
                    this.isComposing = false;
                    this.invalidations.clear();
                    w0();
                    E0();
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            b0.f223360a.b(objA);
            throw th7;
        }
    }

    private final void I1(int key) {
        H1(key, null, o2.c.INSTANCE.a(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e3.a J0(e1 e1Var) {
        return e1Var.H0();
    }

    private final void J1(int key, Object dataKey) {
        H1(key, dataKey, o2.c.INSTANCE.a(), null);
    }

    private final void K0(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        K0(this.reader.Q(group), nearestCommonRoot);
        if (this.reader.K(group)) {
            this.changeListWriter.x(j1(this.reader, group));
        }
    }

    private final void K1(boolean isNode, Object data) {
        if (isNode) {
            this.reader.X();
            return;
        }
        if (data != null && this.reader.l() != data) {
            this.changeListWriter.c0(data);
        }
        this.reader.W();
    }

    private final void L0(boolean isNode) {
        long jRotateRight;
        long j15;
        int iW;
        List<g> list;
        long jRotateRight2;
        long j16;
        int iE = this.parentStateStack.e() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int iJ0 = this.writer.j0(parent);
            Object objK0 = this.writer.k0(parent);
            Object objH0 = this.writer.h0(parent);
            if (objK0 != null) {
                int iOrdinal = objK0 instanceof Enum ? ((Enum) objK0).ordinal() : objK0.hashCode();
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3);
                j16 = iOrdinal;
            } else if (objH0 == null || iJ0 != 207 || t.c(objH0, r.INSTANCE.a())) {
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3);
                j16 = iJ0;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) objH0.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight2 ^ j16, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iD = this.reader.D(parent2);
            Object objE = this.reader.E(parent2);
            Object objA = this.reader.A(parent2);
            if (objE != null) {
                int iOrdinal2 = objE instanceof Enum ? ((Enum) objE).ordinal() : objE.hashCode();
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3);
                j15 = iOrdinal2;
            } else if (objA == null || iD != 207 || t.c(objA, r.INSTANCE.a())) {
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3);
                j15 = iD;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) objA.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight ^ j15, 3);
        }
        int i15 = this.groupNodeCount;
        j1 j1Var = this.pending;
        if (j1Var != null && j1Var.b().size() > 0) {
            List<g> listB = j1Var.b();
            List<g> listF = j1Var.f();
            Set setE = c3.c.e(listF);
            u0 u0VarB = i1.b();
            int size = listF.size();
            int size2 = listB.size();
            int i16 = 0;
            int i17 = 0;
            int iO = 0;
            while (i16 < size2) {
                g gVar = listB.get(i16);
                if (setE.contains(gVar)) {
                    list = listB;
                    if (!u0VarB.a(gVar)) {
                        if (i17 < size) {
                            g gVar2 = listF.get(i17);
                            if (gVar2 != gVar) {
                                int iG = j1Var.g(gVar2);
                                u0VarB.i(gVar2);
                                if (iG != iO) {
                                    int iO2 = j1Var.o(gVar2);
                                    this.changeListWriter.y(j1Var.getStartIndex() + iG, iO + j1Var.getStartIndex(), iO2);
                                    j1Var.j(iG, iO, iO2);
                                }
                            } else {
                                i16++;
                            }
                            i17++;
                            iO += j1Var.o(gVar2);
                            listB = list;
                            listF = listF;
                        }
                    }
                    listB = list;
                } else {
                    this.changeListWriter.S(j1Var.g(gVar) + j1Var.getStartIndex(), gVar.getNodes());
                    j1Var.n(gVar.getLocation(), 0);
                    this.changeListWriter.z(gVar.getLocation());
                    this.reader.R(gVar.getLocation());
                    p1();
                    this.reader.T();
                    list = listB;
                    h1.G(this.invalidations, gVar.getLocation(), gVar.getLocation() + this.reader.F(gVar.getLocation()));
                }
                i16++;
                listB = list;
            }
            this.changeListWriter.i();
            if (listB.size() > 0) {
                this.changeListWriter.z(this.reader.m());
                this.reader.U();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (iW = this.reader.w()) > 0) {
            this.changeListWriter.a0(iW);
        }
        int i18 = this.nodeIndex;
        while (!this.reader.I()) {
            int current = this.reader.getCurrent();
            p1();
            this.changeListWriter.S(i18, this.reader.T());
            h1.G(this.invalidations, current, this.reader.getCurrent());
        }
        if (inserting) {
            if (isNode) {
                this.insertFixups.c();
                i15 = 1;
            }
            this.reader.f();
            int parent3 = this.writer.getParent();
            this.writer.S();
            if (!this.reader.t()) {
                int iD1 = d1(parent3);
                this.writer.T();
                this.writer.K(true);
                q1(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    N1(iD1, 0);
                    O1(iD1, i15);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.B();
            }
            this.changeListWriter.g();
            int parent4 = this.reader.getParent();
            if (i15 != S1(parent4)) {
                O1(parent4, i15);
            }
            if (isNode) {
                i15 = 1;
            }
            this.reader.g();
            this.changeListWriter.i();
        }
        R0(i15, inserting);
    }

    private final void L1() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.U();
        I1(100);
        this.parentContext.x();
        v3 v3VarJ = this.parentContext.j();
        this.providersInvalidStack.i(h1.r(this.providersInvalid));
        this.providersInvalid = W(v3VarJ);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!getSourceMarkersEnabled()) {
            B1(this.parentContext.getCollectingSourceInformation());
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
        I1(Long.hashCode(this.parentContext.getCompositeKeyHashCode()));
    }

    private final void M0() {
        L0(false);
    }

    private final void N0() {
        M0();
        this.parentContext.d();
        M0();
        this.changeListWriter.l();
        T0();
        this.reader.d();
        this.forciblyRecompose = false;
        this.providersInvalid = h1.p(this.providersInvalidStack.g());
    }

    private final void N1(int group, int count) {
        if (S1(group) != count) {
            if (group < 0) {
                h0 h0Var = this.nodeCountVirtualOverrides;
                if (h0Var == null) {
                    h0Var = new h0(0, 1, null);
                    this.nodeCountVirtualOverrides = h0Var;
                }
                h0Var.u(group, count);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                int[] iArr2 = new int[this.reader.getGroupsSize()];
                pq.n.C(iArr2, -1, 0, 0, 6, null);
                this.nodeCountOverrides = iArr2;
                iArr = iArr2;
            }
            iArr[group] = count;
        }
    }

    private final void O0() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterV = this.insertTable.V();
            this.writer = slotWriterV;
            slotWriterV.d1();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void O1(int group, int newCount) {
        int iS1 = S1(group);
        if (iS1 != newCount) {
            int i15 = newCount - iS1;
            int iD = e6.d(this.pendingStack) - 1;
            while (group != -1) {
                int iS2 = S1(group) + i15;
                N1(group, iS2);
                for (int i16 = iD; -1 < i16; i16--) {
                    j1 j1Var = (j1) e6.h(this.pendingStack, i16);
                    if (j1Var != null && j1Var.n(group, iS2)) {
                        iD = i16 - 1;
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.K(group)) {
                    return;
                } else {
                    group = this.reader.Q(group);
                }
            }
        }
    }

    private final void P0(boolean isNode, j1 newPending) {
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, m2.v3] */
    private final v3 P1(v3 parentScope, v3 currentProviders) {
        f.a<z<Object>, o6<Object>> aVarBuilder2 = parentScope.builder2();
        aVarBuilder2.putAll(currentProviders);
        ?? Build2 = aVarBuilder2.build2();
        J1(204, t.i());
        Q1(Build2);
        Q1(currentProviders);
        M0();
        return Build2;
    }

    private final void Q0(f4 scope) {
        scope.P(this.compositionToken);
        this.observerHolder.a();
    }

    private final void Q1(Object value) {
        h1();
        R1(value);
    }

    private final void R0(int expectedNodeCount, boolean inserting) {
        j1 j1Var = (j1) e6.i(this.pendingStack);
        if (j1Var != null && !inserting) {
            j1Var.l(j1Var.getGroupIndex() + 1);
        }
        this.pending = j1Var;
        this.nodeIndex = this.parentStateStack.g() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.g();
        this.groupNodeCount = this.parentStateStack.g() + expectedNodeCount;
    }

    private final er.l<u, i0> S0(f4 scope) {
        this.observerHolder.a();
        return scope.f(this.compositionToken);
    }

    private final int S1(int group) {
        int i15;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i15 = iArr[group]) < 0) ? this.reader.O(group) : i15;
        }
        h0 h0Var = this.nodeCountVirtualOverrides;
        if (h0Var == null || !h0Var.a(group)) {
            return 0;
        }
        return h0Var.c(group);
    }

    private final void T0() {
        this.changeListWriter.o();
        if (!e6.e(this.pendingStack)) {
            t.b("Start/end imbalance");
        }
        B0();
    }

    private final void T1() {
        if (!this.nodeExpected) {
            t.b("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void U0() {
        l lVar = new l();
        if (getSourceMarkersEnabled()) {
            lVar.g();
        }
        if (this.parentContext.e()) {
            lVar.f();
        }
        this.insertTable = lVar;
        SlotWriter slotWriterV = lVar.V();
        slotWriterV.K(true);
        this.writer = slotWriterV;
    }

    private final void U1() {
        if (this.nodeExpected) {
            t.b("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final Object X0(SlotReader slotReader) {
        return slotReader.M(slotReader.getParent());
    }

    private final int Z0(SlotReader slotReader, int i15) {
        Object objA;
        if (!slotReader.H(i15)) {
            int iD = slotReader.D(i15);
            return (iD != 207 || (objA = slotReader.A(i15)) == null || t.c(objA, r.INSTANCE.a())) ? iD : objA.hashCode();
        }
        Object objE = slotReader.E(i15);
        if (objE == null) {
            return 0;
        }
        if (objE instanceof Enum) {
            return ((Enum) objE).ordinal();
        }
        if (objE instanceof o2) {
            return 126665345;
        }
        return objE.hashCode();
    }

    private final void a1(List<oq.r<s2, s2>> references) throws Throwable {
        q2.c cVar;
        q2.a aVar;
        p076m2.b anchor;
        SlotReader slotReader;
        j0<v3> j0Var;
        q2.a aVar2;
        i5 slotStorage;
        List<oq.r<s2, s2>> list = references;
        q2.c cVar2 = this.changeListWriter;
        q2.a aVarA = q2.b.a(this.lateChanges);
        q2.a aVarP = cVar2.getChangeList();
        try {
            cVar2.V(aVarA);
            this.changeListWriter.T();
            int size = list.size();
            int i15 = 0;
            int i16 = 0;
            while (i16 < size) {
                try {
                    oq.r<s2, s2> rVar = list.get(i16);
                    final s2 s2VarA = rVar.a();
                    s2 s2VarB = rVar.b();
                    p2.c cVarA = p2.d.a(s2VarA.getAnchor());
                    l lVarO = p2.n.o(s2VarA.getSlotStorage());
                    int iV = lVarO.v(cVarA);
                    IntRef intRef = new IntRef(i15, 1, null);
                    this.changeListWriter.e(intRef, cVarA);
                    if (s2VarB == null) {
                        if (t.c(lVarO, this.insertTable)) {
                            E0();
                        }
                        final SlotReader slotReaderU = lVarO.U();
                        try {
                            slotReaderU.R(iV);
                            this.changeListWriter.A(iV);
                            final q2.a aVar3 = new q2.a();
                            n1(this, null, null, null, null, new er.a() { // from class: m2.z0
                                @Override // er.a
                                public final Object a() {
                                    return e1.b1(this.f123261a, aVar3, slotReaderU, s2VarA);
                                }
                            }, 15, null);
                            this.changeListWriter.t(aVar3, intRef);
                            i0 i0Var = i0.f148189a;
                            slotReaderU.d();
                        } catch (Throwable th4) {
                            slotReaderU.d();
                            throw th4;
                        }
                    } else {
                        r2 r2VarQ = this.parentContext.q(s2VarB);
                        l lVarO2 = (r2VarQ == null || (slotStorage = r2VarQ.getSlotStorage()) == null) ? null : p2.n.o(slotStorage);
                        l lVarO3 = lVarO2 == null ? p2.n.o(s2VarB.getSlotStorage()) : lVarO2;
                        if (lVarO2 == null || (anchor = lVarO2.u(0)) == null) {
                            anchor = s2VarB.getAnchor();
                        }
                        p2.c cVarA2 = p2.d.a(anchor);
                        List<? extends Object> listS = h1.s(lVarO3, cVarA2);
                        if (!listS.isEmpty()) {
                            this.changeListWriter.b(listS, intRef);
                            if (t.c(lVarO, this.slotTable)) {
                                int iV2 = this.slotTable.v(cVarA);
                                N1(iV2, S1(iV2) + listS.size());
                            }
                        }
                        this.changeListWriter.c(r2VarQ, this.parentContext, s2VarB, s2VarA);
                        SlotReader slotReaderU2 = lVarO3.U();
                        try {
                            SlotReader slotReader2 = this.reader;
                            int[] iArr = this.nodeCountOverrides;
                            j0<v3> j0Var2 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                this.reader = slotReaderU2;
                                int iV3 = lVarO3.v(p2.d.a(cVarA2));
                                slotReaderU2.R(iV3);
                                this.changeListWriter.A(iV3);
                                q2.a aVar4 = new q2.a();
                                q2.c cVar3 = this.changeListWriter;
                                q2.a aVarP2 = cVar3.getChangeList();
                                try {
                                    cVar3.V(aVar4);
                                    slotReader = slotReaderU2;
                                    try {
                                        q2.c cVar4 = this.changeListWriter;
                                        boolean zQ = cVar4.getImplicitRootStart();
                                        try {
                                            cVar4.W(false);
                                            try {
                                                iArr = iArr;
                                                j0Var = j0Var2;
                                                aVar2 = aVarP2;
                                                try {
                                                    m1(s2VarB.getComposition(), s2VarA.getComposition(), Integer.valueOf(slotReader.getCurrent()), s2VarB.d(), new er.a() { // from class: m2.a1
                                                        @Override // er.a
                                                        public final Object a() {
                                                            return e1.c1(this.f122781a, s2VarA);
                                                        }
                                                    });
                                                    try {
                                                        cVar4.W(zQ);
                                                        try {
                                                            cVar3.V(aVar2);
                                                            this.changeListWriter.t(aVar4, intRef);
                                                            i0 i0Var2 = i0.f148189a;
                                                            try {
                                                                this.reader = slotReader2;
                                                                this.nodeCountOverrides = iArr;
                                                                this.providerUpdates = j0Var;
                                                                slotReader.d();
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                slotReader.d();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            this.reader = slotReader2;
                                                            this.nodeCountOverrides = iArr;
                                                            this.providerUpdates = j0Var;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        cVar3.V(aVar2);
                                                        throw th;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    cVar4.W(zQ);
                                                    throw th;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                iArr = iArr;
                                                aVar2 = aVarP2;
                                                j0Var = j0Var2;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            iArr = iArr;
                                            j0Var = j0Var2;
                                            aVar2 = aVarP2;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        j0Var = j0Var2;
                                        aVar2 = aVarP2;
                                        cVar3.V(aVar2);
                                        throw th;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    slotReader = slotReaderU2;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                iArr = iArr;
                                slotReader = slotReaderU2;
                                j0Var = j0Var2;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            slotReader = slotReaderU2;
                        }
                    }
                    try {
                        this.changeListWriter.Y();
                        i16++;
                        list = references;
                        size = size;
                        cVar2 = cVar2;
                        aVarP = aVarP;
                        i15 = 0;
                    } catch (Throwable th15) {
                        th = th15;
                        cVar = cVar2;
                        aVar = aVarP;
                        cVar.V(aVar);
                        throw th;
                    }
                } catch (Throwable th16) {
                    th = th16;
                    cVar2 = cVar2;
                    aVarP = aVarP;
                }
            }
            q2.c cVar5 = cVar2;
            q2.a aVar5 = aVarP;
            this.changeListWriter.h();
            this.changeListWriter.A(0);
            cVar5.V(aVar5);
        } catch (Throwable th17) {
            th = th17;
            cVar = cVar2;
            aVar = aVarP;
            cVar.V(aVar);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b1(e1 e1Var, q2.a aVar, SlotReader slotReader, s2 s2Var) {
        q2.c cVar = e1Var.changeListWriter;
        q2.a aVarP = cVar.getChangeList();
        try {
            cVar.V(aVar);
            SlotReader slotReader2 = e1Var.reader;
            int[] iArr = e1Var.nodeCountOverrides;
            j0<v3> j0Var = e1Var.providerUpdates;
            e1Var.nodeCountOverrides = null;
            e1Var.providerUpdates = null;
            try {
                e1Var.reader = slotReader;
                q2.c cVar2 = e1Var.changeListWriter;
                boolean zQ = cVar2.getImplicitRootStart();
                try {
                    cVar2.W(false);
                    e1Var.e1(s2Var.c(), s2Var.getLocals(), s2Var.getParameter(), true);
                    cVar2.W(zQ);
                    i0 i0Var = i0.f148189a;
                    e1Var.reader = slotReader2;
                    e1Var.nodeCountOverrides = iArr;
                    e1Var.providerUpdates = j0Var;
                    cVar.V(aVarP);
                    return i0.f148189a;
                } catch (Throwable th4) {
                    cVar2.W(zQ);
                    throw th4;
                }
            } catch (Throwable th5) {
                e1Var.reader = slotReader2;
                e1Var.nodeCountOverrides = iArr;
                e1Var.providerUpdates = j0Var;
                throw th5;
            }
        } catch (Throwable th6) {
            cVar.V(aVarP);
            throw th6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c1(e1 e1Var, s2 s2Var) {
        e1Var.e1(s2Var.c(), s2Var.getLocals(), s2Var.getParameter(), true);
        return i0.f148189a;
    }

    private final int d1(int index) {
        return (-2) - index;
    }

    private final void e1(final o2<Object> content, v3 locals, final Object parameter, boolean force) {
        J(126665345, content);
        Q1(parameter);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        try {
            this.compositeKeyHashCode = 126665345;
            boolean z15 = false;
            if (getInserting()) {
                SlotWriter.z0(this.writer, 0, 1, null);
            }
            if (!getInserting() && !t.c(this.reader.l(), locals)) {
                z15 = true;
            }
            if (z15) {
                r1(locals);
            }
            H1(202, t.f(), o2.c.INSTANCE.a(), locals);
            this.providerCache = null;
            if (!getInserting() || force) {
                boolean z16 = this.providersInvalid;
                this.providersInvalid = z15;
                n.a(this, y2.m.b(-59194059, true, new p() { // from class: m2.c1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e1.f1(content, parameter, (r) obj, ((Integer) obj2).intValue());
                    }
                }));
                this.providersInvalid = z16;
            } else {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.n(new s2(content, parameter, getComposition(), this.insertTable, slotWriter.B(slotWriter.L0(slotWriter.getParent())), v.n(), F0(), null));
            }
            M0();
            this.providerCache = null;
            this.compositeKeyHashCode = compositeKeyHashCode;
            U();
        } catch (Throwable th4) {
            try {
                throw e.b(th4, new er.a() { // from class: m2.d1
                    @Override // er.a
                    public final Object a() {
                        return e1.g1(this.f122832a);
                    }
                });
            } catch (Throwable th5) {
                M0();
                this.providerCache = null;
                this.compositeKeyHashCode = compositeKeyHashCode;
                U();
                throw th5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f1(o2 o2Var, Object obj, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-59194059, i15, -1, "androidx.compose.runtime.GapComposer.invokeMovableContentLambda.<anonymous> (GapComposer.kt:2265)");
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
    public static final e3.a g1(e1 e1Var) {
        return e1Var.H0();
    }

    private final Object j1(SlotReader slotReader, int i15) {
        return slotReader.M(i15);
    }

    private final int k1(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iQ = this.reader.Q(group);
        while (iQ != recomposeGroup && !this.reader.K(iQ)) {
            iQ = this.reader.Q(iQ);
        }
        if (this.reader.K(iQ)) {
            recomposeIndex = 0;
        }
        if (iQ == group) {
            return recomposeIndex;
        }
        int iS1 = (S1(iQ) - this.reader.O(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iS1 && iQ != groupLocation) {
            iQ++;
            while (iQ < groupLocation) {
                int iF = this.reader.F(iQ) + iQ;
                if (groupLocation >= iF) {
                    recomposeIndex += this.reader.K(iQ) ? 1 : S1(iQ);
                    iQ = iF;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final int l1(int group) {
        int iQ = this.reader.Q(group) + 1;
        int i15 = 0;
        while (iQ < group) {
            if (!this.reader.H(iQ)) {
                i15++;
            }
            iQ += this.reader.F(iQ);
        }
        return i15;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:3:0x0007, B:5:0x0015, B:7:0x0027, B:11:0x0031, B:10:0x002d, B:14:0x0038, B:16:0x003e, B:18:0x0044), top: B:23:0x0007 }] */
    private final <R> R m1(l0 from, l0 to4, Integer index, List<? extends oq.r<f4, ? extends Object>> invalidations, er.a<? extends R> block) {
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
            if (from == null) {
                rA = block.a();
            } else {
                rA = (R) from.f(to4, index != null ? index.intValue() : -1, block);
                if (rA == null) {
                    rA = block.a();
                }
            }
            return rA;
        } finally {
            this.isComposing = isComposing;
            this.nodeIndex = i15;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object n1(e1 e1Var, l0 l0Var, l0 l0Var2, Integer num, List list, er.a aVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            l0Var = null;
        }
        if ((i15 & 2) != 0) {
            l0Var2 = null;
        }
        if ((i15 & 4) != 0) {
            num = null;
        }
        if ((i15 & 8) != 0) {
            list = v.n();
        }
        return e1Var.m1(l0Var, l0Var2, num, list, aVar);
    }

    private final void o1() {
        boolean isComposing = getIsComposing();
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iF = this.reader.F(parent) + parent;
        int i15 = this.nodeIndex;
        long compositeKeyHashCode = getCompositeKeyHashCode();
        int i16 = this.groupNodeCount;
        int i17 = this.rGroupIndex;
        r1 r1VarZ = h1.z(this.invalidations, this.reader.getCurrent(), iF);
        boolean z15 = false;
        int i18 = parent;
        while (r1VarZ != null) {
            int location = r1VarZ.getLocation();
            f4 scope = r1VarZ.getScope();
            h1.F(this.invalidations, location);
            if (r1VarZ.d()) {
                this.reader.R(location);
                int current = this.reader.getCurrent();
                s1(i18, current, parent);
                this.nodeIndex = k1(location, current, parent, i15);
                this.rGroupIndex = l1(current);
                this.compositeKeyHashCode = D0(this.reader.Q(current), parent, compositeKeyHashCode);
                this.providerCache = null;
                scope.e(this);
                this.providerCache = null;
                this.reader.S(parent);
                z15 = true;
                i18 = current;
            } else {
                e6.j(this.invalidateStack, scope);
                this.observerHolder.a();
                scope.B();
                e6.i(this.invalidateStack);
            }
            r1VarZ = h1.z(this.invalidations, this.reader.getCurrent(), iF);
        }
        if (z15) {
            s1(i18, parent, parent);
            this.reader.U();
            int iS1 = S1(parent);
            this.nodeIndex = i15 + iS1;
            this.groupNodeCount = i16 + iS1;
            this.rGroupIndex = i17;
        } else {
            E1();
        }
        this.compositeKeyHashCode = compositeKeyHashCode;
        this.isComposing = isComposing;
    }

    private final void p1() {
        v1(this.reader.getCurrent());
        this.changeListWriter.R();
    }

    private final void q1(p2.c anchor) {
        if (this.insertFixups.e()) {
            this.changeListWriter.u(anchor, this.insertTable);
        } else {
            this.changeListWriter.v(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new d();
        }
    }

    private final void r1(v3 providers) {
        j0<v3> j0Var = this.providerUpdates;
        if (j0Var == null) {
            j0Var = new j0<>(0, 1, null);
            this.providerUpdates = j0Var;
        }
        j0Var.r(this.reader.getCurrent(), providers);
    }

    private final void s1(int oldGroup, int newGroup, int commonRoot) {
        SlotReader slotReader = this.reader;
        int iD = h1.D(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != iD) {
            if (slotReader.K(oldGroup)) {
                this.changeListWriter.B();
            }
            oldGroup = slotReader.Q(oldGroup);
        }
        K0(newGroup, iD);
    }

    private final int t1() {
        return this.rGroupIndex - 1;
    }

    private final void u1() {
        if (this.slotTable.z()) {
            getComposition().e0();
            q2.a aVar = new q2.a();
            A1(aVar);
            SlotReader slotReaderU = this.slotTable.U();
            try {
                this.reader = slotReaderU;
                q2.c cVar = this.changeListWriter;
                q2.a aVarP = cVar.getChangeList();
                try {
                    cVar.V(aVar);
                    v1(0);
                    this.changeListWriter.N();
                    cVar.V(aVarP);
                    i0 i0Var = i0.f148189a;
                    slotReaderU.d();
                } catch (Throwable th4) {
                    cVar.V(aVarP);
                    throw th4;
                }
            } catch (Throwable th5) {
                slotReaderU.d();
                throw th5;
            }
        }
    }

    private final void v1(int groupBeingRemoved) {
        boolean zK = this.reader.K(groupBeingRemoved);
        if (zK) {
            this.changeListWriter.i();
            this.changeListWriter.x(this.reader.M(groupBeingRemoved));
        }
        z1(this, groupBeingRemoved, groupBeingRemoved, zK, 0);
        this.changeListWriter.i();
        if (zK) {
            this.changeListWriter.B();
        }
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
        if (!this.reader.getClosed()) {
            this.reader.d();
        }
        if (this.writer.getClosed()) {
            return;
        }
        U0();
    }

    private static final s2 w1(e1 e1Var, int i15, List<s2> list) {
        o2 o2Var = (o2) e1Var.reader.E(i15);
        Object objC = e1Var.reader.C(i15, 0);
        p2.c cVarA = e1Var.reader.a(i15);
        int iF = e1Var.reader.F(i15) + i15;
        ArrayList arrayList = new ArrayList();
        List<r1> list2 = e1Var.invalidations;
        for (int iX = h1.x(list2, i15); iX < list2.size(); iX++) {
            r1 r1Var = list2.get(iX);
            if (r1Var.getLocation() >= iF) {
                break;
            }
            arrayList.add(y.a(r1Var.getScope(), r1Var.getInstances()));
        }
        return new s2(o2Var, objC, e1Var.getComposition(), e1Var.slotTable, cVarA, arrayList, e1Var.G0(i15), list);
    }

    private static final s2 x1(e1 e1Var, int i15) {
        int iD = e1Var.reader.D(i15);
        Object objE = e1Var.reader.E(i15);
        ArrayList arrayList = null;
        if (iD != 126665345 || !(objE instanceof o2)) {
            return null;
        }
        if (e1Var.reader.e(i15)) {
            ArrayList arrayList2 = new ArrayList();
            y1(e1Var, arrayList2, i15);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return w1(e1Var, i15, arrayList);
    }

    private static final void y1(e1 e1Var, List<s2> list, int i15) {
        int iF = e1Var.reader.F(i15) + i15;
        int iF2 = i15 + 1;
        while (iF2 < iF) {
            if (e1Var.reader.G(iF2)) {
                s2 s2VarX1 = x1(e1Var, iF2);
                if (s2VarX1 != null) {
                    list.add(s2VarX1);
                }
            } else if (e1Var.reader.e(iF2)) {
                y1(e1Var, list, iF2);
            }
            iF2 += e1Var.reader.F(iF2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb A[LOOP:0: B:35:0x008b->B:45:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ce A[EDGE_INSN: B:82:0x00ce->B:46:0x00ce BREAK  A[LOOP:0: B:35:0x008b->B:45:0x00cb], SYNTHETIC] */
    private static final int z1(e1 e1Var, int i15, int i16, boolean z15, int i17) {
        SlotReader slotReader = e1Var.reader;
        if (!slotReader.G(i16)) {
            if (!slotReader.e(i16)) {
                if (slotReader.K(i16)) {
                    return 1;
                }
                return slotReader.O(i16);
            }
            int iF = slotReader.F(i16) + i16;
            int iZ1 = 0;
            for (int iF2 = i16 + 1; iF2 < iF; iF2 += slotReader.F(iF2)) {
                boolean zK = slotReader.K(iF2);
                if (zK) {
                    e1Var.changeListWriter.i();
                    e1Var.changeListWriter.x(slotReader.M(iF2));
                }
                iZ1 += z1(e1Var, i15, iF2, zK || z15, zK ? 0 : i17 + iZ1);
                if (zK) {
                    e1Var.changeListWriter.i();
                    e1Var.changeListWriter.B();
                }
            }
            if (slotReader.K(i16)) {
                return 1;
            }
            return iZ1;
        }
        int iD = slotReader.D(i16);
        Object objE = slotReader.E(i16);
        if (iD == 126665345 && (objE instanceof o2)) {
            s2 s2VarX1 = x1(e1Var, i16);
            if (s2VarX1 != null) {
                e1Var.parentContext.c(s2VarX1);
                e1Var.changeListWriter.M();
                e1Var.changeListWriter.O(e1Var.getComposition(), e1Var.parentContext, s2VarX1);
            }
            if (!z15 || i16 == i15) {
                return slotReader.O(i16);
            }
            e1Var.changeListWriter.j(i17, i16);
            return 0;
        }
        if (iD != 206 || !t.c(objE, t.j())) {
            if (slotReader.K(i16)) {
                return 1;
            }
            return slotReader.O(i16);
        }
        Object objC = slotReader.C(i16, 0);
        v4 v4Var = objC instanceof v4 ? (v4) objC : null;
        u4 wrapped = v4Var != null ? v4Var.getWrapped() : null;
        a aVar = wrapped instanceof a ? (a) wrapped : null;
        if (aVar != null) {
            u0<e1> u0VarB = aVar.getRef().B();
            Object[] objArr = u0VarB.elements;
            long[] jArr = u0VarB.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i18 = 0;
                while (true) {
                    long j15 = jArr[i18];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i18 != length) {
                            break;
                            break;
                        }
                        i18++;
                    } else {
                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                        for (int i25 = 0; i25 < i19; i25++) {
                            if ((255 & j15) < 128) {
                                e1 e1Var2 = (e1) objArr[(i18 << 3) + i25];
                                e1Var2.u1();
                                e1Var.parentContext.v(e1Var2.getComposition());
                            }
                            j15 >>= 8;
                        }
                        if (i19 != 8) {
                            break;
                        }
                        if (i18 != length) {
                            break;
                        }
                        i18++;
                    }
                }
            }
        }
        return slotReader.O(i16);
    }

    @Override // p076m2.r
    public d4 A() {
        return e0();
    }

    public void A1(q2.a aVar) {
        this.deferredChanges = aVar;
    }

    @Override // p076m2.r
    public void B() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        L0(false);
    }

    public void B1(boolean z15) {
        this.sourceMarkersEnabled = z15;
    }

    @Override // p076m2.r
    public void C(int key) {
        H1(key, null, o2.c.INSTANCE.a(), null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    public void C1() {
        long jRotateLeft;
        long j15;
        if (this.invalidations.isEmpty()) {
            D1();
            return;
        }
        SlotReader slotReader = this.reader;
        int iN = slotReader.n();
        Object objO = slotReader.o();
        Object objL = slotReader.l();
        int i15 = this.rGroupIndex;
        if (objO == null) {
            if (objL == null || iN != 207 || t.c(objL, r.INSTANCE.a())) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) iN), 3);
                j15 = i15;
            } else {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) objL.hashCode()), 3) ^ ((long) i15);
            }
            K1(slotReader.J(), null);
            o1();
            slotReader.g();
            if (objO != null) {
                if (objO instanceof Enum) {
                    this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) ((Enum) objO).ordinal()), 3);
                } else {
                    this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) objO.hashCode()), 3);
                }
            }
            if (objL == null && iN == 207 && !t.c(objL, r.INSTANCE.a())) {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i15), 3) ^ ((long) objL.hashCode()), 3);
                return;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) iN) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i15), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) (objO instanceof Enum ? ((Enum) objO).ordinal() : objO.hashCode())), 3);
        j15 = 0;
        this.compositeKeyHashCode = jRotateLeft ^ j15;
        K1(slotReader.J(), null);
        o1();
        slotReader.g();
        if (objO != null) {
            if (objL == null) {
            }
            this.compositeKeyHashCode = Long.rotateRight(((long) iN) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i15), 3), 3);
        } else if (objO instanceof Enum) {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) ((Enum) objO).ordinal()), 3);
        } else {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) objO.hashCode()), 3);
        }
    }

    @Override // p076m2.r
    public void D(c4<?> value) {
        v3 v3VarF0 = F0();
        J1(201, t.h());
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
            if (value.getCanOverride() || !f0.a(v3VarF0, zVarB)) {
                v3VarF0 = v3VarF0.n1(zVarB, o6VarB);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            v3 v3Var = (v3) slotReader.A(slotReader.getCurrent());
            if (!(i() && zC) && (value.getCanOverride() || !f0.a(v3VarF0, zVarB))) {
                v3VarF0 = v3VarF0.n1(zVarB, o6VarB);
            } else if ((zC && !this.providersInvalid) || !this.providersInvalid) {
                v3VarF0 = v3Var;
            }
            if (!this.reusing && v3Var == v3VarF0) {
                z15 = false;
            }
            z16 = z15;
        }
        if (z16 && !getInserting()) {
            r1(v3VarF0);
        }
        this.providersInvalidStack.i(h1.r(this.providersInvalid));
        this.providersInvalid = z16;
        this.providerCache = v3VarF0;
        H1(202, t.f(), o2.c.INSTANCE.a(), v3VarF0);
    }

    @Override // p076m2.r
    public Object E() {
        return i1();
    }

    @Override // p076m2.r
    public h F() {
        h hVar = this._compositionData;
        if (hVar != null) {
            return hVar;
        }
        i1 i1Var = new i1(getComposition());
        this._compositionData = i1Var;
        return i1Var;
    }

    @Override // p076m2.r
    public boolean G(Object value) {
        if (h1() == value) {
            return false;
        }
        R1(value);
        return true;
    }

    @Override // p076m2.r
    public <T> void H(er.a<? extends T> factory) {
        T1();
        if (!getInserting()) {
            t.b("createNode() can only be called when inserting");
        }
        int iC = this.parentStateStack.c();
        SlotWriter slotWriter = this.writer;
        p2.c cVarB = slotWriter.B(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.b(factory, iC, cVarB);
    }

    @Override // p076m2.r
    public void I() {
        H1(-127, null, o2.c.INSTANCE.a(), null);
    }

    @Override // p076m2.r
    public void J(int key, Object dataKey) {
        H1(key, dataKey, o2.c.INSTANCE.a(), null);
    }

    @Override // p076m2.r
    public void K() {
        H1(125, null, o2.c.INSTANCE.c(), null);
        this.nodeExpected = true;
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
        if (!getInserting() && this.reader.n() == key && !t.c(this.reader.l(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrent();
            this.reusing = true;
        }
        H1(key, null, o2.c.INSTANCE.a(), dataKey);
    }

    public final void M1(Object value) {
        boolean z15 = value instanceof u4;
        Object obj = value;
        if (z15) {
            k1 k1Var = new k1((u4) value, t1());
            if (getInserting()) {
                this.changeListWriter.P(k1Var);
            }
            this.abandonSet.add(value);
            obj = k1Var;
        }
        R1(obj);
    }

    @Override // p076m2.r
    public <T> T N(z<T> key) {
        return (T) f0.b(F0(), key);
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
        if (this.invalidations.isEmpty()) {
            E1();
        } else {
            o1();
        }
    }

    @Override // p076m2.r
    public void P() {
        M0();
        M0();
        this.providersInvalid = h1.p(this.providersInvalidStack.g());
        this.providerCache = null;
    }

    @Override // p076m2.r
    public boolean Q() {
        f4 f4VarE0;
        return !i() || this.providersInvalid || ((f4VarE0 = e0()) != null && f4VarE0.k());
    }

    @Override // p076m2.r
    public void R() {
        M0();
    }

    public final void R1(Object value) {
        if (getInserting()) {
            this.writer.s1(value);
            return;
        }
        if (!this.reader.getHadNext()) {
            q2.c cVar = this.changeListWriter;
            SlotReader slotReader = this.reader;
            cVar.a(slotReader.a(slotReader.getParent()), value);
            return;
        }
        int iQ = this.reader.q() - 1;
        if (!this.changeListWriter.r()) {
            this.changeListWriter.e0(value, iQ);
            return;
        }
        q2.c cVar2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        cVar2.b0(value, slotReader2.a(slotReader2.getParent()), iQ);
    }

    @Override // p076m2.r
    public v T() {
        J1(206, t.j());
        if (getInserting()) {
            SlotWriter.z0(this.writer, 0, 1, null);
        }
        Object objH1 = h1();
        v4 z4Var = objH1 instanceof v4 ? (v4) objH1 : null;
        if (z4Var == null) {
            z4Var = new z4(new a(new b(getCompositeKeyHashCode(), this.forceRecomposeScopes, getSourceMarkersEnabled(), getComposition().getObserverHolder())), -1);
            R1(z4Var);
        }
        a aVar = (a) z4Var.getWrapped();
        aVar.getRef().E(F0());
        M0();
        return aVar.getRef();
    }

    @Override // p076m2.r
    public void U() {
        M0();
    }

    @Override // p076m2.r
    public void V() {
        M0();
    }

    /* JADX INFO: renamed from: V0, reason: from getter */
    public x getComposition() {
        return this.composition;
    }

    @Override // p076m2.r
    public boolean W(Object value) {
        if (t.c(h1(), value)) {
            return false;
        }
        R1(value);
        return true;
    }

    @Override // p076m2.q1
    /* JADX INFO: renamed from: W0, reason: from getter and merged with bridge method [inline-methods] */
    public q2.a getDeferredChanges() {
        return this.deferredChanges;
    }

    @Override // p076m2.r
    public void X(int key) {
        if (this.pending != null) {
            H1(key, null, o2.c.INSTANCE.a(), null);
            return;
        }
        U1();
        this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) key), 3) ^ ((long) this.rGroupIndex);
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.c();
            this.writer.n1(key, r.INSTANCE.a());
            P0(false, null);
            return;
        }
        if (slotReader.n() == key && !slotReader.s()) {
            slotReader.W();
            P0(false, null);
            return;
        }
        if (!slotReader.I()) {
            int i15 = this.nodeIndex;
            int current = slotReader.getCurrent();
            p1();
            this.changeListWriter.S(i15, slotReader.T());
            h1.G(this.invalidations, current, slotReader.getCurrent());
        }
        slotReader.c();
        this.inserting = true;
        this.providerCache = null;
        O0();
        SlotWriter slotWriter = this.writer;
        slotWriter.F();
        int currentGroup = slotWriter.getCurrentGroup();
        slotWriter.n1(key, r.INSTANCE.a());
        this.insertAnchor = slotWriter.B(currentGroup);
        P0(false, null);
    }

    @Override // p076m2.q1
    public void Y() {
        this.providerUpdates = null;
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final SlotReader getReader() {
        return this.reader;
    }

    @Override // p076m2.q1
    public void Z(t0<Object, Object> invalidationsRequested, p<? super r, ? super Integer, i0> content, e5 shouldPause) {
        if (!this.changes.c()) {
            t.b("Expected applyChanges() to have been called");
        }
        this.shouldPauseCallback = shouldPause;
        try {
            I0(invalidationsRequested, content);
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    @Override // p076m2.r
    public boolean a(boolean value) {
        Object objH1 = h1();
        if ((objH1 instanceof Boolean) && value == ((Boolean) objH1).booleanValue()) {
            return false;
        }
        R1(Boolean.valueOf(value));
        return true;
    }

    @Override // p076m2.q1
    public void a0() {
        e6.a(this.invalidateStack);
        this.invalidations.clear();
        this.changes.a();
        this.providerUpdates = null;
    }

    @Override // p076m2.r
    public boolean b(float value) {
        Object objH1 = h1();
        if ((objH1 instanceof Float) && value == ((Number) objH1).floatValue()) {
            return false;
        }
        R1(Float.valueOf(value));
        return true;
    }

    @Override // p076m2.q1
    public void b0() {
        Object objA = b0.f223360a.a("Compose:Composer.dispose");
        try {
            this.parentContext.y(this);
            a0();
            l().clear();
            this.isDisposed = true;
            i0 i0Var = i0.f148189a;
        } finally {
            b0.f223360a.b(objA);
        }
    }

    @Override // p076m2.r
    public boolean c(int value) {
        Object objH1 = h1();
        if ((objH1 instanceof Integer) && value == ((Number) objH1).intValue()) {
            return false;
        }
        R1(Integer.valueOf(value));
        return true;
    }

    @Override // p076m2.q1
    public void c0() {
        if (!(!getIsComposing() && this.reusingGroup == 0)) {
            w3.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // p076m2.r
    public boolean d(long value) {
        Object objH1 = h1();
        if ((objH1 instanceof Long) && value == ((Number) objH1).longValue()) {
            return false;
        }
        R1(Long.valueOf(value));
        return true;
    }

    @Override // p076m2.q1
    public boolean d0() {
        return this.childrenComposing > 0;
    }

    @Override // p076m2.r
    public void e(c4<?>[] values) {
        v3 v3VarP1;
        v3 v3VarF0 = F0();
        J1(201, t.h());
        boolean z15 = true;
        boolean z16 = false;
        if (getInserting()) {
            v3VarP1 = P1(v3VarF0, f0.d(values, v3VarF0, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            v3 v3Var = (v3) this.reader.B(0);
            v3 v3Var2 = (v3) this.reader.B(1);
            v3 v3VarC = f0.c(values, v3VarF0, v3Var2);
            if (i() && !this.reusing && t.c(v3Var2, v3VarC)) {
                D1();
                v3VarP1 = v3Var;
            } else {
                v3VarP1 = P1(v3VarF0, v3VarC);
                if (!this.reusing && t.c(v3VarP1, v3Var)) {
                    z15 = false;
                }
                z16 = z15;
            }
        }
        if (z16 && !getInserting()) {
            r1(v3VarP1);
        }
        this.providersInvalidStack.i(h1.r(this.providersInvalid));
        this.providersInvalid = z16;
        this.providerCache = v3VarP1;
        H1(202, t.f(), o2.c.INSTANCE.a(), v3VarP1);
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

    @Override // p076m2.r
    public void g(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            t.b("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            E1();
            return;
        }
        int current = this.reader.getCurrent();
        int end = this.reader.getEnd();
        this.changeListWriter.d();
        h1.G(this.invalidations, current, end);
        this.reader.U();
    }

    @Override // p076m2.q1
    public k g0() {
        if (this.parentContext.m()) {
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

    public final Object h1() {
        if (getInserting()) {
            U1();
            return r.INSTANCE.a();
        }
        Object objL = this.reader.L();
        return (!this.reusing || (objL instanceof b5)) ? objL : r.INSTANCE.a();
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

    public final Object i1() {
        if (getInserting()) {
            U1();
            return r.INSTANCE.a();
        }
        Object objL = this.reader.L();
        if (!this.reusing || (objL instanceof b5)) {
            return objL instanceof v4 ? ((v4) objL).getWrapped() : objL;
        }
        return r.INSTANCE.a();
    }

    @Override // p076m2.r
    public <V, T> void j(V value, p<? super T, ? super V, i0> block) {
        if (getInserting()) {
            this.insertFixups.f(value, block);
        } else {
            this.changeListWriter.d0(value, block);
        }
    }

    @Override // p076m2.q1
    public List<ComposeStackTraceFrame> j0() {
        Integer numE;
        u uVarI = this.parentContext.i();
        x xVar = uVarI instanceof x ? (x) uVarI : null;
        if (xVar != null && (numE = e3.c.e(p2.n.o(xVar.getSlotStorage()), this.parentContext)) != null) {
            SlotReader slotReaderU = p2.n.o(xVar.getSlotStorage()).U();
            try {
                return v.L0(e3.c.g(slotReaderU, numE.intValue(), 0), xVar.getComposer().j0());
            } finally {
                slotReaderU.d();
            }
        }
        return v.n();
    }

    @Override // p076m2.r
    public void k(List<oq.r<s2, s2>> references) {
        b0 b0Var = b0.f223360a;
        Object objA = b0Var.a("Compose:insertMovableContent");
        try {
            try {
                a1(references);
                B0();
                i0 i0Var = i0.f148189a;
                b0Var.b(objA);
            } catch (Throwable th4) {
                w0();
                throw th4;
            }
        } catch (Throwable th5) {
            b0.f223360a.b(objA);
            throw th5;
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
        if (n2.g.i(invalidationsRequested) <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        this.shouldPauseCallback = shouldPause;
        try {
            I0(invalidationsRequested, null);
            return this.changes.d();
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    @Override // p076m2.r
    public d5 m() {
        p2.c cVarA;
        f4 f4Var = null;
        f4 f4Var2 = e6.f(this.invalidateStack) ? (f4) e6.i(this.invalidateStack) : null;
        if (f4Var2 != null) {
            f4Var2.I(false);
            er.l<u, i0> lVarS0 = S0(f4Var2);
            if (lVarS0 != null) {
                this.changeListWriter.f(lVarS0, getComposition());
            }
            if (f4Var2.q()) {
                f4Var2.L(false);
                this.changeListWriter.k(f4Var2);
                f4Var2.M(false);
                if (f4Var2.p()) {
                    f4Var2.K(false);
                    if (this.reusingGroup == this.reader.getParent()) {
                        this.reusing = false;
                        this.reusingGroup = -1;
                    }
                }
            }
        }
        if (f4Var2 != null && !f4Var2.s() && (f4Var2.t() || this.forceRecomposeScopes)) {
            if (f4Var2.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    cVarA = slotWriter.B(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    cVarA = slotReader.a(slotReader.getParent());
                }
                f4Var2.D(cVarA);
            }
            f4Var2.F(false);
            f4Var = f4Var2;
        }
        L0(false);
        return f4Var;
    }

    @Override // p076m2.q1
    public e3.a m0(final Object value) {
        List listN;
        ObjectLocation objectLocationD = e3.c.d(this.slotTable, new er.l() { // from class: m2.y0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(e1.G1(value, obj));
            }
        });
        if (objectLocationD == null || (listN = v.L0(F1(objectLocationD.getGroup(), objectLocationD.getDataOffset()), j0())) == null) {
            listN = v.n();
        }
        return new e3.a(listN, getSourceMarkersEnabled());
    }

    @Override // p076m2.r
    public void n() {
        H1(125, null, o2.c.INSTANCE.b(), null);
        this.nodeExpected = true;
    }

    @Override // p076m2.q1
    public void n0() {
        this.reusingGroup = 0;
        this.reusing = true;
    }

    @Override // p076m2.r
    public void o(o2<?> value, Object parameter) {
        e1(value, F0(), parameter, false);
    }

    @Override // p076m2.q1
    public boolean o0(f4 scope, Object instance) {
        p076m2.b anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int iD = p2.d.a(anchor).d(this.reader.getTable());
        if (!getIsComposing() || iD < this.reader.getCurrent()) {
            return false;
        }
        h1.B(this.invalidations, iD, scope, instance);
        return true;
    }

    @Override // p076m2.r
    public void p(er.a<i0> effect) {
        this.changeListWriter.X(effect);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8 A[LOOP:1: B:20:0x0053->B:37:0x00a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[EDGE_INSN: B:45:0x00ab->B:38:0x00ab BREAK  A[LOOP:1: B:20:0x0053->B:37:0x00a8], SYNTHETIC] */
    @Override // p076m2.q1
    public void p0(t0<Object, Object> invalidationsRequested) {
        p2.c cVarA;
        for (int iP = v.p(this.invalidations); -1 < iP; iP--) {
            r1 r1Var = this.invalidations.get(iP);
            p076m2.b anchor = r1Var.getScope().getAnchor();
            p2.c cVarA2 = anchor != null ? p2.d.a(anchor) : null;
            if (cVarA2 == null || !cVarA2.a()) {
                this.invalidations.remove(iP);
            } else if (r1Var.getLocation() != cVarA2.getLocation()) {
                r1Var.f(cVarA2.getLocation());
            }
        }
        Object[] objArr = invalidationsRequested.keys;
        Object[] objArr2 = invalidationsRequested.values;
        long[] jArr = invalidationsRequested.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = objArr[i18];
                            Object obj2 = objArr2[i18];
                            f4 f4Var = (f4) obj;
                            p076m2.b anchor2 = f4Var.getAnchor();
                            if (anchor2 != null && (cVarA = p2.d.a(anchor2)) != null) {
                                int location = cVarA.getLocation();
                                List<r1> list = this.invalidations;
                                if (obj2 == c5.f122830a) {
                                    obj2 = null;
                                }
                                list.add(new r1(f4Var, location, obj2));
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    } else if (i15 != length) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        v.C(this.invalidations, h1.f122941a);
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
        this.changeListWriter.Q(f4VarE0);
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
        return F0();
    }

    @Override // p076m2.r
    public void u() {
        T1();
        if (getInserting()) {
            t.b("useNode() called while inserting");
        }
        Object objX0 = X0(this.reader);
        this.changeListWriter.x(objX0);
        if (this.reusing && (objX0 instanceof n)) {
            this.changeListWriter.f0(objX0);
        }
    }

    @Override // p076m2.r
    public void v(Object value) {
        M1(value);
    }

    @Override // p076m2.r
    public void w() {
        M0();
        M0();
        this.providersInvalid = h1.p(this.providersInvalidStack.g());
        this.providerCache = null;
    }

    @Override // p076m2.r
    public void x() {
        L0(true);
    }

    @Override // p076m2.r
    public void y() {
        M0();
        f4 f4VarE0 = e0();
        if (f4VarE0 == null || !f4VarE0.t()) {
            return;
        }
        f4VarE0.E(true);
    }

    @Override // p076m2.r
    public void z() {
        this.forceRecomposeScopes = true;
        B1(true);
        this.slotTable.g();
        this.insertTable.g();
        this.writer.B1();
    }
}
