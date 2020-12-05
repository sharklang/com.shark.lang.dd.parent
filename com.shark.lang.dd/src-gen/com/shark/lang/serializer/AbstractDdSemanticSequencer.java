/*
 * generated by Xtext 2.23.0
 */
package com.shark.lang.serializer;

import com.google.inject.Inject;
import com.shark.lang.dd.AddExpression;
import com.shark.lang.dd.AddExpressionElt;
import com.shark.lang.dd.AndExpression;
import com.shark.lang.dd.AndExpressionElt;
import com.shark.lang.dd.ArraySize;
import com.shark.lang.dd.Attribute;
import com.shark.lang.dd.AttributeSize;
import com.shark.lang.dd.BinaryExpression;
import com.shark.lang.dd.BoolValue;
import com.shark.lang.dd.CatExpression;
import com.shark.lang.dd.CatExpressionElt;
import com.shark.lang.dd.CheckExpression;
import com.shark.lang.dd.ChrValue;
import com.shark.lang.dd.Comment;
import com.shark.lang.dd.Constant;
import com.shark.lang.dd.Constraint;
import com.shark.lang.dd.CstValue;
import com.shark.lang.dd.DataModelFragment;
import com.shark.lang.dd.DdPackage;
import com.shark.lang.dd.DecValue;
import com.shark.lang.dd.Entity;
import com.shark.lang.dd.IdentifierExpression;
import com.shark.lang.dd.IntValue;
import com.shark.lang.dd.ListExpression;
import com.shark.lang.dd.ListExpressionElt;
import com.shark.lang.dd.MultExpression;
import com.shark.lang.dd.MultExpressionElt;
import com.shark.lang.dd.OrExpression;
import com.shark.lang.dd.OrExpressionElt;
import com.shark.lang.dd.Relationship;
import com.shark.lang.dd.StrValue;
import com.shark.lang.dd.UnaryExpression;
import com.shark.lang.dd.UnsetValue;
import com.shark.lang.services.DdGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractDdSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DdGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DdPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DdPackage.ADD_EXPRESSION:
				sequence_AddExpression(context, (AddExpression) semanticObject); 
				return; 
			case DdPackage.ADD_EXPRESSION_ELT:
				sequence_AddExpressionElt(context, (AddExpressionElt) semanticObject); 
				return; 
			case DdPackage.AND_EXPRESSION:
				sequence_AndExpression(context, (AndExpression) semanticObject); 
				return; 
			case DdPackage.AND_EXPRESSION_ELT:
				sequence_AndExpressionElt(context, (AndExpressionElt) semanticObject); 
				return; 
			case DdPackage.ARRAY_SIZE:
				sequence_ArraySize(context, (ArraySize) semanticObject); 
				return; 
			case DdPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case DdPackage.ATTRIBUTE_SIZE:
				sequence_AttributeSize(context, (AttributeSize) semanticObject); 
				return; 
			case DdPackage.BINARY_EXPRESSION:
				sequence_BinaryExpression(context, (BinaryExpression) semanticObject); 
				return; 
			case DdPackage.BOOL_VALUE:
				sequence_TerminalExpression(context, (BoolValue) semanticObject); 
				return; 
			case DdPackage.CAT_EXPRESSION:
				sequence_CatExpression(context, (CatExpression) semanticObject); 
				return; 
			case DdPackage.CAT_EXPRESSION_ELT:
				sequence_CatExpressionElt(context, (CatExpressionElt) semanticObject); 
				return; 
			case DdPackage.CHECK_EXPRESSION:
				sequence_CheckExpression(context, (CheckExpression) semanticObject); 
				return; 
			case DdPackage.CHR_VALUE:
				sequence_TerminalExpression(context, (ChrValue) semanticObject); 
				return; 
			case DdPackage.COMMENT:
				if (rule == grammarAccess.getLineCommentRule()) {
					sequence_LineComment(context, (Comment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTrailCommentRule()) {
					sequence_TrailComment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			case DdPackage.CONSTANT:
				sequence_Constant(context, (Constant) semanticObject); 
				return; 
			case DdPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case DdPackage.CST_VALUE:
				sequence_TerminalExpression(context, (CstValue) semanticObject); 
				return; 
			case DdPackage.DATA_MODEL_FRAGMENT:
				sequence_DataModelFragment(context, (DataModelFragment) semanticObject); 
				return; 
			case DdPackage.DEC_VALUE:
				sequence_TerminalExpression(context, (DecValue) semanticObject); 
				return; 
			case DdPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case DdPackage.IDENTIFIER_EXPRESSION:
				sequence_IdentifierExpression(context, (IdentifierExpression) semanticObject); 
				return; 
			case DdPackage.INT_VALUE:
				sequence_TerminalExpression(context, (IntValue) semanticObject); 
				return; 
			case DdPackage.LIST_EXPRESSION:
				if (rule == grammarAccess.getListExpressionRule()) {
					sequence_ListExpression(context, (ListExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSharkExpressionRule()) {
					sequence_ListExpression_RangeExpression(context, (ListExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRangeExpressionRule()) {
					sequence_RangeExpression(context, (ListExpression) semanticObject); 
					return; 
				}
				else break;
			case DdPackage.LIST_EXPRESSION_ELT:
				sequence_ListExpressionElt(context, (ListExpressionElt) semanticObject); 
				return; 
			case DdPackage.MULT_EXPRESSION:
				sequence_MultExpression(context, (MultExpression) semanticObject); 
				return; 
			case DdPackage.MULT_EXPRESSION_ELT:
				sequence_MultExpressionElt(context, (MultExpressionElt) semanticObject); 
				return; 
			case DdPackage.OR_EXPRESSION:
				sequence_OrExpression(context, (OrExpression) semanticObject); 
				return; 
			case DdPackage.OR_EXPRESSION_ELT:
				sequence_OrExpressionElt(context, (OrExpressionElt) semanticObject); 
				return; 
			case DdPackage.RELATIONSHIP:
				sequence_Relationship(context, (Relationship) semanticObject); 
				return; 
			case DdPackage.STR_VALUE:
				sequence_TerminalExpression(context, (StrValue) semanticObject); 
				return; 
			case DdPackage.UNARY_EXPRESSION:
				sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
				return; 
			case DdPackage.UNSET_VALUE:
				sequence_TerminalExpression(context, (UnsetValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AddExpressionElt returns AddExpressionElt
	 *
	 * Constraint:
	 *     ((op='+' | op='-') right=SharkExpression)
	 */
	protected void sequence_AddExpressionElt(ISerializationContext context, AddExpressionElt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns AddExpression
	 *     AddExpression returns AddExpression
	 *
	 * Constraint:
	 *     (left=SharkExpression (op='+' | op='-') right=SharkExpression addElts+=AddExpressionElt+ (value=NUL precision=INT length=INT)?)
	 */
	protected void sequence_AddExpression(ISerializationContext context, AddExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AndExpressionElt returns AndExpressionElt
	 *
	 * Constraint:
	 *     (op='and' right=SharkExpression)
	 */
	protected void sequence_AndExpressionElt(ISerializationContext context, AndExpressionElt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.AND_EXPRESSION_ELT__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.AND_EXPRESSION_ELT__OP));
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.AND_EXPRESSION_ELT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.AND_EXPRESSION_ELT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndExpressionEltAccess().getOpAndKeyword_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAndExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns AndExpression
	 *     AndExpression returns AndExpression
	 *
	 * Constraint:
	 *     (left=SharkExpression op='and' right=SharkExpression andElts+=AndExpressionElt+)
	 */
	protected void sequence_AndExpression(ISerializationContext context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArraySize returns ArraySize
	 *
	 * Constraint:
	 *     size=INT
	 */
	protected void sequence_ArraySize(ISerializationContext context, ArraySize semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.ARRAY_SIZE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.ARRAY_SIZE__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArraySizeAccess().getSizeINTTerminalRuleCall_1_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AttributeSize returns AttributeSize
	 *
	 * Constraint:
	 *     (length=INT precision=INT?)
	 */
	protected void sequence_AttributeSize(ISerializationContext context, AttributeSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         extraAttrDesc+=LineComment* 
	 *         dataType=DataType 
	 *         attributeSize=AttributeSize? 
	 *         arraySize=ArraySize? 
	 *         name=ID 
	 *         defaultValue=SharkExpression? 
	 *         primaryKey?='key'? 
	 *         mandatory?='!'? 
	 *         attrDesc=TrailComment
	 *     )
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns BinaryExpression
	 *     BinaryExpression returns BinaryExpression
	 *
	 * Constraint:
	 *     (left=SharkExpression op=BinaryOperator right=SharkExpression (value=NUL precision=INT length=INT)?)
	 */
	protected void sequence_BinaryExpression(ISerializationContext context, BinaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CatExpressionElt returns CatExpressionElt
	 *
	 * Constraint:
	 *     (op='&' right=SharkExpression)
	 */
	protected void sequence_CatExpressionElt(ISerializationContext context, CatExpressionElt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.CAT_EXPRESSION_ELT__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.CAT_EXPRESSION_ELT__OP));
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.CAT_EXPRESSION_ELT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.CAT_EXPRESSION_ELT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCatExpressionEltAccess().getOpAmpersandKeyword_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getCatExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns CatExpression
	 *     CatExpression returns CatExpression
	 *
	 * Constraint:
	 *     (left=SharkExpression op='&' right=SharkExpression catElts+=CatExpressionElt+ (value=NUL length=INT)?)
	 */
	protected void sequence_CatExpression(ISerializationContext context, CatExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CheckExpression returns CheckExpression
	 *
	 * Constraint:
	 *     (chkDesc+=LineComment+ name=ID expr=SharkExpression)
	 */
	protected void sequence_CheckExpression(ISerializationContext context, CheckExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constant returns Constant
	 *
	 * Constraint:
	 *     (
	 *         extraAttrDesc+=LineComment* 
	 *         dataType=DataType 
	 *         attributeSize=AttributeSize? 
	 *         arraySize=ArraySize? 
	 *         name=CSTID 
	 *         defaultValue=SharkExpression 
	 *         attrDesc=TrailComment
	 *     )
	 */
	protected void sequence_Constant(ISerializationContext context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns Constraint
	 *
	 * Constraint:
	 *     (chkDescLines+=LineComment+ name=CHKID check+=CheckExpression+)
	 */
	protected void sequence_Constraint(ISerializationContext context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataModelFragment returns DataModelFragment
	 *
	 * Constraint:
	 *     (modelDesc+=LineComment+ name=OBJID constants+=Constant* entities+=Entity* constraints+=Constraint*)
	 */
	protected void sequence_DataModelFragment(ISerializationContext context, DataModelFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (entityDescLines+=LineComment+ name=OBJID extends=[Entity|ID]? attributes+=Attribute+ relationships+=Relationship*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns IdentifierExpression
	 *     IdentifierExpression returns IdentifierExpression
	 *
	 * Constraint:
	 *     value=[Attribute|QualifiedName]
	 */
	protected void sequence_IdentifierExpression(ISerializationContext context, IdentifierExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.IDENTIFIER_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.IDENTIFIER_EXPRESSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIdentifierExpressionAccess().getValueAttributeQualifiedNameParserRuleCall_1_0_1(), semanticObject.eGet(DdPackage.Literals.IDENTIFIER_EXPRESSION__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LineComment returns Comment
	 *
	 * Constraint:
	 *     line=CMT
	 */
	protected void sequence_LineComment(ISerializationContext context, Comment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.COMMENT__LINE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.COMMENT__LINE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLineCommentAccess().getLineCMTTerminalRuleCall_1_0(), semanticObject.getLine());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ListExpressionElt returns ListExpressionElt
	 *
	 * Constraint:
	 *     (op=',' right=SharkExpression)
	 */
	protected void sequence_ListExpressionElt(ISerializationContext context, ListExpressionElt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.LIST_EXPRESSION_ELT__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.LIST_EXPRESSION_ELT__OP));
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.LIST_EXPRESSION_ELT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.LIST_EXPRESSION_ELT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListExpressionEltAccess().getOpCommaKeyword_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getListExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ListExpression returns ListExpression
	 *
	 * Constraint:
	 *     (op='(' left=SharkExpression ListElts+=ListExpressionElt+)
	 */
	protected void sequence_ListExpression(ISerializationContext context, ListExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns ListExpression
	 *
	 * Constraint:
	 *     ((op='(' left=SharkExpression ListElts+=ListExpressionElt+) | range=RANGE | range=RANGEINF)
	 */
	protected void sequence_ListExpression_RangeExpression(ISerializationContext context, ListExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MultExpressionElt returns MultExpressionElt
	 *
	 * Constraint:
	 *     (op='*' right=SharkExpression)
	 */
	protected void sequence_MultExpressionElt(ISerializationContext context, MultExpressionElt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.MULT_EXPRESSION_ELT__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.MULT_EXPRESSION_ELT__OP));
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.MULT_EXPRESSION_ELT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.MULT_EXPRESSION_ELT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultExpressionEltAccess().getOpAsteriskKeyword_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getMultExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns MultExpression
	 *     MultExpression returns MultExpression
	 *
	 * Constraint:
	 *     (left=SharkExpression op='*' right=SharkExpression multElts+=MultExpressionElt+ (value=NUL precision=INT length=INT)?)
	 */
	protected void sequence_MultExpression(ISerializationContext context, MultExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OrExpressionElt returns OrExpressionElt
	 *
	 * Constraint:
	 *     (op='or' right=SharkExpression)
	 */
	protected void sequence_OrExpressionElt(ISerializationContext context, OrExpressionElt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.OR_EXPRESSION_ELT__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.OR_EXPRESSION_ELT__OP));
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.OR_EXPRESSION_ELT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.OR_EXPRESSION_ELT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrExpressionEltAccess().getOpOrKeyword_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getOrExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns OrExpression
	 *     OrExpression returns OrExpression
	 *
	 * Constraint:
	 *     (left=SharkExpression op='or' right=SharkExpression orElts+=OrExpressionElt+)
	 */
	protected void sequence_OrExpression(ISerializationContext context, OrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RangeExpression returns ListExpression
	 *
	 * Constraint:
	 *     (range=RANGE | range=RANGEINF)
	 */
	protected void sequence_RangeExpression(ISerializationContext context, ListExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Relationship
	 *
	 * Constraint:
	 *     (cardi1=RangeExpression name=ID cardi2=RangeExpression linkTo=[Entity|OBJID] relDesc=TrailComment)
	 */
	protected void sequence_Relationship(ISerializationContext context, Relationship semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.RELATIONSHIP__CARDI1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.RELATIONSHIP__CARDI1));
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.RELATIONSHIP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.RELATIONSHIP__NAME));
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.RELATIONSHIP__CARDI2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.RELATIONSHIP__CARDI2));
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.RELATIONSHIP__LINK_TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.RELATIONSHIP__LINK_TO));
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.RELATIONSHIP__REL_DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.RELATIONSHIP__REL_DESC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRelationshipAccess().getCardi1RangeExpressionParserRuleCall_0_0(), semanticObject.getCardi1());
		feeder.accept(grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRelationshipAccess().getCardi2RangeExpressionParserRuleCall_2_0(), semanticObject.getCardi2());
		feeder.accept(grammarAccess.getRelationshipAccess().getLinkToEntityOBJIDTerminalRuleCall_3_0_1(), semanticObject.eGet(DdPackage.Literals.RELATIONSHIP__LINK_TO, false));
		feeder.accept(grammarAccess.getRelationshipAccess().getRelDescTrailCommentParserRuleCall_4_0(), semanticObject.getRelDesc());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns BoolValue
	 *     TerminalExpression returns BoolValue
	 *
	 * Constraint:
	 *     value=Boolean
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, BoolValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.BOOL_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.BOOL_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueBooleanEnumRuleCall_5_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns ChrValue
	 *     TerminalExpression returns ChrValue
	 *
	 * Constraint:
	 *     value=CHR
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, ChrValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.CHR_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.CHR_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueCHRTerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns CstValue
	 *     TerminalExpression returns CstValue
	 *
	 * Constraint:
	 *     value=[Constant|CSTID]
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, CstValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.CST_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.CST_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueConstantCSTIDTerminalRuleCall_4_1_0_1(), semanticObject.eGet(DdPackage.Literals.CST_VALUE__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns DecValue
	 *     TerminalExpression returns DecValue
	 *
	 * Constraint:
	 *     value=DEC
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, DecValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.DEC_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.DEC_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueDECTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns IntValue
	 *     TerminalExpression returns IntValue
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, IntValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.INT_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns StrValue
	 *     TerminalExpression returns StrValue
	 *
	 * Constraint:
	 *     value=STR
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, StrValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.STR_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.STR_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueSTRTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns UnsetValue
	 *     TerminalExpression returns UnsetValue
	 *
	 * Constraint:
	 *     value=Unset
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, UnsetValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.UNSET_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.UNSET_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueUnsetEnumRuleCall_6_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TrailComment returns Comment
	 *
	 * Constraint:
	 *     line=CMT
	 */
	protected void sequence_TrailComment(ISerializationContext context, Comment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DdPackage.Literals.COMMENT__LINE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdPackage.Literals.COMMENT__LINE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTrailCommentAccess().getLineCMTTerminalRuleCall_1_0(), semanticObject.getLine());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SharkExpression returns UnaryExpression
	 *     UnaryExpression returns UnaryExpression
	 *
	 * Constraint:
	 *     (op=UnaryOperator left=SharkExpression (value=NUL precision=INT length=INT)?)
	 */
	protected void sequence_UnaryExpression(ISerializationContext context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
