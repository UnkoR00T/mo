package p24;

import f24.Document;
import f24.DocumentScope;
import fr.q0;
import g24.DocumentSchema;
import h24.MultiDocumentSchema;
import i24.AdvocateCardData;
import i24.DeputyCardData;
import i24.DrivingLicenceData;
import i24.DrivingLicenceFullData;
import i24.DynamicDocumentData;
import i24.DynamicDocumentScope;
import i24.DynamicMultiDocumentFullData;
import i24.FamilyCardData;
import i24.FamilyCardFullData;
import i24.MIdCardData;
import i24.NipipCardData;
import i24.PensionerCardData;
import i24.RailwayCardData;
import i24.RailwayCardFullData;
import i24.RefugeeCardData;
import i24.RefugeeChildrenCardFullData;
import i24.StudentCardData;
import i24.VehicleDocumentData;
import i24.VehicleDocumentsFullData;
import i24.WruDocumentData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import m24.DocumentEntity;
import m24.DocumentSchemaEntity;
import m24.DocumentScopeEntity;
import m24.DocumentWithScopes;
import m24.DocumentWithScopesAndSchemas;
import o24.DocumentSchemaDto;
import o24.DrivingLicenceScope;
import o24.MultiDocumentSchemaDto;
import o24.NipipScope;
import o24.PersonalDataScope9;
import o24.y0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.cms.CMSSignedData;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.deserializer.StrictNonNullAdapterFactory;
import pl.gov.coi.mobywatel.technical.containers.data.database.ContainersDatabase;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentEntityStatus;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentEntityType;
import pl.gov.coi.mobywatel.technical.containers.data.model.AdvocateCardDataDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.DeputyCardDataDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.FamilyCardScopeDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.PensionerCardDataDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.RailwayCardScopeDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.RefugeeCardDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.StudentCardDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.VehicleCardDataDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.WruLicenceDataDto;
import pq.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u000eH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001e0\u000eH\u0096@¢\u0006\u0004\b\u001f\u0010\u001dJ\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0\u000eH\u0096@¢\u0006\u0004\b!\u0010\u001dJ\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\"0\u000eH\u0096@¢\u0006\u0004\b#\u0010\u001dJ\u001c\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$0\u000eH\u0096@¢\u0006\u0004\b%\u0010\u001dJ\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$0\u000eH\u0096@¢\u0006\u0004\b&\u0010\u001dJ\u001c\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020'0\u000eH\u0096@¢\u0006\u0004\b(\u0010\u001dJ\u001c\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020)0\u000eH\u0096@¢\u0006\u0004\b*\u0010\u001dJ\u001c\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+0\u000eH\u0096@¢\u0006\u0004\b,\u0010\u001dJ\u001c\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020-0\u000eH\u0096@¢\u0006\u0004\b.\u0010\u001dJ\u001c\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020/0\u000eH\u0096@¢\u0006\u0004\b0\u0010\u001dJ\u001c\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002010\u000eH\u0096@¢\u0006\u0004\b2\u0010\u001dJ\u001c\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002030\u000eH\u0096@¢\u0006\u0004\b4\u0010\u001dJ$\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002060\u000e2\u0006\u00105\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b7\u00108J*\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020:090\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b;\u0010<J$\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020:0\u000e2\u0006\u00105\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b=\u00108J$\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020>0\u000e2\u0006\u00105\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b?\u00108JR\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u00105\u001a\u00020\u00142\u0006\u0010A\u001a\u00020@2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\bE\u0010FJR\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u00105\u001a\u00020\u00142\u0006\u0010A\u001a\u00020@2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\bG\u0010FJR\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u00105\u001a\u00020\u00142\u0006\u0010A\u001a\u00020@2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\bH\u0010FJZ\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u00105\u001a\u00020\u00142\u0006\u0010I\u001a\u00020\u00142\u0006\u0010A\u001a\u00020@2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\bJ\u0010KJZ\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u00105\u001a\u00020\u00142\u0006\u0010M\u001a\u00020L2\u0006\u0010A\u001a\u00020@2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\bN\u0010OJb\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u00105\u001a\u00020\u00142\u0006\u0010I\u001a\u00020\u00142\u0006\u0010M\u001a\u00020L2\u0006\u0010A\u001a\u00020@2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\bP\u0010QJ$\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020R0\u000e2\u0006\u00105\u001a\u00020\u0014H\u0096@¢\u0006\u0004\bS\u00108J$\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020R0\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\bT\u0010<J$\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u00105\u001a\u00020\u0014H\u0096@¢\u0006\u0004\bU\u00108J$\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\bV\u0010<J\"\u0010X\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020W090\u000eH\u0096@¢\u0006\u0004\bX\u0010\u001dJ$\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020W0\u000e2\u0006\u00105\u001a\u00020\u0014H\u0096@¢\u0006\u0004\bY\u00108J*\u0010Z\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020W090\u000e2\u0006\u0010A\u001a\u00020@H\u0096@¢\u0006\u0004\bZ\u0010[J$\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\\0\u000e2\u0006\u00105\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b]\u00108J$\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\\0\u000e2\u0006\u0010^\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b_\u00108J.\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010`\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\ba\u0010bJ,\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u00105\u001a\u00020\u00142\u0006\u0010d\u001a\u00020cH\u0096@¢\u0006\u0004\be\u0010fJ,\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010I\u001a\u00020\u00142\u0006\u0010M\u001a\u00020gH\u0096@¢\u0006\u0004\bh\u0010iJ,\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u00105\u001a\u00020\u00142\u0006\u0010j\u001a\u00020CH\u0096@¢\u0006\u0004\bk\u0010lR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010mR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010nR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010oR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010pR\u0014\u0010s\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010r¨\u0006t"}, d2 = {"Lp24/b;", "Lv24/b;", "Lp10/f;", "dbProvider", "Lez/a;", "currentTimeProvider", "Liy/e0;", "signedDataDecoder", "Lay/i;", "jsonFieldParser", "Lay/h;", "jsonFactory", "<init>", "(Lp10/f;Lez/a;Liy/e0;Lay/i;Lay/h;)V", "Ldx/i;", "Ldx/b;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/ContainersDatabase;", "M", "()Ldx/i;", "", "", "Lorg/bouncycastle/cms/CMSSignedData;", "Lf24/i;", "documentType", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ljava/util/Map;Lf24/i;)Ldx/i;", "Li24/v;", "u", "(Ltq/e;)Ljava/lang/Object;", "Li24/o0;", "E", "Li24/s0;", "s", "Li24/l;", "m", "Li24/a0;", "o", "z", "Li24/d0;", "p", "Li24/b;", "n", "Li24/e;", "k", "Li24/q0;", "j", "Li24/t;", "C", "Li24/l0;", "K", "Li24/z0;", "J", "documentId", "Li24/b1;", "x", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "Li24/o;", "A", "(Lf24/i;Ltq/e;)Ljava/lang/Object;", "d", "Li24/q;", "I", "", "certificateId", "scopes", "Lfz/b$c;", "expirationDate", "q", "(Ljava/lang/String;ILjava/util/Map;Lfz/b$c;Lf24/i;Ltq/e;)Ljava/lang/Object;", "v", "t", "parentId", "F", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Lfz/b$c;Lf24/i;Ltq/e;)Ljava/lang/Object;", "Lg24/h;", "documentSchema", "w", "(Ljava/lang/String;Lg24/h;ILjava/util/Map;Lfz/b$c;Lf24/i;Ltq/e;)Ljava/lang/Object;", "l", "(Ljava/lang/String;Ljava/lang/String;Lg24/h;ILjava/util/Map;Lfz/b$c;Lf24/i;Ltq/e;)Ljava/lang/Object;", "", "g", "y", "b", "G", "Lf24/e;", "a", "c", "h", "(ILtq/e;)Ljava/lang/Object;", "Lf24/g;", "e", "scopeName", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "additionalKey", "f", "(Lf24/i;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lf24/h;", "newStatus", "r", "(Ljava/lang/String;Lf24/h;Ltq/e;)Ljava/lang/Object;", "Lh24/a;", "B", "(Ljava/lang/String;Lh24/a;Ltq/e;)Ljava/lang/Object;", "newExpirationDate", "i", "(Ljava/lang/String;Lfz/b$c;Ltq/e;)Ljava/lang/Object;", "Lp10/f;", "Lez/a;", "Liy/e0;", "Lay/i;", "Lay/j;", "Lay/j;", "strictNonNullSerializer", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements v24.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p10.f dbProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.e0 signedDataDecoder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ay.i jsonFieldParser;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ay.j strictNonNullSerializer;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f152103a;

        static {
            int[] iArr = new int[f24.i.values().length];
            try {
                iArr[f24.i.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f24.i.REFUGEE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f24.i.STUDENT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f24.i.FAMILY_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f24.i.RAILWAY_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f24.i.DRIVING_LICENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f24.i.VEHICLE_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f24.i.REFUGEE_CHILD_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[f24.i.PENSIONER_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[f24.i.DEPUTY_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[f24.i.ADVOCATE_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[f24.i.MIDWIFE_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[f24.i.NURSE_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[f24.i.RASKA_SENIOR_LICENCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[f24.i.ZDUNSKOWOLSKA_RESIDENT_LICENCE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[f24.i.OLAWA_RESIDENT_LICENCE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[f24.i.OLAWA_FAMILY_LICENCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[f24.i.OLAWA_SENIOR_LICENCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[f24.i.ZDUNSKOWOLSKA_FAMILY_LICENCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[f24.i.ZDUNSKOWOLSKA_SENIOR_LICENCE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[f24.i.SUCHY_LAS_FAMILY_LICENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[f24.i.MIEJSKA_AUGUSTOW_TOURIST_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[f24.i.CHELM_FAMILY_LICENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[f24.i.CHELM_SENIOR_LICENCE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[f24.i.CHELM_RESIDENT_LICENCE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[f24.i.LODZ_SENIOR_LICENCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[f24.i.LODZ_FAMILY_LICENCE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[f24.i.SENATOR_CARD.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[f24.i.RACIBORSKA_RESIDENT_LICENCE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[f24.i.RACIBORSKA_SENIOR_LICENCE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[f24.i.RACIBORSKA_FAMILY_LICENCE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[f24.i.GIZYCKA_RESIDENT_LICENCE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[f24.i.PZPN_LICENCE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[f24.i.KOBYLKA_RESIDENT_LICENCE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[f24.i.WROCLAWSKA_SENIOR_LICENCE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[f24.i.MIEKINIA_SENIOR_LICENCE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[f24.i.MIEKINIA_FAMILY_LICENCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[f24.i.TOPR_LICENCE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[f24.i.MAZOVIA_LICENCE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[f24.i.GENERAL_COUNSEL_LICENCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[f24.i.OLECKO_RESIDENT_LICENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[f24.i.BYDGOSZCZ_FAMILY_LICENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[f24.i.WODZISLAW_FAMILY_LICENCE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[f24.i.MICHALOWICE_RESIDENT_LICENCE.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[f24.i.KOLEJE_DOLNOSLASKIE_LICENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[f24.i.WISLA_RESIDENT_LICENCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[f24.i.JASTRZEBIA_GORA_RESIDENT_LICENCE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[f24.i.FIREFIGHTER_OSP_LICENCE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[f24.i.DOCTOR.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[f24.i.DENTIST.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[f24.i.ATTORNEY_AT_LAW.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[f24.i.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[f24.i.CIVIL_ENGINEER.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[f24.i.TAX_ADVISOR.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[f24.i.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[f24.i.AUDITOR.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[f24.i.SOLIDARITY_CARD.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[f24.i.PHD_STUDENT.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[f24.i.PHYSIOTHERAPIST.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[f24.i.PHARMACIST.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[f24.i.SHOOTING_LICENCE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[f24.i.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[f24.i.TEACHER.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[f24.i.BAILIFF_CARD.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[f24.i.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[f24.i.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[f24.i.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[f24.i.LABORATORY_DIAGNOSTICIAN.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[f24.i.PENSIONER_MSWIA.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            f152103a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152104d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152107g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152108h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152109j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152110k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152111l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152112m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f152113n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152114p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152115q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f152116r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f152118t;

        a0(tq.e<? super a0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152116r = obj;
            this.f152118t |= PKIFailureInfo.systemUnavail;
            return b.this.B(null, null, this);
        }
    }

    /* JADX INFO: renamed from: p24.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3746b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152121f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152122g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152123h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152124j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152125k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152126l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152127m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152128n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152130q;

        C3746b(tq.e<? super C3746b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152128n = obj;
            this.f152130q |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152134g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152135h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152136j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152137k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152138l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152139m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152140n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152142q;

        b0(tq.e<? super b0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152140n = obj;
            this.f152142q |= PKIFailureInfo.systemUnavail;
            return b.this.g(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152145f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152146g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152147h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152148j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152149k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152150l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152151m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152152n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152154q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152152n = obj;
            this.f152154q |= PKIFailureInfo.systemUnavail;
            return b.this.G(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152157f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152158g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152159h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152160j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152161k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152162l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152163m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152164n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152166q;

        c0(tq.e<? super c0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152164n = obj;
            this.f152166q |= PKIFailureInfo.systemUnavail;
            return b.this.y(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152170g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152171h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152172j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152173k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152174l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152175m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152177p;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152175m = obj;
            this.f152177p |= PKIFailureInfo.systemUnavail;
            return b.this.n(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152181g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152182h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152183j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152184k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152185l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f152186m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f152187n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152188p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152189q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f152190r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f152191s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f152192t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f152193v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f152195x;

        d0(tq.e<? super d0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152193v = obj;
            this.f152195x |= PKIFailureInfo.systemUnavail;
            return b.this.v(null, 0, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152196d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152198f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152199g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152200h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152201j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152202k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152203l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152204m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152206p;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152204m = obj;
            this.f152206p |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e0 extends vq.d {
        int A;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152209f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152210g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152211h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152212j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152213k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152214l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f152215m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f152216n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f152217p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f152218q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f152219r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f152220s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f152221t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f152222v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f152223w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f152224x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f152225y;

        e0(tq.e<? super e0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152225y = obj;
            this.A |= PKIFailureInfo.systemUnavail;
            return b.this.w(null, null, 0, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152227d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152229f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152230g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152231h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152232j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152233k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152234l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f152235m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152236n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152238q;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152236n = obj;
            this.f152238q |= PKIFailureInfo.systemUnavail;
            return b.this.h(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f0 extends vq.d {
        int B;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152242g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152243h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152244j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152245k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152246l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f152247m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f152248n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f152249p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f152250q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f152251r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f152252s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f152253t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f152254v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f152255w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f152256x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f152257y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        /* synthetic */ Object f152258z;

        f0(tq.e<? super f0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152258z = obj;
            this.B |= PKIFailureInfo.systemUnavail;
            return b.this.l(null, null, null, 0, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152262g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152263h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152264j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152265k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152266l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152267m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152268n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152270q;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152268n = obj;
            this.f152270q |= PKIFailureInfo.systemUnavail;
            return b.this.A(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152273f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152275h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152276j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152277k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152278l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f152279m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f152280n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152281p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152282q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f152283r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f152284s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f152285t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f152286v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f152288x;

        g0(tq.e<? super g0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152286v = obj;
            this.f152288x |= PKIFailureInfo.systemUnavail;
            return b.this.q(null, 0, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152291f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152292g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152293h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152294j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152295k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152296l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152297m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152299p;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152297m = obj;
            this.f152299p |= PKIFailureInfo.systemUnavail;
            return b.this.k(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152304h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152305j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152306k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152307l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f152308m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f152309n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152310p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152311q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f152312r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f152313s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f152314t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f152315v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f152317x;

        h0(tq.e<? super h0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152315v = obj;
            this.f152317x |= PKIFailureInfo.systemUnavail;
            return b.this.F(null, null, 0, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152321g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152322h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152323j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152324k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152325l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152326m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152327n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152329q;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152327n = obj;
            this.f152329q |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152332f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152333g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152334h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152335j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152336k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152337l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f152338m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f152339n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152340p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152341q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f152342r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f152343s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f152344t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f152345v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f152346w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f152348y;

        i0(tq.e<? super i0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152346w = obj;
            this.f152348y |= PKIFailureInfo.systemUnavail;
            return b.this.t(null, 0, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152351f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152352g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152353h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152354j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152355k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152356l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152357m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f152358n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152359p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f152360q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f152362s;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152360q = obj;
            this.f152362s |= PKIFailureInfo.systemUnavail;
            return b.this.f(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152365f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152366g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152367h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152368j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152369k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152370l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152371m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f152372n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f152373p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f152375r;

        j0(tq.e<? super j0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152373p = obj;
            this.f152375r |= PKIFailureInfo.systemUnavail;
            return b.this.i(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152379g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152380h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152381j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152382k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152383l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152384m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152385n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152387q;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152385n = obj;
            this.f152387q |= PKIFailureInfo.systemUnavail;
            return b.this.H(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152390f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152391g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152392h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152393j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152394k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152395l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152396m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f152397n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f152398p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f152400r;

        k0(tq.e<? super k0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152398p = obj;
            this.f152400r |= PKIFailureInfo.systemUnavail;
            return b.this.r(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152405h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152406j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152407k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152408l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152409m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152410n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152412q;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152410n = obj;
            this.f152412q |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152415f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152416g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152417h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152418j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152419k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152420l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152421m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152423p;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152421m = obj;
            this.f152423p |= PKIFailureInfo.systemUnavail;
            return b.this.m(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class n extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152426f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152427g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152428h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152429j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152430k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152431l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152432m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152433n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152435q;

        n(tq.e<? super n> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152433n = obj;
            this.f152435q |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152439g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152440h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152441j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152442k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152443l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152444m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152446p;

        o(tq.e<? super o> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152444m = obj;
            this.f152446p |= PKIFailureInfo.systemUnavail;
            return b.this.C(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class p extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152449f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152450g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152451h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152452j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152453k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152454l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152455m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152457p;

        p(tq.e<? super p> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152455m = obj;
            this.f152457p |= PKIFailureInfo.systemUnavail;
            return b.this.u(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152460f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152461g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152462h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152463j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152464k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152465l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152466m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152468p;

        q(tq.e<? super q> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152466m = obj;
            this.f152468p |= PKIFailureInfo.systemUnavail;
            return b.this.z(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class r extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152471f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152472g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f152473h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152474j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152475k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152476l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152477m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f152478n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f152479p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f152481r;

        r(tq.e<? super r> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152479p = obj;
            this.f152481r |= PKIFailureInfo.systemUnavail;
            return b.this.I(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class s extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152482d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152484f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152485g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152486h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152487j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152488k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152489l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152490m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152492p;

        s(tq.e<? super s> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152490m = obj;
            this.f152492p |= PKIFailureInfo.systemUnavail;
            return b.this.o(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class t extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152497h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152498j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152499k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152500l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152501m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152503p;

        t(tq.e<? super t> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152501m = obj;
            this.f152503p |= PKIFailureInfo.systemUnavail;
            return b.this.p(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class u extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152506f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152508h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152509j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152510k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152511l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152512m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152514p;

        u(tq.e<? super u> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152512m = obj;
            this.f152514p |= PKIFailureInfo.systemUnavail;
            return b.this.K(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class v extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152517f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152518g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152519h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152520j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152521k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152522l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152523m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152525p;

        v(tq.e<? super v> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152523m = obj;
            this.f152525p |= PKIFailureInfo.systemUnavail;
            return b.this.E(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class w extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152529g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152530h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152531j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152532k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152533l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152534m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152536p;

        w(tq.e<? super w> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152534m = obj;
            this.f152536p |= PKIFailureInfo.systemUnavail;
            return b.this.j(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class x extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152540g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152541h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152542j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152543k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152544l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152545m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152547p;

        x(tq.e<? super x> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152545m = obj;
            this.f152547p |= PKIFailureInfo.systemUnavail;
            return b.this.s(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class y extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f152548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f152550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f152551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152552h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f152553j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f152554k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f152555l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f152556m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f152558p;

        y(tq.e<? super y> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152556m = obj;
            this.f152558p |= PKIFailureInfo.systemUnavail;
            return b.this.J(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class z extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f152559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f152560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f152561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f152562g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f152563h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f152564j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f152565k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f152566l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f152567m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f152568n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f152570q;

        z(tq.e<? super z> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f152568n = obj;
            this.f152570q |= PKIFailureInfo.systemUnavail;
            return b.this.x(null, this);
        }
    }

    public b(p10.f fVar, ez.a aVar, iy.e0 e0Var, ay.i iVar, ay.h hVar) {
        this.dbProvider = fVar;
        this.currentTimeProvider = aVar;
        this.signedDataDecoder = e0Var;
        this.jsonFieldParser = iVar;
        this.strictNonNullSerializer = hVar.a(new StrictNonNullAdapterFactory());
    }

    private final dx.i<dx.b, oq.i0> L(Map<String, ? extends CMSSignedData> map, f24.i iVar) {
        Object objB;
        List listQ;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    switch (a.f152103a[iVar.ordinal()]) {
                        case 1:
                            listQ = pq.v.q(new y0.Equal("PERSONAL_DATA_SCOPE_1"), new y0.Equal("PERSONAL_DATA_SCOPE_2"), new y0.Equal("PERSONAL_DATA_SCOPE_3"), new y0.Equal("PERSONAL_DATA_SCOPE_4"), new y0.Equal("PERSONAL_DATA_SCOPE_5"), new y0.Equal("PERSONAL_DATA_SCOPE_6"), new y0.Equal("PERSONAL_DATA_SCOPE_7"), new y0.Equal("PERSONAL_DATA_SCOPE_8"), new y0.Equal("PERSONAL_DATA_SCOPE_9"));
                            break;
                        case 2:
                            listQ = pq.v.q(new y0.Equal("REFUGEE_SCOPE_3001"), new y0.Equal("REFUGEE_SCOPE_3002"));
                            break;
                        case 3:
                            listQ = pq.v.q(new y0.Equal("fullStudentData"), new y0.Equal("basicStudentData"));
                            break;
                        case 4:
                            listQ = pq.v.e(y0.c.f141687a);
                            break;
                        case 5:
                            listQ = pq.v.e(y0.c.f141687a);
                            break;
                        case 6:
                            listQ = pq.v.q(new y0.Equal("DRIVING_LICENCE"), new y0.Equal("ACTIVE_TEMPORARY_DRIVING_LICENCE"), new y0.Equal("INVALIDATED_TEMPORARY_DRIVING_LICENCE"));
                            break;
                        case 7:
                            listQ = pq.v.e(y0.c.f141687a);
                            break;
                        case 8:
                            listQ = pq.v.q(new y0.Contains("REFUGEE_SCOPE_3001"), new y0.Contains("REFUGEE_SCOPE_3002"));
                            break;
                        case 9:
                            listQ = pq.v.e(new y0.Equal("PENSIONER_DATA_KEY"));
                            break;
                        case 10:
                            listQ = pq.v.q(new y0.Equal("DEPUTY_SCOPE_ZERO"), new y0.Equal("DEPUTY_SCOPE_ONE"));
                            break;
                        case 11:
                            listQ = pq.v.q(new y0.Equal("ADVOCATE_SCOPE_ZERO"), new y0.Equal("ADVOCATE_SCOPE_ONE"));
                            break;
                        case 12:
                            listQ = pq.v.e(new y0.Equal("ENCRYPTION_NIPIP_MIDWIFE"));
                            break;
                        case 13:
                            listQ = pq.v.e(new y0.Equal("ENCRYPTION_NIPIP_NURSE"));
                            break;
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case BERTags.DATE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        case 40:
                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        case EACTags.CURRENCY_CODE /* 42 */:
                        case EACTags.DATE_OF_BIRTH /* 43 */:
                        case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                        case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                        case 46:
                        case 47:
                        case 48:
                            listQ = pq.v.e(new y0.Equal("licenseData"));
                            break;
                        case 49:
                            listQ = pq.v.e(new y0.Equal("DOCTOR"));
                            break;
                        case 50:
                            listQ = pq.v.e(new y0.Equal("DENTIST"));
                            break;
                        case EACTags.TRANSACTION_DATE /* 51 */:
                            listQ = pq.v.e(new y0.Equal("ATTORNEY_AT_LAW"));
                            break;
                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                            listQ = pq.v.e(new y0.Equal("TRAINEE_ATTORNEY_AT_LAW"));
                            break;
                        case 53:
                            listQ = pq.v.e(new y0.Equal("CIVIL_ENGINEER"));
                            break;
                        case EACTags.CURRENCY_EXPONENT /* 54 */:
                            listQ = pq.v.e(new y0.Equal("TAX_ADVISOR"));
                            break;
                        case 55:
                            listQ = pq.v.e(new y0.Equal("JUNIOR_SCHOOL_CARD_MOBYWATEL_APP"));
                            break;
                        case 56:
                            listQ = pq.v.e(new y0.Equal("AUDITOR"));
                            break;
                        case 57:
                            listQ = pq.v.e(new y0.Equal("SOLIDARITY_CARD"));
                            break;
                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                            listQ = pq.v.e(new y0.Equal("PHD_STUDENT"));
                            break;
                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                            listQ = pq.v.e(new y0.Equal("PHYSIOTHERAPIST"));
                            break;
                        case 60:
                            listQ = pq.v.e(new y0.Equal("PHARMACIST"));
                            break;
                        case 61:
                            listQ = pq.v.e(new y0.Equal("SHOOTING_LICENCE"));
                            break;
                        case 62:
                            listQ = pq.v.e(new y0.Equal("SPORT_SHOOTING_COMPETITOR_LICENCE"));
                            break;
                        case 63:
                            listQ = pq.v.e(new y0.Equal("SPORT_SHOOTING_COACH_LICENCE"));
                            break;
                        case 64:
                            listQ = pq.v.e(new y0.Equal("SPORT_SHOOTING_INSTRUCTOR_LICENCE"));
                            break;
                        case 65:
                            listQ = pq.v.e(new y0.Equal("SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING"));
                            break;
                        case 66:
                            listQ = pq.v.e(new y0.Equal("SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING"));
                            break;
                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                            listQ = pq.v.e(new y0.Equal("SPORT_SHOOTING_RANGE_OFFICER_LICENCE"));
                            break;
                        case EACTags.APPLICATION_IMAGE /* 68 */:
                            listQ = pq.v.e(new y0.Equal("DISABLED_PERSON"));
                            break;
                        case EACTags.DISPLAY_IMAGE /* 69 */:
                            listQ = pq.v.e(new y0.Equal("TEACHER"));
                            break;
                        case 70:
                            listQ = pq.v.e(new y0.Equal("BAILIFF"));
                            break;
                        case EACTags.MESSAGE_REFERENCE /* 71 */:
                            listQ = pq.v.e(new y0.Equal("ELECTRONIC_DIPLOMA_GRADUATION"));
                            break;
                        case 72:
                            listQ = pq.v.e(new y0.Equal("ELECTRONIC_DIPLOMA_PHD"));
                            break;
                        case 73:
                            listQ = pq.v.e(new y0.Equal("ELECTRONIC_DIPLOMA_DSC"));
                            break;
                        case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                            listQ = pq.v.e(new y0.Equal("LABORATORY_DIAGNOSTICIAN"));
                            break;
                        case EACTags.DEPRECATED /* 75 */:
                            listQ = pq.v.e(new y0.Equal("PENSIONER_MSWIA"));
                            break;
                        default:
                            throw new oq.p();
                    }
                    Set<String> setKeySet = map.keySet();
                    if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                        for (String str : setKeySet) {
                            List list = listQ;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    if (((y0) it.next()).a(str)) {
                                        return new dx.i.Right(oq.i0.f148189a);
                                    }
                                }
                            }
                        }
                    }
                    aVar.b(new dx.b.Generic(new NoSuchElementException("No scope named listed in " + iVar + " allowedScopes in the scopes")));
                    throw new oq.g();
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, ContainersDatabase> M() {
        return this.dbProvider.b(ContainersDatabase.class, pq.v.n(), pq.v.n(), ContainersDatabase.INSTANCE.a());
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0232 A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #9 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x0090, B:29:0x0098, B:30:0x00a5, B:32:0x00ab, B:34:0x00be, B:37:0x00c6, B:72:0x018b, B:74:0x018f, B:75:0x0199, B:77:0x019d, B:79:0x01bb, B:106:0x0243, B:108:0x0247, B:109:0x0250, B:111:0x0254, B:112:0x0274, B:113:0x0279, B:92:0x01f5, B:95:0x01fe, B:97:0x020d, B:101:0x0225, B:98:0x021b, B:100:0x021f, B:102:0x022b, B:103:0x0230, B:104:0x0231, B:105:0x0232, B:114:0x027a, B:115:0x027f, B:62:0x0156, B:65:0x015f, B:67:0x016e, B:71:0x0186, B:68:0x017c, B:70:0x0180, B:116:0x0280, B:117:0x0285, B:118:0x0286, B:120:0x0289, B:121:0x028e, B:122:0x0295, B:123:0x02bd, B:130:0x02c7, B:133:0x02d5), top: B:149:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0247 A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #9 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x0090, B:29:0x0098, B:30:0x00a5, B:32:0x00ab, B:34:0x00be, B:37:0x00c6, B:72:0x018b, B:74:0x018f, B:75:0x0199, B:77:0x019d, B:79:0x01bb, B:106:0x0243, B:108:0x0247, B:109:0x0250, B:111:0x0254, B:112:0x0274, B:113:0x0279, B:92:0x01f5, B:95:0x01fe, B:97:0x020d, B:101:0x0225, B:98:0x021b, B:100:0x021f, B:102:0x022b, B:103:0x0230, B:104:0x0231, B:105:0x0232, B:114:0x027a, B:115:0x027f, B:62:0x0156, B:65:0x015f, B:67:0x016e, B:71:0x0186, B:68:0x017c, B:70:0x0180, B:116:0x0280, B:117:0x0285, B:118:0x0286, B:120:0x0289, B:121:0x028e, B:122:0x0295, B:123:0x02bd, B:130:0x02c7, B:133:0x02d5), top: B:149:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0250 A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #9 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x0090, B:29:0x0098, B:30:0x00a5, B:32:0x00ab, B:34:0x00be, B:37:0x00c6, B:72:0x018b, B:74:0x018f, B:75:0x0199, B:77:0x019d, B:79:0x01bb, B:106:0x0243, B:108:0x0247, B:109:0x0250, B:111:0x0254, B:112:0x0274, B:113:0x0279, B:92:0x01f5, B:95:0x01fe, B:97:0x020d, B:101:0x0225, B:98:0x021b, B:100:0x021f, B:102:0x022b, B:103:0x0230, B:104:0x0231, B:105:0x0232, B:114:0x027a, B:115:0x027f, B:62:0x0156, B:65:0x015f, B:67:0x016e, B:71:0x0186, B:68:0x017c, B:70:0x0180, B:116:0x0280, B:117:0x0285, B:118:0x0286, B:120:0x0289, B:121:0x028e, B:122:0x0295, B:123:0x02bd, B:130:0x02c7, B:133:0x02d5), top: B:149:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0254 A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #9 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x0090, B:29:0x0098, B:30:0x00a5, B:32:0x00ab, B:34:0x00be, B:37:0x00c6, B:72:0x018b, B:74:0x018f, B:75:0x0199, B:77:0x019d, B:79:0x01bb, B:106:0x0243, B:108:0x0247, B:109:0x0250, B:111:0x0254, B:112:0x0274, B:113:0x0279, B:92:0x01f5, B:95:0x01fe, B:97:0x020d, B:101:0x0225, B:98:0x021b, B:100:0x021f, B:102:0x022b, B:103:0x0230, B:104:0x0231, B:105:0x0232, B:114:0x027a, B:115:0x027f, B:62:0x0156, B:65:0x015f, B:67:0x016e, B:71:0x0186, B:68:0x017c, B:70:0x0180, B:116:0x0280, B:117:0x0285, B:118:0x0286, B:120:0x0289, B:121:0x028e, B:122:0x0295, B:123:0x02bd, B:130:0x02c7, B:133:0x02d5), top: B:149:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0295 A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #9 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x0090, B:29:0x0098, B:30:0x00a5, B:32:0x00ab, B:34:0x00be, B:37:0x00c6, B:72:0x018b, B:74:0x018f, B:75:0x0199, B:77:0x019d, B:79:0x01bb, B:106:0x0243, B:108:0x0247, B:109:0x0250, B:111:0x0254, B:112:0x0274, B:113:0x0279, B:92:0x01f5, B:95:0x01fe, B:97:0x020d, B:101:0x0225, B:98:0x021b, B:100:0x021f, B:102:0x022b, B:103:0x0230, B:104:0x0231, B:105:0x0232, B:114:0x027a, B:115:0x027f, B:62:0x0156, B:65:0x015f, B:67:0x016e, B:71:0x0186, B:68:0x017c, B:70:0x0180, B:116:0x0280, B:117:0x0285, B:118:0x0286, B:120:0x0289, B:121:0x028e, B:122:0x0295, B:123:0x02bd, B:130:0x02c7, B:133:0x02d5), top: B:149:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0098 A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #9 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x0090, B:29:0x0098, B:30:0x00a5, B:32:0x00ab, B:34:0x00be, B:37:0x00c6, B:72:0x018b, B:74:0x018f, B:75:0x0199, B:77:0x019d, B:79:0x01bb, B:106:0x0243, B:108:0x0247, B:109:0x0250, B:111:0x0254, B:112:0x0274, B:113:0x0279, B:92:0x01f5, B:95:0x01fe, B:97:0x020d, B:101:0x0225, B:98:0x021b, B:100:0x021f, B:102:0x022b, B:103:0x0230, B:104:0x0231, B:105:0x0232, B:114:0x027a, B:115:0x027f, B:62:0x0156, B:65:0x015f, B:67:0x016e, B:71:0x0186, B:68:0x017c, B:70:0x0180, B:116:0x0280, B:117:0x0285, B:118:0x0286, B:120:0x0289, B:121:0x028e, B:122:0x0295, B:123:0x02bd, B:130:0x02c7, B:133:0x02d5), top: B:149:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #9 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x0090, B:29:0x0098, B:30:0x00a5, B:32:0x00ab, B:34:0x00be, B:37:0x00c6, B:72:0x018b, B:74:0x018f, B:75:0x0199, B:77:0x019d, B:79:0x01bb, B:106:0x0243, B:108:0x0247, B:109:0x0250, B:111:0x0254, B:112:0x0274, B:113:0x0279, B:92:0x01f5, B:95:0x01fe, B:97:0x020d, B:101:0x0225, B:98:0x021b, B:100:0x021f, B:102:0x022b, B:103:0x0230, B:104:0x0231, B:105:0x0232, B:114:0x027a, B:115:0x027f, B:62:0x0156, B:65:0x015f, B:67:0x016e, B:71:0x0186, B:68:0x017c, B:70:0x0180, B:116:0x0280, B:117:0x0285, B:118:0x0286, B:120:0x0289, B:121:0x028e, B:122:0x0295, B:123:0x02bd, B:130:0x02c7, B:133:0x02d5), top: B:149:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1 A[Catch: Exception -> 0x00f3, c -> 0x00f5, CancellationException -> 0x00f7, TryCatch #4 {Exception -> 0x00f3, blocks: (B:38:0x00d0, B:39:0x00db, B:41:0x00e1, B:51:0x00fa, B:53:0x00fe, B:55:0x0116, B:56:0x011c, B:57:0x0144, B:58:0x0145, B:61:0x0155), top: B:150:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe A[Catch: Exception -> 0x00f3, c -> 0x00f5, CancellationException -> 0x00f7, TryCatch #4 {Exception -> 0x00f3, blocks: (B:38:0x00d0, B:39:0x00db, B:41:0x00e1, B:51:0x00fa, B:53:0x00fe, B:55:0x0116, B:56:0x011c, B:57:0x0144, B:58:0x0145, B:61:0x0155), top: B:150:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0116 A[Catch: Exception -> 0x00f3, c -> 0x00f5, CancellationException -> 0x00f7, TryCatch #4 {Exception -> 0x00f3, blocks: (B:38:0x00d0, B:39:0x00db, B:41:0x00e1, B:51:0x00fa, B:53:0x00fe, B:55:0x0116, B:56:0x011c, B:57:0x0144, B:58:0x0145, B:61:0x0155), top: B:150:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x018f A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #9 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x0090, B:29:0x0098, B:30:0x00a5, B:32:0x00ab, B:34:0x00be, B:37:0x00c6, B:72:0x018b, B:74:0x018f, B:75:0x0199, B:77:0x019d, B:79:0x01bb, B:106:0x0243, B:108:0x0247, B:109:0x0250, B:111:0x0254, B:112:0x0274, B:113:0x0279, B:92:0x01f5, B:95:0x01fe, B:97:0x020d, B:101:0x0225, B:98:0x021b, B:100:0x021f, B:102:0x022b, B:103:0x0230, B:104:0x0231, B:105:0x0232, B:114:0x027a, B:115:0x027f, B:62:0x0156, B:65:0x015f, B:67:0x016e, B:71:0x0186, B:68:0x017c, B:70:0x0180, B:116:0x0280, B:117:0x0285, B:118:0x0286, B:120:0x0289, B:121:0x028e, B:122:0x0295, B:123:0x02bd, B:130:0x02c7, B:133:0x02d5), top: B:149:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0199 A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #9 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x0090, B:29:0x0098, B:30:0x00a5, B:32:0x00ab, B:34:0x00be, B:37:0x00c6, B:72:0x018b, B:74:0x018f, B:75:0x0199, B:77:0x019d, B:79:0x01bb, B:106:0x0243, B:108:0x0247, B:109:0x0250, B:111:0x0254, B:112:0x0274, B:113:0x0279, B:92:0x01f5, B:95:0x01fe, B:97:0x020d, B:101:0x0225, B:98:0x021b, B:100:0x021f, B:102:0x022b, B:103:0x0230, B:104:0x0231, B:105:0x0232, B:114:0x027a, B:115:0x027f, B:62:0x0156, B:65:0x015f, B:67:0x016e, B:71:0x0186, B:68:0x017c, B:70:0x0180, B:116:0x0280, B:117:0x0285, B:118:0x0286, B:120:0x0289, B:121:0x028e, B:122:0x0295, B:123:0x02bd, B:130:0x02c7, B:133:0x02d5), top: B:149:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x019d A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #9 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x0090, B:29:0x0098, B:30:0x00a5, B:32:0x00ab, B:34:0x00be, B:37:0x00c6, B:72:0x018b, B:74:0x018f, B:75:0x0199, B:77:0x019d, B:79:0x01bb, B:106:0x0243, B:108:0x0247, B:109:0x0250, B:111:0x0254, B:112:0x0274, B:113:0x0279, B:92:0x01f5, B:95:0x01fe, B:97:0x020d, B:101:0x0225, B:98:0x021b, B:100:0x021f, B:102:0x022b, B:103:0x0230, B:104:0x0231, B:105:0x0232, B:114:0x027a, B:115:0x027f, B:62:0x0156, B:65:0x015f, B:67:0x016e, B:71:0x0186, B:68:0x017c, B:70:0x0180, B:116:0x0280, B:117:0x0285, B:118:0x0286, B:120:0x0289, B:121:0x028e, B:122:0x0295, B:123:0x02bd, B:130:0x02c7, B:133:0x02d5), top: B:149:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01bb A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TRY_LEAVE, TryCatch #9 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x0090, B:29:0x0098, B:30:0x00a5, B:32:0x00ab, B:34:0x00be, B:37:0x00c6, B:72:0x018b, B:74:0x018f, B:75:0x0199, B:77:0x019d, B:79:0x01bb, B:106:0x0243, B:108:0x0247, B:109:0x0250, B:111:0x0254, B:112:0x0274, B:113:0x0279, B:92:0x01f5, B:95:0x01fe, B:97:0x020d, B:101:0x0225, B:98:0x021b, B:100:0x021f, B:102:0x022b, B:103:0x0230, B:104:0x0231, B:105:0x0232, B:114:0x027a, B:115:0x027f, B:62:0x0156, B:65:0x015f, B:67:0x016e, B:71:0x0186, B:68:0x017c, B:70:0x0180, B:116:0x0280, B:117:0x0285, B:118:0x0286, B:120:0x0289, B:121:0x028e, B:122:0x0295, B:123:0x02bd, B:130:0x02c7, B:133:0x02d5), top: B:149:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x0295, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // v24.b
    public Object A(f24.i iVar, tq.e<? super dx.i<? extends dx.b, ? extends List<DynamicDocumentData>>> eVar) throws Throwable {
        g gVar;
        Object objB;
        f24.i iVar2;
        ex.b bVar;
        Collection collection;
        ArrayList arrayList;
        DocumentScopeEntity documentScopeEntity;
        DynamicDocumentData dynamicDocumentData;
        String scopeName;
        dx.i left;
        Object objB2;
        Map<String, String> mapA;
        DocumentSchemaEntity documentSchemaEntity;
        dx.i left2;
        Object objB3;
        Iterator it;
        Object next;
        DocumentScopeEntity documentScopeEntity2;
        Object objA;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f152270q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f152270q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f152268n;
        ?? E = uq.b.e();
        int i16 = gVar.f152270q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityTypeD = n24.a.d(iVar);
                        gVar.f152259d = iVar;
                        gVar.f152260e = jVarA;
                        gVar.f152261f = vq.j.a(aVar);
                        gVar.f152262g = aVar;
                        gVar.f152263h = 0;
                        gVar.f152264j = 0;
                        gVar.f152265k = 0;
                        gVar.f152266l = 0;
                        gVar.f152267m = 0;
                        gVar.f152270q = 1;
                        Object objU = nVarB0.u(documentEntityTypeD, gVar);
                        if (objU == E) {
                            return E;
                        }
                        obj = objU;
                        iVar2 = iVar;
                        bVar = aVar;
                        collection = (Collection) obj;
                        if (!collection.isEmpty()) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + iVar2 + " in the database.")));
                            throw new oq.g();
                        }
                        arrayList = new ArrayList();
                        for (DocumentWithScopesAndSchemas documentWithScopesAndSchemas : (List) collection) {
                            documentScopeEntity = (DocumentScopeEntity) pq.v.n0(documentWithScopesAndSchemas.c());
                            dynamicDocumentData = null;
                            if (documentScopeEntity != null) {
                                List<DocumentScopeEntity> listC = documentWithScopesAndSchemas.c();
                                dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                                ex.a aVar2 = new ex.a();
                                it = listC.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), scopeName));
                                documentScopeEntity2 = (DocumentScopeEntity) next;
                                if (documentScopeEntity2 != null) {
                                    objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity2.getScopeData()), q0.g(com.google.gson.o.class));
                                    if (objA != null) {
                                        left = new dx.i.Right(objA);
                                        if (left instanceof dx.i.Left) {
                                        } else {
                                            if (left instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            mapA = this.jsonFieldParser.a(((com.google.gson.o) ((dx.i.Right) left).b()).toString());
                                            documentSchemaEntity = (DocumentSchemaEntity) pq.v.n0(documentWithScopesAndSchemas.b());
                                            if (documentSchemaEntity != null) {
                                                dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                                                new ex.a();
                                                left2 = new dx.i.Right(this.strictNonNullSerializer.a(fu.r.A(documentSchemaEntity.getSchema()), q0.n(DocumentSchemaDto.class)));
                                            } else {
                                                left2 = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No schema in the DocumentSchemaEntity list.")));
                                            }
                                            if (left2 instanceof dx.i.Left) {
                                            } else {
                                                if (left2 instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                dynamicDocumentData = new DynamicDocumentData(n24.a.b(documentWithScopesAndSchemas.getDocument()), new DynamicDocumentScope(mapA), n24.a.t((DocumentSchemaDto) ((dx.i.Right) left2).b()));
                                            }
                                        }
                                    }
                                }
                                aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name " + scopeName + " in list.")));
                                throw new oq.g();
                            }
                            if (dynamicDocumentData != null) {
                                arrayList.add(dynamicDocumentData);
                            }
                        }
                        return new dx.i.Right(arrayList);
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) gVar.f152262g;
                iVar2 = (f24.i) gVar.f152259d;
                try {
                    oq.u.b(obj);
                    collection = (Collection) obj;
                    if (!collection.isEmpty()) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + iVar2 + " in the database.")));
                        throw new oq.g();
                    }
                    arrayList = new ArrayList();
                    while (r13.hasNext()) {
                        documentScopeEntity = (DocumentScopeEntity) pq.v.n0(documentWithScopesAndSchemas.c());
                        dynamicDocumentData = null;
                        if (documentScopeEntity != null && (scopeName = documentScopeEntity.getScopeName()) != null) {
                            List<DocumentScopeEntity> listC2 = documentWithScopesAndSchemas.c();
                            dx.j<dx.b> jVarA4 = xw.c.f221622a.a();
                            try {
                                try {
                                    ex.a aVar3 = new ex.a();
                                    it = listC2.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), scopeName));
                                    documentScopeEntity2 = (DocumentScopeEntity) next;
                                    if (documentScopeEntity2 != null) {
                                        objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity2.getScopeData()), q0.g(com.google.gson.o.class));
                                        if (objA != null) {
                                            left = new dx.i.Right(objA);
                                            if (left instanceof dx.i.Left) {
                                            } else {
                                                if (left instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                mapA = this.jsonFieldParser.a(((com.google.gson.o) ((dx.i.Right) left).b()).toString());
                                                documentSchemaEntity = (DocumentSchemaEntity) pq.v.n0(documentWithScopesAndSchemas.b());
                                                if (documentSchemaEntity != null) {
                                                    dx.j<dx.b> jVarA5 = xw.c.f221622a.a();
                                                    try {
                                                        try {
                                                            new ex.a();
                                                            left2 = new dx.i.Right(this.strictNonNullSerializer.a(fu.r.A(documentSchemaEntity.getSchema()), q0.n(DocumentSchemaDto.class)));
                                                        } catch (Exception e18) {
                                                            px.f fVar2 = px.f.f163100a;
                                                            String message2 = e18.getMessage();
                                                            if (message2 == null) {
                                                                message2 = "";
                                                            }
                                                            fVar2.d(message2, e18, px.c.a(jVarA5));
                                                            Object objA2 = jVarA5.a(e18);
                                                            if (objA2 instanceof dx.i.Left) {
                                                                objB3 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                                            } else {
                                                                if (!(objA2 instanceof dx.i.Right)) {
                                                                    throw new oq.p();
                                                                }
                                                                objB3 = ((dx.i.Right) objA2).b();
                                                            }
                                                            left2 = new dx.i.Left(objB3);
                                                        }
                                                    } catch (ex.c e19) {
                                                        try {
                                                            left2 = new dx.i.Left((dx.b) ex.d.a(e19));
                                                        } catch (CancellationException e25) {
                                                            throw e25;
                                                        }
                                                    } catch (CancellationException e26) {
                                                        throw e26;
                                                    }
                                                } else {
                                                    left2 = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No schema in the DocumentSchemaEntity list.")));
                                                }
                                                if (left2 instanceof dx.i.Left) {
                                                } else {
                                                    if (left2 instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    dynamicDocumentData = new DynamicDocumentData(n24.a.b(documentWithScopesAndSchemas.getDocument()), new DynamicDocumentScope(mapA), n24.a.t((DocumentSchemaDto) ((dx.i.Right) left2).b()));
                                                }
                                            }
                                        }
                                    }
                                    aVar3.b(new dx.b.Generic(new NoSuchElementException("No scope with name " + scopeName + " in list.")));
                                    throw new oq.g();
                                } catch (Exception e27) {
                                    px.f fVar3 = px.f.f163100a;
                                    String message3 = e27.getMessage();
                                    if (message3 == null) {
                                        message3 = "";
                                    }
                                    fVar3.d(message3, e27, px.c.a(jVarA4));
                                    Object objA3 = jVarA4.a(e27);
                                    if (objA3 instanceof dx.i.Left) {
                                        objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA3).b());
                                    } else {
                                        if (!(objA3 instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB2 = ((dx.i.Right) objA3).b();
                                    }
                                    left = new dx.i.Left(objB2);
                                }
                            } catch (ex.c e28) {
                                try {
                                    left = new dx.i.Left((dx.b) ex.d.a(e28));
                                } catch (CancellationException e29) {
                                    throw e29;
                                }
                            } catch (CancellationException e35) {
                                throw e35;
                            }
                        }
                        if (dynamicDocumentData != null) {
                            arrayList.add(dynamicDocumentData);
                        }
                    }
                    return new dx.i.Right(arrayList);
                } catch (ex.c e36) {
                    e = e36;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e37) {
                    throw e37;
                }
            } catch (CancellationException e38) {
                throw e38;
            }
        } catch (Exception e39) {
            e = e39;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // v24.b
    public Object B(String str, MultiDocumentSchema multiDocumentSchema, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        a0 a0Var;
        Exception exc;
        ?? r15;
        Object objB;
        ex.c cVar;
        if (eVar instanceof a0) {
            a0Var = (a0) eVar;
            int i15 = a0Var.f152118t;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                a0Var.f152118t = i15 - PKIFailureInfo.systemUnavail;
            } else {
                a0Var = new a0(eVar);
            }
        } else {
            a0Var = new a0(eVar);
        }
        Object obj = a0Var.f152116r;
        Object objE = uq.b.e();
        int i16 = a0Var.f152118t;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        String strB = this.strictNonNullSerializer.b(n24.a.a1(multiDocumentSchema), q0.n(MultiDocumentSchemaDto.class));
                        DocumentSchemaEntity documentSchemaEntity = new DocumentSchemaEntity(0, str, strB.getBytes(fu.d.UTF_8), 1, null);
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        a0Var.f152104d = vq.j.a(str);
                        a0Var.f152105e = vq.j.a(multiDocumentSchema);
                        a0Var.f152106f = jVarA;
                        a0Var.f152107g = vq.j.a(aVar);
                        a0Var.f152108h = vq.j.a(aVar);
                        a0Var.f152109j = vq.j.a(documentSchemaEntity);
                        a0Var.f152110k = vq.j.a(strB);
                        a0Var.f152111l = 0;
                        a0Var.f152112m = 0;
                        a0Var.f152113n = 0;
                        a0Var.f152114p = 0;
                        a0Var.f152115q = 0;
                        a0Var.f152118t = 1;
                        if (nVarB0.j(documentSchemaEntity, a0Var) == objE) {
                            return objE;
                        }
                    } catch (ex.c e15) {
                        cVar = e15;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        exc = e17;
                        r15 = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, exc, px.c.a(r15));
                        dx.i iVarA = r15.a(exc);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        cVar = e18;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            exc = e26;
            r15 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0098 A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #7 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:28:0x0091, B:30:0x0098, B:34:0x00ab, B:36:0x00af, B:38:0x00b5, B:40:0x00bb, B:41:0x00c6, B:43:0x00cc, B:98:0x01f5, B:46:0x00df, B:48:0x00eb, B:51:0x00f2, B:86:0x01b6, B:88:0x01ba, B:89:0x01c4, B:91:0x01c8, B:92:0x01e6, B:93:0x01eb, B:76:0x0181, B:79:0x018a, B:81:0x0199, B:85:0x01b1, B:82:0x01a7, B:84:0x01ab, B:94:0x01ec, B:95:0x01f1, B:96:0x01f2, B:99:0x01fa, B:100:0x020a, B:101:0x021e, B:108:0x022e, B:111:0x023d), top: B:128:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p24.b$o, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l24.n] */
    @Override // v24.b
    public Object C(tq.e<? super dx.i<? extends dx.b, FamilyCardFullData>> eVar) throws Throwable {
        ?? oVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        Iterator it;
        Object next;
        DocumentWithScopes documentWithScopes;
        DocumentEntity document;
        String parentDocumentId;
        DocumentScopeEntity documentScopeEntity;
        String scopeName;
        dx.i left;
        Object objB2;
        oq.r rVarA;
        Object next2;
        if (eVar instanceof o) {
            o oVar2 = (o) eVar;
            int i15 = oVar2.f152446p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                oVar2.f152446p = i15 - PKIFailureInfo.systemUnavail;
                oVar = oVar2;
            } else {
                oVar = new o(eVar);
            }
        } else {
            oVar = new o(eVar);
        }
        Object obj = oVar.f152444m;
        Object objE = uq.b.e();
        int i16 = oVar.f152446p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.FAMILY_CARD;
                        oVar.f152441j = jVarA;
                        oVar.f152442k = vq.j.a(aVar);
                        oVar.f152443l = aVar;
                        oVar.f152436d = 0;
                        oVar.f152437e = 0;
                        oVar.f152438f = 0;
                        oVar.f152439g = 0;
                        oVar.f152440h = 0;
                        oVar.f152446p = 1;
                        Object objQ = B0.q(documentEntityType, oVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        obj = objQ;
                        bVar = aVar;
                        List<DocumentWithScopes> list = (List) obj;
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((DocumentWithScopes) next).getDocument().getParentDocumentId() == null);
                        documentWithScopes = (DocumentWithScopes) next;
                        if (documentWithScopes != null) {
                        }
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with parent id in the database.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        oVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(oVar));
                        dx.i iVarA = oVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) oVar.f152443l;
                try {
                    oq.u.b(obj);
                    List<DocumentWithScopes> list2 = (List) obj;
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((DocumentWithScopes) next).getDocument().getParentDocumentId() == null);
                    documentWithScopes = (DocumentWithScopes) next;
                    if (documentWithScopes != null || (document = documentWithScopes.getDocument()) == null || (parentDocumentId = document.getParentDocumentId()) == null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with parent id in the database.")));
                        throw new oq.g();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (DocumentWithScopes documentWithScopes2 : list2) {
                        if (documentWithScopes2.getDocument().getParentDocumentId() == null || (documentScopeEntity = (DocumentScopeEntity) pq.v.n0(documentWithScopes2.b())) == null || (scopeName = documentScopeEntity.getScopeName()) == null) {
                            rVarA = null;
                        } else {
                            List<DocumentScopeEntity> listB = documentWithScopes2.b();
                            dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                            try {
                                try {
                                    ex.a aVar2 = new ex.a();
                                    Iterator it4 = listB.iterator();
                                    do {
                                        if (!it4.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it4.next();
                                    } while (!fr.t.c(((DocumentScopeEntity) next2).getScopeName(), scopeName));
                                    DocumentScopeEntity documentScopeEntity2 = (DocumentScopeEntity) next2;
                                    if (documentScopeEntity2 != null) {
                                        Object objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity2.getScopeData()), q0.g(FamilyCardScopeDto.class));
                                        if (objA != null) {
                                            left = new dx.i.Right(objA);
                                            if (left instanceof dx.i.Left) {
                                                rVarA = null;
                                            } else {
                                                if (!(left instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                rVarA = oq.y.a(scopeName, new FamilyCardData(n24.a.b(documentWithScopes2.getDocument()), n24.a.a0((FamilyCardScopeDto) ((dx.i.Right) left).b())));
                                            }
                                        }
                                    }
                                    aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name " + scopeName + " in list.")));
                                    throw new oq.g();
                                } catch (Exception e19) {
                                    px.f fVar2 = px.f.f163100a;
                                    String message2 = e19.getMessage();
                                    if (message2 == null) {
                                        message2 = "";
                                    }
                                    fVar2.d(message2, e19, px.c.a(jVarA2));
                                    Object objA2 = jVarA2.a(e19);
                                    if (objA2 instanceof dx.i.Left) {
                                        objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                    } else {
                                        if (!(objA2 instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB2 = ((dx.i.Right) objA2).b();
                                    }
                                    left = new dx.i.Left(objB2);
                                }
                            } catch (ex.c e25) {
                                try {
                                    left = new dx.i.Left((dx.b) ex.d.a(e25));
                                } catch (CancellationException e26) {
                                    throw e26;
                                }
                            } catch (CancellationException e27) {
                                throw e27;
                            }
                        }
                        if (rVarA != null) {
                            arrayList.add(rVarA);
                        }
                    }
                    return new dx.i.Right(new FamilyCardFullData(parentDocumentId, v0.s(arrayList)));
                } catch (ex.c e28) {
                    e15 = e28;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (CancellationException e35) {
                throw e35;
            }
        } catch (Exception e36) {
            e = e36;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x017d A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #9 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:29:0x0092, B:64:0x0160, B:54:0x012a, B:57:0x0133, B:59:0x0142, B:63:0x015a, B:60:0x0150, B:62:0x0154, B:65:0x0176, B:66:0x017b, B:67:0x017c, B:68:0x017d, B:69:0x01a7, B:76:0x01b7, B:79:0x01c6), top: B:97:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:96:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x017d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p24.b$v, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l24.n] */
    @Override // v24.b
    public Object E(tq.e<? super dx.i<? extends dx.b, RefugeeCardData>> eVar) throws Throwable {
        ?? vVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        DocumentWithScopes documentWithScopes;
        Document documentB;
        dx.i left;
        Object objB2;
        Iterator it;
        Object next;
        DocumentScopeEntity documentScopeEntity;
        Object objA;
        if (eVar instanceof v) {
            v vVar2 = (v) eVar;
            int i15 = vVar2.f152525p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                vVar2.f152525p = i15 - PKIFailureInfo.systemUnavail;
                vVar = vVar2;
            } else {
                vVar = new v(eVar);
            }
        } else {
            vVar = new v(eVar);
        }
        Object obj = vVar.f152523m;
        Object objE = uq.b.e();
        int i16 = vVar.f152525p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.REFUGEE_CARD;
                        vVar.f152520j = jVarA;
                        vVar.f152521k = vq.j.a(aVar);
                        vVar.f152522l = aVar;
                        vVar.f152515d = 0;
                        vVar.f152516e = 0;
                        vVar.f152517f = 0;
                        vVar.f152518g = 0;
                        vVar.f152519h = 0;
                        vVar.f152525p = 1;
                        Object objQ = B0.q(documentEntityType, vVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        obj = objQ;
                        bVar = aVar;
                        documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                        if (documentWithScopes != null) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.REFUGEE_CARD + " in the database.")));
                            throw new oq.g();
                        }
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB = documentWithScopes.b();
                        dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                        ex.a aVar2 = new ex.a();
                        it = listB.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "REFUGEE_SCOPE_3001"));
                        documentScopeEntity = (DocumentScopeEntity) next;
                        if (documentScopeEntity != null) {
                            objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(RefugeeCardDto.class));
                            if (objA != null) {
                                left = new dx.i.Right(objA);
                                return new dx.i.Right(new RefugeeCardData(documentB, n24.a.s0((RefugeeCardDto) bVar.a(left))));
                            }
                        }
                        aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name REFUGEE_SCOPE_3001 in list.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        vVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(vVar));
                        dx.i iVarA = vVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) vVar.f152522l;
                try {
                    oq.u.b(obj);
                    documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                    if (documentWithScopes != null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.REFUGEE_CARD + " in the database.")));
                        throw new oq.g();
                    }
                    try {
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB2 = documentWithScopes.b();
                        dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                        try {
                            try {
                                ex.a aVar3 = new ex.a();
                                it = listB2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "REFUGEE_SCOPE_3001"));
                                documentScopeEntity = (DocumentScopeEntity) next;
                                if (documentScopeEntity != null) {
                                    objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(RefugeeCardDto.class));
                                    if (objA != null) {
                                        left = new dx.i.Right(objA);
                                        return new dx.i.Right(new RefugeeCardData(documentB, n24.a.s0((RefugeeCardDto) bVar.a(left))));
                                    }
                                }
                                aVar3.b(new dx.b.Generic(new NoSuchElementException("No scope with name REFUGEE_SCOPE_3001 in list.")));
                                throw new oq.g();
                            } catch (Exception e19) {
                                px.f fVar2 = px.f.f163100a;
                                String message2 = e19.getMessage();
                                if (message2 == null) {
                                    message2 = "";
                                }
                                fVar2.d(message2, e19, px.c.a(jVarA3));
                                Object objA2 = jVarA3.a(e19);
                                if (objA2 instanceof dx.i.Left) {
                                    objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                } else {
                                    if (!(objA2 instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) objA2).b();
                                }
                                left = new dx.i.Left(objB2);
                            }
                        } catch (ex.c e25) {
                            left = new dx.i.Left((dx.b) ex.d.a(e25));
                        } catch (CancellationException e26) {
                            throw e26;
                        }
                    } catch (CancellationException e27) {
                        throw e27;
                    }
                } catch (ex.c e28) {
                    e15 = e28;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (CancellationException e36) {
            throw e36;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x021a A[Catch: Exception -> 0x00b2, c -> 0x00b6, CancellationException -> 0x00ba, TryCatch #7 {c -> 0x00b6, CancellationException -> 0x00ba, Exception -> 0x00b2, blocks: (B:25:0x00a4, B:56:0x0212, B:58:0x021a, B:61:0x0225, B:62:0x025b, B:64:0x0261, B:65:0x028e, B:34:0x00ee, B:47:0x0177, B:49:0x017f), top: B:97:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0223  */
    /* JADX WARN: Code duplicated, block: B:64:0x0261 A[Catch: Exception -> 0x00b2, c -> 0x00b6, CancellationException -> 0x00ba, LOOP:0: B:62:0x025b->B:64:0x0261, LOOP_END, TryCatch #7 {c -> 0x00b6, CancellationException -> 0x00ba, Exception -> 0x00b2, blocks: (B:25:0x00a4, B:56:0x0212, B:58:0x021a, B:61:0x0225, B:62:0x025b, B:64:0x0261, B:65:0x028e, B:34:0x00ee, B:47:0x0177, B:49:0x017f), top: B:97:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:68:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r32v0, types: [p24.b] */
    @Override // v24.b
    public Object F(String str, String str2, int i15, Map<String, ? extends CMSSignedData> map, fz.b.LocalDate localDate, f24.i iVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        h0 h0Var;
        Object objB;
        String str3;
        fz.b.LocalDate localDate2;
        Object objD;
        String str4;
        f24.i iVar2;
        ex.b bVar;
        int i16;
        int i17;
        int i18;
        int i19;
        dx.j<dx.b> jVar;
        ex.b bVar2;
        int i25;
        int i26;
        ?? r15;
        String str5;
        ?? r19;
        Object obj;
        String str6;
        int i27;
        ex.b bVar3;
        ?? r110;
        int i28;
        String str7;
        int i29;
        int i35;
        fz.b.LocalDate localDate3;
        ex.b bVar4;
        ex.b bVar5;
        LocalDate date;
        DocumentEntity documentEntity;
        l24.n nVarB0;
        ArrayList arrayList;
        Iterator it;
        ?? r16 = map;
        if (eVar instanceof h0) {
            h0Var = (h0) eVar;
            int i36 = h0Var.f152317x;
            if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                h0Var.f152317x = i36 - PKIFailureInfo.systemUnavail;
            } else {
                h0Var = new h0(eVar);
            }
        } else {
            h0Var = new h0(eVar);
        }
        Object obj2 = h0Var.f152315v;
        Object objE = uq.b.e();
        int i37 = h0Var.f152317x;
        try {
            try {
                try {
                    if (i37 == 0) {
                        oq.u.b(obj2);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            int i38 = a.f152103a[iVar.ordinal()];
                            if (i38 == 1 || i38 == 2 || i38 == 3) {
                                aVar.b(new dx.b.Generic(new UnsupportedOperationException(iVar + " wrong saving method")));
                                throw new oq.g();
                            }
                            aVar.a(L(r16, iVar));
                            l24.n nVarB1 = ((ContainersDatabase) aVar.a(M())).b0();
                            str3 = str;
                            h0Var.f152300d = str3;
                            h0Var.f152301e = str2;
                            h0Var.f152302f = r16;
                            localDate2 = localDate;
                            h0Var.f152303g = localDate2;
                            h0Var.f152304h = iVar;
                            h0Var.f152305j = jVarA;
                            h0Var.f152306k = vq.j.a(aVar);
                            h0Var.f152307l = aVar;
                            h0Var.f152309n = i15;
                            h0Var.f152310p = 0;
                            h0Var.f152311q = 0;
                            h0Var.f152312r = 0;
                            h0Var.f152313s = 0;
                            h0Var.f152314t = 0;
                            h0Var.f152317x = 1;
                            objD = nVarB1.d(str2, h0Var);
                            if (objD == objE) {
                                return objE;
                            }
                            str4 = str2;
                            iVar2 = iVar;
                            bVar = aVar;
                            i16 = i15;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            jVar = jVarA;
                            bVar2 = bVar;
                            i25 = 0;
                            i26 = 0;
                            r15 = r16;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r16 = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r16));
                            dx.i iVarA = r16.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i37 != 1) {
                            if (i37 != 2) {
                                if (i37 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                try {
                                    oq.u.b(obj2);
                                    return new dx.i.Right(oq.i0.f148189a);
                                } catch (ex.c e18) {
                                    e = e18;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                }
                            }
                            int i39 = h0Var.f152314t;
                            int i45 = h0Var.f152313s;
                            int i46 = h0Var.f152312r;
                            i26 = h0Var.f152311q;
                            i29 = h0Var.f152310p;
                            i35 = h0Var.f152309n;
                            bVar4 = (ex.b) h0Var.f152307l;
                            bVar5 = (ex.b) h0Var.f152306k;
                            jVar = (dx.j) h0Var.f152305j;
                            iVar2 = (f24.i) h0Var.f152304h;
                            localDate3 = (fz.b.LocalDate) h0Var.f152303g;
                            Map map2 = (Map) h0Var.f152302f;
                            String str8 = (String) h0Var.f152301e;
                            str7 = (String) h0Var.f152300d;
                            oq.u.b(obj2);
                            i28 = i39;
                            i25 = i46;
                            r110 = map2;
                            str5 = str8;
                            i18 = i45;
                            obj = objE;
                            ex.b bVar6 = bVar5;
                            bVar2 = bVar4;
                            localDate2 = localDate3;
                            bVar3 = bVar6;
                            str6 = str7;
                            i17 = i28;
                            i27 = i35;
                            i19 = i29;
                            r19 = r110;
                            String str9 = str5;
                            DocumentEntityType documentEntityTypeD = n24.a.d(iVar2);
                            DocumentEntityStatus documentEntityStatus = DocumentEntityStatus.ACTIVE;
                            if (localDate2 != null) {
                                date = localDate2.getDate();
                            } else {
                                date = null;
                            }
                            documentEntity = new DocumentEntity(0, str6, documentEntityTypeD, date, this.currentTimeProvider.a(), documentEntityStatus, str9, i27, 1, null);
                            int i47 = i27;
                            nVarB0 = ((ContainersDatabase) bVar2.a(M())).b0();
                            fz.b.LocalDate localDate4 = localDate2;
                            arrayList = new ArrayList(r19.size());
                            for (it = r19.entrySet().iterator(); it.hasNext(); it = it) {
                                Map.Entry entry = (Map.Entry) it.next();
                                arrayList.add(new DocumentScopeEntity(0, str6, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                            }
                            h0Var.f152300d = vq.j.a(str6);
                            h0Var.f152301e = vq.j.a(str9);
                            h0Var.f152302f = vq.j.a(r19);
                            h0Var.f152303g = vq.j.a(localDate4);
                            h0Var.f152304h = vq.j.a(iVar2);
                            h0Var.f152305j = jVar;
                            h0Var.f152306k = vq.j.a(bVar3);
                            h0Var.f152307l = vq.j.a(bVar2);
                            h0Var.f152308m = vq.j.a(documentEntity);
                            h0Var.f152309n = i47;
                            h0Var.f152310p = i19;
                            h0Var.f152311q = i26;
                            h0Var.f152312r = i25;
                            h0Var.f152313s = i18;
                            h0Var.f152314t = i17;
                            h0Var.f152317x = 3;
                            if (nVarB0.v(documentEntity, arrayList, h0Var) == obj) {
                                return obj;
                            }
                            return new dx.i.Right(oq.i0.f148189a);
                        }
                        int i48 = h0Var.f152314t;
                        int i49 = h0Var.f152313s;
                        int i55 = h0Var.f152312r;
                        i26 = h0Var.f152311q;
                        int i56 = h0Var.f152310p;
                        int i57 = h0Var.f152309n;
                        ex.b bVar7 = (ex.b) h0Var.f152307l;
                        ex.b bVar8 = (ex.b) h0Var.f152306k;
                        jVar = (dx.j) h0Var.f152305j;
                        iVar2 = (f24.i) h0Var.f152304h;
                        fz.b.LocalDate localDate5 = (fz.b.LocalDate) h0Var.f152303g;
                        Map map3 = (Map) h0Var.f152302f;
                        String str10 = (String) h0Var.f152301e;
                        String str11 = (String) h0Var.f152300d;
                        oq.u.b(obj2);
                        bVar2 = bVar7;
                        localDate2 = localDate5;
                        bVar = bVar8;
                        str4 = str10;
                        i16 = i57;
                        i19 = i56;
                        objD = obj2;
                        i25 = i55;
                        i18 = i49;
                        r15 = map3;
                        str3 = str11;
                        i17 = i48;
                    }
                    if (((Number) objD).intValue() <= 0) {
                        DocumentEntity documentEntity2 = new DocumentEntity(0, str4, n24.a.d(iVar2), null, this.currentTimeProvider.a(), DocumentEntityStatus.ACTIVE, null, i16, 65, null);
                        ex.b bVar9 = bVar;
                        str5 = str4;
                        int i58 = i16;
                        l24.n nVarB2 = ((ContainersDatabase) bVar2.a(M())).b0();
                        List<DocumentScopeEntity> listN = pq.v.n();
                        h0Var.f152300d = str3;
                        h0Var.f152301e = str5;
                        h0Var.f152302f = r15;
                        h0Var.f152303g = localDate2;
                        h0Var.f152304h = iVar2;
                        h0Var.f152305j = jVar;
                        r110 = r15;
                        h0Var.f152306k = vq.j.a(bVar9);
                        h0Var.f152307l = bVar2;
                        h0Var.f152308m = vq.j.a(documentEntity2);
                        h0Var.f152309n = i58;
                        h0Var.f152310p = i19;
                        h0Var.f152311q = i26;
                        h0Var.f152312r = i25;
                        h0Var.f152313s = i18;
                        h0Var.f152314t = i17;
                        h0Var.f152317x = 2;
                        obj = objE;
                        if (nVarB2.v(documentEntity2, listN, h0Var) == obj) {
                            return obj;
                        }
                        i28 = i17;
                        str7 = str3;
                        i29 = i19;
                        i35 = i58;
                        localDate3 = localDate2;
                        bVar4 = bVar2;
                        bVar5 = bVar9;
                        ex.b bVar10 = bVar5;
                        bVar2 = bVar4;
                        localDate2 = localDate3;
                        bVar3 = bVar10;
                        str6 = str7;
                        i17 = i28;
                        i27 = i35;
                        i19 = i29;
                        r19 = r110;
                    } else {
                        str5 = str4;
                        r19 = r15;
                        obj = objE;
                        str6 = str3;
                        i27 = i16;
                        bVar3 = bVar;
                    }
                    String str12 = str5;
                    DocumentEntityType documentEntityTypeD2 = n24.a.d(iVar2);
                    DocumentEntityStatus documentEntityStatus2 = DocumentEntityStatus.ACTIVE;
                    if (localDate2 != null) {
                        date = localDate2.getDate();
                    } else {
                        date = null;
                    }
                    documentEntity = new DocumentEntity(0, str6, documentEntityTypeD2, date, this.currentTimeProvider.a(), documentEntityStatus2, str12, i27, 1, null);
                    int i410 = i27;
                    nVarB0 = ((ContainersDatabase) bVar2.a(M())).b0();
                    fz.b.LocalDate localDate6 = localDate2;
                    arrayList = new ArrayList(r19.size());
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new DocumentScopeEntity(0, str6, (String) entry2.getKey(), ((CMSSignedData) entry2.getValue()).getEncoded(), 1, null));
                    }
                    h0Var.f152300d = vq.j.a(str6);
                    h0Var.f152301e = vq.j.a(str12);
                    h0Var.f152302f = vq.j.a(r19);
                    h0Var.f152303g = vq.j.a(localDate6);
                    h0Var.f152304h = vq.j.a(iVar2);
                    h0Var.f152305j = jVar;
                    h0Var.f152306k = vq.j.a(bVar3);
                    h0Var.f152307l = vq.j.a(bVar2);
                    h0Var.f152308m = vq.j.a(documentEntity);
                    h0Var.f152309n = i410;
                    h0Var.f152310p = i19;
                    h0Var.f152311q = i26;
                    h0Var.f152312r = i25;
                    h0Var.f152313s = i18;
                    h0Var.f152314t = i17;
                    h0Var.f152317x = 3;
                    if (nVarB0.v(documentEntity, arrayList, h0Var) == obj) {
                        return obj;
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (ex.c e27) {
            e = e27;
        } catch (CancellationException e28) {
            throw e28;
        } catch (Exception e29) {
            e = e29;
            r16 = jVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [f24.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // v24.b
    public Object G(f24.i iVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        c cVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f152154q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f152154q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f152152n;
        Object objE = uq.b.e();
        int i16 = cVar.f152154q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityTypeD = n24.a.d(iVar);
                        cVar.f152143d = vq.j.a(iVar);
                        cVar.f152144e = jVarA;
                        cVar.f152145f = vq.j.a(aVar);
                        cVar.f152146g = vq.j.a(aVar);
                        cVar.f152147h = 0;
                        cVar.f152148j = 0;
                        cVar.f152149k = 0;
                        cVar.f152150l = 0;
                        cVar.f152151m = 0;
                        cVar.f152154q = 1;
                        if (nVarB0.k(documentEntityTypeD, cVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        iVar = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(iVar));
                        dx.i iVarA = iVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // v24.b
    public Object H(String str, tq.e<? super dx.i<? extends dx.b, DocumentScope>> eVar) throws Throwable {
        k kVar;
        Object objB;
        String str2;
        ex.b bVar;
        DocumentScopeEntity documentScopeEntity;
        DocumentScope documentScopeK;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f152387q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f152387q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object obj = kVar.f152385n;
        ?? E = uq.b.e();
        int i16 = kVar.f152387q;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) kVar.f152379g;
                    str2 = (String) kVar.f152376d;
                    try {
                        oq.u.b(obj);
                        documentScopeEntity = (DocumentScopeEntity) obj;
                        if (documentScopeEntity == null && (documentScopeK = n24.a.k(documentScopeEntity)) != null) {
                            return new dx.i.Right(documentScopeK);
                        }
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document scope with name " + str2 + " in the database.")));
                        throw new oq.g();
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                oq.u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                    kVar.f152376d = str;
                    kVar.f152377e = jVarA;
                    kVar.f152378f = vq.j.a(aVar);
                    kVar.f152379g = aVar;
                    kVar.f152380h = 0;
                    kVar.f152381j = 0;
                    kVar.f152382k = 0;
                    kVar.f152383l = 0;
                    kVar.f152384m = 0;
                    kVar.f152387q = 1;
                    Object objM = nVarB0.m(str, kVar);
                    if (objM == E) {
                        return E;
                    }
                    obj = objM;
                    str2 = str;
                    bVar = aVar;
                    documentScopeEntity = (DocumentScopeEntity) obj;
                    if (documentScopeEntity == null) {
                    }
                    bVar.b(new dx.b.Generic(new NoSuchElementException("No document scope with name " + str2 + " in the database.")));
                    throw new oq.g();
                } catch (ex.c e17) {
                    e = e17;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    e = e19;
                    E = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(E));
                    dx.i iVarA = E.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x024a A[Catch: Exception -> 0x025c, c -> 0x025e, CancellationException -> 0x0260, TryCatch #16 {Exception -> 0x025c, blocks: (B:100:0x0239, B:101:0x0244, B:103:0x024a, B:113:0x0263, B:115:0x0267, B:117:0x027f, B:118:0x0285, B:119:0x02ad, B:120:0x02ae, B:123:0x02be), top: B:216:0x0239 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0267 A[Catch: Exception -> 0x025c, c -> 0x025e, CancellationException -> 0x0260, TryCatch #16 {Exception -> 0x025c, blocks: (B:100:0x0239, B:101:0x0244, B:103:0x024a, B:113:0x0263, B:115:0x0267, B:117:0x027f, B:118:0x0285, B:119:0x02ad, B:120:0x02ae, B:123:0x02be), top: B:216:0x0239 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x027f A[Catch: Exception -> 0x025c, c -> 0x025e, CancellationException -> 0x0260, TryCatch #16 {Exception -> 0x025c, blocks: (B:100:0x0239, B:101:0x0244, B:103:0x024a, B:113:0x0263, B:115:0x0267, B:117:0x027f, B:118:0x0285, B:119:0x02ad, B:120:0x02ae, B:123:0x02be), top: B:216:0x0239 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02f9 A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0303 A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0307 A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0325 A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TRY_LEAVE, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:167:0x039d A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:170:0x03b0 A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:171:0x03b9 A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:173:0x03bd A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0402 A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:217:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x013d A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0165 A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TRY_LEAVE, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:90:0x01eb A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0213 A[Catch: Exception -> 0x0156, c -> 0x0159, CancellationException -> 0x015c, TryCatch #12 {Exception -> 0x0156, blocks: (B:47:0x012c, B:48:0x0137, B:50:0x013d, B:52:0x0152, B:59:0x015f, B:61:0x0165, B:64:0x0173, B:91:0x01fa, B:92:0x020d, B:94:0x0213, B:96:0x0227, B:99:0x022f, B:134:0x02f5, B:136:0x02f9, B:137:0x0303, B:139:0x0307, B:141:0x0325, B:168:0x03ac, B:170:0x03b0, B:171:0x03b9, B:173:0x03bd, B:174:0x03dc, B:175:0x03e1, B:154:0x035f, B:157:0x0369, B:159:0x0378, B:163:0x0390, B:160:0x0386, B:162:0x038a, B:164:0x0396, B:165:0x039b, B:166:0x039c, B:167:0x039d, B:176:0x03e2, B:177:0x03e7, B:124:0x02bf, B:127:0x02c9, B:129:0x02d8, B:133:0x02f0, B:130:0x02e6, B:132:0x02ea, B:178:0x03e8, B:179:0x03ed, B:180:0x03ee, B:182:0x03f1, B:183:0x03f6, B:77:0x01ad, B:80:0x01b7, B:82:0x01c6, B:86:0x01de, B:83:0x01d4, B:85:0x01d8, B:87:0x01e4, B:88:0x01e9, B:89:0x01ea, B:90:0x01eb, B:184:0x0402, B:185:0x0428, B:190:0x047d, B:193:0x048b, B:43:0x0101, B:186:0x0429, B:187:0x0453, B:188:0x0454, B:189:0x047c), top: B:215:0x002c }] */
    /* JADX WARN: Instruction removed from duplicated block: B:184:0x0402, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // v24.b
    public Object I(String str, tq.e<? super dx.i<? extends dx.b, DynamicMultiDocumentFullData>> eVar) throws Throwable {
        r rVar;
        ?? r15;
        Object objB;
        dx.j<dx.b> jVarA;
        ex.b aVar;
        int i15;
        String str2;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        DocumentWithScopesAndSchemas documentWithScopesAndSchemas;
        ex.b bVar2;
        String str3;
        ArrayList<DocumentWithScopesAndSchemas> arrayList;
        DocumentSchemaEntity documentSchemaEntity;
        dx.i left;
        Object objB2;
        ArrayList arrayList2;
        DocumentScopeEntity documentScopeEntity;
        DynamicDocumentData dynamicDocumentData;
        String scopeName;
        dx.i left2;
        Object objB3;
        Map<String, String> mapA;
        DocumentSchemaEntity documentSchemaEntity2;
        dx.i left3;
        Object objB4;
        Iterator it;
        Object next;
        DocumentScopeEntity documentScopeEntity2;
        Object objA;
        if (eVar instanceof r) {
            rVar = (r) eVar;
            int i25 = rVar.f152481r;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                rVar.f152481r = i25 - PKIFailureInfo.systemUnavail;
            } else {
                rVar = new r(eVar);
            }
        } else {
            rVar = new r(eVar);
        }
        Object objB5 = rVar.f152479p;
        Object objE = uq.b.e();
        int i26 = rVar.f152481r;
        try {
            try {
                try {
                    try {
                        if (i26 == 0) {
                            oq.u.b(objB5);
                            jVarA = xw.c.f221622a.a();
                            aVar = new ex.a();
                            l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                            rVar.f152469d = str;
                            rVar.f152470e = jVarA;
                            rVar.f152471f = vq.j.a(aVar);
                            rVar.f152472g = aVar;
                            i15 = 0;
                            rVar.f152474j = 0;
                            rVar.f152475k = 0;
                            rVar.f152476l = 0;
                            rVar.f152477m = 0;
                            rVar.f152478n = 0;
                            rVar.f152481r = 1;
                            objB5 = nVarB0.b(str, rVar);
                            if (objB5 != objE) {
                                str2 = str;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                bVar = aVar;
                            }
                            return objE;
                        }
                        if (i26 == 1) {
                            i16 = rVar.f152478n;
                            int i27 = rVar.f152477m;
                            i17 = rVar.f152476l;
                            int i28 = rVar.f152475k;
                            int i29 = rVar.f152474j;
                            ex.b bVar3 = (ex.b) rVar.f152472g;
                            ex.b bVar4 = (ex.b) rVar.f152471f;
                            dx.j<dx.b> jVar = (dx.j) rVar.f152470e;
                            str2 = (String) rVar.f152469d;
                            try {
                                oq.u.b(objB5);
                                i15 = i27;
                                jVarA = jVar;
                                bVar = bVar4;
                                aVar = bVar3;
                                i19 = i29;
                                i18 = i28;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                fVar.d(message == null ? "" : message, e, px.c.a(r15));
                                dx.i iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        } else {
                            if (i26 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            documentWithScopesAndSchemas = (DocumentWithScopesAndSchemas) rVar.f152473h;
                            bVar2 = (ex.b) rVar.f152472g;
                            str3 = (String) rVar.f152469d;
                            oq.u.b(objB5);
                        }
                        arrayList = new ArrayList();
                        for (Object obj : (Iterable) objB5) {
                            if (fr.t.c(((DocumentWithScopesAndSchemas) obj).getDocument().getParentDocumentId(), str3)) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            bVar2.b(new dx.b.Generic(new NoSuchElementException("No child documents for parent id " + str3 + " in the database.")));
                            throw new oq.g();
                        }
                        documentSchemaEntity = (DocumentSchemaEntity) pq.v.n0(documentWithScopesAndSchemas.b());
                        if (documentSchemaEntity != null) {
                            try {
                                dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                                try {
                                    try {
                                        new ex.a();
                                        left = new dx.i.Right(this.strictNonNullSerializer.a(fu.r.A(documentSchemaEntity.getSchema()), q0.n(MultiDocumentSchemaDto.class)));
                                    } catch (Exception e18) {
                                        px.f fVar2 = px.f.f163100a;
                                        String message2 = e18.getMessage();
                                        if (message2 == null) {
                                            message2 = r9;
                                        }
                                        fVar2.d(message2, e18, px.c.a(jVarA2));
                                        Object objA2 = jVarA2.a(e18);
                                        if (objA2 instanceof dx.i.Left) {
                                            objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                        } else {
                                            if (!(objA2 instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB2 = ((dx.i.Right) objA2).b();
                                        }
                                        left = new dx.i.Left(objB2);
                                    }
                                } catch (ex.c e19) {
                                    left = new dx.i.Left((dx.b) ex.d.a(e19));
                                } catch (CancellationException e25) {
                                    throw e25;
                                }
                            } catch (CancellationException e26) {
                                throw e26;
                            }
                        } else {
                            left = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No schema in the DocumentSchemaEntity list.")));
                        }
                        MultiDocumentSchema multiDocumentSchemaK = n24.a.K((MultiDocumentSchemaDto) bVar2.a(left));
                        arrayList2 = new ArrayList();
                        for (DocumentWithScopesAndSchemas documentWithScopesAndSchemas2 : arrayList) {
                            documentScopeEntity = (DocumentScopeEntity) pq.v.n0(documentWithScopesAndSchemas2.c());
                            dynamicDocumentData = null;
                            if (documentScopeEntity != null && (scopeName = documentScopeEntity.getScopeName()) != null) {
                                List<DocumentScopeEntity> listC = documentWithScopesAndSchemas2.c();
                                dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                                try {
                                    try {
                                        ex.a aVar2 = new ex.a();
                                        it = listC.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                        } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), scopeName));
                                        documentScopeEntity2 = (DocumentScopeEntity) next;
                                        if (documentScopeEntity2 != null) {
                                            objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity2.getScopeData()), q0.g(com.google.gson.o.class));
                                            if (objA != null) {
                                                left2 = new dx.i.Right(objA);
                                                if (left2 instanceof dx.i.Left) {
                                                } else {
                                                    if (left2 instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    mapA = this.jsonFieldParser.a(((com.google.gson.o) ((dx.i.Right) left2).b()).toString());
                                                    documentSchemaEntity2 = (DocumentSchemaEntity) pq.v.n0(documentWithScopesAndSchemas2.b());
                                                    if (documentSchemaEntity2 != null) {
                                                        dx.j<dx.b> jVarA4 = xw.c.f221622a.a();
                                                        try {
                                                            try {
                                                                new ex.a();
                                                                left3 = new dx.i.Right(this.strictNonNullSerializer.a(fu.r.A(documentSchemaEntity2.getSchema()), q0.n(DocumentSchemaDto.class)));
                                                            } catch (Exception e27) {
                                                                px.f fVar3 = px.f.f163100a;
                                                                String message3 = e27.getMessage();
                                                                if (message3 == null) {
                                                                    message3 = "";
                                                                }
                                                                fVar3.d(message3, e27, px.c.a(jVarA4));
                                                                Object objA3 = jVarA4.a(e27);
                                                                if (objA3 instanceof dx.i.Left) {
                                                                    objB4 = new dx.b.Generic((Exception) ((dx.i.Left) objA3).b());
                                                                } else {
                                                                    if (!(objA3 instanceof dx.i.Right)) {
                                                                        throw new oq.p();
                                                                    }
                                                                    objB4 = ((dx.i.Right) objA3).b();
                                                                }
                                                                left3 = new dx.i.Left(objB4);
                                                            }
                                                        } catch (ex.c e28) {
                                                            try {
                                                                left3 = new dx.i.Left((dx.b) ex.d.a(e28));
                                                            } catch (CancellationException e29) {
                                                                throw e29;
                                                            }
                                                        } catch (CancellationException e35) {
                                                            throw e35;
                                                        }
                                                    } else {
                                                        left3 = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No schema in the DocumentSchemaEntity list.")));
                                                    }
                                                    if (left3 instanceof dx.i.Left) {
                                                    } else {
                                                        if (left3 instanceof dx.i.Right) {
                                                            throw new oq.p();
                                                        }
                                                        dynamicDocumentData = new DynamicDocumentData(n24.a.b(documentWithScopesAndSchemas2.getDocument()), new DynamicDocumentScope(mapA), n24.a.t((DocumentSchemaDto) ((dx.i.Right) left3).b()));
                                                    }
                                                }
                                            }
                                        }
                                        aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name " + scopeName + " in list.")));
                                        throw new oq.g();
                                    } catch (Exception e36) {
                                        px.f fVar4 = px.f.f163100a;
                                        String message4 = e36.getMessage();
                                        if (message4 == null) {
                                            message4 = r9;
                                        }
                                        fVar4.d(message4, e36, px.c.a(jVarA3));
                                        Object objA4 = jVarA3.a(e36);
                                        if (objA4 instanceof dx.i.Left) {
                                            objB3 = new dx.b.Generic((Exception) ((dx.i.Left) objA4).b());
                                        } else {
                                            if (!(objA4 instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB3 = ((dx.i.Right) objA4).b();
                                        }
                                        left2 = new dx.i.Left(objB3);
                                    }
                                } catch (ex.c e37) {
                                    try {
                                        left2 = new dx.i.Left((dx.b) ex.d.a(e37));
                                    } catch (CancellationException e38) {
                                        throw e38;
                                    }
                                } catch (CancellationException e39) {
                                    throw e39;
                                }
                            }
                            if (dynamicDocumentData != null) {
                                arrayList2.add(dynamicDocumentData);
                            }
                        }
                        return new dx.i.Right(new DynamicMultiDocumentFullData(str3, multiDocumentSchemaK, arrayList2));
                        DocumentWithScopesAndSchemas documentWithScopesAndSchemas3 = (DocumentWithScopesAndSchemas) objB5;
                        if (documentWithScopesAndSchemas3 == null) {
                            aVar.b(new dx.b.Generic(new NoSuchElementException("No parent document with id " + str2 + " in the database.")));
                            throw new oq.g();
                        }
                        if (documentWithScopesAndSchemas3.getDocument().getParentDocumentId() != null) {
                            aVar.b(new dx.b.Generic(new IllegalArgumentException("Document id " + str2 + " is not a parent document id.")));
                            throw new oq.g();
                        }
                        l24.n nVarB1 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType type = documentWithScopesAndSchemas3.getDocument().getType();
                        rVar.f152469d = str2;
                        rVar.f152470e = jVarA;
                        rVar.f152471f = vq.j.a(bVar);
                        rVar.f152472g = aVar;
                        rVar.f152473h = documentWithScopesAndSchemas3;
                        rVar.f152474j = i19;
                        rVar.f152475k = i18;
                        rVar.f152476l = i17;
                        rVar.f152477m = i15;
                        rVar.f152478n = i16;
                        rVar.f152481r = 2;
                        Object objU = nVarB1.u(type, rVar);
                        if (objU != objE) {
                            objB5 = objU;
                            documentWithScopesAndSchemas = documentWithScopesAndSchemas3;
                            bVar2 = aVar;
                            str3 = str2;
                            arrayList = new ArrayList();
                            while (r2.hasNext()) {
                                if (fr.t.c(((DocumentWithScopesAndSchemas) obj).getDocument().getParentDocumentId(), str3)) {
                                    arrayList.add(obj);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                bVar2.b(new dx.b.Generic(new NoSuchElementException("No child documents for parent id " + str3 + " in the database.")));
                                throw new oq.g();
                            }
                            documentSchemaEntity = (DocumentSchemaEntity) pq.v.n0(documentWithScopesAndSchemas.b());
                            if (documentSchemaEntity != null) {
                                dx.j<dx.b> jVarA5 = xw.c.f221622a.a();
                                new ex.a();
                                left = new dx.i.Right(this.strictNonNullSerializer.a(fu.r.A(documentSchemaEntity.getSchema()), q0.n(MultiDocumentSchemaDto.class)));
                            } else {
                                left = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No schema in the DocumentSchemaEntity list.")));
                            }
                            MultiDocumentSchema multiDocumentSchemaK2 = n24.a.K((MultiDocumentSchemaDto) bVar2.a(left));
                            arrayList2 = new ArrayList();
                            while (r7.hasNext()) {
                                documentScopeEntity = (DocumentScopeEntity) pq.v.n0(documentWithScopesAndSchemas2.c());
                                dynamicDocumentData = null;
                                if (documentScopeEntity != null) {
                                    List<DocumentScopeEntity> listC2 = documentWithScopesAndSchemas2.c();
                                    dx.j<dx.b> jVarA6 = xw.c.f221622a.a();
                                    ex.a aVar3 = new ex.a();
                                    it = listC2.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), scopeName));
                                    documentScopeEntity2 = (DocumentScopeEntity) next;
                                    if (documentScopeEntity2 != null) {
                                        objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity2.getScopeData()), q0.g(com.google.gson.o.class));
                                        if (objA != null) {
                                            left2 = new dx.i.Right(objA);
                                            if (left2 instanceof dx.i.Left) {
                                            } else {
                                                if (left2 instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                mapA = this.jsonFieldParser.a(((com.google.gson.o) ((dx.i.Right) left2).b()).toString());
                                                documentSchemaEntity2 = (DocumentSchemaEntity) pq.v.n0(documentWithScopesAndSchemas2.b());
                                                if (documentSchemaEntity2 != null) {
                                                    dx.j<dx.b> jVarA7 = xw.c.f221622a.a();
                                                    new ex.a();
                                                    left3 = new dx.i.Right(this.strictNonNullSerializer.a(fu.r.A(documentSchemaEntity2.getSchema()), q0.n(DocumentSchemaDto.class)));
                                                } else {
                                                    left3 = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No schema in the DocumentSchemaEntity list.")));
                                                }
                                                if (left3 instanceof dx.i.Left) {
                                                } else {
                                                    if (left3 instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    dynamicDocumentData = new DynamicDocumentData(n24.a.b(documentWithScopesAndSchemas2.getDocument()), new DynamicDocumentScope(mapA), n24.a.t((DocumentSchemaDto) ((dx.i.Right) left3).b()));
                                                }
                                            }
                                        }
                                    }
                                    aVar3.b(new dx.b.Generic(new NoSuchElementException("No scope with name " + scopeName + " in list.")));
                                    throw new oq.g();
                                }
                                if (dynamicDocumentData != null) {
                                    arrayList2.add(dynamicDocumentData);
                                }
                            }
                            return new dx.i.Right(new DynamicMultiDocumentFullData(str3, multiDocumentSchemaK2, arrayList2));
                        }
                        return objE;
                    } catch (Exception e45) {
                        e = e45;
                        r15 = i26;
                    }
                } catch (CancellationException e46) {
                    throw e46;
                }
            } catch (ex.c e47) {
                e = e47;
            } catch (CancellationException e48) {
                throw e48;
            }
        } catch (ex.c e49) {
            e = e49;
        } catch (CancellationException e55) {
            throw e55;
        } catch (Exception e56) {
            e = e56;
            r15 = i26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x021f A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #8 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:29:0x0090, B:30:0x0099, B:32:0x00a0, B:36:0x00b3, B:38:0x00b7, B:40:0x00bd, B:42:0x00c3, B:43:0x00ce, B:45:0x00d4, B:100:0x01f9, B:48:0x00e7, B:50:0x00f3, B:53:0x00fa, B:88:0x01be, B:90:0x01c2, B:91:0x01cc, B:93:0x01d0, B:94:0x01ea, B:95:0x01ef, B:78:0x0189, B:81:0x0192, B:83:0x01a1, B:87:0x01b9, B:84:0x01af, B:86:0x01b3, B:96:0x01f0, B:97:0x01f5, B:98:0x01f6, B:101:0x01fe, B:102:0x020a, B:103:0x021e, B:104:0x021f, B:105:0x0233, B:112:0x0243, B:115:0x0251), top: B:131:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0090 A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #8 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:29:0x0090, B:30:0x0099, B:32:0x00a0, B:36:0x00b3, B:38:0x00b7, B:40:0x00bd, B:42:0x00c3, B:43:0x00ce, B:45:0x00d4, B:100:0x01f9, B:48:0x00e7, B:50:0x00f3, B:53:0x00fa, B:88:0x01be, B:90:0x01c2, B:91:0x01cc, B:93:0x01d0, B:94:0x01ea, B:95:0x01ef, B:78:0x0189, B:81:0x0192, B:83:0x01a1, B:87:0x01b9, B:84:0x01af, B:86:0x01b3, B:96:0x01f0, B:97:0x01f5, B:98:0x01f6, B:101:0x01fe, B:102:0x020a, B:103:0x021e, B:104:0x021f, B:105:0x0233, B:112:0x0243, B:115:0x0251), top: B:131:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0 A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #8 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:29:0x0090, B:30:0x0099, B:32:0x00a0, B:36:0x00b3, B:38:0x00b7, B:40:0x00bd, B:42:0x00c3, B:43:0x00ce, B:45:0x00d4, B:100:0x01f9, B:48:0x00e7, B:50:0x00f3, B:53:0x00fa, B:88:0x01be, B:90:0x01c2, B:91:0x01cc, B:93:0x01d0, B:94:0x01ea, B:95:0x01ef, B:78:0x0189, B:81:0x0192, B:83:0x01a1, B:87:0x01b9, B:84:0x01af, B:86:0x01b3, B:96:0x01f0, B:97:0x01f5, B:98:0x01f6, B:101:0x01fe, B:102:0x020a, B:103:0x021e, B:104:0x021f, B:105:0x0233, B:112:0x0243, B:115:0x0251), top: B:131:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p24.b$y, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l24.n] */
    @Override // v24.b
    public Object J(tq.e<? super dx.i<? extends dx.b, VehicleDocumentsFullData>> eVar) throws Throwable {
        ?? yVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        Collection collection;
        Iterator it;
        Object next;
        DocumentWithScopes documentWithScopes;
        DocumentEntity document;
        String parentDocumentId;
        DocumentScopeEntity documentScopeEntity;
        String scopeName;
        dx.i left;
        Object objB2;
        VehicleDocumentData vehicleDocumentData;
        Object next2;
        if (eVar instanceof y) {
            y yVar2 = (y) eVar;
            int i15 = yVar2.f152558p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                yVar2.f152558p = i15 - PKIFailureInfo.systemUnavail;
                yVar = yVar2;
            } else {
                yVar = new y(eVar);
            }
        } else {
            yVar = new y(eVar);
        }
        Object obj = yVar.f152556m;
        Object objE = uq.b.e();
        int i16 = yVar.f152558p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.VEHICLE_CARD;
                        yVar.f152553j = jVarA;
                        yVar.f152554k = vq.j.a(aVar);
                        yVar.f152555l = aVar;
                        yVar.f152548d = 0;
                        yVar.f152549e = 0;
                        yVar.f152550f = 0;
                        yVar.f152551g = 0;
                        yVar.f152552h = 0;
                        yVar.f152558p = 1;
                        Object objQ = B0.q(documentEntityType, yVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        obj = objQ;
                        bVar = aVar;
                        collection = (Collection) obj;
                        if (!collection.isEmpty()) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type VEHICLE CARD in the database.")));
                            throw new oq.g();
                        }
                        List<DocumentWithScopes> list = (List) collection;
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((DocumentWithScopes) next).getDocument().getParentDocumentId() == null);
                        documentWithScopes = (DocumentWithScopes) next;
                        if (documentWithScopes != null) {
                        }
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with parent id in the database.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        yVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(yVar));
                        dx.i iVarA = yVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) yVar.f152555l;
                try {
                    oq.u.b(obj);
                    collection = (Collection) obj;
                    if (!collection.isEmpty()) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type VEHICLE CARD in the database.")));
                        throw new oq.g();
                    }
                    List<DocumentWithScopes> list2 = (List) collection;
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((DocumentWithScopes) next).getDocument().getParentDocumentId() == null);
                    documentWithScopes = (DocumentWithScopes) next;
                    if (documentWithScopes != null || (document = documentWithScopes.getDocument()) == null || (parentDocumentId = document.getParentDocumentId()) == null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with parent id in the database.")));
                        throw new oq.g();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (DocumentWithScopes documentWithScopes2 : list2) {
                        if (documentWithScopes2.getDocument().getParentDocumentId() == null || (documentScopeEntity = (DocumentScopeEntity) pq.v.n0(documentWithScopes2.b())) == null || (scopeName = documentScopeEntity.getScopeName()) == null) {
                            vehicleDocumentData = null;
                        } else {
                            List<DocumentScopeEntity> listB = documentWithScopes2.b();
                            dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                            try {
                                try {
                                    ex.a aVar2 = new ex.a();
                                    Iterator it4 = listB.iterator();
                                    do {
                                        if (!it4.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it4.next();
                                    } while (!fr.t.c(((DocumentScopeEntity) next2).getScopeName(), scopeName));
                                    DocumentScopeEntity documentScopeEntity2 = (DocumentScopeEntity) next2;
                                    if (documentScopeEntity2 != null) {
                                        Object objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity2.getScopeData()), q0.g(VehicleCardDataDto.class));
                                        if (objA != null) {
                                            left = new dx.i.Right(objA);
                                            if (left instanceof dx.i.Left) {
                                                vehicleDocumentData = null;
                                            } else {
                                                if (!(left instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                vehicleDocumentData = new VehicleDocumentData(n24.a.b(documentWithScopes2.getDocument()), n24.a.w0((VehicleCardDataDto) ((dx.i.Right) left).b()));
                                            }
                                        }
                                    }
                                    aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name " + scopeName + " in list.")));
                                    throw new oq.g();
                                } catch (Exception e19) {
                                    px.f fVar2 = px.f.f163100a;
                                    String message2 = e19.getMessage();
                                    if (message2 == null) {
                                        message2 = "";
                                    }
                                    fVar2.d(message2, e19, px.c.a(jVarA2));
                                    Object objA2 = jVarA2.a(e19);
                                    if (objA2 instanceof dx.i.Left) {
                                        objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                    } else {
                                        if (!(objA2 instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB2 = ((dx.i.Right) objA2).b();
                                    }
                                    left = new dx.i.Left(objB2);
                                }
                            } catch (ex.c e25) {
                                try {
                                    left = new dx.i.Left((dx.b) ex.d.a(e25));
                                } catch (CancellationException e26) {
                                    throw e26;
                                }
                            } catch (CancellationException e27) {
                                throw e27;
                            }
                        }
                        if (vehicleDocumentData != null) {
                            arrayList.add(vehicleDocumentData);
                        }
                    }
                    return new dx.i.Right(new VehicleDocumentsFullData(parentDocumentId, arrayList));
                } catch (ex.c e28) {
                    e15 = e28;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (CancellationException e35) {
                throw e35;
            }
        } catch (Exception e36) {
            e = e36;
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0098 A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #7 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:28:0x0091, B:30:0x0098, B:34:0x00ab, B:36:0x00af, B:38:0x00b5, B:40:0x00bb, B:41:0x00c6, B:43:0x00cc, B:98:0x01f5, B:46:0x00df, B:48:0x00eb, B:51:0x00f2, B:86:0x01b6, B:88:0x01ba, B:89:0x01c4, B:91:0x01c8, B:92:0x01e6, B:93:0x01eb, B:76:0x0181, B:79:0x018a, B:81:0x0199, B:85:0x01b1, B:82:0x01a7, B:84:0x01ab, B:94:0x01ec, B:95:0x01f1, B:96:0x01f2, B:99:0x01fa, B:100:0x020a, B:101:0x021e, B:108:0x022e, B:111:0x023d), top: B:128:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p24.b$u, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l24.n] */
    @Override // v24.b
    public Object K(tq.e<? super dx.i<? extends dx.b, RailwayCardFullData>> eVar) throws Throwable {
        ?? uVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        Iterator it;
        Object next;
        DocumentWithScopes documentWithScopes;
        DocumentEntity document;
        String parentDocumentId;
        DocumentScopeEntity documentScopeEntity;
        String scopeName;
        dx.i left;
        Object objB2;
        oq.r rVarA;
        Object next2;
        if (eVar instanceof u) {
            u uVar2 = (u) eVar;
            int i15 = uVar2.f152514p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                uVar2.f152514p = i15 - PKIFailureInfo.systemUnavail;
                uVar = uVar2;
            } else {
                uVar = new u(eVar);
            }
        } else {
            uVar = new u(eVar);
        }
        Object obj = uVar.f152512m;
        Object objE = uq.b.e();
        int i16 = uVar.f152514p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.RAILWAY_CARD;
                        uVar.f152509j = jVarA;
                        uVar.f152510k = vq.j.a(aVar);
                        uVar.f152511l = aVar;
                        uVar.f152504d = 0;
                        uVar.f152505e = 0;
                        uVar.f152506f = 0;
                        uVar.f152507g = 0;
                        uVar.f152508h = 0;
                        uVar.f152514p = 1;
                        Object objQ = B0.q(documentEntityType, uVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        obj = objQ;
                        bVar = aVar;
                        List<DocumentWithScopes> list = (List) obj;
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((DocumentWithScopes) next).getDocument().getParentDocumentId() == null);
                        documentWithScopes = (DocumentWithScopes) next;
                        if (documentWithScopes != null) {
                        }
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with parent id in the database.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        uVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(uVar));
                        dx.i iVarA = uVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) uVar.f152511l;
                try {
                    oq.u.b(obj);
                    List<DocumentWithScopes> list2 = (List) obj;
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((DocumentWithScopes) next).getDocument().getParentDocumentId() == null);
                    documentWithScopes = (DocumentWithScopes) next;
                    if (documentWithScopes != null || (document = documentWithScopes.getDocument()) == null || (parentDocumentId = document.getParentDocumentId()) == null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with parent id in the database.")));
                        throw new oq.g();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (DocumentWithScopes documentWithScopes2 : list2) {
                        if (documentWithScopes2.getDocument().getParentDocumentId() == null || (documentScopeEntity = (DocumentScopeEntity) pq.v.n0(documentWithScopes2.b())) == null || (scopeName = documentScopeEntity.getScopeName()) == null) {
                            rVarA = null;
                        } else {
                            List<DocumentScopeEntity> listB = documentWithScopes2.b();
                            dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                            try {
                                try {
                                    ex.a aVar2 = new ex.a();
                                    Iterator it4 = listB.iterator();
                                    do {
                                        if (!it4.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it4.next();
                                    } while (!fr.t.c(((DocumentScopeEntity) next2).getScopeName(), scopeName));
                                    DocumentScopeEntity documentScopeEntity2 = (DocumentScopeEntity) next2;
                                    if (documentScopeEntity2 != null) {
                                        Object objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity2.getScopeData()), q0.g(RailwayCardScopeDto.class));
                                        if (objA != null) {
                                            left = new dx.i.Right(objA);
                                            if (left instanceof dx.i.Left) {
                                                rVarA = null;
                                            } else {
                                                if (!(left instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                rVarA = oq.y.a(scopeName, new RailwayCardData(n24.a.b(documentWithScopes2.getDocument()), n24.a.q0((RailwayCardScopeDto) ((dx.i.Right) left).b())));
                                            }
                                        }
                                    }
                                    aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name " + scopeName + " in list.")));
                                    throw new oq.g();
                                } catch (Exception e19) {
                                    px.f fVar2 = px.f.f163100a;
                                    String message2 = e19.getMessage();
                                    if (message2 == null) {
                                        message2 = "";
                                    }
                                    fVar2.d(message2, e19, px.c.a(jVarA2));
                                    Object objA2 = jVarA2.a(e19);
                                    if (objA2 instanceof dx.i.Left) {
                                        objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                    } else {
                                        if (!(objA2 instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB2 = ((dx.i.Right) objA2).b();
                                    }
                                    left = new dx.i.Left(objB2);
                                }
                            } catch (ex.c e25) {
                                try {
                                    left = new dx.i.Left((dx.b) ex.d.a(e25));
                                } catch (CancellationException e26) {
                                    throw e26;
                                }
                            } catch (CancellationException e27) {
                                throw e27;
                            }
                        }
                        if (rVarA != null) {
                            arrayList.add(rVarA);
                        }
                    }
                    return new dx.i.Right(new RailwayCardFullData(parentDocumentId, v0.s(arrayList)));
                } catch (ex.c e28) {
                    e15 = e28;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (CancellationException e35) {
                throw e35;
            }
        } catch (Exception e36) {
            e = e36;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p24.b$e, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [l24.n] */
    @Override // v24.b
    public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<Document>>> eVar) throws Throwable {
        ?? eVar2;
        Object objB;
        ex.c e15;
        if (eVar instanceof e) {
            e eVar3 = (e) eVar;
            int i15 = eVar3.f152206p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar3.f152206p = i15 - PKIFailureInfo.systemUnavail;
                eVar2 = eVar3;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f152204m;
        Object objE = uq.b.e();
        int i16 = eVar2.f152206p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        eVar2.f152201j = jVarA;
                        eVar2.f152202k = vq.j.a(aVar);
                        eVar2.f152203l = vq.j.a(aVar);
                        eVar2.f152196d = 0;
                        eVar2.f152197e = 0;
                        eVar2.f152198f = 0;
                        eVar2.f152199g = 0;
                        eVar2.f152200h = 0;
                        eVar2.f152206p = 1;
                        Object objA = B0.a(eVar2);
                        if (objA == objE) {
                            return objE;
                        }
                        obj = objA;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        eVar2 = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(eVar2));
                        dx.i iVarA = eVar2.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(pq.v.y(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(n24.a.b((DocumentEntity) it.next()));
                }
                return new dx.i.Right(arrayList);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // v24.b
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        C3746b c3746b;
        Object objB;
        ex.c e15;
        if (eVar instanceof C3746b) {
            c3746b = (C3746b) eVar;
            int i15 = c3746b.f152130q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3746b.f152130q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3746b = new C3746b(eVar);
            }
        } else {
            c3746b = new C3746b(eVar);
        }
        Object obj = c3746b.f152128n;
        Object objE = uq.b.e();
        int i16 = c3746b.f152130q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        c3746b.f152119d = vq.j.a(str);
                        c3746b.f152120e = jVarA;
                        c3746b.f152121f = vq.j.a(aVar);
                        c3746b.f152122g = vq.j.a(aVar);
                        c3746b.f152123h = 0;
                        c3746b.f152124j = 0;
                        c3746b.f152125k = 0;
                        c3746b.f152126l = 0;
                        c3746b.f152127m = 0;
                        c3746b.f152130q = 1;
                        if (nVarB0.g(str, c3746b) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // v24.b
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, Document>> eVar) throws Throwable {
        i iVar;
        Object objB;
        String str2;
        ex.b bVar;
        DocumentEntity documentEntity;
        Document documentB;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f152329q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f152329q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object obj = iVar.f152327n;
        ?? E = uq.b.e();
        int i16 = iVar.f152329q;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) iVar.f152321g;
                    str2 = (String) iVar.f152318d;
                    try {
                        oq.u.b(obj);
                        documentEntity = (DocumentEntity) obj;
                        if (documentEntity == null && (documentB = n24.a.b(documentEntity)) != null) {
                            return new dx.i.Right(documentB);
                        }
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with id " + str2 + " in the database.")));
                        throw new oq.g();
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                oq.u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                    iVar.f152318d = str;
                    iVar.f152319e = jVarA;
                    iVar.f152320f = vq.j.a(aVar);
                    iVar.f152321g = aVar;
                    iVar.f152322h = 0;
                    iVar.f152323j = 0;
                    iVar.f152324k = 0;
                    iVar.f152325l = 0;
                    iVar.f152326m = 0;
                    iVar.f152329q = 1;
                    Object objC = nVarB0.c(str, iVar);
                    if (objC == E) {
                        return E;
                    }
                    obj = objC;
                    str2 = str;
                    bVar = aVar;
                    documentEntity = (DocumentEntity) obj;
                    if (documentEntity == null) {
                    }
                    bVar.b(new dx.b.Generic(new NoSuchElementException("No document with id " + str2 + " in the database.")));
                    throw new oq.g();
                } catch (ex.c e17) {
                    e = e17;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    e = e19;
                    E = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(E));
                    dx.i iVarA = E.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x025d A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #10 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x008c, B:30:0x0092, B:32:0x009e, B:34:0x00a4, B:69:0x0168, B:71:0x0184, B:98:0x020c, B:84:0x01be, B:87:0x01c7, B:89:0x01d6, B:93:0x01ee, B:90:0x01e4, B:92:0x01e8, B:94:0x01f4, B:95:0x01f9, B:96:0x01fa, B:97:0x01fb, B:59:0x0133, B:62:0x013c, B:64:0x014b, B:68:0x0163, B:65:0x0159, B:67:0x015d, B:99:0x022f, B:100:0x0234, B:101:0x0235, B:102:0x0236, B:103:0x025c, B:104:0x025d, B:105:0x0283, B:112:0x028d, B:115:0x029c), top: B:133:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0092 A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TRY_ENTER, TryCatch #10 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x008c, B:30:0x0092, B:32:0x009e, B:34:0x00a4, B:69:0x0168, B:71:0x0184, B:98:0x020c, B:84:0x01be, B:87:0x01c7, B:89:0x01d6, B:93:0x01ee, B:90:0x01e4, B:92:0x01e8, B:94:0x01f4, B:95:0x01f9, B:96:0x01fa, B:97:0x01fb, B:59:0x0133, B:62:0x013c, B:64:0x014b, B:68:0x0163, B:65:0x0159, B:67:0x015d, B:99:0x022f, B:100:0x0234, B:101:0x0235, B:102:0x0236, B:103:0x025c, B:104:0x025d, B:105:0x0283, B:112:0x028d, B:115:0x029c), top: B:133:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:104:0x025d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // v24.b
    public Object d(String str, tq.e<? super dx.i<? extends dx.b, DynamicDocumentData>> eVar) throws Throwable {
        n nVar;
        Object objB;
        String str2;
        ex.b bVar;
        DocumentWithScopesAndSchemas documentWithScopesAndSchemas;
        DocumentScopeEntity documentScopeEntity;
        String scopeName;
        dx.i left;
        Object objB2;
        dx.i left2;
        Object objB3;
        Object next;
        if (eVar instanceof n) {
            nVar = (n) eVar;
            int i15 = nVar.f152435q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                nVar.f152435q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                nVar = new n(eVar);
            }
        } else {
            nVar = new n(eVar);
        }
        Object obj = nVar.f152433n;
        ?? E = uq.b.e();
        int i16 = nVar.f152435q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        nVar.f152424d = str;
                        nVar.f152425e = jVarA;
                        nVar.f152426f = vq.j.a(aVar);
                        nVar.f152427g = aVar;
                        nVar.f152428h = 0;
                        nVar.f152429j = 0;
                        nVar.f152430k = 0;
                        nVar.f152431l = 0;
                        nVar.f152432m = 0;
                        nVar.f152435q = 1;
                        Object objB4 = nVarB0.b(str, nVar);
                        if (objB4 == E) {
                            return E;
                        }
                        obj = objB4;
                        str2 = str;
                        bVar = aVar;
                        documentWithScopesAndSchemas = (DocumentWithScopesAndSchemas) obj;
                        if (documentWithScopesAndSchemas != null) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("No document with id " + str2 + " in the database.")));
                            throw new oq.g();
                        }
                        documentScopeEntity = (DocumentScopeEntity) pq.v.n0(documentWithScopesAndSchemas.c());
                        if (documentScopeEntity != null) {
                        }
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No scope for document with id " + str2 + " in the database.")));
                        throw new oq.g();
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) nVar.f152427g;
                str2 = (String) nVar.f152424d;
                try {
                    oq.u.b(obj);
                    documentWithScopesAndSchemas = (DocumentWithScopesAndSchemas) obj;
                    if (documentWithScopesAndSchemas != null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with id " + str2 + " in the database.")));
                        throw new oq.g();
                    }
                    documentScopeEntity = (DocumentScopeEntity) pq.v.n0(documentWithScopesAndSchemas.c());
                    if (documentScopeEntity != null || (scopeName = documentScopeEntity.getScopeName()) == null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No scope for document with id " + str2 + " in the database.")));
                        throw new oq.g();
                    }
                    try {
                        List<DocumentScopeEntity> listC = documentWithScopesAndSchemas.c();
                        dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                        try {
                            try {
                                ex.a aVar2 = new ex.a();
                                Iterator it = listC.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), scopeName));
                                DocumentScopeEntity documentScopeEntity2 = (DocumentScopeEntity) next;
                                if (documentScopeEntity2 != null) {
                                    Object objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity2.getScopeData()), q0.g(com.google.gson.o.class));
                                    if (objA != null) {
                                        left = new dx.i.Right(objA);
                                        Map<String, String> mapA = this.jsonFieldParser.a(((com.google.gson.o) bVar.a(left)).toString());
                                        DocumentSchemaEntity documentSchemaEntity = (DocumentSchemaEntity) pq.v.n0(documentWithScopesAndSchemas.b());
                                        if (documentSchemaEntity != null) {
                                            try {
                                                dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                                                try {
                                                    try {
                                                        new ex.a();
                                                        left2 = new dx.i.Right(this.strictNonNullSerializer.a(fu.r.A(documentSchemaEntity.getSchema()), q0.n(DocumentSchemaDto.class)));
                                                    } catch (Exception e18) {
                                                        px.f fVar2 = px.f.f163100a;
                                                        String message2 = e18.getMessage();
                                                        if (message2 == null) {
                                                            message2 = "";
                                                        }
                                                        fVar2.d(message2, e18, px.c.a(jVarA3));
                                                        Object objA2 = jVarA3.a(e18);
                                                        if (objA2 instanceof dx.i.Left) {
                                                            objB3 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                                        } else {
                                                            if (!(objA2 instanceof dx.i.Right)) {
                                                                throw new oq.p();
                                                            }
                                                            objB3 = ((dx.i.Right) objA2).b();
                                                        }
                                                        left2 = new dx.i.Left(objB3);
                                                    }
                                                } catch (ex.c e19) {
                                                    left2 = new dx.i.Left((dx.b) ex.d.a(e19));
                                                } catch (CancellationException e25) {
                                                    throw e25;
                                                }
                                            } catch (CancellationException e26) {
                                                throw e26;
                                            }
                                        } else {
                                            left2 = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No schema in the DocumentSchemaEntity list.")));
                                        }
                                        return new dx.i.Right(new DynamicDocumentData(n24.a.b(documentWithScopesAndSchemas.getDocument()), new DynamicDocumentScope(mapA), n24.a.t((DocumentSchemaDto) bVar.a(left2))));
                                    }
                                }
                                aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name " + scopeName + " in list.")));
                                throw new oq.g();
                            } catch (Exception e27) {
                                px.f fVar3 = px.f.f163100a;
                                String message3 = e27.getMessage();
                                if (message3 == null) {
                                    message3 = "";
                                }
                                fVar3.d(message3, e27, px.c.a(jVarA2));
                                Object objA3 = jVarA2.a(e27);
                                if (objA3 instanceof dx.i.Left) {
                                    objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA3).b());
                                } else {
                                    if (!(objA3 instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) objA3).b();
                                }
                                left = new dx.i.Left(objB2);
                            }
                        } catch (ex.c e28) {
                            left = new dx.i.Left((dx.b) ex.d.a(e28));
                        } catch (CancellationException e29) {
                            throw e29;
                        }
                    } catch (CancellationException e35) {
                        throw e35;
                    }
                } catch (ex.c e36) {
                    e = e36;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e37) {
                    throw e37;
                }
            } catch (CancellationException e38) {
                throw e38;
            }
        } catch (Exception e39) {
            e = e39;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // v24.b
    public Object e(String str, tq.e<? super dx.i<? extends dx.b, DocumentScope>> eVar) throws Throwable {
        l lVar;
        Object objB;
        String str2;
        ex.b bVar;
        DocumentScopeEntity documentScopeEntity;
        DocumentScope documentScopeK;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i15 = lVar.f152412q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f152412q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(eVar);
            }
        } else {
            lVar = new l(eVar);
        }
        Object obj = lVar.f152410n;
        ?? E = uq.b.e();
        int i16 = lVar.f152412q;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) lVar.f152404g;
                    str2 = (String) lVar.f152401d;
                    try {
                        oq.u.b(obj);
                        documentScopeEntity = (DocumentScopeEntity) obj;
                        if (documentScopeEntity == null && (documentScopeK = n24.a.k(documentScopeEntity)) != null) {
                            return new dx.i.Right(documentScopeK);
                        }
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document scope with documentId " + str2 + " in the database.")));
                        throw new oq.g();
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                oq.u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                    lVar.f152401d = str;
                    lVar.f152402e = jVarA;
                    lVar.f152403f = vq.j.a(aVar);
                    lVar.f152404g = aVar;
                    lVar.f152405h = 0;
                    lVar.f152406j = 0;
                    lVar.f152407k = 0;
                    lVar.f152408l = 0;
                    lVar.f152409m = 0;
                    lVar.f152412q = 1;
                    Object objE = nVarB0.e(str, lVar);
                    if (objE == E) {
                        return E;
                    }
                    obj = objE;
                    str2 = str;
                    bVar = aVar;
                    documentScopeEntity = (DocumentScopeEntity) obj;
                    if (documentScopeEntity == null) {
                    }
                    bVar.b(new dx.b.Generic(new NoSuchElementException("No document scope with documentId " + str2 + " in the database.")));
                    throw new oq.g();
                } catch (ex.c e17) {
                    e = e17;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    e = e19;
                    E = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(E));
                    dx.i iVarA = E.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: Exception -> 0x0048, c -> 0x004b, CancellationException -> 0x004e, TryCatch #5 {Exception -> 0x0048, blocks: (B:13:0x0043, B:35:0x00bd, B:83:0x01e8, B:85:0x01f0, B:86:0x01f7, B:87:0x021f, B:38:0x00c5, B:40:0x00c9, B:41:0x00df, B:43:0x00e5, B:45:0x0104, B:49:0x011c, B:51:0x0120, B:52:0x0127, B:53:0x012e, B:54:0x0133, B:90:0x0226, B:93:0x0234, B:24:0x0071, B:67:0x0190, B:70:0x0197, B:72:0x019b, B:73:0x01b1, B:75:0x01b7, B:79:0x01d8, B:81:0x01dc, B:82:0x01e3, B:88:0x0220, B:89:0x0225), top: B:108:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9 A[Catch: Exception -> 0x0048, c -> 0x004b, CancellationException -> 0x004e, TryCatch #5 {Exception -> 0x0048, blocks: (B:13:0x0043, B:35:0x00bd, B:83:0x01e8, B:85:0x01f0, B:86:0x01f7, B:87:0x021f, B:38:0x00c5, B:40:0x00c9, B:41:0x00df, B:43:0x00e5, B:45:0x0104, B:49:0x011c, B:51:0x0120, B:52:0x0127, B:53:0x012e, B:54:0x0133, B:90:0x0226, B:93:0x0234, B:24:0x0071, B:67:0x0190, B:70:0x0197, B:72:0x019b, B:73:0x01b1, B:75:0x01b7, B:79:0x01d8, B:81:0x01dc, B:82:0x01e3, B:88:0x0220, B:89:0x0225), top: B:108:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5 A[Catch: Exception -> 0x0048, c -> 0x004b, CancellationException -> 0x004e, TryCatch #5 {Exception -> 0x0048, blocks: (B:13:0x0043, B:35:0x00bd, B:83:0x01e8, B:85:0x01f0, B:86:0x01f7, B:87:0x021f, B:38:0x00c5, B:40:0x00c9, B:41:0x00df, B:43:0x00e5, B:45:0x0104, B:49:0x011c, B:51:0x0120, B:52:0x0127, B:53:0x012e, B:54:0x0133, B:90:0x0226, B:93:0x0234, B:24:0x0071, B:67:0x0190, B:70:0x0197, B:72:0x019b, B:73:0x01b1, B:75:0x01b7, B:79:0x01d8, B:81:0x01dc, B:82:0x01e3, B:88:0x0220, B:89:0x0225), top: B:108:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0120 A[Catch: Exception -> 0x0048, c -> 0x004b, CancellationException -> 0x004e, TryCatch #5 {Exception -> 0x0048, blocks: (B:13:0x0043, B:35:0x00bd, B:83:0x01e8, B:85:0x01f0, B:86:0x01f7, B:87:0x021f, B:38:0x00c5, B:40:0x00c9, B:41:0x00df, B:43:0x00e5, B:45:0x0104, B:49:0x011c, B:51:0x0120, B:52:0x0127, B:53:0x012e, B:54:0x0133, B:90:0x0226, B:93:0x0234, B:24:0x0071, B:67:0x0190, B:70:0x0197, B:72:0x019b, B:73:0x01b1, B:75:0x01b7, B:79:0x01d8, B:81:0x01dc, B:82:0x01e3, B:88:0x0220, B:89:0x0225), top: B:108:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x012e A[Catch: Exception -> 0x0048, c -> 0x004b, CancellationException -> 0x004e, TryCatch #5 {Exception -> 0x0048, blocks: (B:13:0x0043, B:35:0x00bd, B:83:0x01e8, B:85:0x01f0, B:86:0x01f7, B:87:0x021f, B:38:0x00c5, B:40:0x00c9, B:41:0x00df, B:43:0x00e5, B:45:0x0104, B:49:0x011c, B:51:0x0120, B:52:0x0127, B:53:0x012e, B:54:0x0133, B:90:0x0226, B:93:0x0234, B:24:0x0071, B:67:0x0190, B:70:0x0197, B:72:0x019b, B:73:0x01b1, B:75:0x01b7, B:79:0x01d8, B:81:0x01dc, B:82:0x01e3, B:88:0x0220, B:89:0x0225), top: B:108:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x0197 A[Catch: Exception -> 0x0048, c -> 0x004b, CancellationException -> 0x004e, TryCatch #5 {Exception -> 0x0048, blocks: (B:13:0x0043, B:35:0x00bd, B:83:0x01e8, B:85:0x01f0, B:86:0x01f7, B:87:0x021f, B:38:0x00c5, B:40:0x00c9, B:41:0x00df, B:43:0x00e5, B:45:0x0104, B:49:0x011c, B:51:0x0120, B:52:0x0127, B:53:0x012e, B:54:0x0133, B:90:0x0226, B:93:0x0234, B:24:0x0071, B:67:0x0190, B:70:0x0197, B:72:0x019b, B:73:0x01b1, B:75:0x01b7, B:79:0x01d8, B:81:0x01dc, B:82:0x01e3, B:88:0x0220, B:89:0x0225), top: B:108:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x019b A[Catch: Exception -> 0x0048, c -> 0x004b, CancellationException -> 0x004e, TryCatch #5 {Exception -> 0x0048, blocks: (B:13:0x0043, B:35:0x00bd, B:83:0x01e8, B:85:0x01f0, B:86:0x01f7, B:87:0x021f, B:38:0x00c5, B:40:0x00c9, B:41:0x00df, B:43:0x00e5, B:45:0x0104, B:49:0x011c, B:51:0x0120, B:52:0x0127, B:53:0x012e, B:54:0x0133, B:90:0x0226, B:93:0x0234, B:24:0x0071, B:67:0x0190, B:70:0x0197, B:72:0x019b, B:73:0x01b1, B:75:0x01b7, B:79:0x01d8, B:81:0x01dc, B:82:0x01e3, B:88:0x0220, B:89:0x0225), top: B:108:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b7 A[Catch: Exception -> 0x0048, c -> 0x004b, CancellationException -> 0x004e, TryCatch #5 {Exception -> 0x0048, blocks: (B:13:0x0043, B:35:0x00bd, B:83:0x01e8, B:85:0x01f0, B:86:0x01f7, B:87:0x021f, B:38:0x00c5, B:40:0x00c9, B:41:0x00df, B:43:0x00e5, B:45:0x0104, B:49:0x011c, B:51:0x0120, B:52:0x0127, B:53:0x012e, B:54:0x0133, B:90:0x0226, B:93:0x0234, B:24:0x0071, B:67:0x0190, B:70:0x0197, B:72:0x019b, B:73:0x01b1, B:75:0x01b7, B:79:0x01d8, B:81:0x01dc, B:82:0x01e3, B:88:0x0220, B:89:0x0225), top: B:108:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x01dc A[Catch: Exception -> 0x0048, c -> 0x004b, CancellationException -> 0x004e, TryCatch #5 {Exception -> 0x0048, blocks: (B:13:0x0043, B:35:0x00bd, B:83:0x01e8, B:85:0x01f0, B:86:0x01f7, B:87:0x021f, B:38:0x00c5, B:40:0x00c9, B:41:0x00df, B:43:0x00e5, B:45:0x0104, B:49:0x011c, B:51:0x0120, B:52:0x0127, B:53:0x012e, B:54:0x0133, B:90:0x0226, B:93:0x0234, B:24:0x0071, B:67:0x0190, B:70:0x0197, B:72:0x019b, B:73:0x01b1, B:75:0x01b7, B:79:0x01d8, B:81:0x01dc, B:82:0x01e3, B:88:0x0220, B:89:0x0225), top: B:108:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0220 A[Catch: Exception -> 0x0048, c -> 0x004b, CancellationException -> 0x004e, TryCatch #5 {Exception -> 0x0048, blocks: (B:13:0x0043, B:35:0x00bd, B:83:0x01e8, B:85:0x01f0, B:86:0x01f7, B:87:0x021f, B:38:0x00c5, B:40:0x00c9, B:41:0x00df, B:43:0x00e5, B:45:0x0104, B:49:0x011c, B:51:0x0120, B:52:0x0127, B:53:0x012e, B:54:0x0133, B:90:0x0226, B:93:0x0234, B:24:0x0071, B:67:0x0190, B:70:0x0197, B:72:0x019b, B:73:0x01b1, B:75:0x01b7, B:79:0x01d8, B:81:0x01dc, B:82:0x01e3, B:88:0x0220, B:89:0x0225), top: B:108:0x0025 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [p24.b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // v24.b
    public Object f(f24.i iVar, String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        j jVar;
        Object objB;
        f24.i iVar2;
        ex.b bVar;
        ex.b bVar2;
        String str2;
        Object right;
        Iterator it;
        Object next;
        Iterator it4;
        Object next2;
        RailwayCardData railwayCardData;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f152362s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f152362s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object obj = jVar.f152360q;
        ?? E = uq.b.e();
        int i16 = jVar.f152362s;
        try {
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            int i17 = a.f152103a[iVar.ordinal()];
                            if (i17 == 4) {
                                jVar.f152349d = iVar;
                                jVar.f152350e = vq.j.a(str);
                                jVar.f152351f = jVarA;
                                jVar.f152352g = vq.j.a(aVar);
                                jVar.f152353h = aVar;
                                jVar.f152354j = aVar;
                                jVar.f152355k = 0;
                                jVar.f152356l = 0;
                                jVar.f152357m = 0;
                                jVar.f152358n = 0;
                                jVar.f152359p = 0;
                                jVar.f152362s = 1;
                                Object objC = C(jVar);
                                if (objC != E) {
                                    iVar2 = iVar;
                                    bVar = aVar;
                                    obj = objC;
                                    bVar2 = bVar;
                                    right = (dx.i) obj;
                                    if (!(right instanceof dx.i.Left)) {
                                        if (right instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        it = ((FamilyCardFullData) ((dx.i.Right) right).b()).a().entrySet().iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                        } while (!fr.t.c(((FamilyCardData) ((Map.Entry) next).getValue()).getScope().getData().getCardRelation(), "W"));
                                        Map.Entry entry = (Map.Entry) next;
                                        right = new dx.i.Right(entry != null ? (String) entry.getKey() : null);
                                    }
                                }
                            } else {
                                if (i17 != 5) {
                                    aVar.b(new dx.b.Generic(new UnsupportedOperationException(iVar + " is not supported for getting internal owner scope")));
                                    throw new oq.g();
                                }
                                jVar.f152349d = iVar;
                                jVar.f152350e = str;
                                jVar.f152351f = jVarA;
                                jVar.f152352g = vq.j.a(aVar);
                                jVar.f152353h = aVar;
                                jVar.f152354j = aVar;
                                jVar.f152355k = 0;
                                jVar.f152356l = 0;
                                jVar.f152357m = 0;
                                jVar.f152358n = 0;
                                jVar.f152359p = 0;
                                jVar.f152362s = 2;
                                Object objK = K(jVar);
                                if (objK != E) {
                                    obj = objK;
                                    iVar2 = iVar;
                                    bVar = aVar;
                                    str2 = str;
                                    bVar2 = bVar;
                                    right = (dx.i) obj;
                                    if (!(right instanceof dx.i.Left)) {
                                        if (right instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        it4 = ((RailwayCardFullData) ((dx.i.Right) right).b()).a().entrySet().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                next2 = null;
                                                break;
                                            }
                                            next2 = it4.next();
                                            railwayCardData = (RailwayCardData) ((Map.Entry) next2).getValue();
                                            if (!fr.t.c(railwayCardData.getScope().getData().getCardRelation(), "W")) {
                                            }
                                        }
                                        Map.Entry entry2 = (Map.Entry) next2;
                                        right = new dx.i.Right(entry2 != null ? (String) entry2.getKey() : null);
                                    }
                                }
                            }
                            return E;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i16 == 1) {
                        bVar = (ex.b) jVar.f152354j;
                        bVar2 = (ex.b) jVar.f152353h;
                        iVar2 = (f24.i) jVar.f152349d;
                        oq.u.b(obj);
                        right = (dx.i) obj;
                        if (!(right instanceof dx.i.Left)) {
                            if (right instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            it = ((FamilyCardFullData) ((dx.i.Right) right).b()).a().entrySet().iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!fr.t.c(((FamilyCardData) ((Map.Entry) next).getValue()).getScope().getData().getCardRelation(), "W"));
                            Map.Entry entry3 = (Map.Entry) next;
                            right = new dx.i.Right(entry3 != null ? (String) entry3.getKey() : null);
                        }
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) jVar.f152354j;
                        bVar2 = (ex.b) jVar.f152353h;
                        str2 = (String) jVar.f152350e;
                        iVar2 = (f24.i) jVar.f152349d;
                        oq.u.b(obj);
                        right = (dx.i) obj;
                        if (!(right instanceof dx.i.Left)) {
                            if (right instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            it4 = ((RailwayCardFullData) ((dx.i.Right) right).b()).a().entrySet().iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                                railwayCardData = (RailwayCardData) ((Map.Entry) next2).getValue();
                                if (!fr.t.c(railwayCardData.getScope().getData().getCardRelation(), "W") && fr.t.c(railwayCardData.getScope().getData().getOuCategory().getValue(), str2)) {
                                    break;
                                }
                            }
                            Map.Entry entry4 = (Map.Entry) next2;
                            right = new dx.i.Right(entry4 != null ? (String) entry4.getKey() : null);
                        }
                    }
                    String str3 = (String) bVar.a(right);
                    if (str3 != null) {
                        return new dx.i.Right(str3);
                    }
                    bVar2.b(new dx.b.Generic(new NoSuchElementException("No internal owner scope for document type " + iVar2 + " in the database.")));
                    throw new oq.g();
                } catch (CancellationException e18) {
                    throw e18;
                }
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // v24.b
    public Object g(String str, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        b0 b0Var;
        Object objB;
        ex.c e15;
        if (eVar instanceof b0) {
            b0Var = (b0) eVar;
            int i15 = b0Var.f152142q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                b0Var.f152142q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                b0Var = new b0(eVar);
            }
        } else {
            b0Var = new b0(eVar);
        }
        Object obj = b0Var.f152140n;
        Object objE = uq.b.e();
        int i16 = b0Var.f152142q;
        boolean z15 = true;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        b0Var.f152131d = vq.j.a(str);
                        b0Var.f152132e = jVarA;
                        b0Var.f152133f = vq.j.a(aVar);
                        b0Var.f152134g = vq.j.a(aVar);
                        b0Var.f152135h = 0;
                        b0Var.f152136j = 0;
                        b0Var.f152137k = 0;
                        b0Var.f152138l = 0;
                        b0Var.f152139m = 0;
                        b0Var.f152142q = 1;
                        Object objD = nVarB0.d(str, b0Var);
                        if (objD == objE) {
                            return objE;
                        }
                        obj = objD;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                if (((Number) obj).intValue() <= 0) {
                    z15 = false;
                }
                return new dx.i.Right(vq.b.a(z15));
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // v24.b
    public Object h(int i15, tq.e<? super dx.i<? extends dx.b, ? extends List<Document>>> eVar) throws Throwable {
        f fVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i16 = fVar.f152238q;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f152238q = i16 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f152236n;
        Object objE = uq.b.e();
        int i17 = fVar.f152238q;
        try {
            try {
                if (i17 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        fVar.f152233k = jVarA;
                        fVar.f152234l = vq.j.a(aVar);
                        fVar.f152235m = vq.j.a(aVar);
                        fVar.f152227d = i15;
                        fVar.f152228e = 0;
                        fVar.f152229f = 0;
                        fVar.f152230g = 0;
                        fVar.f152231h = 0;
                        fVar.f152232j = 0;
                        fVar.f152238q = 1;
                        Object objH = nVarB0.h(i15, fVar);
                        if (objH == objE) {
                            return objE;
                        }
                        obj = objH;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        i15 = jVarA;
                        px.f fVar2 = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(i15));
                        dx.i iVarA = i15.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(pq.v.y(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(n24.a.b((DocumentEntity) it.next()));
                }
                return new dx.i.Right(arrayList);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // v24.b
    public Object i(String str, fz.b.LocalDate localDate, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        j0 j0Var;
        Object objB;
        if (eVar instanceof j0) {
            j0Var = (j0) eVar;
            int i15 = j0Var.f152375r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                j0Var.f152375r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                j0Var = new j0(eVar);
            }
        } else {
            j0Var = new j0(eVar);
        }
        Object obj = j0Var.f152373p;
        Object objE = uq.b.e();
        int i16 = j0Var.f152375r;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        LocalDate date = localDate.getDate();
                        j0Var.f152363d = vq.j.a(str);
                        j0Var.f152364e = vq.j.a(localDate);
                        j0Var.f152365f = jVarA;
                        j0Var.f152366g = vq.j.a(aVar);
                        j0Var.f152367h = vq.j.a(aVar);
                        j0Var.f152368j = 0;
                        j0Var.f152369k = 0;
                        j0Var.f152370l = 0;
                        j0Var.f152371m = 0;
                        j0Var.f152372n = 0;
                        j0Var.f152375r = 1;
                        if (nVarB0.o(str, date, j0Var) == objE) {
                            return objE;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x009b A[Catch: Exception -> 0x003c, c -> 0x003f, CancellationException -> 0x0042, TryCatch #5 {Exception -> 0x003c, blocks: (B:12:0x0038, B:27:0x008b, B:28:0x0094, B:30:0x009b, B:34:0x00ae, B:36:0x00b2, B:38:0x00b8, B:40:0x00be, B:41:0x00c9, B:43:0x00cf, B:97:0x01f6, B:46:0x00e2, B:47:0x00ec, B:49:0x00f2, B:53:0x0108, B:55:0x010c, B:57:0x0112, B:92:0x01dd, B:82:0x01a8, B:85:0x01b1, B:87:0x01c0, B:91:0x01d8, B:88:0x01ce, B:90:0x01d2, B:93:0x01ed, B:94:0x01f2, B:95:0x01f3, B:99:0x01fc, B:100:0x0207, B:101:0x021b, B:108:0x0225, B:111:0x0233), top: B:127:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [p24.b$w, tq.e] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [l24.n] */
    @Override // v24.b
    public Object j(tq.e<? super dx.i<? extends dx.b, RefugeeChildrenCardFullData>> eVar) throws Throwable {
        ?? wVar;
        Object objB;
        ex.b bVar;
        Iterator it;
        Object next;
        DocumentWithScopes documentWithScopes;
        DocumentEntity document;
        String parentDocumentId;
        Object next2;
        String scopeName;
        dx.i left;
        Object objB2;
        RefugeeCardData refugeeCardData;
        Object next3;
        if (eVar instanceof w) {
            w wVar2 = (w) eVar;
            int i15 = wVar2.f152536p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                wVar2.f152536p = i15 - PKIFailureInfo.systemUnavail;
                wVar = wVar2;
            } else {
                wVar = new w(eVar);
            }
        } else {
            wVar = new w(eVar);
        }
        Object obj = wVar.f152534m;
        Object objE = uq.b.e();
        int i16 = wVar.f152536p;
        boolean z15 = false;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.REFUGEE_CHILD_CARD;
                        wVar.f152531j = jVarA;
                        wVar.f152532k = vq.j.a(aVar);
                        wVar.f152533l = aVar;
                        wVar.f152526d = 0;
                        wVar.f152527e = 0;
                        wVar.f152528f = 0;
                        wVar.f152529g = 0;
                        wVar.f152530h = 0;
                        wVar.f152536p = 1;
                        Object objQ = B0.q(documentEntityType, wVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        bVar = aVar;
                        obj = objQ;
                        List<DocumentWithScopes> list = (List) obj;
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((DocumentWithScopes) next).getDocument().getParentDocumentId() == null);
                        documentWithScopes = (DocumentWithScopes) next;
                        if (documentWithScopes != null) {
                        }
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with parent id in the database.")));
                        throw new oq.g();
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        wVar = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(wVar));
                        dx.i iVarA = wVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) wVar.f152533l;
                try {
                    oq.u.b(obj);
                    List<DocumentWithScopes> list2 = (List) obj;
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((DocumentWithScopes) next).getDocument().getParentDocumentId() == null);
                    documentWithScopes = (DocumentWithScopes) next;
                    if (documentWithScopes != null || (document = documentWithScopes.getDocument()) == null || (parentDocumentId = document.getParentDocumentId()) == null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with parent id in the database.")));
                        throw new oq.g();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (DocumentWithScopes documentWithScopes2 : list2) {
                        if (documentWithScopes2.getDocument().getParentDocumentId() == null) {
                            refugeeCardData = null;
                        } else {
                            Iterator it4 = documentWithScopes2.b().iterator();
                            do {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                            } while (!fu.r.d0(((DocumentScopeEntity) next2).getScopeName(), "REFUGEE_SCOPE_3001", z15, 2, null));
                            DocumentScopeEntity documentScopeEntity = (DocumentScopeEntity) next2;
                            if (documentScopeEntity == null || (scopeName = documentScopeEntity.getScopeName()) == null) {
                                refugeeCardData = null;
                            } else {
                                Document documentB = n24.a.b(documentWithScopes2.getDocument());
                                List<DocumentScopeEntity> listB = documentWithScopes2.b();
                                dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                                try {
                                    try {
                                        ex.a aVar2 = new ex.a();
                                        Iterator it5 = listB.iterator();
                                        do {
                                            if (!it5.hasNext()) {
                                                next3 = null;
                                                break;
                                            }
                                            next3 = it5.next();
                                        } while (!fr.t.c(((DocumentScopeEntity) next3).getScopeName(), scopeName));
                                        DocumentScopeEntity documentScopeEntity2 = (DocumentScopeEntity) next3;
                                        if (documentScopeEntity2 != null) {
                                            Object objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity2.getScopeData()), q0.g(RefugeeCardDto.class));
                                            if (objA != null) {
                                                left = new dx.i.Right(objA);
                                                refugeeCardData = new RefugeeCardData(documentB, n24.a.s0((RefugeeCardDto) bVar.a(left)));
                                            }
                                        }
                                        aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name " + scopeName + " in list.")));
                                        throw new oq.g();
                                    } catch (Exception e18) {
                                        px.f fVar2 = px.f.f163100a;
                                        String message2 = e18.getMessage();
                                        if (message2 == null) {
                                            message2 = "";
                                        }
                                        fVar2.d(message2, e18, px.c.a(jVarA2));
                                        Object objA2 = jVarA2.a(e18);
                                        if (objA2 instanceof dx.i.Left) {
                                            objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                        } else {
                                            if (!(objA2 instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB2 = ((dx.i.Right) objA2).b();
                                        }
                                        left = new dx.i.Left(objB2);
                                    }
                                } catch (ex.c e19) {
                                    try {
                                        left = new dx.i.Left((dx.b) ex.d.a(e19));
                                    } catch (CancellationException e25) {
                                        throw e25;
                                    }
                                } catch (CancellationException e26) {
                                    throw e26;
                                }
                            }
                        }
                        if (refugeeCardData != null) {
                            arrayList.add(refugeeCardData);
                        }
                        z15 = false;
                    }
                    return new dx.i.Right(new RefugeeChildrenCardFullData(parentDocumentId, arrayList));
                } catch (ex.c e27) {
                    e = e27;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (CancellationException e29) {
                throw e29;
            }
        } catch (Exception e35) {
            e = e35;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x017d A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #9 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:29:0x0092, B:64:0x0160, B:54:0x012a, B:57:0x0133, B:59:0x0142, B:63:0x015a, B:60:0x0150, B:62:0x0154, B:65:0x0176, B:66:0x017b, B:67:0x017c, B:68:0x017d, B:69:0x01a7, B:76:0x01b7, B:79:0x01c6), top: B:97:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:96:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x017d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p24.b$h, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l24.n] */
    @Override // v24.b
    public Object k(tq.e<? super dx.i<? extends dx.b, DeputyCardData>> eVar) throws Throwable {
        ?? hVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        DocumentWithScopes documentWithScopes;
        Document documentB;
        dx.i left;
        Object objB2;
        Iterator it;
        Object next;
        DocumentScopeEntity documentScopeEntity;
        Object objA;
        if (eVar instanceof h) {
            h hVar2 = (h) eVar;
            int i15 = hVar2.f152299p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar2.f152299p = i15 - PKIFailureInfo.systemUnavail;
                hVar = hVar2;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object obj = hVar.f152297m;
        Object objE = uq.b.e();
        int i16 = hVar.f152299p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.DEPUTY_CARD;
                        hVar.f152294j = jVarA;
                        hVar.f152295k = vq.j.a(aVar);
                        hVar.f152296l = aVar;
                        hVar.f152289d = 0;
                        hVar.f152290e = 0;
                        hVar.f152291f = 0;
                        hVar.f152292g = 0;
                        hVar.f152293h = 0;
                        hVar.f152299p = 1;
                        Object objQ = B0.q(documentEntityType, hVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        obj = objQ;
                        bVar = aVar;
                        documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                        if (documentWithScopes != null) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.DEPUTY_CARD + " in the database.")));
                            throw new oq.g();
                        }
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB = documentWithScopes.b();
                        dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                        ex.a aVar2 = new ex.a();
                        it = listB.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "DEPUTY_SCOPE_ZERO"));
                        documentScopeEntity = (DocumentScopeEntity) next;
                        if (documentScopeEntity != null) {
                            objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(DeputyCardDataDto.class));
                            if (objA != null) {
                                left = new dx.i.Right(objA);
                                return new dx.i.Right(new DeputyCardData(documentB, n24.a.S((DeputyCardDataDto) bVar.a(left))));
                            }
                        }
                        aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name DEPUTY_SCOPE_ZERO in list.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        hVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(hVar));
                        dx.i iVarA = hVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) hVar.f152296l;
                try {
                    oq.u.b(obj);
                    documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                    if (documentWithScopes != null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.DEPUTY_CARD + " in the database.")));
                        throw new oq.g();
                    }
                    try {
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB2 = documentWithScopes.b();
                        dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                        try {
                            try {
                                ex.a aVar3 = new ex.a();
                                it = listB2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "DEPUTY_SCOPE_ZERO"));
                                documentScopeEntity = (DocumentScopeEntity) next;
                                if (documentScopeEntity != null) {
                                    objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(DeputyCardDataDto.class));
                                    if (objA != null) {
                                        left = new dx.i.Right(objA);
                                        return new dx.i.Right(new DeputyCardData(documentB, n24.a.S((DeputyCardDataDto) bVar.a(left))));
                                    }
                                }
                                aVar3.b(new dx.b.Generic(new NoSuchElementException("No scope with name DEPUTY_SCOPE_ZERO in list.")));
                                throw new oq.g();
                            } catch (Exception e19) {
                                px.f fVar2 = px.f.f163100a;
                                String message2 = e19.getMessage();
                                if (message2 == null) {
                                    message2 = "";
                                }
                                fVar2.d(message2, e19, px.c.a(jVarA3));
                                Object objA2 = jVarA3.a(e19);
                                if (objA2 instanceof dx.i.Left) {
                                    objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                } else {
                                    if (!(objA2 instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) objA2).b();
                                }
                                left = new dx.i.Left(objB2);
                            }
                        } catch (ex.c e25) {
                            left = new dx.i.Left((dx.b) ex.d.a(e25));
                        } catch (CancellationException e26) {
                            throw e26;
                        }
                    } catch (CancellationException e27) {
                        throw e27;
                    }
                } catch (ex.c e28) {
                    e15 = e28;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (CancellationException e36) {
            throw e36;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0234 A[Catch: Exception -> 0x00cc, c -> 0x00d0, CancellationException -> 0x00d4, TryCatch #6 {c -> 0x00d0, CancellationException -> 0x00d4, Exception -> 0x00cc, blocks: (B:25:0x00ba, B:50:0x022c, B:52:0x0234, B:55:0x023f, B:56:0x0269, B:58:0x026f, B:59:0x02ac, B:34:0x010e, B:41:0x018c, B:43:0x0194), top: B:89:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x023d  */
    /* JADX WARN: Code duplicated, block: B:58:0x026f A[Catch: Exception -> 0x00cc, c -> 0x00d0, CancellationException -> 0x00d4, LOOP:0: B:56:0x0269->B:58:0x026f, LOOP_END, TryCatch #6 {c -> 0x00d0, CancellationException -> 0x00d4, Exception -> 0x00cc, blocks: (B:25:0x00ba, B:50:0x022c, B:52:0x0234, B:55:0x023f, B:56:0x0269, B:58:0x026f, B:59:0x02ac, B:34:0x010e, B:41:0x018c, B:43:0x0194), top: B:89:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:62:0x034b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r32v0, types: [p24.b] */
    @Override // v24.b
    public Object l(String str, String str2, DocumentSchema documentSchema, int i15, Map<String, ? extends CMSSignedData> map, fz.b.LocalDate localDate, f24.i iVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        f0 f0Var;
        Object objB;
        String str3;
        DocumentSchema documentSchema2;
        fz.b.LocalDate localDate2;
        Object objD;
        String str4;
        ex.b bVar;
        ex.b bVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        f24.i iVar2;
        dx.j<dx.b> jVar;
        int i25;
        int i26;
        ?? r15;
        int i27;
        String str5;
        ?? r19;
        Object obj;
        int i28;
        ex.b bVar3;
        String str6;
        ?? r110;
        String str7;
        int i29;
        int i35;
        fz.b.LocalDate localDate3;
        ex.b bVar4;
        LocalDate date;
        DocumentEntity documentEntity;
        ArrayList arrayList;
        Iterator it;
        DocumentSchemaEntity documentSchemaEntity;
        l24.n nVarB0;
        ?? r16 = map;
        if (eVar instanceof f0) {
            f0Var = (f0) eVar;
            int i36 = f0Var.B;
            if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                f0Var.B = i36 - PKIFailureInfo.systemUnavail;
            } else {
                f0Var = new f0(eVar);
            }
        } else {
            f0Var = new f0(eVar);
        }
        Object obj2 = f0Var.f152258z;
        Object objE = uq.b.e();
        int i37 = f0Var.B;
        try {
            try {
                try {
                    if (i37 == 0) {
                        oq.u.b(obj2);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            aVar.a(L(r16, iVar));
                            l24.n nVarB1 = ((ContainersDatabase) aVar.a(M())).b0();
                            str3 = str;
                            f0Var.f152239d = str3;
                            f0Var.f152240e = str2;
                            documentSchema2 = documentSchema;
                            f0Var.f152241f = documentSchema2;
                            f0Var.f152242g = r16;
                            localDate2 = localDate;
                            f0Var.f152243h = localDate2;
                            f0Var.f152244j = iVar;
                            f0Var.f152245k = jVarA;
                            f0Var.f152246l = vq.j.a(aVar);
                            f0Var.f152247m = aVar;
                            f0Var.f152252s = i15;
                            f0Var.f152253t = 0;
                            f0Var.f152254v = 0;
                            f0Var.f152255w = 0;
                            f0Var.f152256x = 0;
                            f0Var.f152257y = 0;
                            f0Var.B = 1;
                            objD = nVarB1.d(str2, f0Var);
                            if (objD == objE) {
                                return objE;
                            }
                            str4 = str2;
                            bVar = aVar;
                            bVar2 = bVar;
                            i16 = i15;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            iVar2 = iVar;
                            jVar = jVarA;
                            i25 = 0;
                            i26 = 0;
                            r15 = r16;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r16 = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r16));
                            dx.i iVarA = r16.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i37 != 1) {
                            if (i37 != 2) {
                                if (i37 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                try {
                                    oq.u.b(obj2);
                                    return new dx.i.Right(oq.i0.f148189a);
                                } catch (ex.c e18) {
                                    e = e18;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                }
                            }
                            int i38 = f0Var.f152257y;
                            int i39 = f0Var.f152256x;
                            int i45 = f0Var.f152255w;
                            i18 = f0Var.f152254v;
                            i29 = f0Var.f152253t;
                            i35 = f0Var.f152252s;
                            ex.b bVar5 = (ex.b) f0Var.f152247m;
                            bVar4 = (ex.b) f0Var.f152246l;
                            jVar = (dx.j) f0Var.f152245k;
                            iVar2 = (f24.i) f0Var.f152244j;
                            fz.b.LocalDate localDate4 = (fz.b.LocalDate) f0Var.f152243h;
                            Map map2 = (Map) f0Var.f152242g;
                            DocumentSchema documentSchema3 = (DocumentSchema) f0Var.f152241f;
                            String str8 = (String) f0Var.f152240e;
                            str7 = (String) f0Var.f152239d;
                            oq.u.b(obj2);
                            i27 = i38;
                            i26 = i45;
                            r110 = map2;
                            localDate3 = localDate4;
                            str5 = str8;
                            i25 = i39;
                            obj = objE;
                            bVar = bVar5;
                            documentSchema2 = documentSchema3;
                            ex.b bVar6 = bVar4;
                            localDate2 = localDate3;
                            bVar3 = bVar6;
                            str6 = str7;
                            i28 = i35;
                            i19 = i29;
                            r19 = r110;
                            String str9 = str5;
                            int i46 = i27;
                            DocumentEntityType documentEntityTypeD = n24.a.d(iVar2);
                            DocumentEntityStatus documentEntityStatus = DocumentEntityStatus.ACTIVE;
                            if (localDate2 != null) {
                                date = localDate2.getDate();
                            } else {
                                date = null;
                            }
                            documentEntity = new DocumentEntity(0, str6, documentEntityTypeD, date, this.currentTimeProvider.a(), documentEntityStatus, str9, i28, 1, null);
                            int i47 = i28;
                            ex.b bVar7 = bVar3;
                            DocumentSchema documentSchema4 = documentSchema2;
                            arrayList = new ArrayList(r19.size());
                            for (it = r19.entrySet().iterator(); it.hasNext(); it = it) {
                                Map.Entry entry = (Map.Entry) it.next();
                                String str10 = str6;
                                str6 = str10;
                                arrayList.add(new DocumentScopeEntity(0, str10, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                            }
                            fz.b.LocalDate localDate5 = localDate2;
                            String strB = this.strictNonNullSerializer.b(n24.a.N0(documentSchema4), q0.n(DocumentSchemaDto.class));
                            documentSchemaEntity = new DocumentSchemaEntity(0, str6, strB.getBytes(fu.d.UTF_8), 1, null);
                            nVarB0 = ((ContainersDatabase) bVar.a(M())).b0();
                            f0Var.f152239d = vq.j.a(str6);
                            f0Var.f152240e = vq.j.a(str9);
                            f0Var.f152241f = vq.j.a(documentSchema4);
                            f0Var.f152242g = vq.j.a(r19);
                            f0Var.f152243h = vq.j.a(localDate5);
                            f0Var.f152244j = vq.j.a(iVar2);
                            f0Var.f152245k = jVar;
                            f0Var.f152246l = vq.j.a(bVar7);
                            f0Var.f152247m = vq.j.a(bVar);
                            f0Var.f152248n = vq.j.a(arrayList);
                            f0Var.f152249p = vq.j.a(strB);
                            f0Var.f152250q = vq.j.a(documentEntity);
                            f0Var.f152251r = vq.j.a(documentSchemaEntity);
                            f0Var.f152252s = i47;
                            f0Var.f152253t = i19;
                            f0Var.f152254v = i18;
                            f0Var.f152255w = i26;
                            f0Var.f152256x = i25;
                            f0Var.f152257y = i46;
                            f0Var.B = 3;
                            if (nVarB0.s(documentEntity, arrayList, documentSchemaEntity, f0Var) == obj) {
                                return obj;
                            }
                            return new dx.i.Right(oq.i0.f148189a);
                        }
                        int i48 = f0Var.f152257y;
                        int i49 = f0Var.f152256x;
                        int i55 = f0Var.f152255w;
                        i18 = f0Var.f152254v;
                        int i56 = f0Var.f152253t;
                        int i57 = f0Var.f152252s;
                        ex.b bVar8 = (ex.b) f0Var.f152247m;
                        ex.b bVar9 = (ex.b) f0Var.f152246l;
                        jVar = (dx.j) f0Var.f152245k;
                        iVar2 = (f24.i) f0Var.f152244j;
                        fz.b.LocalDate localDate6 = (fz.b.LocalDate) f0Var.f152243h;
                        Map map3 = (Map) f0Var.f152242g;
                        DocumentSchema documentSchema5 = (DocumentSchema) f0Var.f152241f;
                        String str11 = (String) f0Var.f152240e;
                        String str12 = (String) f0Var.f152239d;
                        oq.u.b(obj2);
                        str4 = str11;
                        i16 = i57;
                        bVar2 = bVar9;
                        localDate2 = localDate6;
                        i19 = i56;
                        bVar = bVar8;
                        documentSchema2 = documentSchema5;
                        objD = obj2;
                        i26 = i55;
                        i25 = i49;
                        r15 = map3;
                        str3 = str12;
                        i17 = i48;
                    }
                    if (((Number) objD).intValue() <= 0) {
                        DocumentEntity documentEntity2 = new DocumentEntity(0, str4, n24.a.d(iVar2), null, this.currentTimeProvider.a(), DocumentEntityStatus.ACTIVE, null, i16, 65, null);
                        str5 = str4;
                        int i58 = i16;
                        l24.n nVarB2 = ((ContainersDatabase) bVar.a(M())).b0();
                        List<DocumentScopeEntity> listN = pq.v.n();
                        f0Var.f152239d = str3;
                        f0Var.f152240e = str5;
                        f0Var.f152241f = documentSchema2;
                        f0Var.f152242g = r15;
                        f0Var.f152243h = localDate2;
                        f0Var.f152244j = iVar2;
                        f0Var.f152245k = jVar;
                        r110 = r15;
                        f0Var.f152246l = vq.j.a(bVar2);
                        f0Var.f152247m = bVar;
                        f0Var.f152248n = vq.j.a(documentEntity2);
                        f0Var.f152252s = i58;
                        f0Var.f152253t = i19;
                        f0Var.f152254v = i18;
                        f0Var.f152255w = i26;
                        f0Var.f152256x = i25;
                        f0Var.f152257y = i17;
                        f0Var.B = 2;
                        i27 = i17;
                        obj = objE;
                        if (nVarB2.v(documentEntity2, listN, f0Var) == obj) {
                            return obj;
                        }
                        str7 = str3;
                        i29 = i19;
                        i35 = i58;
                        localDate3 = localDate2;
                        bVar4 = bVar2;
                        ex.b bVar10 = bVar4;
                        localDate2 = localDate3;
                        bVar3 = bVar10;
                        str6 = str7;
                        i28 = i35;
                        i19 = i29;
                        r19 = r110;
                    } else {
                        i27 = i17;
                        str5 = str4;
                        r19 = r15;
                        obj = objE;
                        ex.b bVar11 = bVar2;
                        i28 = i16;
                        bVar3 = bVar11;
                        str6 = str3;
                    }
                    String str13 = str5;
                    int i410 = i27;
                    DocumentEntityType documentEntityTypeD2 = n24.a.d(iVar2);
                    DocumentEntityStatus documentEntityStatus2 = DocumentEntityStatus.ACTIVE;
                    if (localDate2 != null) {
                        date = localDate2.getDate();
                    } else {
                        date = null;
                    }
                    documentEntity = new DocumentEntity(0, str6, documentEntityTypeD2, date, this.currentTimeProvider.a(), documentEntityStatus2, str13, i28, 1, null);
                    int i411 = i28;
                    ex.b bVar12 = bVar3;
                    DocumentSchema documentSchema6 = documentSchema2;
                    arrayList = new ArrayList(r19.size());
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        String str14 = str6;
                        str6 = str14;
                        arrayList.add(new DocumentScopeEntity(0, str14, (String) entry2.getKey(), ((CMSSignedData) entry2.getValue()).getEncoded(), 1, null));
                    }
                    fz.b.LocalDate localDate7 = localDate2;
                    String strB2 = this.strictNonNullSerializer.b(n24.a.N0(documentSchema6), q0.n(DocumentSchemaDto.class));
                    documentSchemaEntity = new DocumentSchemaEntity(0, str6, strB2.getBytes(fu.d.UTF_8), 1, null);
                    nVarB0 = ((ContainersDatabase) bVar.a(M())).b0();
                    f0Var.f152239d = vq.j.a(str6);
                    f0Var.f152240e = vq.j.a(str13);
                    f0Var.f152241f = vq.j.a(documentSchema6);
                    f0Var.f152242g = vq.j.a(r19);
                    f0Var.f152243h = vq.j.a(localDate7);
                    f0Var.f152244j = vq.j.a(iVar2);
                    f0Var.f152245k = jVar;
                    f0Var.f152246l = vq.j.a(bVar12);
                    f0Var.f152247m = vq.j.a(bVar);
                    f0Var.f152248n = vq.j.a(arrayList);
                    f0Var.f152249p = vq.j.a(strB2);
                    f0Var.f152250q = vq.j.a(documentEntity);
                    f0Var.f152251r = vq.j.a(documentSchemaEntity);
                    f0Var.f152252s = i411;
                    f0Var.f152253t = i19;
                    f0Var.f152254v = i18;
                    f0Var.f152255w = i26;
                    f0Var.f152256x = i25;
                    f0Var.f152257y = i410;
                    f0Var.B = 3;
                    if (nVarB0.s(documentEntity, arrayList, documentSchemaEntity, f0Var) == obj) {
                        return obj;
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (ex.c e27) {
            e = e27;
        } catch (CancellationException e28) {
            throw e28;
        } catch (Exception e29) {
            e = e29;
            r16 = jVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x009a A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #1 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x008b, B:28:0x0094, B:30:0x009a, B:34:0x00ad, B:36:0x00b1, B:38:0x00b7, B:40:0x00bd, B:41:0x00c8, B:43:0x00ce, B:97:0x0208, B:46:0x00e2, B:47:0x00ec, B:49:0x00f2, B:51:0x0105, B:53:0x0111, B:57:0x011f, B:60:0x0124, B:95:0x01eb, B:85:0x01b6, B:88:0x01bf, B:90:0x01ce, B:94:0x01e6, B:91:0x01dc, B:93:0x01e0, B:98:0x020d, B:99:0x0212, B:100:0x0213, B:101:0x0214, B:102:0x021f, B:103:0x0233, B:110:0x023d, B:113:0x024b), top: B:129:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [p24.b$m, tq.e] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v3, types: [l24.n] */
    @Override // v24.b
    public Object m(tq.e<? super dx.i<? extends dx.b, DrivingLicenceFullData>> eVar) throws Throwable {
        ?? mVar;
        Object objB;
        ex.b bVar;
        Iterator it;
        Object next;
        DocumentWithScopes documentWithScopes;
        DocumentEntity document;
        String parentDocumentId;
        Object next2;
        dx.i left;
        Object objB2;
        DrivingLicenceData drivingLicenceData;
        Object next3;
        DocumentScopeEntity documentScopeEntity;
        if (eVar instanceof m) {
            m mVar2 = (m) eVar;
            int i15 = mVar2.f152423p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar2.f152423p = i15 - PKIFailureInfo.systemUnavail;
                mVar = mVar2;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object obj = mVar.f152421m;
        Object objE = uq.b.e();
        int i16 = mVar.f152423p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.DRIVING_LICENCE;
                        mVar.f152418j = jVarA;
                        mVar.f152419k = vq.j.a(aVar);
                        mVar.f152420l = aVar;
                        mVar.f152413d = 0;
                        mVar.f152414e = 0;
                        mVar.f152415f = 0;
                        mVar.f152416g = 0;
                        mVar.f152417h = 0;
                        mVar.f152423p = 1;
                        Object objQ = B0.q(documentEntityType, mVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        bVar = aVar;
                        obj = objQ;
                        List<DocumentWithScopes> list = (List) obj;
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((DocumentWithScopes) next).getDocument().getParentDocumentId() == null);
                        documentWithScopes = (DocumentWithScopes) next;
                        if (documentWithScopes != null) {
                        }
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with parent id in the database.")));
                        throw new oq.g();
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        mVar = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(mVar));
                        dx.i iVarA = mVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) mVar.f152420l;
                try {
                    oq.u.b(obj);
                    List<DocumentWithScopes> list2 = (List) obj;
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((DocumentWithScopes) next).getDocument().getParentDocumentId() == null);
                    documentWithScopes = (DocumentWithScopes) next;
                    if (documentWithScopes != null || (document = documentWithScopes.getDocument()) == null || (parentDocumentId = document.getParentDocumentId()) == null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with parent id in the database.")));
                        throw new oq.g();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (DocumentWithScopes documentWithScopes2 : list2) {
                        if (documentWithScopes2.getDocument().getParentDocumentId() == null) {
                            drivingLicenceData = null;
                        } else {
                            Iterator it4 = documentWithScopes2.b().iterator();
                            do {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                                documentScopeEntity = (DocumentScopeEntity) next2;
                                if (fr.t.c(documentScopeEntity.getScopeName(), "DRIVING_LICENCE") || fr.t.c(documentScopeEntity.getScopeName(), "ACTIVE_TEMPORARY_DRIVING_LICENCE")) {
                                    break;
                                }
                            } while (!fr.t.c(documentScopeEntity.getScopeName(), "INVALIDATED_TEMPORARY_DRIVING_LICENCE"));
                            DocumentScopeEntity documentScopeEntity2 = (DocumentScopeEntity) next2;
                            if (documentScopeEntity2 == null) {
                                drivingLicenceData = null;
                            } else {
                                List<DocumentScopeEntity> listB = documentWithScopes2.b();
                                String scopeName = documentScopeEntity2.getScopeName();
                                dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                                try {
                                    try {
                                        ex.a aVar2 = new ex.a();
                                        Iterator it5 = listB.iterator();
                                        do {
                                            if (!it5.hasNext()) {
                                                next3 = null;
                                                break;
                                            }
                                            next3 = it5.next();
                                        } while (!fr.t.c(((DocumentScopeEntity) next3).getScopeName(), scopeName));
                                        DocumentScopeEntity documentScopeEntity3 = (DocumentScopeEntity) next3;
                                        if (documentScopeEntity3 != null) {
                                            Object objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity3.getScopeData()), q0.g(DrivingLicenceScope.class));
                                            if (objA != null) {
                                                left = new dx.i.Right(objA);
                                                drivingLicenceData = new DrivingLicenceData(n24.a.b(documentWithScopes2.getDocument()), documentScopeEntity2.getScopeName(), n24.a.X((DrivingLicenceScope) bVar.a(left)));
                                            }
                                        }
                                        aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name " + scopeName + " in list.")));
                                        throw new oq.g();
                                    } catch (Exception e18) {
                                        px.f fVar2 = px.f.f163100a;
                                        String message2 = e18.getMessage();
                                        if (message2 == null) {
                                            message2 = "";
                                        }
                                        fVar2.d(message2, e18, px.c.a(jVarA2));
                                        Object objA2 = jVarA2.a(e18);
                                        if (objA2 instanceof dx.i.Left) {
                                            objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                        } else {
                                            if (!(objA2 instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB2 = ((dx.i.Right) objA2).b();
                                        }
                                        left = new dx.i.Left(objB2);
                                    }
                                } catch (ex.c e19) {
                                    try {
                                        left = new dx.i.Left((dx.b) ex.d.a(e19));
                                    } catch (CancellationException e25) {
                                        throw e25;
                                    }
                                } catch (CancellationException e26) {
                                    throw e26;
                                }
                            }
                        }
                        if (drivingLicenceData != null) {
                            arrayList.add(drivingLicenceData);
                        }
                    }
                    return new dx.i.Right(new DrivingLicenceFullData(parentDocumentId, arrayList));
                } catch (ex.c e27) {
                    e = e27;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        } catch (CancellationException e35) {
            throw e35;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x017d A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #9 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:29:0x0092, B:64:0x0160, B:54:0x012a, B:57:0x0133, B:59:0x0142, B:63:0x015a, B:60:0x0150, B:62:0x0154, B:65:0x0176, B:66:0x017b, B:67:0x017c, B:68:0x017d, B:69:0x01a7, B:76:0x01b7, B:79:0x01c6), top: B:97:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:96:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x017d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p24.b$d, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l24.n] */
    @Override // v24.b
    public Object n(tq.e<? super dx.i<? extends dx.b, AdvocateCardData>> eVar) throws Throwable {
        ?? dVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        DocumentWithScopes documentWithScopes;
        Document documentB;
        dx.i left;
        Object objB2;
        Iterator it;
        Object next;
        DocumentScopeEntity documentScopeEntity;
        Object objA;
        if (eVar instanceof d) {
            d dVar2 = (d) eVar;
            int i15 = dVar2.f152177p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar2.f152177p = i15 - PKIFailureInfo.systemUnavail;
                dVar = dVar2;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f152175m;
        Object objE = uq.b.e();
        int i16 = dVar.f152177p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.ADVOCATE_CARD;
                        dVar.f152172j = jVarA;
                        dVar.f152173k = vq.j.a(aVar);
                        dVar.f152174l = aVar;
                        dVar.f152167d = 0;
                        dVar.f152168e = 0;
                        dVar.f152169f = 0;
                        dVar.f152170g = 0;
                        dVar.f152171h = 0;
                        dVar.f152177p = 1;
                        Object objQ = B0.q(documentEntityType, dVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        obj = objQ;
                        bVar = aVar;
                        documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                        if (documentWithScopes != null) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.ADVOCATE_CARD + " in the database.")));
                            throw new oq.g();
                        }
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB = documentWithScopes.b();
                        dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                        ex.a aVar2 = new ex.a();
                        it = listB.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "ADVOCATE_SCOPE_ZERO"));
                        documentScopeEntity = (DocumentScopeEntity) next;
                        if (documentScopeEntity != null) {
                            objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(AdvocateCardDataDto.class));
                            if (objA != null) {
                                left = new dx.i.Right(objA);
                                return new dx.i.Right(new AdvocateCardData(documentB, n24.a.Q((AdvocateCardDataDto) bVar.a(left))));
                            }
                        }
                        aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name ADVOCATE_SCOPE_ZERO in list.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        dVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(dVar));
                        dx.i iVarA = dVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) dVar.f152174l;
                try {
                    oq.u.b(obj);
                    documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                    if (documentWithScopes != null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.ADVOCATE_CARD + " in the database.")));
                        throw new oq.g();
                    }
                    try {
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB2 = documentWithScopes.b();
                        dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                        try {
                            try {
                                ex.a aVar3 = new ex.a();
                                it = listB2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "ADVOCATE_SCOPE_ZERO"));
                                documentScopeEntity = (DocumentScopeEntity) next;
                                if (documentScopeEntity != null) {
                                    objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(AdvocateCardDataDto.class));
                                    if (objA != null) {
                                        left = new dx.i.Right(objA);
                                        return new dx.i.Right(new AdvocateCardData(documentB, n24.a.Q((AdvocateCardDataDto) bVar.a(left))));
                                    }
                                }
                                aVar3.b(new dx.b.Generic(new NoSuchElementException("No scope with name ADVOCATE_SCOPE_ZERO in list.")));
                                throw new oq.g();
                            } catch (Exception e19) {
                                px.f fVar2 = px.f.f163100a;
                                String message2 = e19.getMessage();
                                if (message2 == null) {
                                    message2 = "";
                                }
                                fVar2.d(message2, e19, px.c.a(jVarA3));
                                Object objA2 = jVarA3.a(e19);
                                if (objA2 instanceof dx.i.Left) {
                                    objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                } else {
                                    if (!(objA2 instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) objA2).b();
                                }
                                left = new dx.i.Left(objB2);
                            }
                        } catch (ex.c e25) {
                            left = new dx.i.Left((dx.b) ex.d.a(e25));
                        } catch (CancellationException e26) {
                            throw e26;
                        }
                    } catch (CancellationException e27) {
                        throw e27;
                    }
                } catch (ex.c e28) {
                    e15 = e28;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (CancellationException e36) {
            throw e36;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x017d A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #9 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:29:0x0092, B:64:0x0160, B:54:0x012a, B:57:0x0133, B:59:0x0142, B:63:0x015a, B:60:0x0150, B:62:0x0154, B:65:0x0176, B:66:0x017b, B:67:0x017c, B:68:0x017d, B:69:0x01a7, B:76:0x01b7, B:79:0x01c6), top: B:97:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:96:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x017d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p24.b$s, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l24.n] */
    @Override // v24.b
    public Object o(tq.e<? super dx.i<? extends dx.b, NipipCardData>> eVar) throws Throwable {
        ?? sVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        DocumentWithScopes documentWithScopes;
        Document documentB;
        dx.i left;
        Object objB2;
        Iterator it;
        Object next;
        DocumentScopeEntity documentScopeEntity;
        Object objA;
        if (eVar instanceof s) {
            s sVar2 = (s) eVar;
            int i15 = sVar2.f152492p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                sVar2.f152492p = i15 - PKIFailureInfo.systemUnavail;
                sVar = sVar2;
            } else {
                sVar = new s(eVar);
            }
        } else {
            sVar = new s(eVar);
        }
        Object obj = sVar.f152490m;
        Object objE = uq.b.e();
        int i16 = sVar.f152492p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.NURSE_CARD;
                        sVar.f152487j = jVarA;
                        sVar.f152488k = vq.j.a(aVar);
                        sVar.f152489l = aVar;
                        sVar.f152482d = 0;
                        sVar.f152483e = 0;
                        sVar.f152484f = 0;
                        sVar.f152485g = 0;
                        sVar.f152486h = 0;
                        sVar.f152492p = 1;
                        Object objQ = B0.q(documentEntityType, sVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        obj = objQ;
                        bVar = aVar;
                        documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                        if (documentWithScopes != null) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.NURSE_CARD + " in the database.")));
                            throw new oq.g();
                        }
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB = documentWithScopes.b();
                        dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                        ex.a aVar2 = new ex.a();
                        it = listB.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "ENCRYPTION_NIPIP_NURSE"));
                        documentScopeEntity = (DocumentScopeEntity) next;
                        if (documentScopeEntity != null) {
                            objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(NipipScope.class));
                            if (objA != null) {
                                left = new dx.i.Right(objA);
                                return new dx.i.Right(new NipipCardData(documentB, n24.a.i0((NipipScope) bVar.a(left))));
                            }
                        }
                        aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name ENCRYPTION_NIPIP_NURSE in list.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        sVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(sVar));
                        dx.i iVarA = sVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) sVar.f152489l;
                try {
                    oq.u.b(obj);
                    documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                    if (documentWithScopes != null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.NURSE_CARD + " in the database.")));
                        throw new oq.g();
                    }
                    try {
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB2 = documentWithScopes.b();
                        dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                        try {
                            try {
                                ex.a aVar3 = new ex.a();
                                it = listB2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "ENCRYPTION_NIPIP_NURSE"));
                                documentScopeEntity = (DocumentScopeEntity) next;
                                if (documentScopeEntity != null) {
                                    objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(NipipScope.class));
                                    if (objA != null) {
                                        left = new dx.i.Right(objA);
                                        return new dx.i.Right(new NipipCardData(documentB, n24.a.i0((NipipScope) bVar.a(left))));
                                    }
                                }
                                aVar3.b(new dx.b.Generic(new NoSuchElementException("No scope with name ENCRYPTION_NIPIP_NURSE in list.")));
                                throw new oq.g();
                            } catch (Exception e19) {
                                px.f fVar2 = px.f.f163100a;
                                String message2 = e19.getMessage();
                                if (message2 == null) {
                                    message2 = "";
                                }
                                fVar2.d(message2, e19, px.c.a(jVarA3));
                                Object objA2 = jVarA3.a(e19);
                                if (objA2 instanceof dx.i.Left) {
                                    objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                } else {
                                    if (!(objA2 instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) objA2).b();
                                }
                                left = new dx.i.Left(objB2);
                            }
                        } catch (ex.c e25) {
                            left = new dx.i.Left((dx.b) ex.d.a(e25));
                        } catch (CancellationException e26) {
                            throw e26;
                        }
                    } catch (CancellationException e27) {
                        throw e27;
                    }
                } catch (ex.c e28) {
                    e15 = e28;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (CancellationException e36) {
            throw e36;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x017d A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #9 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:29:0x0092, B:64:0x0160, B:54:0x012a, B:57:0x0133, B:59:0x0142, B:63:0x015a, B:60:0x0150, B:62:0x0154, B:65:0x0176, B:66:0x017b, B:67:0x017c, B:68:0x017d, B:69:0x01a7, B:76:0x01b7, B:79:0x01c6), top: B:97:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:96:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x017d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p24.b$t, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l24.n] */
    @Override // v24.b
    public Object p(tq.e<? super dx.i<? extends dx.b, PensionerCardData>> eVar) throws Throwable {
        ?? tVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        DocumentWithScopes documentWithScopes;
        Document documentB;
        dx.i left;
        Object objB2;
        Iterator it;
        Object next;
        DocumentScopeEntity documentScopeEntity;
        Object objA;
        if (eVar instanceof t) {
            t tVar2 = (t) eVar;
            int i15 = tVar2.f152503p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                tVar2.f152503p = i15 - PKIFailureInfo.systemUnavail;
                tVar = tVar2;
            } else {
                tVar = new t(eVar);
            }
        } else {
            tVar = new t(eVar);
        }
        Object obj = tVar.f152501m;
        Object objE = uq.b.e();
        int i16 = tVar.f152503p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.PENSIONER_CARD;
                        tVar.f152498j = jVarA;
                        tVar.f152499k = vq.j.a(aVar);
                        tVar.f152500l = aVar;
                        tVar.f152493d = 0;
                        tVar.f152494e = 0;
                        tVar.f152495f = 0;
                        tVar.f152496g = 0;
                        tVar.f152497h = 0;
                        tVar.f152503p = 1;
                        Object objQ = B0.q(documentEntityType, tVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        obj = objQ;
                        bVar = aVar;
                        documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                        if (documentWithScopes != null) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.PENSIONER_CARD + " in the database.")));
                            throw new oq.g();
                        }
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB = documentWithScopes.b();
                        dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                        ex.a aVar2 = new ex.a();
                        it = listB.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "PENSIONER_DATA_KEY"));
                        documentScopeEntity = (DocumentScopeEntity) next;
                        if (documentScopeEntity != null) {
                            objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(PensionerCardDataDto.class));
                            if (objA != null) {
                                left = new dx.i.Right(objA);
                                return new dx.i.Right(new PensionerCardData(documentB, n24.a.k0((PensionerCardDataDto) bVar.a(left))));
                            }
                        }
                        aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name PENSIONER_DATA_KEY in list.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        tVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(tVar));
                        dx.i iVarA = tVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) tVar.f152500l;
                try {
                    oq.u.b(obj);
                    documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                    if (documentWithScopes != null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.PENSIONER_CARD + " in the database.")));
                        throw new oq.g();
                    }
                    try {
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB2 = documentWithScopes.b();
                        dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                        try {
                            try {
                                ex.a aVar3 = new ex.a();
                                it = listB2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "PENSIONER_DATA_KEY"));
                                documentScopeEntity = (DocumentScopeEntity) next;
                                if (documentScopeEntity != null) {
                                    objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(PensionerCardDataDto.class));
                                    if (objA != null) {
                                        left = new dx.i.Right(objA);
                                        return new dx.i.Right(new PensionerCardData(documentB, n24.a.k0((PensionerCardDataDto) bVar.a(left))));
                                    }
                                }
                                aVar3.b(new dx.b.Generic(new NoSuchElementException("No scope with name PENSIONER_DATA_KEY in list.")));
                                throw new oq.g();
                            } catch (Exception e19) {
                                px.f fVar2 = px.f.f163100a;
                                String message2 = e19.getMessage();
                                if (message2 == null) {
                                    message2 = "";
                                }
                                fVar2.d(message2, e19, px.c.a(jVarA3));
                                Object objA2 = jVarA3.a(e19);
                                if (objA2 instanceof dx.i.Left) {
                                    objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                } else {
                                    if (!(objA2 instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) objA2).b();
                                }
                                left = new dx.i.Left(objB2);
                            }
                        } catch (ex.c e25) {
                            left = new dx.i.Left((dx.b) ex.d.a(e25));
                        } catch (CancellationException e26) {
                            throw e26;
                        }
                    } catch (CancellationException e27) {
                        throw e27;
                    }
                } catch (ex.c e28) {
                    e15 = e28;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (CancellationException e36) {
            throw e36;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // v24.b
    public Object q(String str, int i15, Map<String, ? extends CMSSignedData> map, fz.b.LocalDate localDate, f24.i iVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        g0 g0Var;
        Object objB;
        if (eVar instanceof g0) {
            g0Var = (g0) eVar;
            int i16 = g0Var.f152288x;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                g0Var.f152288x = i16 - PKIFailureInfo.systemUnavail;
            } else {
                g0Var = new g0(eVar);
            }
        } else {
            g0Var = new g0(eVar);
        }
        Object obj = g0Var.f152286v;
        ?? E = uq.b.e();
        int i17 = g0Var.f152288x;
        try {
            try {
                if (i17 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        int i18 = a.f152103a[iVar.ordinal()];
                        if (i18 != 1 && i18 != 2 && i18 != 3) {
                            aVar.b(new dx.b.Generic(new UnsupportedOperationException(iVar + " is not the main document")));
                            throw new oq.g();
                        }
                        aVar.a(L(map, iVar));
                        DocumentEntity documentEntity = new DocumentEntity(0, str, n24.a.d(iVar), localDate != null ? localDate.getDate() : null, this.currentTimeProvider.a(), DocumentEntityStatus.ACTIVE, null, i15, 65, null);
                        ArrayList arrayList = new ArrayList(map.size());
                        for (Map.Entry<String, ? extends CMSSignedData> entry : map.entrySet()) {
                            arrayList.add(new DocumentScopeEntity(0, str, entry.getKey(), entry.getValue().getEncoded(), 1, null));
                        }
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        g0Var.f152271d = vq.j.a(str);
                        g0Var.f152272e = vq.j.a(map);
                        g0Var.f152273f = vq.j.a(localDate);
                        g0Var.f152274g = vq.j.a(iVar);
                        g0Var.f152275h = jVarA;
                        g0Var.f152276j = vq.j.a(aVar);
                        g0Var.f152277k = vq.j.a(aVar);
                        g0Var.f152278l = vq.j.a(documentEntity);
                        g0Var.f152279m = vq.j.a(arrayList);
                        g0Var.f152280n = i15;
                        g0Var.f152281p = 0;
                        g0Var.f152282q = 0;
                        g0Var.f152283r = 0;
                        g0Var.f152284s = 0;
                        g0Var.f152285t = 0;
                        g0Var.f152288x = 1;
                        if (nVarB0.v(documentEntity, arrayList, g0Var) == E) {
                            return E;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // v24.b
    public Object r(String str, f24.h hVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        k0 k0Var;
        Object objB;
        if (eVar instanceof k0) {
            k0Var = (k0) eVar;
            int i15 = k0Var.f152400r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                k0Var.f152400r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                k0Var = new k0(eVar);
            }
        } else {
            k0Var = new k0(eVar);
        }
        Object obj = k0Var.f152398p;
        Object objE = uq.b.e();
        int i16 = k0Var.f152400r;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityStatus documentEntityStatusC = n24.a.c(hVar);
                        k0Var.f152388d = vq.j.a(str);
                        k0Var.f152389e = vq.j.a(hVar);
                        k0Var.f152390f = jVarA;
                        k0Var.f152391g = vq.j.a(aVar);
                        k0Var.f152392h = vq.j.a(aVar);
                        k0Var.f152393j = 0;
                        k0Var.f152394k = 0;
                        k0Var.f152395l = 0;
                        k0Var.f152396m = 0;
                        k0Var.f152397n = 0;
                        k0Var.f152400r = 1;
                        if (nVarB0.w(str, documentEntityStatusC, k0Var) == objE) {
                            return objE;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x017d A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #9 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:29:0x0092, B:64:0x0160, B:54:0x012a, B:57:0x0133, B:59:0x0142, B:63:0x015a, B:60:0x0150, B:62:0x0154, B:65:0x0176, B:66:0x017b, B:67:0x017c, B:68:0x017d, B:69:0x01a7, B:76:0x01b7, B:79:0x01c6), top: B:97:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:96:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x017d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p24.b$x, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l24.n] */
    @Override // v24.b
    public Object s(tq.e<? super dx.i<? extends dx.b, StudentCardData>> eVar) throws Throwable {
        ?? xVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        DocumentWithScopes documentWithScopes;
        Document documentB;
        dx.i left;
        Object objB2;
        Iterator it;
        Object next;
        DocumentScopeEntity documentScopeEntity;
        Object objA;
        if (eVar instanceof x) {
            x xVar2 = (x) eVar;
            int i15 = xVar2.f152547p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                xVar2.f152547p = i15 - PKIFailureInfo.systemUnavail;
                xVar = xVar2;
            } else {
                xVar = new x(eVar);
            }
        } else {
            xVar = new x(eVar);
        }
        Object obj = xVar.f152545m;
        Object objE = uq.b.e();
        int i16 = xVar.f152547p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.STUDENT_CARD;
                        xVar.f152542j = jVarA;
                        xVar.f152543k = vq.j.a(aVar);
                        xVar.f152544l = aVar;
                        xVar.f152537d = 0;
                        xVar.f152538e = 0;
                        xVar.f152539f = 0;
                        xVar.f152540g = 0;
                        xVar.f152541h = 0;
                        xVar.f152547p = 1;
                        Object objQ = B0.q(documentEntityType, xVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        obj = objQ;
                        bVar = aVar;
                        documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                        if (documentWithScopes != null) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.STUDENT_CARD + " in the database.")));
                            throw new oq.g();
                        }
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB = documentWithScopes.b();
                        dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                        ex.a aVar2 = new ex.a();
                        it = listB.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "fullStudentData"));
                        documentScopeEntity = (DocumentScopeEntity) next;
                        if (documentScopeEntity != null) {
                            objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(StudentCardDto.class));
                            if (objA != null) {
                                left = new dx.i.Right(objA);
                                return new dx.i.Right(new StudentCardData(documentB, n24.a.t0((StudentCardDto) bVar.a(left))));
                            }
                        }
                        aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name fullStudentData in list.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        xVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(xVar));
                        dx.i iVarA = xVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) xVar.f152544l;
                try {
                    oq.u.b(obj);
                    documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                    if (documentWithScopes != null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.STUDENT_CARD + " in the database.")));
                        throw new oq.g();
                    }
                    try {
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB2 = documentWithScopes.b();
                        dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                        try {
                            try {
                                ex.a aVar3 = new ex.a();
                                it = listB2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "fullStudentData"));
                                documentScopeEntity = (DocumentScopeEntity) next;
                                if (documentScopeEntity != null) {
                                    objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(StudentCardDto.class));
                                    if (objA != null) {
                                        left = new dx.i.Right(objA);
                                        return new dx.i.Right(new StudentCardData(documentB, n24.a.t0((StudentCardDto) bVar.a(left))));
                                    }
                                }
                                aVar3.b(new dx.b.Generic(new NoSuchElementException("No scope with name fullStudentData in list.")));
                                throw new oq.g();
                            } catch (Exception e19) {
                                px.f fVar2 = px.f.f163100a;
                                String message2 = e19.getMessage();
                                if (message2 == null) {
                                    message2 = "";
                                }
                                fVar2.d(message2, e19, px.c.a(jVarA3));
                                Object objA2 = jVarA3.a(e19);
                                if (objA2 instanceof dx.i.Left) {
                                    objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                } else {
                                    if (!(objA2 instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) objA2).b();
                                }
                                left = new dx.i.Left(objB2);
                            }
                        } catch (ex.c e25) {
                            left = new dx.i.Left((dx.b) ex.d.a(e25));
                        } catch (CancellationException e26) {
                            throw e26;
                        }
                    } catch (CancellationException e27) {
                        throw e27;
                    }
                } catch (ex.c e28) {
                    e15 = e28;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (CancellationException e36) {
            throw e36;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // v24.b
    public Object t(String str, int i15, Map<String, ? extends CMSSignedData> map, fz.b.LocalDate localDate, f24.i iVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        i0 i0Var;
        Object objB;
        if (eVar instanceof i0) {
            i0Var = (i0) eVar;
            int i16 = i0Var.f152348y;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                i0Var.f152348y = i16 - PKIFailureInfo.systemUnavail;
            } else {
                i0Var = new i0(eVar);
            }
        } else {
            i0Var = new i0(eVar);
        }
        Object obj = i0Var.f152346w;
        ?? E = uq.b.e();
        int i17 = i0Var.f152348y;
        try {
            try {
                if (i17 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        aVar.a(L(map, iVar));
                        DocumentEntity documentEntity = new DocumentEntity(0, str, n24.a.d(iVar), localDate != null ? localDate.getDate() : null, this.currentTimeProvider.a(), DocumentEntityStatus.ACTIVE, null, i15, 65, null);
                        String str2 = (String) aVar.a(n24.b.a(iVar));
                        Set<Map.Entry<String, ? extends CMSSignedData>> setEntrySet = map.entrySet();
                        ArrayList arrayList = new ArrayList(pq.v.y(setEntrySet, 10));
                        Iterator it = setEntrySet.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new DocumentScopeEntity(0, str, str2, ((CMSSignedData) ((Map.Entry) it.next()).getValue()).getEncoded(), 1, null));
                        }
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        i0Var.f152330d = vq.j.a(str);
                        i0Var.f152331e = vq.j.a(map);
                        i0Var.f152332f = vq.j.a(localDate);
                        i0Var.f152333g = vq.j.a(iVar);
                        i0Var.f152334h = jVarA;
                        i0Var.f152335j = vq.j.a(aVar);
                        i0Var.f152336k = vq.j.a(aVar);
                        i0Var.f152337l = vq.j.a(str2);
                        i0Var.f152338m = vq.j.a(arrayList);
                        i0Var.f152339n = vq.j.a(documentEntity);
                        i0Var.f152340p = i15;
                        i0Var.f152341q = 0;
                        i0Var.f152342r = 0;
                        i0Var.f152343s = 0;
                        i0Var.f152344t = 0;
                        i0Var.f152345v = 0;
                        i0Var.f152348y = 1;
                        if (nVarB0.v(documentEntity, arrayList, i0Var) == E) {
                            return E;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x017d A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #9 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:29:0x0092, B:64:0x0160, B:54:0x012a, B:57:0x0133, B:59:0x0142, B:63:0x015a, B:60:0x0150, B:62:0x0154, B:65:0x0176, B:66:0x017b, B:67:0x017c, B:68:0x017d, B:69:0x01a7, B:76:0x01b7, B:79:0x01c6), top: B:97:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:96:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x017d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p24.b$p, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l24.n] */
    @Override // v24.b
    public Object u(tq.e<? super dx.i<? extends dx.b, MIdCardData>> eVar) throws Throwable {
        ?? pVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        DocumentWithScopes documentWithScopes;
        Document documentB;
        dx.i left;
        Object objB2;
        Iterator it;
        Object next;
        DocumentScopeEntity documentScopeEntity;
        Object objA;
        if (eVar instanceof p) {
            p pVar2 = (p) eVar;
            int i15 = pVar2.f152457p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                pVar2.f152457p = i15 - PKIFailureInfo.systemUnavail;
                pVar = pVar2;
            } else {
                pVar = new p(eVar);
            }
        } else {
            pVar = new p(eVar);
        }
        Object obj = pVar.f152455m;
        Object objE = uq.b.e();
        int i16 = pVar.f152457p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.ID_CARD;
                        pVar.f152452j = jVarA;
                        pVar.f152453k = vq.j.a(aVar);
                        pVar.f152454l = aVar;
                        pVar.f152447d = 0;
                        pVar.f152448e = 0;
                        pVar.f152449f = 0;
                        pVar.f152450g = 0;
                        pVar.f152451h = 0;
                        pVar.f152457p = 1;
                        Object objQ = B0.q(documentEntityType, pVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        obj = objQ;
                        bVar = aVar;
                        documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                        if (documentWithScopes != null) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.ID_CARD + " in the database.")));
                            throw new oq.g();
                        }
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB = documentWithScopes.b();
                        dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                        ex.a aVar2 = new ex.a();
                        it = listB.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "PERSONAL_DATA_SCOPE_9"));
                        documentScopeEntity = (DocumentScopeEntity) next;
                        if (documentScopeEntity != null) {
                            objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(PersonalDataScope9.class));
                            if (objA != null) {
                                left = new dx.i.Right(objA);
                                return new dx.i.Right(new MIdCardData(documentB, n24.a.b0((PersonalDataScope9) bVar.a(left))));
                            }
                        }
                        aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name PERSONAL_DATA_SCOPE_9 in list.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        pVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(pVar));
                        dx.i iVarA = pVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) pVar.f152454l;
                try {
                    oq.u.b(obj);
                    documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                    if (documentWithScopes != null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.ID_CARD + " in the database.")));
                        throw new oq.g();
                    }
                    try {
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB2 = documentWithScopes.b();
                        dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                        try {
                            try {
                                ex.a aVar3 = new ex.a();
                                it = listB2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "PERSONAL_DATA_SCOPE_9"));
                                documentScopeEntity = (DocumentScopeEntity) next;
                                if (documentScopeEntity != null) {
                                    objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(PersonalDataScope9.class));
                                    if (objA != null) {
                                        left = new dx.i.Right(objA);
                                        return new dx.i.Right(new MIdCardData(documentB, n24.a.b0((PersonalDataScope9) bVar.a(left))));
                                    }
                                }
                                aVar3.b(new dx.b.Generic(new NoSuchElementException("No scope with name PERSONAL_DATA_SCOPE_9 in list.")));
                                throw new oq.g();
                            } catch (Exception e19) {
                                px.f fVar2 = px.f.f163100a;
                                String message2 = e19.getMessage();
                                if (message2 == null) {
                                    message2 = "";
                                }
                                fVar2.d(message2, e19, px.c.a(jVarA3));
                                Object objA2 = jVarA3.a(e19);
                                if (objA2 instanceof dx.i.Left) {
                                    objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                } else {
                                    if (!(objA2 instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) objA2).b();
                                }
                                left = new dx.i.Left(objB2);
                            }
                        } catch (ex.c e25) {
                            left = new dx.i.Left((dx.b) ex.d.a(e25));
                        } catch (CancellationException e26) {
                            throw e26;
                        }
                    } catch (CancellationException e27) {
                        throw e27;
                    }
                } catch (ex.c e28) {
                    e15 = e28;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (CancellationException e36) {
            throw e36;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // v24.b
    public Object v(String str, int i15, Map<String, ? extends CMSSignedData> map, fz.b.LocalDate localDate, f24.i iVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        d0 d0Var;
        Object objB;
        if (eVar instanceof d0) {
            d0Var = (d0) eVar;
            int i16 = d0Var.f152195x;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                d0Var.f152195x = i16 - PKIFailureInfo.systemUnavail;
            } else {
                d0Var = new d0(eVar);
            }
        } else {
            d0Var = new d0(eVar);
        }
        Object obj = d0Var.f152193v;
        ?? E = uq.b.e();
        int i17 = d0Var.f152195x;
        try {
            try {
                if (i17 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        int i18 = a.f152103a[iVar.ordinal()];
                        if (i18 == 1 || i18 == 2 || i18 == 3) {
                            aVar.b(new dx.b.Generic(new UnsupportedOperationException(iVar + " wrong saving method")));
                            throw new oq.g();
                        }
                        aVar.a(L(map, iVar));
                        DocumentEntity documentEntity = new DocumentEntity(0, str, n24.a.d(iVar), localDate != null ? localDate.getDate() : null, this.currentTimeProvider.a(), DocumentEntityStatus.ACTIVE, null, i15, 65, null);
                        ArrayList arrayList = new ArrayList(map.size());
                        for (Map.Entry<String, ? extends CMSSignedData> entry : map.entrySet()) {
                            arrayList.add(new DocumentScopeEntity(0, str, entry.getKey(), entry.getValue().getEncoded(), 1, null));
                        }
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        d0Var.f152178d = vq.j.a(str);
                        d0Var.f152179e = vq.j.a(map);
                        d0Var.f152180f = vq.j.a(localDate);
                        d0Var.f152181g = vq.j.a(iVar);
                        d0Var.f152182h = jVarA;
                        d0Var.f152183j = vq.j.a(aVar);
                        d0Var.f152184k = vq.j.a(aVar);
                        d0Var.f152185l = vq.j.a(documentEntity);
                        d0Var.f152186m = vq.j.a(arrayList);
                        d0Var.f152187n = i15;
                        d0Var.f152188p = 0;
                        d0Var.f152189q = 0;
                        d0Var.f152190r = 0;
                        d0Var.f152191s = 0;
                        d0Var.f152192t = 0;
                        d0Var.f152195x = 1;
                        if (nVarB0.v(documentEntity, arrayList, d0Var) == E) {
                            return E;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // v24.b
    public Object w(String str, DocumentSchema documentSchema, int i15, Map<String, ? extends CMSSignedData> map, fz.b.LocalDate localDate, f24.i iVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        e0 e0Var;
        Object objB;
        if (eVar instanceof e0) {
            e0Var = (e0) eVar;
            int i16 = e0Var.A;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                e0Var.A = i16 - PKIFailureInfo.systemUnavail;
            } else {
                e0Var = new e0(eVar);
            }
        } else {
            e0Var = new e0(eVar);
        }
        Object obj = e0Var.f152225y;
        ?? E = uq.b.e();
        int i17 = e0Var.A;
        try {
            try {
                if (i17 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        aVar.a(L(map, iVar));
                        DocumentEntity documentEntity = new DocumentEntity(0, str, n24.a.d(iVar), localDate != null ? localDate.getDate() : null, this.currentTimeProvider.a(), DocumentEntityStatus.ACTIVE, null, i15, 65, null);
                        ArrayList arrayList = new ArrayList(map.size());
                        for (Map.Entry<String, ? extends CMSSignedData> entry : map.entrySet()) {
                            arrayList.add(new DocumentScopeEntity(0, str, entry.getKey(), entry.getValue().getEncoded(), 1, null));
                        }
                        String strB = this.strictNonNullSerializer.b(n24.a.N0(documentSchema), q0.n(DocumentSchemaDto.class));
                        DocumentSchemaEntity documentSchemaEntity = new DocumentSchemaEntity(0, str, strB.getBytes(fu.d.UTF_8), 1, null);
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        e0Var.f152207d = vq.j.a(str);
                        e0Var.f152208e = vq.j.a(documentSchema);
                        e0Var.f152209f = vq.j.a(map);
                        e0Var.f152210g = vq.j.a(localDate);
                        e0Var.f152211h = vq.j.a(iVar);
                        e0Var.f152212j = jVarA;
                        e0Var.f152213k = vq.j.a(aVar);
                        e0Var.f152214l = vq.j.a(aVar);
                        e0Var.f152215m = vq.j.a(arrayList);
                        e0Var.f152216n = vq.j.a(strB);
                        e0Var.f152217p = vq.j.a(documentSchemaEntity);
                        e0Var.f152218q = vq.j.a(documentEntity);
                        e0Var.f152219r = i15;
                        e0Var.f152220s = 0;
                        e0Var.f152221t = 0;
                        e0Var.f152222v = 0;
                        e0Var.f152223w = 0;
                        e0Var.f152224x = 0;
                        e0Var.A = 1;
                        if (nVarB0.s(documentEntity, arrayList, documentSchemaEntity, e0Var) == E) {
                            return E;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1 A[Catch: Exception -> 0x00d3, c -> 0x00d5, CancellationException -> 0x00d7, TryCatch #7 {Exception -> 0x00d3, blocks: (B:30:0x00b0, B:31:0x00bb, B:33:0x00c1, B:43:0x00da, B:45:0x00de, B:47:0x00f6, B:48:0x00fc, B:49:0x0124, B:50:0x0125, B:53:0x0133), top: B:97:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00de A[Catch: Exception -> 0x00d3, c -> 0x00d5, CancellationException -> 0x00d7, TryCatch #7 {Exception -> 0x00d3, blocks: (B:30:0x00b0, B:31:0x00bb, B:33:0x00c1, B:43:0x00da, B:45:0x00de, B:47:0x00f6, B:48:0x00fc, B:49:0x0124, B:50:0x0125, B:53:0x0133), top: B:97:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f6 A[Catch: Exception -> 0x00d3, c -> 0x00d5, CancellationException -> 0x00d7, TryCatch #7 {Exception -> 0x00d3, blocks: (B:30:0x00b0, B:31:0x00bb, B:33:0x00c1, B:43:0x00da, B:45:0x00de, B:47:0x00f6, B:48:0x00fc, B:49:0x0124, B:50:0x0125, B:53:0x0133), top: B:97:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0187 A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #3 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x008c, B:29:0x0090, B:64:0x016a, B:54:0x0134, B:57:0x013d, B:59:0x014c, B:63:0x0164, B:60:0x015a, B:62:0x015e, B:65:0x0180, B:66:0x0185, B:67:0x0186, B:68:0x0187, B:69:0x01af, B:76:0x01b9, B:79:0x01c8), top: B:96:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:95:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0187, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // v24.b
    public Object x(String str, tq.e<? super dx.i<? extends dx.b, WruDocumentData>> eVar) throws Throwable {
        z zVar;
        Object objB;
        String str2;
        ex.b bVar;
        DocumentWithScopes documentWithScopes;
        Document documentB;
        String str3;
        dx.i left;
        Object objB2;
        Iterator it;
        Object next;
        DocumentScopeEntity documentScopeEntity;
        Object objA;
        if (eVar instanceof z) {
            zVar = (z) eVar;
            int i15 = zVar.f152570q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                zVar.f152570q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                zVar = new z(eVar);
            }
        } else {
            zVar = new z(eVar);
        }
        Object obj = zVar.f152568n;
        ?? E = uq.b.e();
        int i16 = zVar.f152570q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        zVar.f152559d = str;
                        zVar.f152560e = jVarA;
                        zVar.f152561f = vq.j.a(aVar);
                        zVar.f152562g = aVar;
                        zVar.f152563h = 0;
                        zVar.f152564j = 0;
                        zVar.f152565k = 0;
                        zVar.f152566l = 0;
                        zVar.f152567m = 0;
                        zVar.f152570q = 1;
                        Object objF = nVarB0.f(str, zVar);
                        if (objF == E) {
                            return E;
                        }
                        obj = objF;
                        str2 = str;
                        bVar = aVar;
                        documentWithScopes = (DocumentWithScopes) obj;
                        if (documentWithScopes != null) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("No document with id " + str2 + " in the database.")));
                            throw new oq.g();
                        }
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        str3 = (String) bVar.a(n24.b.a(documentB.getDocumentType()));
                        List<DocumentScopeEntity> listB = documentWithScopes.b();
                        dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                        ex.a aVar2 = new ex.a();
                        it = listB.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), str3));
                        documentScopeEntity = (DocumentScopeEntity) next;
                        if (documentScopeEntity != null) {
                            objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(WruLicenceDataDto.class));
                            if (objA != null) {
                                left = new dx.i.Right(objA);
                                return new dx.i.Right(new WruDocumentData(documentB, n24.a.z0((WruLicenceDataDto) bVar.a(left))));
                            }
                        }
                        aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name " + str3 + " in list.")));
                        throw new oq.g();
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) zVar.f152562g;
                str2 = (String) zVar.f152559d;
                try {
                    oq.u.b(obj);
                    documentWithScopes = (DocumentWithScopes) obj;
                    if (documentWithScopes != null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with id " + str2 + " in the database.")));
                        throw new oq.g();
                    }
                    try {
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        str3 = (String) bVar.a(n24.b.a(documentB.getDocumentType()));
                        List<DocumentScopeEntity> listB2 = documentWithScopes.b();
                        dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                        try {
                            try {
                                ex.a aVar3 = new ex.a();
                                it = listB2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), str3));
                                documentScopeEntity = (DocumentScopeEntity) next;
                                if (documentScopeEntity != null) {
                                    objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(WruLicenceDataDto.class));
                                    if (objA != null) {
                                        left = new dx.i.Right(objA);
                                        return new dx.i.Right(new WruDocumentData(documentB, n24.a.z0((WruLicenceDataDto) bVar.a(left))));
                                    }
                                }
                                aVar3.b(new dx.b.Generic(new NoSuchElementException("No scope with name " + str3 + " in list.")));
                                throw new oq.g();
                            } catch (Exception e18) {
                                px.f fVar2 = px.f.f163100a;
                                String message2 = e18.getMessage();
                                if (message2 == null) {
                                    message2 = "";
                                }
                                fVar2.d(message2, e18, px.c.a(jVarA3));
                                Object objA2 = jVarA3.a(e18);
                                if (objA2 instanceof dx.i.Left) {
                                    objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                } else {
                                    if (!(objA2 instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) objA2).b();
                                }
                                left = new dx.i.Left(objB2);
                            }
                        } catch (ex.c e19) {
                            left = new dx.i.Left((dx.b) ex.d.a(e19));
                        } catch (CancellationException e25) {
                            throw e25;
                        }
                    } catch (CancellationException e26) {
                        throw e26;
                    }
                } catch (ex.c e27) {
                    e = e27;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        } catch (CancellationException e35) {
            throw e35;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [f24.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // v24.b
    public Object y(f24.i iVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        c0 c0Var;
        Object objB;
        ex.c e15;
        if (eVar instanceof c0) {
            c0Var = (c0) eVar;
            int i15 = c0Var.f152166q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c0Var.f152166q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c0Var = new c0(eVar);
            }
        } else {
            c0Var = new c0(eVar);
        }
        Object obj = c0Var.f152164n;
        Object objE = uq.b.e();
        int i16 = c0Var.f152166q;
        boolean z15 = true;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l24.n nVarB0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityTypeD = n24.a.d(iVar);
                        c0Var.f152155d = vq.j.a(iVar);
                        c0Var.f152156e = jVarA;
                        c0Var.f152157f = vq.j.a(aVar);
                        c0Var.f152158g = vq.j.a(aVar);
                        c0Var.f152159h = 0;
                        c0Var.f152160j = 0;
                        c0Var.f152161k = 0;
                        c0Var.f152162l = 0;
                        c0Var.f152163m = 0;
                        c0Var.f152166q = 1;
                        Object objL = nVarB0.l(documentEntityTypeD, c0Var);
                        if (objL == objE) {
                            return objE;
                        }
                        obj = objL;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        iVar = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(iVar));
                        dx.i iVarA = iVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                if (((Number) obj).intValue() <= 0) {
                    z15 = false;
                }
                return new dx.i.Right(vq.b.a(z15));
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4 A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec A[Catch: Exception -> 0x00c9, c -> 0x00cb, CancellationException -> 0x00cd, TryCatch #6 {Exception -> 0x00c9, blocks: (B:30:0x00a6, B:31:0x00b1, B:33:0x00b7, B:43:0x00d0, B:45:0x00d4, B:47:0x00ec, B:48:0x00f2, B:49:0x011a, B:50:0x011b, B:53:0x0129), top: B:95:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x017d A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #9 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0088, B:29:0x0092, B:64:0x0160, B:54:0x012a, B:57:0x0133, B:59:0x0142, B:63:0x015a, B:60:0x0150, B:62:0x0154, B:65:0x0176, B:66:0x017b, B:67:0x017c, B:68:0x017d, B:69:0x01a7, B:76:0x01b7, B:79:0x01c6), top: B:97:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:96:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x017d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p24.b$q, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l24.n] */
    @Override // v24.b
    public Object z(tq.e<? super dx.i<? extends dx.b, NipipCardData>> eVar) throws Throwable {
        ?? qVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        DocumentWithScopes documentWithScopes;
        Document documentB;
        dx.i left;
        Object objB2;
        Iterator it;
        Object next;
        DocumentScopeEntity documentScopeEntity;
        Object objA;
        if (eVar instanceof q) {
            q qVar2 = (q) eVar;
            int i15 = qVar2.f152468p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                qVar2.f152468p = i15 - PKIFailureInfo.systemUnavail;
                qVar = qVar2;
            } else {
                qVar = new q(eVar);
            }
        } else {
            qVar = new q(eVar);
        }
        Object obj = qVar.f152466m;
        Object objE = uq.b.e();
        int i16 = qVar.f152468p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? B0 = ((ContainersDatabase) aVar.a(M())).b0();
                        DocumentEntityType documentEntityType = DocumentEntityType.MIDWIFE_CARD;
                        qVar.f152463j = jVarA;
                        qVar.f152464k = vq.j.a(aVar);
                        qVar.f152465l = aVar;
                        qVar.f152458d = 0;
                        qVar.f152459e = 0;
                        qVar.f152460f = 0;
                        qVar.f152461g = 0;
                        qVar.f152462h = 0;
                        qVar.f152468p = 1;
                        Object objQ = B0.q(documentEntityType, qVar);
                        if (objQ == objE) {
                            return objE;
                        }
                        obj = objQ;
                        bVar = aVar;
                        documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                        if (documentWithScopes != null) {
                            bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.MIDWIFE_CARD + " in the database.")));
                            throw new oq.g();
                        }
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB = documentWithScopes.b();
                        dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                        ex.a aVar2 = new ex.a();
                        it = listB.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "ENCRYPTION_NIPIP_MIDWIFE"));
                        documentScopeEntity = (DocumentScopeEntity) next;
                        if (documentScopeEntity != null) {
                            objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(NipipScope.class));
                            if (objA != null) {
                                left = new dx.i.Right(objA);
                                return new dx.i.Right(new NipipCardData(documentB, n24.a.i0((NipipScope) bVar.a(left))));
                            }
                        }
                        aVar2.b(new dx.b.Generic(new NoSuchElementException("No scope with name ENCRYPTION_NIPIP_MIDWIFE in list.")));
                        throw new oq.g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        qVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(qVar));
                        dx.i iVarA = qVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) qVar.f152465l;
                try {
                    oq.u.b(obj);
                    documentWithScopes = (DocumentWithScopes) pq.v.n0((List) obj);
                    if (documentWithScopes != null) {
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No document with type " + DocumentEntityType.MIDWIFE_CARD + " in the database.")));
                        throw new oq.g();
                    }
                    try {
                        documentB = n24.a.b(documentWithScopes.getDocument());
                        List<DocumentScopeEntity> listB2 = documentWithScopes.b();
                        dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                        try {
                            try {
                                ex.a aVar3 = new ex.a();
                                it = listB2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!fr.t.c(((DocumentScopeEntity) next).getScopeName(), "ENCRYPTION_NIPIP_MIDWIFE"));
                                documentScopeEntity = (DocumentScopeEntity) next;
                                if (documentScopeEntity != null) {
                                    objA = this.strictNonNullSerializer.a(this.signedDataDecoder.decode(documentScopeEntity.getScopeData()), q0.g(NipipScope.class));
                                    if (objA != null) {
                                        left = new dx.i.Right(objA);
                                        return new dx.i.Right(new NipipCardData(documentB, n24.a.i0((NipipScope) bVar.a(left))));
                                    }
                                }
                                aVar3.b(new dx.b.Generic(new NoSuchElementException("No scope with name ENCRYPTION_NIPIP_MIDWIFE in list.")));
                                throw new oq.g();
                            } catch (Exception e19) {
                                px.f fVar2 = px.f.f163100a;
                                String message2 = e19.getMessage();
                                if (message2 == null) {
                                    message2 = "";
                                }
                                fVar2.d(message2, e19, px.c.a(jVarA3));
                                Object objA2 = jVarA3.a(e19);
                                if (objA2 instanceof dx.i.Left) {
                                    objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                } else {
                                    if (!(objA2 instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB2 = ((dx.i.Right) objA2).b();
                                }
                                left = new dx.i.Left(objB2);
                            }
                        } catch (ex.c e25) {
                            left = new dx.i.Left((dx.b) ex.d.a(e25));
                        } catch (CancellationException e26) {
                            throw e26;
                        }
                    } catch (CancellationException e27) {
                        throw e27;
                    }
                } catch (ex.c e28) {
                    e15 = e28;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (CancellationException e36) {
            throw e36;
        }
    }
}
