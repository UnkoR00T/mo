package p34;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er0.BEDocumentStatus;
import er0.h;
import gr0.DynamicDocument;
import hr0.MultiDocumentSchema;
import iy.a0;
import iy.b0;
import java.util.List;
import java.util.Map;
import jr0.NipipScope;
import jr0.PersonalDataScope9;
import k34.AdvocateDataModel;
import k34.DeputyCardModel;
import k34.DrivingLicenceScopes;
import k34.FamilyDataModel;
import k34.PensionerCardDocumentData;
import k34.RailwayCardDocumentData;
import k34.StudentCardDocumentData;
import k34.UserDocumentData;
import k34.WruDocumentData;
import k34.g0;
import k34.j;
import l34.DynamicDocumentDataContainer;
import m34.DynamicMultiDocumentFullDataContainer;
import mu.g;
import o34.c;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J<\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H¦@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0015\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0019\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\u00180\tH¦@¢\u0006\u0004\b\u0019\u0010\u0014J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\tH¦@¢\u0006\u0004\b\u001b\u0010\u0014J4\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH¦@¢\u0006\u0004\b!\u0010\"J4\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH¦@¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b'\u0010\u0017J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020(0\tH&¢\u0006\u0004\b)\u0010*J\u001c\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+0\tH¦@¢\u0006\u0004\b,\u0010\u0014J\u001c\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+0\tH¦@¢\u0006\u0004\b-\u0010\u0014J$\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020.0\t2\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0004\b/\u00100J,\u00102\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020.0\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u000eH¦@¢\u0006\u0004\b2\u00103J*\u00104\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00120\t2\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0004\b4\u00100J\u001b\u00106\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002050\tH&¢\u0006\u0004\b6\u0010*J,\u00109\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020&H¦@¢\u0006\u0004\b9\u0010:J$\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u00107\u001a\u00020\u000eH¦@¢\u0006\u0004\b;\u0010<J,\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020&H¦@¢\u0006\u0004\b=\u0010:J\u0018\u0010>\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b>\u0010\u0017J,\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u000eH¦@¢\u0006\u0004\b@\u0010AJ#\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020B0\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\bC\u0010DJ\u001c\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020E0\tH¦@¢\u0006\u0004\bF\u0010\u0014J.\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010H\u001a\u00020G2\b\u0010I\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0004\bJ\u0010KJ#\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010M\u001a\u00020LH&¢\u0006\u0004\bN\u0010OJ\u001b\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020P0\tH&¢\u0006\u0004\bQ\u0010*J\u001b\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020R0\tH&¢\u0006\u0004\bS\u0010*J(\u0010U\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020T0\u00180\tH¦@¢\u0006\u0004\bU\u0010\u0014J2\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u00122\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\bX\u0010YJ,\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020[0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u000eH¦@¢\u0006\u0004\b\\\u0010AJ(\u0010^\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020]0\u00180\tH¦@¢\u0006\u0004\b^\u0010\u0014J\u001c\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020_0\tH¦@¢\u0006\u0004\b`\u0010\u0014J,\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010a\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004H¦@¢\u0006\u0004\bb\u0010cJ\u001e\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\bd\u0010\u0017J#\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020g0\t2\u0006\u0010f\u001a\u00020eH&¢\u0006\u0004\bh\u0010iJ,\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u000eH¦@¢\u0006\u0004\bj\u00103J,\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010f\u001a\u00020e2\u0006\u0010?\u001a\u00020\u000eH¦@¢\u0006\u0004\bk\u0010lJ9\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\bn\u0010oJ+\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010q\u001a\u00020p2\u0006\u0010f\u001a\u00020\u0002H&¢\u0006\u0004\br\u0010sJ:\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\u0006\u0010 \u001a\u00020\u001fH¦@¢\u0006\u0004\bt\u0010uJ!\u0010w\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020v0\u00120\tH&¢\u0006\u0004\bw\u0010*J\u001c\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020x0\tH¦@¢\u0006\u0004\by\u0010\u0014J(\u0010z\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020x0\u00180\tH¦@¢\u0006\u0004\bz\u0010\u0014J,\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00108\u001a\u00020&H¦@¢\u0006\u0004\b{\u0010:J\u001b\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH&¢\u0006\u0004\b|\u0010*J\u0016\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0}H&¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001c\u0010\u0082\u0001\u001a\u00020\u000b2\u0007\u0010\u0081\u0001\u001a\u00020~H¦@¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J)\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H¦@¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J!\u0010\u0088\u0001\u001a\u0011\u0012\u0004\u0012\u00020\n\u0012\u0007\u0012\u0005\u0018\u00010\u0084\u00010\tH¦@¢\u0006\u0005\b\u0088\u0001\u0010\u0014J2\u0010\u008b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0007\u0010\u0089\u0001\u001a\u00020\u000e2\b\u0010\u008a\u0001\u001a\u00030\u0084\u0001H¦@¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J(\u0010\u008d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\n\u0012\u0005\u0012\u00030\u0084\u00010\t2\u0007\u0010\u0089\u0001\u001a\u00020\u000eH¦@¢\u0006\u0005\b\u008d\u0001\u0010<J$\u0010\u008e\u0001\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\tH¦@¢\u0006\u0005\b\u008e\u0001\u0010\u0014J'\u0010\u008f\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0007\u0010\u0089\u0001\u001a\u00020\u000eH¦@¢\u0006\u0005\b\u008f\u0001\u0010<J\u001e\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH¦@¢\u0006\u0005\b\u0090\u0001\u0010\u0014J\u001f\u0010\u0091\u0001\u001a\u000f\u0012\u0004\u0012\u00020\n\u0012\u0005\u0012\u00030\u0084\u00010\tH¦@¢\u0006\u0005\b\u0091\u0001\u0010\u0014J)\u0010\u0092\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\b\u0010\u008a\u0001\u001a\u00030\u0084\u0001H¦@¢\u0006\u0006\b\u0092\u0001\u0010\u0087\u0001¨\u0006\u0093\u0001À\u0006\u0003"}, d2 = {"Lp34/a;", "", "Lrq0/b;", "documentType", "Liy/b0;", "peselTicket", "Liy/a0;", "certPkcs12", "password", "Ldx/i;", "Ldx/b;", "Loq/i0;", ip.a.f96138c, "(Lrq0/b;Liy/b0;Liy/a0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "", "dataScope", "x", "(Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "", "j", "(Ltq/e;)Ljava/lang/Object;", "document", "i", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "", "t", "Lk34/f0;", "a", "Lgr0/r;", "Lrq0/b$b;", "dynamicDocumentType", "Lk34/j;", "saveMode", "E", "(Lgr0/r;Lrq0/b$b;Lk34/j;Ltq/e;)Ljava/lang/Object;", "documentData", "V", "(Ljava/lang/String;Lrq0/b;Lk34/j;Ltq/e;)Ljava/lang/Object;", "", "g", "Lk34/p;", "Q", "()Ldx/i;", "Ljr0/j;", "y", "U", "Ll34/a;", "I", "(Lrq0/b$b;Ltq/e;)Ljava/lang/Object;", "documentIID", "v", "(Lrq0/b$b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Z", "Lk34/x;", "p", "scopeData", "clearAlreadySaved", i.f37094u, "(Ljava/lang/String;ZLtq/e;)Ljava/lang/Object;", "a0", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "z", "W", "documentId", "o", "(Lrq0/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lk34/k0;", "n", "(Lrq0/b;)Ldx/i;", "Ljr0/o;", "l", "Lk34/a0;", "scope", "documentPredicate", "T", "(Lk34/a0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "bundleId", "R", "(I)Ldx/i;", "Lk34/c0;", "X", "Lk34/b;", i.f37086m, "Lk34/r;", "c0", "Ler0/c;", "statuses", "r", "(Ljava/util/List;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "documentIid", "Ler0/h;", "G", "Lk34/z;", "b0", "Lk34/e;", "B", "packageData", "d", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "d0", "Lrq0/b$c;", "dynamicMultiDocumentType", "Lm34/a;", "J", "(Lrq0/b$c;)Ldx/i;", "M", "C", "(Lrq0/b$c;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "documents", "s", "(Ljava/util/List;Lrq0/b;Lk34/j;)Ldx/i;", "Lhr0/a;", "multiDocumentSchema", "A", "(Lhr0/a;Lrq0/b;)Ldx/i;", "Y", "(Lrq0/b;Ljava/util/List;Lk34/j;Ltq/e;)Ljava/lang/Object;", "Lk34/g0;", "O", "Lo34/c;", "F", "h", "N", ip.a.f96137b, "Lmu/g;", "Lk34/i;", "w", "()Lmu/g;", "documentContainerChanged", "K", "(Lk34/i;Ltq/e;)Ljava/lang/Object;", "", "passportsData", "f", "([BLtq/e;)Ljava/lang/Object;", "u", "processId", "data", i.f37087n, "(Ljava/lang/String;[BLtq/e;)Ljava/lang/Object;", "m", "b", "q", "c", "e", "k", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    dx.i<dx.b, i0> A(MultiDocumentSchema multiDocumentSchema, rq0.b dynamicMultiDocumentType);

    Object B(e<? super dx.i<? extends dx.b, DeputyCardModel>> eVar);

    Object C(rq0.b.c cVar, String str, e<? super dx.i<? extends dx.b, String>> eVar);

    Object D(rq0.b bVar, b0 b0Var, a0 a0Var, b0 b0Var2, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object E(DynamicDocument dynamicDocument, rq0.b.EnumC4479b enumC4479b, j jVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object F(e<? super dx.i<? extends dx.b, c>> eVar);

    Object G(rq0.b bVar, String str, e<? super dx.i<? extends dx.b, ? extends h>> eVar);

    Object H(String str, byte[] bArr, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object I(rq0.b.EnumC4479b enumC4479b, e<? super dx.i<? extends dx.b, DynamicDocumentDataContainer>> eVar);

    dx.i<dx.b, DynamicMultiDocumentFullDataContainer> J(rq0.b.c dynamicMultiDocumentType);

    Object K(k34.i iVar, e<? super i0> eVar);

    Object L(String str, boolean z15, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object M(rq0.b.EnumC4479b enumC4479b, String str, e<? super dx.i<? extends dx.b, String>> eVar);

    Object N(String str, boolean z15, e<? super dx.i<? extends dx.b, i0>> eVar);

    dx.i<dx.b, List<g0>> O();

    dx.i<dx.b, AdvocateDataModel> P();

    dx.i<dx.b, DrivingLicenceScopes> Q();

    dx.i<dx.b, String> R(int bundleId);

    dx.i<dx.b, i0> S();

    Object T(k34.a0 a0Var, String str, e<? super dx.i<? extends dx.b, String>> eVar);

    Object U(e<? super dx.i<? extends dx.b, NipipScope>> eVar);

    Object V(String str, rq0.b bVar, j jVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object W(rq0.b bVar, e<? super i0> eVar);

    dx.i<dx.b, StudentCardDocumentData> X();

    Object Y(rq0.b bVar, List<DynamicDocument> list, j jVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object Z(rq0.b.EnumC4479b enumC4479b, e<? super dx.i<? extends dx.b, ? extends List<DynamicDocumentDataContainer>>> eVar);

    Object a(e<? super dx.i<? extends dx.b, UserDocumentData>> eVar);

    Object a0(String str, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object b(e<? super dx.i<? extends dx.b, ? extends List<String>>> eVar);

    Object b0(e<? super dx.i<? extends dx.b, ? extends Map<String, RailwayCardDocumentData>>> eVar);

    Object c(e<? super dx.i<? extends dx.b, i0>> eVar);

    Object c0(e<? super dx.i<? extends dx.b, ? extends Map<String, FamilyDataModel>>> eVar);

    Object d(String str, b0 b0Var, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object d0(rq0.b bVar, e<? super List<? extends rq0.b>> eVar);

    Object e(e<? super dx.i<? extends dx.b, byte[]>> eVar);

    Object f(byte[] bArr, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object g(rq0.b bVar, e<? super Boolean> eVar);

    Object h(e<? super dx.i<? extends dx.b, ? extends Map<Integer, c>>> eVar);

    Object i(rq0.b bVar, e<? super List<String>> eVar);

    Object j(e<? super List<? extends rq0.b>> eVar);

    Object k(byte[] bArr, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object l(e<? super dx.i<? extends dx.b, PersonalDataScope9>> eVar);

    Object m(String str, e<? super dx.i<? extends dx.b, byte[]>> eVar);

    dx.i<dx.b, WruDocumentData> n(rq0.b documentType);

    Object o(rq0.b bVar, String str, e<? super dx.i<? extends dx.b, i0>> eVar);

    dx.i<dx.b, PensionerCardDocumentData> p();

    Object q(String str, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object r(List<BEDocumentStatus> list, rq0.b bVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    dx.i<dx.b, i0> s(List<DynamicDocument> documents, rq0.b documentType, j saveMode);

    Object t(e<? super dx.i<? extends dx.b, ? extends Map<rq0.b, ? extends List<String>>>> eVar);

    Object u(e<? super dx.i<? extends dx.b, byte[]>> eVar);

    Object v(rq0.b.EnumC4479b enumC4479b, String str, e<? super dx.i<? extends dx.b, DynamicDocumentDataContainer>> eVar);

    g<k34.i> w();

    Object x(String str, rq0.b bVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object y(e<? super dx.i<? extends dx.b, NipipScope>> eVar);

    Object z(String str, boolean z15, e<? super dx.i<? extends dx.b, i0>> eVar);
}
