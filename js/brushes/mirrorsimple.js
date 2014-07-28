function hmirrorsimple( context )
{
	this.init( context );
}

hmirrorsimple.prototype =
{
	name: "Horizontal Simple Mirror",
	
	context: null,
	
	leftBrush: null,
	rightBrush: null,

	init: function( context )
	{
		this.context = context;
		this.leftBrush = new simple(context);
		this.rightBrush = new simple(context);
	},

	destroy: function()
	{
		this.leftBrush.destroy();
		this.leftBrush = null;
		this.rightBrush.destroy();
		this.rightBrush = null;
	},

	strokeStart: function( mouseX, mouseY )
	{
		this.leftBrush.strokeStart(mouseX, mouseY);
		this.rightBrush.strokeStart(this.context.canvas.width - mouseX, mouseY)
		
	},

	stroke: function( mouseX, mouseY )
	{
		this.leftBrush.stroke(mouseX, mouseY);
		this.rightBrush.stroke(this.context.canvas.width - mouseX, mouseY);
	},

	strokeEnd: function()
	{
		this.leftBrush.strokeEnd();
		this.rightBrush.strokeEnd();
	}
}

function vmirrorsimple( context )
{
	this.init( context );
}

vmirrorsimple.prototype =
{
	name: "Vertical Simple mirror",
	
	context: null,
	
	topBrush: null,
	bottomBrush: null,

	init: function( context )
	{
		this.context = context;
		this.topBrush = new simple(context);
		this.bottomBrush = new simple(context);
	},

	destroy: function()
	{
		this.topBrush.destroy();
		this.topBrush = null;
		this.bottomBrush.destroy();
		this.bottomBrush = null;
	},

	strokeStart: function( mouseX, mouseY )
	{
		this.topBrush.strokeStart(mouseX, mouseY);
		this.bottomBrush.strokeStart(mouseX, this.context.canvas.height - mouseY)
		
	},

	stroke: function( mouseX, mouseY )
	{
		this.topBrush.stroke(mouseX, mouseY);
		this.bottomBrush.stroke(mouseX, this.context.canvas.height - mouseY);
	},

	strokeEnd: function()
	{
		this.topBrush.strokeEnd();
		this.bottomBrush.strokeEnd();
	}
}

